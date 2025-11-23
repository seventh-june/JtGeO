package net.junedev.junetech_geo.worldgen.provinces;

import net.junedev.junetech_geo.worldgen.provinces.list.Basin;
import net.junedev.junetech_geo.worldgen.provinces.list.Orogen;
import net.junedev.junetech_geo.worldgen.provinces.list.Shield;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Registers province configs to a static array.
 */
public class Provinces {

    private static final ArrayList<Province> entries = new ArrayList<>();
    public static ArrayList<Province> getEntries() {
        return entries;
    }

    public Provinces(){}

    //Land
    public static final Province shield = register(new Shield());
    public static final Province orogen = register(new Orogen());

    //Ocean
    public static final Province basin = register(new Basin());

    private static Province register(Province object){
        entries.add(object);
        return object;
    }

    public static Province get(float idx){
        return entries.get((int) (idx * (entries.size()-1)));
    }

    public static Province get(int i){
        return entries.get(i);
    }

    public static Province get(String selectedItem) {
        for (Province province : entries){
            if (Objects.equals(province.toString(), selectedItem)){
                return province;
            }
        }
        return null;
    }

}
