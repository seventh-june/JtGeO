package net.junedev.junetech_geo.worldgen.noise;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.synth.ImprovedNoise;
import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import net.minecraft.world.phys.Vec3;

import java.util.stream.IntStream;

/**
 * Modified n-dimensional Perlin noise generator implementing enhanced erosion emulation. This extends the original to automatically maintain datapack serializability
 * <br><br>
 * Largely based on resources from <a href="https://adrianb.io/2014/08/09/perlinnoise.html">Adrian Biagioli</a>,
 * <a href="https://iquilezles.org/articles/morenoise/">Inigo Quilez</a>, and <a href="https://www.youtube.com/watch?v=gsJHzBTPG0Y">Josh's Channel</a>
 * @author kawaiicakes
 */
public class EnhancedPerlinNoise extends PerlinNoise {
    public static PerlinNoise createLegacyForBlendedNoise(RandomSource random, IntStream octaves) {
        return new EnhancedPerlinNoise(random, makeAmplitudes(new IntRBTreeSet(octaves.boxed().collect(ImmutableList.toImmutableList()))), false);
    }

    public static PerlinNoise createLegacyForLegacyNetherBiome(RandomSource random, int firstOctave, DoubleList amplitudes) {
        return new EnhancedPerlinNoise(random, Pair.of(firstOctave, amplitudes), false);
    }

    public static PerlinNoise create(RandomSource random, int firstOctave, DoubleList amplitudes) {
        return new EnhancedPerlinNoise(random, Pair.of(firstOctave, amplitudes), true);
    }

    public EnhancedPerlinNoise(
            RandomSource random, Pair<Integer, DoubleList> octavesAndAmplitudes, boolean useNewFactory
    ) {
        super(random, octavesAndAmplitudes, useNewFactory);
    }

    // TODO - add remaining data checks for hardcoded noise usages and anywhere else user config is not already accepted
    @SuppressWarnings("deprecation")
    @Override
    public double getValue(double x, double y, double z, double yScale, double yMax, boolean useFixedY) {
        double total = 0.0D;
        double frequency = this.lowestFreqInputFactor;
        double amplitude = this.lowestFreqValueFactor;
        double[] partialDerivatives = {0, 0, 0};

        for(int i = 0; i < this.noiseLevels.length; ++i) {
            ImprovedNoise octave = this.noiseLevels[i];

            if (octave != null) {
                // TODO: determine if uses for yScale and yMax actually need to be reimplemented here
                // #wrap seems to adjust the passed value VERY slightly, like the ninth decimal place or something
                double baseNoise = octave.noiseWithDerivative(
                        wrap(x * frequency),
                        useFixedY ? -octave.yo : wrap(y * frequency),
                        wrap(z * frequency),
                        partialDerivatives
                );

                Vec3 asVec = new Vec3(partialDerivatives[0], partialDerivatives[1], partialDerivatives[2]);

                // An additional amplitude multiplier is declared in the JSON for the noise
                total += this.amplitudes.getDouble(i) * baseNoise * amplitude / (1.0D + asVec.dot(asVec));
            }

            frequency *= 2.0D;
            amplitude *= 0.5D;
        }

        return total;
    }

    /*
            Translation key for ImprovedNoise
            web | Mojang

            xi / (int)x & 255 = gridX / Math.floor(x + this.xo)
            yi / (int)y & 255 = gridY / Math.floor(y + this.yo)
            zi / (int)z & 255 = gridZ / Math.floor(z + this.zo)

            Mojang definition for d6, yScale and yMax are passed to here:
                  double d6;
                  if (yScale != 0.0D) {
                     double d7;
                     if (yMax >= 0.0D && yMax < y + this.yo - (double) Math.floor(y + this.yo)) {
                        d7 = yMax;
                     } else {
                        d7 = y + this.yo - (double) Math.floor(y + this.yo);
                     }

                     d6 = (double)Mth.floor(d7 / yScale + (double)1.0E-7F) * yScale;
                  } else {
                     d6 = 0.0D;
                  }

            xf / x - floor(x) = deltaX / x + this.xo - (double) Math.floor(x + this.xo);
            yf / y - floor(y) = weirdDeltaY / y + this.yo - (double) Math.floor(y + this.yo) - d6;
            zf / z - floor(z) = deltaZ / z + this.zo - (double) Math.floor(y + this.yo);

            u = Mth.smoothstep(deltaX);
            v = Mth.smoothstep(deltaY);
            w = Mth.smoothstep(deltaW);

            grad and gradDot are basically identical

            inc(x) = x + 1;
            p[x] = this.p(x) or this.p[x & 255] & 255

            p[xi] = this.p(gridX) or i;
            p[inc(xi)] = this.p(gridX + 1) or j;
            p[p[xi] + p[yi]] = this.p(i + gridY) or k;
            p[p[xi] + p[inc(yi)]] = this.p(i + gridY + 1) or l;
            p[p[inc(xi)] + p[yi]] = this.p(j + gridY) or i1;
            p[p[inc(xi)] + p[inc(yi)]] = this.p(j + gridY + 1) or j1;

            aaa / p[p[p[    xi ]+    yi ]+    zi ] = this.p(k + gridZ);
            aba / p[p[p[    xi ]+inc(yi)]+    zi ] = this.p(l + gridZ);
            aab / p[p[p[    xi ]+    yi ]+inc(zi)] = this.p(k + gridZ + 1);
            abb / p[p[p[    xi ]+inc(yi)]+inc(zi)] = this.p(l + gridZ + 1);
            baa / p[p[p[inc(xi)]+    yi ]+    zi ] = this.p(i1 + gridZ);
            bba / p[p[p[inc(xi)]+inc(yi)]+    zi ] = this.p(j1 + gridZ);
            bab / p[p[p[inc(xi)]+    yi ]+inc(zi)] = this.p(i1 + gridZ + 1);
            bbb / p[p[p[inc(xi)]+inc(yi)]+inc(zi)] = this.p(j1 + gridZ + 1);
    */
}
