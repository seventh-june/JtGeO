package net.junedev.junetech_geo.mixin;

import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.world.level.levelgen.synth.ImprovedNoise;
import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(PerlinNoise.class)
public abstract class PerlinNoiseMixin {
    @Final
    @Shadow
    protected double lowestFreqInputFactor;
    @Final
    @Shadow
    protected double lowestFreqValueFactor;
    @Final
    @Shadow
    protected ImprovedNoise[] noiseLevels;
    @Final
    @Shadow
    protected DoubleList amplitudes;

    @Shadow
    public static double wrap(double value) {
        throw new AssertionError();
    }

    /**
     * @author kawaiicakes
     * @reason This is really only temporary. Using it for debugging current implementation of {@link net.junedev.junetech_geo.worldgen.noise.EnhancedPerlinNoise}
     *         check out how the worldgen looks here {@code /tp @s -2180 117 -1308} for seed {@code -2631604141297922420}. Try this before and after enabling this mixin
     */
    @Deprecated
    @Overwrite
    public double getValue(double x, double y, double z, double yScale, double yMax, boolean useFixedY) {
        double total = 0.0D;
        double frequency = this.lowestFreqInputFactor;
        double amplitude = this.lowestFreqValueFactor;
        double[] partialDerivatives = {0, 0, 0};

        for(int i = 0; i < this.noiseLevels.length; ++i) {
            ImprovedNoise octave = this.noiseLevels[i];

            if (octave != null) {
                double baseNoise = octave.noiseWithDerivative(
                        wrap(x * frequency),
                        useFixedY ? -octave.yo : wrap(y * frequency),
                        wrap(z * frequency),
                        partialDerivatives
                );

                Vec3 asVec = new Vec3(partialDerivatives[0], partialDerivatives[1], partialDerivatives[2]);

                total += this.amplitudes.getDouble(i) * baseNoise * amplitude / (1.0D + asVec.dot(asVec));
            }

            frequency *= 2.0D;
            amplitude *= 0.5D;
        }

        return total;
    }
}
