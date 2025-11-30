package net.junedev.junetech_geo.worldgen.provinces.list;

import net.junedev.junetech_geo.worldgen.noise.FastNoiseLite;
import net.junedev.junetech_geo.worldgen.provinces.Province;
import net.minecraft.world.level.block.Blocks;

public class Basin extends Province {

    public Basin(){
        register(Blocks.BASALT, 5, 48, 8);
        register(Blocks.GRANITE, 2, 4, 2);
        register(Blocks.LAVA, 1, 5, 1);
    }

    @Override
    public FastNoiseLite elevation(int seed, float value, float edge) {
        FastNoiseLite noise = new FastNoiseLite();

        noise.SetNoiseType(FastNoiseLite.NoiseType.OpenSimplex2);
        noise.SetFractalOctaves(3);
        noise.SetSeed(seed);
        noise.SetFrequency(1f/128);

        return noise;
    }

    @Override
    public FastNoiseLite depthNoise(int iteration) {
        FastNoiseLite noise = new FastNoiseLite();

        noise.SetNoiseType(FastNoiseLite.NoiseType.Perlin);
        noise.SetFractalOctaves(3);
        noise.SetSeed(iteration);
        noise.SetFrequency(1f/64f);

        return noise;
    }
}
