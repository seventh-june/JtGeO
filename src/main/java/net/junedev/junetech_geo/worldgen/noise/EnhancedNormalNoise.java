package net.junedev.junetech_geo.worldgen.noise;

import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import net.junedev.junetech_geo.worldgen.serialization.NoiseAlgorithm;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.minecraft.world.level.levelgen.synth.PerlinNoise;

import java.util.function.Supplier;

/**
 * Nothing about this is enhanced per se. It's just meant to allow determining whether to use Minecraft's Perlin noise or ours.
 * The way it's set up will also allow us to do more with our custom settings if need be.
 * <br><br>
 * Taking a {@link Supplier} for the {@link NoiseAlgorithm} is necessary since we can only get the datapack registry data
 * from {@link net.minecraft.world.level.levelgen.RandomState} after its construction, whereas these may be called in its
 * constructor.
 * @author kawaiicakes
 */
public class EnhancedNormalNoise extends NormalNoise {
    private Supplier<NoiseAlgorithm> supplier;
    private RandomSource random;
    private final boolean useLegacyNetherBiome;

    public static EnhancedNormalNoise createLegacyNetherBiome(
            Supplier<NoiseAlgorithm> algorithm, RandomSource random, NormalNoise.NoiseParameters parameters
    ) {
        return new EnhancedNormalNoise(
                algorithm,
                random, parameters, false
        );
    }

    public static EnhancedNormalNoise create(
            Supplier<NoiseAlgorithm> algorithm, RandomSource random, int firstOctave, double... amplitudes
    ) {
        return create(algorithm, random, new NormalNoise.NoiseParameters(firstOctave, new DoubleArrayList(amplitudes)));
    }

    public static EnhancedNormalNoise create(
            Supplier<NoiseAlgorithm> algorithm, RandomSource random, NormalNoise.NoiseParameters parameters
    ) {
        return new EnhancedNormalNoise(algorithm, random, parameters, true);
    }


    public EnhancedNormalNoise(
            Supplier<NoiseAlgorithm> algorithm, RandomSource random, NoiseParameters parameters, boolean useLegacyNetherBiome
    ) {
        super(random, parameters, useLegacyNetherBiome);
        this.supplier = algorithm;
        this.random = random;
        this.useLegacyNetherBiome = useLegacyNetherBiome;
    }

    public PerlinNoise getFirst() {
        if (this.supplier == null) return this.first;
        this.validateNoises();
        return this.first;
    }

    public PerlinNoise getSecond() {
        if (this.supplier == null) return this.second;
        this.validateNoises();
        return this.second;
    }

    protected void validateNoises() {
        if (this.supplier.get().useEnhanced()) {
            this.first = this.useLegacyNetherBiome
                    ? EnhancedPerlinNoise.createLegacyForLegacyNetherBiome(this.random, this.parameters().firstOctave(), this.parameters().amplitudes())
                    : EnhancedPerlinNoise.create(this.random, this.parameters().firstOctave(), this.parameters().amplitudes());

            this.second = this.useLegacyNetherBiome
                    ? EnhancedPerlinNoise.createLegacyForLegacyNetherBiome(this.random, this.parameters().firstOctave(), this.parameters().amplitudes())
                    : EnhancedPerlinNoise.create(this.random, this.parameters().firstOctave(), this.parameters().amplitudes());
        }

        this.supplier = null;
        this.random = null;
    }

    @Override
    public double getValue(double x, double y, double z) {
        double d0 = x * 1.0181268882175227D;
        double d1 = y * 1.0181268882175227D;
        double d2 = z * 1.0181268882175227D;
        return (this.getFirst().getValue(x, y, z) + this.getSecond().getValue(d0, d1, d2)) * this.valueFactor;
    }

    @VisibleForTesting
    @Override
    public void parityConfigString(StringBuilder builder) {
        builder.append("EnhancedNormalNoise {");
        builder.append("first: ");
        this.getFirst().parityConfigString(builder);
        builder.append(", second: ");
        this.getSecond().parityConfigString(builder);
        builder.append("}");
    }
}
