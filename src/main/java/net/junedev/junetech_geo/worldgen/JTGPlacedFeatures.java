package net.junedev.junetech_geo.worldgen;

import net.junedev.junetech_geo.JunetechGeo;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

import static net.junedev.junetech_geo.JunetechGeo.MOD_ID;

public class JTGPlacedFeatures {

    public static final ResourceKey<PlacedFeature> STRATA_PLACED = registerKey("strata_placed");
    public static final ResourceKey<PlacedFeature> DYKE_PLACED = registerKey("dyke_placed");
    public static final ResourceKey<PlacedFeature> INTRUSION_PLACED = registerKey("intrusion_placed");

    public static void initialize(BootstapContext<PlacedFeature> context) {

        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, STRATA_PLACED, configuredFeatures.getOrThrow(JTGConfiguredFeatures.STRATA_CONFIGURED), JTGPlacements.justPlaceIt());
        register(context, DYKE_PLACED, configuredFeatures.getOrThrow(JTGConfiguredFeatures.DYKE_CONFIGURED), JTGPlacements.justPlaceIt());
        register(context, INTRUSION_PLACED, configuredFeatures.getOrThrow(JTGConfiguredFeatures.INTRUSION_CONFIGURED), JTGPlacements.justPlaceIt());

        JunetechGeo.LOGGER.info("Placed features initalized");
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

}
