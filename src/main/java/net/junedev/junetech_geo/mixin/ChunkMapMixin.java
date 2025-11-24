package net.junedev.junetech_geo.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.junedev.junetech_geo.mixinterface.RandomStateAccessor;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ChunkMap;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ChunkMap.class)
public abstract class ChunkMapMixin {
    /**
     * Replace calls to {@link RandomState#create(NoiseGeneratorSettings, HolderGetter, long)} with {@link RandomState#create(HolderGetter.Provider, ResourceKey, long)}
     * so our {@link net.junedev.junetech_geo.worldgen.serialization.NoiseAlgorithm} can access their datapack registry entries.
     */
    @WrapOperation(
            method = "<init>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/level/levelgen/RandomState;create(Lnet/minecraft/world/level/levelgen/NoiseGeneratorSettings;Lnet/minecraft/core/HolderGetter;J)Lnet/minecraft/world/level/levelgen/RandomState;"
            )
    )
    public RandomState addRandomStateParams(
            NoiseGeneratorSettings settings, HolderGetter<NormalNoise.NoiseParameters> noiseParametersGetter,
            long levelSeed,
            Operation<RandomState> original, @Local LocalRef<RegistryAccess> access
            ) {
        // allow chained code to execute still in case something else is mixing in here
        // 0 is passed as seed to bypass the logging
        // original.call(settings, noiseParametersGetter, 0L);
        // can't chain? leads to null issues?
        return RandomStateAccessor.create(settings, access.get().asGetterLookup(), levelSeed);
    }
}
