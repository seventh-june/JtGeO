package net.junedev.junetech_geo.worldgen.provinces.strata;

import net.minecraft.world.level.block.Block;

//Compressed stack
public record Stratum (Block id, int floor, int depth){

    public int getCeil(){
        return floor + depth;
    }

}
