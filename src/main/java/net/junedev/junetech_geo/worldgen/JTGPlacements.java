package net.junedev.junetech_geo.worldgen;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class JTGPlacements {

    public static List<PlacementModifier> justPlaceIt() {
        return List.of(PlacementUtils.FULL_RANGE, BiomeFilter.biome());
    }

}