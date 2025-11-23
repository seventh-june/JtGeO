package net.junedev.junetech_geo.worldgen.provinces.list;

import net.junedev.junetech_geo.worldgen.noise.FastNoiseLite;
import net.junedev.junetech_geo.worldgen.provinces.Province;
import net.minecraft.world.level.block.Blocks;

public class Shield extends Province {

    public Shield(){
        register(Blocks.STONE, 5, 8, 3);
        register(Blocks.DEEPSLATE, 2, 4, 2);
        register(Blocks.COBBLED_DEEPSLATE, 1, 5, 1);
        register(Blocks.DIAMOND_BLOCK, 1, 5, 1);
        register(Blocks.REDSTONE_ORE, 1, 5, 1);
    }

    @Override
    public FastNoiseLite elevation(int seed, float value, float edge) {
        FastNoiseLite noise = new FastNoiseLite();

        noise.SetNoiseType(FastNoiseLite.NoiseType.OpenSimplex2);
        noise.SetFractalOctaves(3);
        noise.SetSeed(seed);

        return noise;
    }

    @Override
    public FastNoiseLite depthNoise(int iteration) {
        FastNoiseLite noise = new FastNoiseLite();

        noise.SetNoiseType(FastNoiseLite.NoiseType.Perlin);
        noise.SetFractalOctaves(3);
        noise.SetSeed(iteration);

        return noise;
    }
}
