package net.junedev.junetech_geo.worldgen.provinces;

import net.junedev.junetech_geo.worldgen.noise.FastNoiseLite;
import net.junedev.junetech_geo.worldgen.provinces.strata.StratumConfig;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;

/**
 * Container class for a geo province.
 * #strataConfig, list of available placeable layers for this province.
 * #elevation, Noise config for height overlay / mix.
 * #depthNoise, Noise config for the strata layers depth.
 */
public abstract class Province{

    public final ArrayList<StratumConfig> strataConfig;

    //todo add climate or other filterable values?
    public Province(){
        this.strataConfig = new ArrayList<>();
    }

    //Registers
    public void register(StratumConfig config){
        strataConfig.add(config);
    }
    public void register(Block block, int min, int max, int weight){
        strataConfig.add(new StratumConfig(block, min, max, weight));
    }

    //Getters
    public ArrayList<StratumConfig> getStrataEntries() {
        return strataConfig;
    }
    public StratumConfig getStrataConfig(float idx) {
        int i = (int)(idx * (strataConfig.size()-1));
        return strataConfig.get(i);
    }


    //Potential Noise overlay?
    /**
     * @param seed that sprouts
     * @param value cell value, 0-1
     * @param edge edge value, distance to center. 0-1
     * @return
     */
    public abstract FastNoiseLite elevation(int seed, float value, float edge);
    //Defines the depth of a stratum layer
    public abstract FastNoiseLite depthNoise(int iteration);

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }


}