package net.junedev.junetech_geo.worldgen;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.worldgen.features.DykeBuilder;
import net.junedev.junetech_geo.worldgen.features.IntrusionBuilder;
import net.junedev.junetech_geo.worldgen.features.StrataBuilder;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.ApiStatus;

import static net.junedev.junetech_geo.JunetechGeo.MOD_ID;

public class JTGFeatures {

    private static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, MOD_ID);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> STRATA_BUILDER = FEATURES.register("strata_builder", () -> new StrataBuilder(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> DYKE_BUILDER = FEATURES.register("dyke_builder", () -> new DykeBuilder(NoneFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> INTRUSION_BUILDER = FEATURES.register("intrusion_builder", () -> new IntrusionBuilder(NoneFeatureConfiguration.CODEC));

    @ApiStatus.Internal
    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
        JunetechGeo.LOGGER.info("Registering Features");
    }

}
