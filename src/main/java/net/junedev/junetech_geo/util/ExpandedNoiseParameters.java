package net.junedev.junetech_geo.util;

/**
 * Mixin interface intended to provide extra parameters to {@link net.minecraft.world.level.levelgen.synth.NormalNoise.NoiseParameters}.
 * @author kawaiicakes
 */
public interface ExpandedNoiseParameters {
    default boolean jtGeO$isEnhanced() {
        throw new AssertionError();
    }

    default void jtGeO$setEnhanced(boolean isEnhanced) {
        throw new AssertionError();
    }
}
