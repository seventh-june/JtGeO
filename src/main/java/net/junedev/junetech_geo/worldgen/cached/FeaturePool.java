package net.junedev.junetech_geo.worldgen.cached;

/**
 * Cached pool of Heightmap area's
 */
public class FeaturePool extends CachedPool<String, FeatureMap> implements IFeatureMap {

    //Todo add feature generator
    //private final HeightMapGenerator generator;

    public FeaturePool(){
        super(8000, 800, 16);
        //this.generator = new HeightMapGenerator(grid, pool);
    }

    /**
     * Get FeatureMap instance from global world pos
     * @param globalX //global input
     * @param globalZ //global input
     * @return FeatureMap from cached Map
     */
    public FeatureMap get(int globalX, int globalZ) {

        int dx = coordToAreaIdx(globalX, areaSize);
        int dz = coordToAreaIdx(globalZ, areaSize);

        String key = dx + "." + dz;

        if (!has(key)) {

            FeatureMap map = new FeatureMap(key);

            int startX = dx * areaSize;
            int startZ = dz * areaSize;

            //generator.apply(map, context, startX, startZ);

            return put(key, map);
        } else {
            return get(key);
        }

    }

    //Global coordinate to area start
    private static final int offSet = 200000;
    public static int coordToAreaIdx(int coord, int area){
        return (coord + offSet * area) / area - offSet;
    }

}