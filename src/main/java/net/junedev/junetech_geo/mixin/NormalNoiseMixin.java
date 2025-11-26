package net.junedev.junetech_geo.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.junedev.junetech_geo.util.ExpandedNoiseParameters;
import net.junedev.junetech_geo.worldgen.noise.EnhancedPerlinNoise;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.minecraft.world.level.levelgen.synth.PerlinNoise;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

/**
 * @author kawaiicakes
 */
@Mixin(NormalNoise.class)
public abstract class NormalNoiseMixin {
    @WrapOperation(
            method = "<init>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;create(Lnet/minecraft/util/RandomSource;ILit/unimi/dsi/fastutil/doubles/DoubleList;)Lnet/minecraft/world/level/levelgen/synth/PerlinNoise;"
            )
    )
    private PerlinNoise handler(
            RandomSource random, int firstOctave, DoubleList amplitudes, Operation<PerlinNoise> original,
            @Local(argsOnly = true) LocalRef<NormalNoise.NoiseParameters> noiseParams
    ) {
        if (((ExpandedNoiseParameters) (Object) noiseParams.get()).jtGeO$isEnhanced()) {
            return new EnhancedPerlinNoise(random, Pair.of(firstOctave, amplitudes), true);
        }
        return original.call(random, firstOctave, amplitudes);
    }
}
