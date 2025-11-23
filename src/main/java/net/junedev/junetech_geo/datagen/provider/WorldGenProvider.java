package net.junedev.junetech_geo.datagen.provider;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.worldgen.JTGBiomeModifiers;
import net.junedev.junetech_geo.worldgen.JTGConfiguredFeatures;
import net.junedev.junetech_geo.worldgen.JTGPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static net.junedev.junetech_geo.JunetechGeo.MOD_ID;

public class WorldGenProvider extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE,         JTGConfiguredFeatures::initialize)
            .add(Registries.PLACED_FEATURE,             JTGPlacedFeatures::initialize)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS,  JTGBiomeModifiers::initialize)
            ;

    public WorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MOD_ID));
        JunetechGeo.LOGGER.info("WorldGenProvider Init");
    }
}