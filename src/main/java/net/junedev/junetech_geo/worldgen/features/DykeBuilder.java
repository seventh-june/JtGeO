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

public class DykeBuilder extends Feature<NoneFeatureConfiguration> {

    //todo add feature config:
    private final float threshold;
    private final BlockState state;

    public DykeBuilder(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
        this.threshold = 0.98f;
        this.state = Blocks.RED_STAINED_GLASS.defaultBlockState();
        JunetechGeo.LOGGER.info("Hello from the dyke builder");
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> ctx) {

        BlockPos pos = ctx.origin();
        WorldGenLevel level = ctx.level();

        int hash = FastNoiseLite.Hash(
                (int)level.getSeed(),
                pos.getX() + pos.hashCode(),
                pos.getZ() + pos.hashCode()
        );
        float value = clamp((hash * (1 / 2147483648.0f) + 1f)/2f);

        if (value < threshold){
            return true;
        }

        //todo set width, max 8+16 within 3x3 space. Max 8 within 1x1 space.
        int width = 8;

        for (int i = -width; i < width; i++) {
            for (int j = -width; j < width; j++) {

                int dx = pos.getX() + 8 + i;
                int dz = pos.getZ() + 8 + j;
                int height = ctx.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, dx, dz);

                float dist = 1f - (float) Math.sqrt(i*i + j*j)/width;

                BlockPos.MutableBlockPos blockPos = new BlockPos.MutableBlockPos(dx, 0, dz);

                for (int k = -64; k < dist*height; k++) {
                    blockPos.setY(k);
                    if (dist > 0) {
                        level.setBlock(blockPos, state, 2);
                    }
                }

            }
        }

        return true;
    }

    //Failsafe... To be sure.
    private float clamp(float val){
        if (val >= 1f){
            return 1f;
        }
        if (val <= 0f){
            return 0f;
        }
        return val;
    }

}
