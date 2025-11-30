package net.junedev.junetech_geo.worldgen;

import net.junedev.junetech_geo.JunetechGeo;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import static net.junedev.junetech_geo.JunetechGeo.MOD_ID;

public class JTGConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?,?>> STRATA_CONFIGURED = registerKey("strata_configured");
    public static final ResourceKey<ConfiguredFeature<?,?>> DYKE_CONFIGURED = registerKey("dyke_configured");
    public static final ResourceKey<ConfiguredFeature<?,?>> INTRUSION_CONFIGURED = registerKey("intrusion_configured");

    public static void initialize(BootstapContext<ConfiguredFeature<?,?>> context) {
        context.register(STRATA_CONFIGURED, new ConfiguredFeature<>(JTGFeatures.STRATA_BUILDER.get(), NoneFeatureConfiguration.INSTANCE));
        context.register(DYKE_CONFIGURED, new ConfiguredFeature<>(JTGFeatures.DYKE_BUILDER.get(), NoneFeatureConfiguration.INSTANCE));
        context.register(INTRUSION_CONFIGURED, new ConfiguredFeature<>(JTGFeatures.INTRUSION_BUILDER.get(), NoneFeatureConfiguration.INSTANCE));
        JunetechGeo.LOGGER.info("Configured features initialized");
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MOD_ID, name));
    }

}
