package net.junedev.junetech_geo.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.junedev.junetech_geo.util.ExpandedNoiseParameters;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

/**
 * This is basically temporary as improved {@link net.minecraft.world.level.levelgen.synth.NormalNoise.NoiseParameters}
 * will replace the need for it whenever we get that going.
 * @author kawaiicakes
 */
@Mixin(Noises.class)
public abstract class NoisesMixin {
    // TODO - continue work on tweaking what is replaced, or rather (eventually) determining what should be tweaked in the NoiseParameters
    @WrapOperation(
            method = "instantiate",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/synth/NormalNoise;create(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;"
            )
    )
    private static NormalNoise instantiate(
            RandomSource random, NormalNoise.NoiseParameters parameters, Operation<NormalNoise> original,
            @Local(argsOnly = true) LocalRef<ResourceKey<NormalNoise.NoiseParameters>> key
    ) {
        if (
                key.get().location().toString().contains("cave")
                        || key.get().location().toString().contains("spaghetti")
                || key.get().location().toString().contains("noodle")
        ) {
            ((ExpandedNoiseParameters) (Object) parameters).jtGeO$setEnhanced(false);
            return NormalNoise.create(random, parameters);
        }

        return switch(key.get().location().toString()) {
            case "minecraft:temperature",
                 "minecraft:continentalness",
                 "minecraft:erosion",
                 "minecraft:ridge",
                 "minecraft:depth",
                 "minecraft:temperature_large",
                 "minecraft:continentalness_large",
                 "minecraft:erosion_large",
                 "minecraft:ridge_large",
                 "minecraft:depth_large"
                    -> {
                ((ExpandedNoiseParameters) (Object) parameters).jtGeO$setEnhanced(false);
                yield NormalNoise.create(random, parameters);
            }
            default -> NormalNoise.create(random, parameters);
        };
    }
}
