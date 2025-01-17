package net.junedev.junetech_geo.util;

import net.junedev.junetech_geo.junetech_geo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SEDIMENTARY = tag("sedimentary");
        public static final TagKey<Block> METAMORPHIC = tag("metamorphic");
        public static final TagKey<Block> IGNEOUS = tag("igneous");
        public static final TagKey<Block> GROUND_COVER = tag("ground_cover");
        public static final TagKey<Block> PRIMARY_REPLACEABLE = tag("primary_replaceable");
        public static final TagKey<Block> SECONDARY_REPLACEABLE = tag("secondary_replaceable");
        public static final TagKey<Block> TERTIARY_REPLACEABLE = tag("tertiary_replaceable");

        public static final TagKey<Block> caso4 = tag("caso4");
        public static final TagKey<Block> fe2o3 = tag("fe2o3");
        public static final TagKey<Block> hornblende = tag("hornblende");
        public static final TagKey<Block> kcl = tag("kcl");
        public static final TagKey<Block> kclnacl = tag("kclnacl");
        public static final TagKey<Block> kspar = tag("kspar");
        public static final TagKey<Block> nacl = tag("nacl");
        public static final TagKey<Block> olivine = tag("olivine");
        public static final TagKey<Block> pspar = tag("pspar");
        public static final TagKey<Block> sio2 = tag("sio2");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(junetech_geo.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(junetech_geo.MOD_ID, name));
        }
    }
}