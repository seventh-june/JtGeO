package net.junedev.junetech_geo.worldgen.provinces.strata;

import net.minecraft.world.level.block.Block;

//Used by provinces to register possible stratum layers.
public record StratumConfig (Block id, int min, int max, int weight){

    public int getDelta(){
        return max-min;
    }

}
