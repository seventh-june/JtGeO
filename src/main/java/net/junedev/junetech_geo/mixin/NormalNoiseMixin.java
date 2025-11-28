package net.junedev.junetech_geo.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.mojang.logging.LogUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

// TODO - continue replacing calls to these
/**
 * Log whenever a deprecated method is used, as calls to these should have all been replaced
 * @author kawaiicakes
 */
@Mixin(NormalNoise.class)
public abstract class NormalNoiseMixin {
    @Unique
    private final static Logger jtGeO$LOGGER = LogUtils.getLogger();

    @Unique
    private static void jtGeO$logDeprecated(String signature) {
        jtGeO$LOGGER.warn("Something has called deprecated NormalNoise#{}, jtGeO might not like this!", signature);
    }

    @WrapMethod(method = "createLegacyNetherBiome")
    private static NormalNoise createLegacyNetherBiome(
            RandomSource random, NormalNoise.NoiseParameters parameters, Operation<NormalNoise> original
    ) {
        jtGeO$logDeprecated("createLegacyNetherBiome");
        return original.call(random, parameters);
    }

    @WrapMethod(method = "create(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;")
    private static NormalNoise create(
            RandomSource random, NormalNoise.NoiseParameters parameters, Operation<NormalNoise> original
    ) {
        jtGeO$logDeprecated("create(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;");
        return original.call(random, parameters);
    }

    @WrapMethod(method = "create(Lnet/minecraft/util/RandomSource;I[D)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;")
    private static NormalNoise create(
            RandomSource random, int firstOctave, double[] amplitudes, Operation<NormalNoise> original
    ) {
        jtGeO$logDeprecated("create(Lnet/minecraft/util/RandomSource;I[D)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;");
        return original.call(random, firstOctave, amplitudes);
    }
}
