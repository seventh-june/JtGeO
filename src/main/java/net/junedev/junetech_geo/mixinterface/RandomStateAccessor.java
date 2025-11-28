package net.junedev.junetech_geo.mixinterface;

import net.junedev.junetech_geo.worldgen.serialization.NoiseAlgorithm;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.RandomState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.junedev.junetech_geo.worldgen.serialization.NoiseAlgorithm.NOISE_ALGORITHM;

/**
 * I don't like the idea of trying to access {@link net.minecraft.core.RegistryAccess} out of thin air when I want to get
 * the {@link net.junedev.junetech_geo.worldgen.serialization.NoiseAlgorithm} settings. This is a way to get the latter
 * cached in an appropriate manner and place.
 * @author kawaiicakes
 */
public interface RandomStateAccessor {
    static RandomState create(
            NoiseGeneratorSettings settings,
            HolderGetter.Provider provider, long levelSeed
    ) {
        final RandomState toReturn = RandomState.create(
                settings, provider.lookupOrThrow(Registries.NOISE), levelSeed
        );
        ((RandomStateAccessor) (Object) toReturn).jtGeO$setNoiseAlgorithm(provider.lookupOrThrow(NOISE_ALGORITHM));
        return toReturn;
    }

    @Nullable
    default HolderGetter<NoiseAlgorithm> jtGeO$getNoiseAlgorithm() {
        throw new AssertionError();
    }

    default void jtGeO$setNoiseAlgorithm(@NotNull HolderGetter<NoiseAlgorithm> noise) {
        throw new AssertionError();
    }
}
