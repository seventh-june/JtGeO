package net.junedev.junetech_geo.datagen.provider;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.block.ModBlocks;
import net.junedev.junetech_geo.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, JunetechGeo.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // TODO: Add appropiate blocks to tags below
        //this.tag(ModTags.Blocks.caso4).add();
        //this.tag(ModTags.Blocks.fe2o3).add();
        //this.tag(ModTags.Blocks.hornblende).add();
        //this.tag(ModTags.Blocks.kcl).add();
        //this.tag(ModTags.Blocks.kclnacl).add();
        //this.tag(ModTags.Blocks.kspar).add();
        //this.tag(ModTags.Blocks.nacl).add();
        //this.tag(ModTags.Blocks.olivine).add();
        //this.tag(ModTags.Blocks.pspar).add();

        this.tag(ModTags.Blocks.SEDIMENTARY)
                .addTag(ModTags.Blocks.SED_CHEMICAL)
                .addTag(ModTags.Blocks.SED_CLASTIC);

        this.tag(ModTags.Blocks.METAMORPHIC)
                .addTag(ModTags.Blocks.META_FOLIATED)
                .addTag(ModTags.Blocks.META_NONFOLIATED);

        this.tag(ModTags.Blocks.IGNEOUS)
                .addTag(ModTags.Blocks.GRANITE)
                .addTag(ModTags.Blocks.FELSIC_INTRUSIVE)
                .addTag(ModTags.Blocks.FELSIVE_EXTRUSIVE)
                .addTag(ModTags.Blocks.INTERMEDIATE_INTRUSIVE)
                .addTag(ModTags.Blocks.INTERMEDIATE_EXTRUSIVE)
                .addTag(ModTags.Blocks.MAFIC_INTRUSIVE)
                .addTag(ModTags.Blocks.MAFIC_EXTRUSIVE)
                .addTag(ModTags.Blocks.ULTRAMAFIC_INTRUSIVE)
                .addTag(ModTags.Blocks.ULTRAMAFIC_EXTRUSIVE);

        this.tag(ModTags.Blocks.PRIMARY_REPLACEABLE)
                .add(Blocks.STONE,
                        Blocks.DEEPSLATE,
                        Blocks.STONE_SLAB,
                        Blocks.NETHERRACK);

        this.tag(ModTags.Blocks.SECONDARY_REPLACEABLE)
                .add(Blocks.GRANITE,
                        Blocks.ANDESITE,
                        Blocks.DIORITE,
                        Blocks.TUFF);

        this.tag(ModTags.Blocks.TERTIARY_REPLACEABLE)
                .add(Blocks.SMOOTH_BASALT,
                        Blocks.CALCITE,
                        Blocks.GRAVEL,
                        Blocks.CLAY,
                        Blocks.DIRT);

        this.tag(ModTags.Blocks.HARD_STONE_TOOL_MATERIALS) //rocks with a hardness of 7+
                .addTag(ModTags.Blocks.sio2)
                .add(Blocks.GRANITE,
                        Blocks.ANDESITE,
                        Blocks.DIORITE,
                        ModBlocks.ORTHOQUARTZITE.get(),
                        ModBlocks.EMERY.get(),
                        ModBlocks.CORUNDITE.get(),
                        ModBlocks.QUARTZITE.get(),
                        ModBlocks.QUARTZOLITE.get(),
                        ModBlocks.QUARTZITE_COBBLESTONE.get(),
                        ModBlocks.RHYOLITE.get(),
                        ModBlocks.PERIDOTITE.get(),
                        ModBlocks.TONALITE.get(),
                        ModBlocks.SANDSTONE_GREYWACKE.get(),
                        ModBlocks.SANDSTONE_GREYWACKE_COBBLESTONE.get(),
                        ModBlocks.MONZONITE.get(),
                        ModBlocks.MONZODIORITE.get());


        this.tag(ModTags.Blocks.SED_CLASTIC)
                .addTag(ModTags.Blocks.SANDSTONE)
                .add(ModBlocks.CONGLOMERATE.get(),
                        ModBlocks.BRECCIA.get(),
                        ModBlocks.BRECCIA_DALLASITE.get(),
                        Blocks.SANDSTONE,
                        Blocks.RED_SANDSTONE,
                        // ModBlocks.SANDSTONE_QUARTZ_ARENITE.get(),
                        ModBlocks.SANDSTONE_FELDSPATHIC_ARENITE.get(),
                        ModBlocks.SANDSTONE_GREYWACKE.get(),
                        ModBlocks.SANDSTONE_ARKOSE.get(),
                        ModBlocks.SANDSTONE_ITACOLUMITE.get(),
                        ModBlocks.SANDSTONE_GANISTER.get(),
                        ModBlocks.SANDSTONE_GANISTER_ROOT_TRACED.get(),
                        ModBlocks.SANDSTONE_TURBIDITE.get(),
                        ModBlocks.LACUSTRINE.get(),
                        ModBlocks.BAUXITE_LATERITE.get(),
                        ModBlocks.SHALE.get(),
                        ModBlocks.SHALE_HAKATAI.get(),
                        ModBlocks.MUDSTONE.get(),
                        ModBlocks.SILTSTONE.get(),
                        ModBlocks.DIAMICTITE.get(),
                        ModBlocks.DIAMICTITE_TILLITE.get(),
                        ModBlocks.ARGILLITE.get(),
                        ModBlocks.ARGILLITE_MARINITE.get());


        this.tag(ModTags.Blocks.SED_CHEMICAL)
                .add(ModBlocks.LIMESTONE.get(),
                        ModBlocks.LIMESTONE_FOSSILIFEROUS.get(),
                        ModBlocks.LIMESTONE_KARST.get(),
                        ModBlocks.LIMESTONE_COQUINA.get(),
                        ModBlocks.LIMESTONE_AEOLIANITE.get(),
                        ModBlocks.LIMESTONE_BLACK.get(),
                        ModBlocks.LIMESTONE_OOLITIC.get(),
                        ModBlocks.LIMESTONE_MOONMILK.get(),
                        ModBlocks.DOLOMITE.get(),
                        ModBlocks.DIATOMITE.get(),
                        ModBlocks.CHERT_DIATOMIC.get(),
                        ModBlocks.CHERT_RADIOLARIAN.get(),
                        ModBlocks.TUFA.get(),
                        ModBlocks.TRAVERTINE_LIME.get(),
                        ModBlocks.TRAVERTINE_PEACH.get(),
                        ModBlocks.GYPSUM.get(),
                        ModBlocks.HALITE.get(),
                        ModBlocks.HALITE_HIMALAYAN_SALT.get(),
                        ModBlocks.BITUMEN.get(),
                        ModBlocks.BITUMEN_SHUNGITE.get(),
                        ModBlocks.BITUMEN_RESINITE.get(),
                        ModBlocks.PYROBITUMEN.get(),
                        ModBlocks.LIGNITE.get(),
                        ModBlocks.LIGNITE_RESINITE.get(),
                        ModBlocks.LIGNITE_JET.get(),
                        ModBlocks.BAUXITE_CALCAREOUS.get(),
                        ModBlocks.BAUXITE_KARST.get());

        this.tag(ModTags.Blocks.GRANITE)
                .add(Blocks.GRANITE,
                        ModBlocks.GRANITE_APPINITE.get(),
                        ModBlocks.GRANITE_CHARNOCKITE.get(),
                        ModBlocks.GRANITE_BLUE.get(),
                        ModBlocks.GRANITE_CHARNOCKITE_MANGERITE.get(),
                        ModBlocks.GRANITE_CHARNOCKITE_ENDERBITE.get(),
                        ModBlocks.GRANITE_LUXULLIANITE.get(),
                        ModBlocks.GRANITE_PEGMATITE.get(),
                        ModBlocks.GREISENS_PEGMATITE.get(),
                        ModBlocks.GREISENS_CONTACT.get(),
                        ModBlocks.GRANITE_UNAKITE.get(),
                        ModBlocks.GRANITE_RAPAKIVI.get(),
                        ModBlocks.GRANITE_GOLD.get(),
                        ModBlocks.GRANITE_WHITE.get(),
                        ModBlocks.GRANITE_PORPHYRY.get(),
                        ModBlocks.GRANODIORITE.get(),
                        ModBlocks.MONZOGRANITE.get());

        this.tag(ModTags.Blocks.META_FOLIATED)
                .add(ModBlocks.GNEISS.get(),
                    ModBlocks.PHYLLITE.get());


        this.tag(ModTags.Blocks.META_NONFOLIATED)
                .add(ModBlocks.QUARTZITE.get(),
                    ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.FELSIVE_EXTRUSIVE)
                .add(ModBlocks.QUARTZITE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.FELSIC_INTRUSIVE)
                .add(ModBlocks.QUARTZITE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.INTERMEDIATE_EXTRUSIVE)
                .add(ModBlocks.QUARTZITE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.INTERMEDIATE_INTRUSIVE)
                .add(ModBlocks.QUARTZITE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.MAFIC_EXTRUSIVE)
                .add(ModBlocks.QUARTZITE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.MAFIC_INTRUSIVE)
                .add(ModBlocks.QUARTZITE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.ULTRAMAFIC_EXTRUSIVE)
                .add(ModBlocks.QUARTZITE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.ULTRAMAFIC_INTRUSIVE)
                .add(ModBlocks.QUARTZITE.get(),
                        ModBlocks.MARBLE.get());

        this.tag(ModTags.Blocks.SANDSTONE)
                .add(ModBlocks.SANDSTONE_TURBIDITE.get(),
                        ModBlocks.SANDSTONE_GANISTER.get());

        this.tag(ModTags.Blocks.sio2)
                .add(Blocks.QUARTZ_BLOCK,
                        Blocks.AMETHYST_BLOCK,
                        ModBlocks.QUARTZ_CRYSTAL_BLOCK.get(),
                        ModBlocks.CITRINE_CRYSTAL_BLOCK.get(),
                        ModBlocks.AMETRINE_CRYSTAL_BLOCK.get(),
                        ModBlocks.AVENTURINE_CRYSTAL_BLOCK.get(),
                        ModBlocks.BLOODSTONE_CRYSTAL_BLOCK.get(),
                        ModBlocks.DUMORTIERITE_CRYSTAL_BLOCK.get(),
                        ModBlocks.PRASIOLITE_CRYSTAL_BLOCK.get(),
                        ModBlocks.SMOKY_CRYSTAL_BLOCK.get(),
                        ModBlocks.ROSE_CRYSTAL_BLOCK.get(),
                        ModBlocks.CHERT.get(),
                        ModBlocks.CHERT_COBBLESTONE.get(),
                        ModBlocks.CHERT_CHALCEDONY.get(),
                        ModBlocks.CHERT_CHALCEDONY_COBBLESTONE.get(),
                        ModBlocks.CHERT_AGATE.get(),
                        ModBlocks.CHERT_JASPER.get(),
                        ModBlocks.CHERT_FLINTSTONE.get(),
                        ModBlocks.TEKTITE_LECHATELIERITE.get(),
                        ModBlocks.TEKTITE_COESITE.get(),
                        ModBlocks.FULGURITE.get(),
                        ModBlocks.OPAL_BLOCK.get(),
                        ModBlocks.OPAL_BLOCK_BOULDER.get(),
                        ModBlocks.OPAL_BLOCK_COMMON.get());


    }
}