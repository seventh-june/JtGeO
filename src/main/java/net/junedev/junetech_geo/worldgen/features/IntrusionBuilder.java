package net.junedev.junetech_geo.worldgen.features;

import com.mojang.serialization.Codec;
import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.worldgen.noise.FastNoiseLite;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class IntrusionBuilder extends Feature<NoneFeatureConfiguration> {

    //todo add feature config:
    private final float threshold;
    private final BlockState state;
    private final FastNoiseLite noise;

    public IntrusionBuilder(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
        JunetechGeo.LOGGER.info("Hello from the Intrusion builder");
        this.threshold = 0.9f;
        this.state = Blocks.GLOWSTONE.defaultBlockState();
        this.noise = new FastNoiseLite(12);
        this.noise.SetNoiseType(FastNoiseLite.NoiseType.Cellular);
        this.noise.SetCellularDistanceFunction(FastNoiseLite.CellularDistanceFunction.Hybrid);
        this.noise.SetCellularJitter(0.8f);
        this.noise.SetCellularReturnType(FastNoiseLite.CellularReturnType.Distance2Mul);
        this.noise.SetFrequency(1f/256f);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> ctx) {

        BlockPos pos = ctx.origin();
        WorldGenLevel level = ctx.level();

        this.noise.SetSeed((int) level.getSeed());

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {

                int dx = pos.getX() + i;
                int dz = pos.getZ() + j;
                int height = ctx.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, dx, dz);

                BlockPos.MutableBlockPos blockPos = new BlockPos.MutableBlockPos(dx, 0, dz);

                for (int k = -64; k < height; k++) {

                    blockPos.setY(k);
                    float v = 1f-this.noise.getValue(dx, k, dz);
                    if (v > threshold+0.05f) {
                        level.setBlock(blockPos, state, 2);
                    }else if (v > threshold){
                        level.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 2);
                    }

                }

            }
        }
        return true;
    }

}
