package net.junedev.junetech_geo.worldgen.features;

import com.mojang.serialization.Codec;
import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.worldgen.noise.FastNoiseLite;
import net.junedev.junetech_geo.worldgen.provinces.Province;
import net.junedev.junetech_geo.worldgen.provinces.Provinces;
import net.junedev.junetech_geo.worldgen.provinces.strata.StratumConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

/**
 * Using temporarily voronoi output till the knots can be tied together
 */
public class StrataBuilder extends Feature<NoneFeatureConfiguration> {

    //Todo replace noise config with province cells output
    private final FastNoiseLite cells;

    public StrataBuilder(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
        this.cells = new FastNoiseLite();
        this.cells.SetSeed(1);
        this.cells.SetNoiseType(FastNoiseLite.NoiseType.Cellular);
        this.cells.SetCellularReturnType(FastNoiseLite.CellularReturnType.CellValue);
        this.cells.SetFrequency(1f/384f);
        JunetechGeo.LOGGER.info("Hello from the strata builder");
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> ctx) {

        BlockPos pos = ctx.origin();

        WorldGenLevel level = ctx.level();

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {

                int dx = pos.getX() + i;
                int dz = pos.getZ() + j;
                int height = ctx.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, dx, dz)-2;
                Province province = getProvince(dx, dz);

                fillChunkWithStrata(ctx, level, dx, dz, height, province);

            }
        }

        return true;
    }

    private Province getProvince(int x, int z) {
        float v = cells.getValue(x, z);
        return Provinces.get(clamp(v));
    }

    //Fill the column
    private void fillChunkWithStrata(FeaturePlaceContext<NoneFeatureConfiguration> ctx, WorldGenLevel level, int dx, int dz, int height, Province province) {

        int y = -64;
        int seed = (int) ctx.level().getSeed();
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos(dx, 0, dz);

        while(y < height){

            StratumConfig config = getStratumConfig(seed, y, province);

            float depthMod = province.depthNoise(seed + y).getValue(dx, dz);
            float depth = config.min() + (depthMod*config.getDelta());
            if (depth < 1){depth = 1f;}//Avoid endless void iteration

            for (int i = 0; i < depth; i++) {

                if (y > height){break;}

                pos.setY(y);
                if (!level.getBlockState(pos).isAir()) {
                    level.setBlock(pos, config.id().defaultBlockState(), 2);
                }

                y++;
            }

        }

    }

    //get stratum from province
    private StratumConfig getStratumConfig(int seed, int rand, Province config) {
        int hash = FastNoiseLite.Hash(seed, rand, 0);
        float idx = clamp((hash * (1 / 2147483648.0f) + 1f) / 2f); //Cell type value from FastNoiseLite
        return config.getStrataConfig(idx);
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
