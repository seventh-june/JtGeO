package net.junedev.junetech_geo.worldgen.serialization;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import static net.junedev.junetech_geo.JunetechGeo.MOD_ID;

public record NoiseAlgorithm(boolean useEnhanced) {
    public static final ResourceKey<Registry<NoiseAlgorithm>> NOISE_ALGORITHM
            = ResourceKey.createRegistryKey(new ResourceLocation("worldgen/noise_algorithm"));

    public static final Codec<NoiseAlgorithm> DIRECT_CODEC = RecordCodecBuilder.create(
            (builder) -> builder.group(
                    Codec.BOOL.fieldOf("useEnhanced").forGetter(NoiseAlgorithm::useEnhanced)
            ).apply(builder, NoiseAlgorithm::new)
    );

    public static void bootstrap(BootstapContext<NoiseAlgorithm> context) {
        register(context, "temperature", false);
        register(context, "vegetation", false);
        register(context, "continentalness", false);
        register(context, "erosion", false);
        register(context, "temperature_large", false);
        register(context, "vegetation_large", false);
        register(context, "continentalness_large", false);
        register(context, "erosion_large", false);
        register(context, "ridge", false);
        register(context, "offset", true);
        register(context, "aquifer_barrier", false);
        register(context, "aquifer_fluid_level_floodedness", false);
        register(context, "aquifer_lava", false);
        register(context, "aquifer_fluid_level_spread", false);
        register(context, "pillar", false);
        register(context, "pillar_rareness", false);
        register(context, "pillar_thickness", false);
        register(context, "spaghetti_2d", false);
        register(context, "spaghetti_2d_elevation", false);
        register(context, "spaghetti_2d_modulator", false);
        register(context, "spaghetti_2d_thickness", false);
        register(context, "spaghetti_3d_1", false);
        register(context, "spaghetti_3d_2", false);
        register(context, "spaghetti_3d_rarity", false);
        register(context, "spaghetti_3d_thickness", false);
        register(context, "spaghetti_roughness", false);
        register(context, "spaghetti_roughness_modulator", false);
        register(context, "cave_entrance", false);
        register(context, "cave_layer", false);
        register(context, "cave_cheese", false);
        register(context, "ore_veininess", false);
        register(context, "ore_vein_a", false);
        register(context, "ore_vein_b", false);
        register(context, "ore_gap", false);
        register(context, "noodle", false);
        register(context, "noodle_thickness", false);
        register(context, "noodle_ridge_a", false);
        register(context, "noodle_ridge_b", false);
        register(context, "jagged", false);
        register(context, "surface", true);
        register(context, "surface_secondary", true);
        register(context, "clay_bands_offset", false);
        register(context, "badlands_pillar", false);
        register(context, "badlands_pillar_roof", false);
        register(context, "badlands_surface", true);
        register(context, "iceberg_pillar", false);
        register(context, "iceberg_pillar_roof", false);
        register(context, "iceberg_surface", true);
        register(context, "surface_swamp", true);
        register(context, "calcite", false);
        register(context, "gravel", false);
        register(context, "powder_snow", false);
        register(context, "packed_ice", false);
        register(context, "ice", false);
        register(context, "soul_sand_layer", false);
        register(context, "gravel_layer", false);
        register(context, "patch", false);
        register(context, "netherrack", false);
        register(context, "nether_wart", false);
        register(context, "nether_state_selector", false);
    }

    private static void register(
            BootstapContext<NoiseAlgorithm> context, String name, 
            boolean useEnhanced
    ) {
        context.register(ResourceKey.create(NOISE_ALGORITHM, new ResourceLocation(MOD_ID, name)), new NoiseAlgorithm(useEnhanced));
    }
}
