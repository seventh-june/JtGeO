package net.junedev.junetech_geo.worldgen;

import net.junedev.junetech_geo.JunetechGeo;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import static net.junedev.junetech_geo.JunetechGeo.MOD_ID;

public class JTGBiomeModifiers {

    public static final ResourceKey<BiomeModifier> STRATA = registerKey("add_strata_builder");

    public static void initialize(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        JunetechGeo.LOGGER.info("Modifying BIOMES");
        context.register(STRATA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(JTGPlacedFeatures.STRATA_PLACED)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MOD_ID, name));
    }
}