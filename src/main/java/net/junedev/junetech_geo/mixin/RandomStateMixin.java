package net.junedev.junetech_geo.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import net.junedev.junetech_geo.mixinterface.RandomStateAccessor;
import net.junedev.junetech_geo.worldgen.noise.EnhancedNormalNoise;
import net.junedev.junetech_geo.worldgen.serialization.NoiseAlgorithm;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.lang.reflect.Field;
import java.util.Objects;

import static net.junedev.junetech_geo.JunetechGeo.MOD_ID;

/**
 * Mixin to allow the class to hold the data relating to our {@link net.junedev.junetech_geo.worldgen.serialization.NoiseAlgorithm}
 * @author kawaiicakes
 */
@SuppressWarnings("LoggingSimilarMessage")
@Mixin(RandomState.class)
public abstract class RandomStateMixin implements RandomStateAccessor {
    @Unique
    private final static Logger jtGeO$LOGGER = LogUtils.getLogger();

    @Unique
    private HolderGetter<NoiseAlgorithm> jtGeO$algorithm;

    @Override
    @Nullable
    public HolderGetter<NoiseAlgorithm> jtGeO$getNoiseAlgorithm() {
        // Maybe even make this throw
        if (this.jtGeO$algorithm == null) jtGeO$LOGGER.error("Attempted to access null NoiseAlgorithm!");
        return this.jtGeO$algorithm;
    }

    @Override
    public void jtGeO$setNoiseAlgorithm(@NotNull HolderGetter<NoiseAlgorithm> noise) {
        this.jtGeO$algorithm = noise;
    }

    /**
     * For debug and compatibility purposes, wrap any calls to these "deprecated" methods so they create a warning log
     * @author kawaiicakes
     */
    @WrapMethod(method = "create(Lnet/minecraft/core/HolderGetter$Provider;Lnet/minecraft/resources/ResourceKey;J)Lnet/minecraft/world/level/levelgen/RandomState;")
    private static RandomState logDeprecated(
            HolderGetter.Provider registries, ResourceKey<NoiseGeneratorSettings> settingsKey, long levelSeed,
            Operation<RandomState> original
    ) {
        // hacky way to get the logger to not log when this is used for our stuff
        if (levelSeed != 0) {
            jtGeO$LOGGER.warn(
                    "Something has called deprecated RandomState#{}, jtGeO might not like this!",
                    "create(Lnet/minecraft/core/HolderGetter$Provider;Lnet/minecraft/resources/ResourceKey;J)Lnet/minecraft/world/level/levelgen/RandomState;"
            );
        }
        return original.call(registries, settingsKey, levelSeed);
    }

    /**
     * For debug and compatibility purposes, wrap any calls to these "deprecated" methods so they create a warning log
     * @author kawaiicakes
     */
    @WrapMethod(method = "create(Lnet/minecraft/world/level/levelgen/NoiseGeneratorSettings;Lnet/minecraft/core/HolderGetter;J)Lnet/minecraft/world/level/levelgen/RandomState;")
    private static RandomState logDeprecated(
            NoiseGeneratorSettings settings, HolderGetter<NormalNoise.NoiseParameters> noiseParametersGetter,
            long levelSeed,
            Operation<RandomState> original
    ) {
        // hacky way to get the logger to not log when this is used for our stuff
        if (levelSeed != 0) {
            jtGeO$LOGGER.warn(
                    "Something has called deprecated RandomState#{}, jtGeO might not like this!",
                    "create(Lnet/minecraft/world/level/levelgen/NoiseGeneratorSettings;Lnet/minecraft/core/HolderGetter;J)Lnet/minecraft/world/level/levelgen/RandomState;"
            );
        }
        return original.call(settings, noiseParametersGetter, levelSeed);
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @Mixin(targets = "net/minecraft/world/level/levelgen/RandomState$1NoiseWiringHelper")
    public abstract static class NoiseWiringHelperMixin {
        @SuppressWarnings({"LocalMayBeArgsOnly"}) // It can't, I don't know why it's telling me it can
        @WrapOperation(
                method = "visitNoise(Lnet/minecraft/world/level/levelgen/DensityFunction$NoiseHolder;)Lnet/minecraft/world/level/levelgen/DensityFunction$NoiseHolder;",
                at = @At(
                        value = "INVOKE",
                        target = "net/minecraft/world/level/levelgen/synth/NormalNoise.createLegacyNetherBiome(Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/synth/NormalNoise$NoiseParameters;)Lnet/minecraft/world/level/levelgen/synth/NormalNoise;"
                )
        )
        private NormalNoise handler(
                RandomSource random, NormalNoise.NoiseParameters parameters,
                Operation<NormalNoise> original, @Local LocalRef<Holder<NormalNoise.NoiseParameters>> holder
        ) {
            NormalNoise originalReturn = original.call(random, parameters); // preserve chained code

            try {
                Field field = this.getClass().getDeclaredField("this$0");
                RandomState container = ((RandomState) field.get(this));

                if (holder.get().is(Noises.TEMPERATURE)) {
                    LogUtils.getLogger().info("Enhanced made for Temperature");
                    return EnhancedNormalNoise.createLegacyNetherBiome(
                            () -> Objects.requireNonNull(((RandomStateAccessor) (Object) container).jtGeO$getNoiseAlgorithm()).getOrThrow(NoiseAlgorithm.makeKey(new ResourceLocation(MOD_ID, Noises.TEMPERATURE.location().getPath()))).get(),
                            random,
                            parameters
                    );
                } else if (holder.get().is(Noises.VEGETATION)) {
                    LogUtils.getLogger().info("Enhanced made for Vegetation");
                    return EnhancedNormalNoise.createLegacyNetherBiome(
                            () -> Objects.requireNonNull(((RandomStateAccessor) (Object) container).jtGeO$getNoiseAlgorithm()).getOrThrow(NoiseAlgorithm.makeKey(new ResourceLocation(MOD_ID, Noises.VEGETATION.location().getPath()))).get(),
                            random,
                            parameters
                    );
                }
            } catch (Exception e) {
                LogUtils.getLogger().error("Epic fail!", e);
            }

            return originalReturn;
        }

        // TODO - for wrapNew
    }
}
