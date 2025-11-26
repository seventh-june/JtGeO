package net.junedev.junetech_geo.mixin;

import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import org.spongepowered.asm.mixin.Mixin;

/**
 * <br><br>
 * Check out how the worldgen looks here {@code /tp @s -2180 117 -1308} for seed {@code -2631604141297922420}. Try this before and after enabling this mixin
 * <br><br>
 * Check this out too if the biome hasn't been changed {@code /tp Dev -2202.299 147.84795 -1143.134 -48 8.9}
 * @author kawaiicakes
 */
@Mixin(PerlinNoise.class)
public abstract class PerlinNoiseMixin {
    // TODO - refactor or add to the static creation methods in here for more holistic effects on the rest of the code. Consider using the additional noise params.
}
