package net.junedev.junetech_geo.worldgen.cached;

/**
 * feature map definitions
 * Ensures every feature map instance / calculation part has the same values.
 */
public interface IFeatureMap {

    int areaSize = 256;
    int rows = areaSize / 16;

}