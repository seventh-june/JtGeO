package net.junedev.junetech_geo.worldgen.provinces.list;

import net.junedev.junetech_geo.worldgen.noise.FastNoiseLite;
import net.junedev.junetech_geo.worldgen.provinces.Province;
import net.minecraft.world.level.block.Blocks;

public class Orogen extends Province {

    public Orogen(){
        register(Blocks.STONE, 5, 12, 3);
        register(Blocks.SANDSTONE, 2, 4, 2);
        register(Blocks.RED_SANDSTONE, 1, 5, 1);
        register(Blocks.GRANITE, 1, 5, 1);
        register(Blocks.OBSIDIAN, 1, 5, 1);
        register(Blocks.DIORITE, 1, 5, 1);
        register(Blocks.ANDESITE, 1, 5, 1);
        register(Blocks.COAL_ORE, 1, 5, 1);
        register(Blocks.IRON_ORE, 1, 5, 1);
    }

    @Override
    public FastNoiseLite elevation(int seed, float value, float edge) {
        FastNoiseLite noise = new FastNoiseLite();

        noise.SetNoiseType(FastNoiseLite.NoiseType.OpenSimplex2);
        noise.SetFractalOctaves(3);
        noise.SetSeed(seed);
        noise.SetFrequency(1f/128f);

        return noise;
    }

    @Override
    public FastNoiseLite depthNoise(int iteration) {
        FastNoiseLite noise = new FastNoiseLite();

        noise.SetNoiseType(FastNoiseLite.NoiseType.Cellular);
        noise.SetCellularReturnType(FastNoiseLite.CellularReturnType.CellValue);
        noise.SetFractalOctaves(3);
        noise.SetSeed(iteration);
        noise.SetFrequency(1f/16f);

        return noise;
    }
}
