package net.junedev.junetech_geo.item;

import net.junedev.junetech_geo.JunetechGeo;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.junedev.junetech_geo.util.CompositionConstants.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JunetechGeo.MOD_ID);

       // for public static final RegistryObject<Item> VAR1 = ITEMS.register("var2",
         //       () -> new Item(new Item.Properties())); = (VAR1, var2)??? could this work?
//Sand Piles
        public static final RegistryObject<Item> SAND_PILE = ITEMS.register("sand_pile",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_RED = ITEMS.register("sand_pile_red",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_BASALT = ITEMS.register("sand_pile_basalt",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_CASSITERITE = ITEMS.register("sand_pile_cassiterite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_GLAUCONITE = ITEMS.register("sand_pile_glauconite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_GRANITE = ITEMS.register("sand_pile_granite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_LACUSTRINE = ITEMS.register("sand_pile_lacustrine",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_ALKALI_FELDSPAR = ITEMS.register("sand_pile_alkali_feldspar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_PLAGIOCLASE_FELDSPAR = ITEMS.register("sand_pile_plagioclase_feldspar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_SODALITE = ITEMS.register("sand_pile_sodalite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAND_PILE_SOUL = ITEMS.register("sand_pile_soul",
                () -> new Item(new Item.Properties()));
//Minerals
        public static final RegistryObject<Item> CITRINE_SHARD = ITEMS.register("citrine_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMETRINE_SHARD = ITEMS.register("ametrine_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AVENTURINE_SHARD = ITEMS.register("aventurine_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BLOODSTONE_QUARTZ_SHARD = ITEMS.register("bloodstone_quartz_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DUMORTIERITE_SHARD = ITEMS.register("dumortierite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PRASIOLITE_SHARD = ITEMS.register("prasiolite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SMOKY_QUARTZ_SHARD = ITEMS.register("smoky_quartz_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROSE_QUARTZ_SHARD = ITEMS.register("rose_quartz_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMBER_SHARD = ITEMS.register("amber_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MOSQUITO_AMBER_SHARD = ITEMS.register("mosquito_amber_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OPAL_SHARD = ITEMS.register("opal_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MULLITE_SHARD = ITEMS.register("mullite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DUST_SALT_NACL = ITEMS.register("dust_salt_nacl",
                () -> new ItemWithTooltip(new Item.Properties(), NACL, true));
        public static final RegistryObject<Item> CHALK_STICK = ITEMS.register("chalk_stick",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIC_LIME = ITEMS.register("lithic_lime",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIC_ALKALI_FELDSPAR = ITEMS.register("lithic_alkali_feldspar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIC_PLAGIOCLASE_FELDSPAR = ITEMS.register("lithic_plagioclase_feldspar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIC_QUARTZ = ITEMS.register("lithic_quartz",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COAL_ANTHRACITE = ITEMS.register("coal_anthracite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COAL_LIGNITE = ITEMS.register("coal_lignite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_CALCITE = ITEMS.register("cemented_calcite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_HEMATITE = ITEMS.register("cemented_hematite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_METACONGLOMERATE = ITEMS.register("cemented_metaconglomerate",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_SIDERITE = ITEMS.register("cemented_siderite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CEMENTED_SILICA = ITEMS.register("cemented_silica",
                () -> new Item(new Item.Properties()));
//Geodes
        public static final RegistryObject<Item> GEODE_CLOSED = ITEMS.register("geode_closed",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_AGATE = ITEMS.register("geode_agate",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_AMETHYST = ITEMS.register("geode_amethyst",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_JASPER = ITEMS.register("geode_jasper",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_ONYX = ITEMS.register("geode_onyx",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEODE_QUARTZ = ITEMS.register("geode_quartz",
                () -> new Item(new Item.Properties()));
//Tools
        public static final RegistryObject<Item> CHISEL_IRON = ITEMS.register("chisel_iron",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHISEL_DIAMOND = ITEMS.register("chisel_diamond",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHISEL_NETHERITE = ITEMS.register("chisel_netherite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROCKHOUNDERS_SATCHEL = ITEMS.register("rockhounders_satchel",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROCKHOUNDERS_BACKPACK = ITEMS.register("rockhounders_backpack",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MACUAHUITL = ITEMS.register("macuahuitl",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUCKET_OF_CRUDE_OIL = ITEMS.register("bucket_of_crude_oil",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUCKET_OF_LAHAR = ITEMS.register("bucket_of_lahar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUCKET_OF_MERCURY = ITEMS.register("bucket_of_mercury",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUCKET_OF_TAR = ITEMS.register("bucket_of_tar",
                () -> new Item(new Item.Properties()));
//Fossils
        public static final RegistryObject<Item> FOSSIL_ARCHAEOCYATHAN = ITEMS.register("fossil_archaeocyathan",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_BRYOZOAN = ITEMS.register("fossil_bryozoan",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_CEPHALOPOD = ITEMS.register("fossil_cephalopod",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_CORAL = ITEMS.register("fossil_coral",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_CRINOID = ITEMS.register("fossil_crinoid",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_ECHINOID = ITEMS.register("fossil_echinoid",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_GASTROPOD = ITEMS.register("fossil_gastropod",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_SPONGE = ITEMS.register("fossil_sponge",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_COQUINA_AMMONITE = ITEMS.register("fossil_coquina_ammonite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_COQUINA_BRACHIOPOD = ITEMS.register("fossil_coquina_brachiopod",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_COQUINA_SHARK_TOOTH = ITEMS.register("fossil_coquina_shark_tooth",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_COQUINA_TRILOBITE = ITEMS.register("fossil_coquina_trilobite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOSSIL_MAMMOTH_TUSK = ITEMS.register("fossil_mammoth_tusk",
            () -> new Item(new Item.Properties()));
//Misc
        public static final RegistryObject<Item> ADOBE_BRICK = ITEMS.register("adobe_brick",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BALL_OF_MOSS = ITEMS.register("ball_of_moss",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DIRT_CLUMP = ITEMS.register("dirt_clump",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GRASS_CLUMP = ITEMS.register("grass_clump",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GRAVEL_PEBBLES = ITEMS.register("gravel_pebbles",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LOAM_CLUMP = ITEMS.register("loam_clump",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OCHRE_CLAY_BALL = ITEMS.register("ochre_clay_ball",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RED_CLAY_BALL = ITEMS.register("red_clay_ball",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROCK_PILE = ITEMS.register("rock_pile",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PERMAFROST_CLUMP = ITEMS.register("permafrost_clump",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SILT_PILE = ITEMS.register("silt_pile",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SOOT_PILE = ITEMS.register("soot_pile",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VOLCANIC_ASH_PILE = ITEMS.register("volcanic_ash_pile",
            () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGNIFYING_GLASS = ITEMS.register("magnifying_glass",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FIELD_NOTEBOOK = ITEMS.register("field_notebook",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BOROSILICATE_GLASS_BAR = ITEMS.register("borosilicate_glass_bar",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLASK = ITEMS.register("flask",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IRON_MESH = ITEMS.register("iro_mesh",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITMUS_PAPER = ITEMS.register("litmus_paper",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PETRI_DISH = ITEMS.register("petri_dish",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPOOL_COPPER = ITEMS.register("spool_copper",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPOOL_IRON = ITEMS.register("spool_iron",
                () -> new Item(new Item.Properties()));

        //Ore Stuff / Rock Byproducts
        public static final RegistryObject<Item> FELSIC_CLAST_MIXTURE = ITEMS.register("felsic_clast_mixture",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GAS_SHALE_RAW = ITEMS.register("gas_shale_raw",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GOSSAN_AZURITE_RAW = ITEMS.register("gossan_azurite_raw",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GOSSAN_MAGNETITE_RAW = ITEMS.register("gossan_magnetite_raw",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KEROGEN_1 = ITEMS.register("kerogen_1",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KEROGEN_2 = ITEMS.register("kerogen_2",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KEROGEN_2S = ITEMS.register("kerogen_2s",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KEROGEN_3 = ITEMS.register("kerogen_3",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KEROGEN_4 = ITEMS.register("kerogen_4",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KSPAR_CLASTS = ITEMS.register("kspar_clasts",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIC_CLASTS = ITEMS.register("lithic_clasts",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAFIC_CLAST_MIXTURE = ITEMS.register("mafic_clast_mixture",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OIL_SHALE_RAW = ITEMS.register("oil_shale_raw",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLAGIOCLASE_CLASTS = ITEMS.register("plagioclase_clasts",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_CLASTS = ITEMS.register("quartz_clasts",
                () -> new Item(new Item.Properties()));

        //Minerals
        public static final RegistryObject<Item> ABELLAITE_FIBERS = ITEMS.register("abellaite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ACANTHITE_CRYSTALS = ITEMS.register("acanthite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ACTINOLITE_FIBERS = ITEMS.register("actinolite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ADACHIITE_FIBERS = ITEMS.register("adachiite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ADAMITE_CRYSTAL = ITEMS.register("adamite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ADULARIA_CRYSTAL = ITEMS.register("adularia_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AEGIRINE_CRYSTAL = ITEMS.register("aegirine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AENIGMATITE_CRYSTAL = ITEMS.register("aenigmatite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AFGHANITE_SHARD = ITEMS.register("afghanite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AGARDITE_FIBERS = ITEMS.register("agardite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AGATE_NODULE = ITEMS.register("agate_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AGRELLITE_FIBERS = ITEMS.register("agrellite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AKERMANITE_CHUNK = ITEMS.register("akermanite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALABANDITE_CRYSTAL = ITEMS.register("alabandite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALBITE_SHARDS = ITEMS.register("albite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALEXANDRITE_SHARD = ITEMS.register("alexandrite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALFORSITE_CRYSTAL = ITEMS.register("alforsite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALITE_CRYSTAL = ITEMS.register("alite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALLANITE_CUBE = ITEMS.register("allanite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALLOCLASITE_CHUNK = ITEMS.register("alloclasite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALLOPHANE_CLUMP = ITEMS.register("allophane_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALLUAUDITE_CRYSTALS = ITEMS.register("alluaudite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALMANDINE_CRYSTAL = ITEMS.register("almandine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALUM_CRYSTAL = ITEMS.register("alum_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALUMINUM_NATIVE = ITEMS.register("aluminum_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALUNITE_SHARDS = ITEMS.register("alunite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMAZONITE_CRYSTAL = ITEMS.register("amazonite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMBLYGONITE_CRYSTAL = ITEMS.register("amblygonite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMESITE_CRYSTAL = ITEMS.register("amesite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AMPHIBOLE_CRYSTAL = ITEMS.register("amphibole_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANALCIME_CRYSTAL = ITEMS.register("analcime_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANATASE_CRYSTAL = ITEMS.register("anatase_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANCYLITE_CUBE = ITEMS.register("ancylite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANDALUSITE_CRYSTAL = ITEMS.register("andalusite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANDERSONITE_CHUNK = ITEMS.register("andersonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANDESINE_CHUNK = ITEMS.register("andesine_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANDRADITE_CRYSTAL = ITEMS.register("andradite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANGLESITE_SHARD = ITEMS.register("anglesite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANHYDRITE_CRYSTAL = ITEMS.register("anhydrite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANHYDRITE_HYDROTHERMAL_CRYSTAL = ITEMS.register("anhydrite_hydrothermal_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANKERITE_SHARD = ITEMS.register("ankerite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANNITE_SHARD = ITEMS.register("annite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANORTHITE_CHUNK = ITEMS.register("anorthite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANORTHOCLASE_CRYSTAL = ITEMS.register("anorthoclase_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANTHOPHYLLITE_CHUNK = ITEMS.register("anthophyllite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANTIGORITE_FIBERS = ITEMS.register("antigorite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ANTLERITE_CRYSTAL = ITEMS.register("antlerite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> APATITE_CRYSTAL = ITEMS.register("apatite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> APATITE_COLLOPHANE_CHUNK = ITEMS.register("apatite_collophane_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> APHROSIDERITE_CRYSTAL = ITEMS.register("aphrosiderite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> APHTHITALITE_CRYSTAL = ITEMS.register("aphthitalite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> APOPHYLLITE_CUBE = ITEMS.register("apophyllite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AQUALITE_CHUNK = ITEMS.register("aqualite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AQUAMARINE_CRYSTAL = ITEMS.register("aquamarine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ARAGONITE = ITEMS.register("aragonite",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ARFVEDSONITE_CRYSTALS = ITEMS.register("arfvedsonite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ARGYRODITE_CRYSTAL = ITEMS.register("argyrodite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ARSENIC_NATIVE = ITEMS.register("arsenic_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ARSENOPYRITE_CRYSTAL = ITEMS.register("arsenopyrite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ASBESTOS_FIBERS = ITEMS.register("asbestos_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ASTROPHYLLITE_CRYSTALS = ITEMS.register("astrophyllite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ATACAMITE_CRYSTAL = ITEMS.register("atacamite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AUGITE_CRYSTALS = ITEMS.register("augite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AURA_QUARTZ_SHARD = ITEMS.register("aura_quartz_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AURICHALCITE_FIBERS = ITEMS.register("aurichalcite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AUTUNITE_SHEET = ITEMS.register("autunite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AXINITE_SHARDS = ITEMS.register("axinite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> AZURITE_SHARDS = ITEMS.register("azurite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BABINGTONITE_CRYSTAL = ITEMS.register("babingtonite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BAILEYCHLORE_CLUMP = ITEMS.register("baileychlore_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BANALSITE_CHUNK = ITEMS.register("banalsite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BANDED_IRON_CHUNK = ITEMS.register("banded_iron_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BARKEVILLE_CHUNK = ITEMS.register("barkeville_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BARRINGERITE_CRYSTAL = ITEMS.register("barringerite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BARYTE_SHARDS = ITEMS.register("baryte_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BARYTOCALCITE_ROSETTE = ITEMS.register("barytocalcite_rosette",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BASTNASITE_CRYSTAL = ITEMS.register("bastnasite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BAURANOITE_CHUNK = ITEMS.register("bauranoite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BEIDELLITE_CLAY_CHUNK = ITEMS.register("beidellite_clay_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BENITOITE_CRYSTALS = ITEMS.register("benitoite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BENTONITE_CLAY_CHUNK = ITEMS.register("bentonite_clay_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BERTHIERINE_CUBE = ITEMS.register("berthierine_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BERYL_CRYSTAL = ITEMS.register("beryl_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BERYLLIUM_NATIVE = ITEMS.register("beryllium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BERZELIITE_CRYSTAL = ITEMS.register("berzeliite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BETAFITE_CRYSTAL = ITEMS.register("betafite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BIOTITE_SHEET = ITEMS.register("biotite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BISCHOFITE_CHUNK = ITEMS.register("bischofite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BISMUTH_NATIVE = ITEMS.register("bismuth_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BISMUTH_PURE_CUBE = ITEMS.register("bismuth_pure_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BISMUTHINITE_CRYSTALS = ITEMS.register("bismuthinite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BISMUTITE_SHARDS = ITEMS.register("bismutite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BIXBYITE_CRYSTAL = ITEMS.register("bixbyite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BOEHMITE_FIBERS = ITEMS.register("boehmite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BORACITE_CRYSTAL = ITEMS.register("boracite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BORAX_CRYSTAL = ITEMS.register("borax_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BORNITE_CRYSTAL = ITEMS.register("bornite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BOROMUSCOVITE_SHARD = ITEMS.register("boromuscovite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BOUSSINGAULTITE_SHARDS = ITEMS.register("boussingaultite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRACKEBUSCHITE_CRYSTALS = ITEMS.register("brackebuschite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRAZILIANITE_CRYSTAL = ITEMS.register("brazilianite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRIANYOUNGITE_FIBERS = ITEMS.register("brianyoungite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRIDGMANITE_CUBE = ITEMS.register("bridgmanite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BROCHANTITE_FIBERS = ITEMS.register("brochantite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRONZITE_CHUNK = ITEMS.register("bronzite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BROOKITE_CRYSTALS = ITEMS.register("brookite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BROWNMILLERITE_CHUNK = ITEMS.register("brownmillerite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRUCITE_SHEET = ITEMS.register("brucite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BRUSHITE_CHUNK = ITEMS.register("brushite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUDDINGTONITE_CHUNK = ITEMS.register("buddingtonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BURBANKITE_CRYSTAL = ITEMS.register("burbankite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BUSTAMITE_CHUNK = ITEMS.register("bustamite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> BYTOWNITE_CHUNK = ITEMS.register("bytownite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CADMIUM_NATIVE = ITEMS.register("cadmium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CALAVERITE_CRYSTALS = ITEMS.register("calaverite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CALCIOFERRITE_FIBERS = ITEMS.register("calcioferrite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CALCITE_BLUE_CRYSTAL = ITEMS.register("calcite_blue_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CALCITE_SHARD = ITEMS.register("calcite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CALDERITE_CRYSTAL = ITEMS.register("calderite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CALOMEL_SHEET = ITEMS.register("calomel_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CANCRINITE_CHUNK = ITEMS.register("cancrinite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CARLSBERGITE_CHUNK = ITEMS.register("carlsbergite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CARNELIAN_NODULE = ITEMS.register("carnelian_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CARNOTITE_SHARDS = ITEMS.register("carnotite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CARPHOLITE_FIBERS = ITEMS.register("carpholite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CARROLLITE_CRYSTAL = ITEMS.register("carrollite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CASSITERITE_CRYSTAL = ITEMS.register("cassiterite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CATAPLEIITE_SHEET = ITEMS.register("catapleiite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CELADONITE_NODULE = ITEMS.register("celadonite_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CELESTINE_SHARDS = ITEMS.register("celestine_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CELSIAN_CRYSTAL = ITEMS.register("celsian_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CERUSSITE_CRYSTALS = ITEMS.register("cerussite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHABAZITE_CUBE = ITEMS.register("chabazite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHALCEDONY_NODULE = ITEMS.register("chalcedony_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHALCOCITE_SHARDS = ITEMS.register("chalcocite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHALCONATRONITE_FIBERS = ITEMS.register("chalconatronite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHALCOPYRITE_CRYSTAL = ITEMS.register("chalcopyrite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHAMOSITE_SHARDS = ITEMS.register("chamosite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHAROITE_FIBERS = ITEMS.register("charoite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHENITE_SHARDS = ITEMS.register("chenite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHIBAITE_CLUMP = ITEMS.register("chibaite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHLORAPATITE_CRYSTAL = ITEMS.register("chlorapatite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHLORARGYRITE_CRYSTAL = ITEMS.register("chlorargyrite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHLORASTROLITE_CLUMP = ITEMS.register("chlorastrolite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHLORITE_CLUMP = ITEMS.register("chlorite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHLORITOID_CRYSTAL = ITEMS.register("chloritoid_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHLOROMELANITE_CHUNK = ITEMS.register("chloromelanite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHONDRODITE_CRYSTAL = ITEMS.register("chondrodite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHROMFERIDE_NANOCRYSTAL = ITEMS.register("chromferide_nanocrystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHROMITE_CRYSTAL = ITEMS.register("chromite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHRYSOBERYL_CRYSTAL = ITEMS.register("chrysoberyl_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHRYSOCOLLA_BLUE_CLUMP = ITEMS.register("chrysocolla_blue_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHRYSOCOLLA_GREEN_CLUMP = ITEMS.register("chrysocolla_green_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHRYSOPRASE_NODULE = ITEMS.register("chrysoprase_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHRYSOTILE_FIBERS = ITEMS.register("chrysotile_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHUDOBAITE_FIBERS = ITEMS.register("chudobaite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CHURCHITE_FIBERS = ITEMS.register("churchite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CINNABAR_SHARDS = ITEMS.register("cinnabar_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLARKEITE_NODULE = ITEMS.register("clarkeite_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINOCHLORE_CRYSTAL = ITEMS.register("clinochlore_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINOCLASE_CRYSTALS = ITEMS.register("clinoclase_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINOFERROSILITE_CRYSTALS = ITEMS.register("clinoferrosilite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINOHUMITE_CRYSTAL = ITEMS.register("clinohumite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINOPYROXENE_CRYSTAL = ITEMS.register("clinopyroxene_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINOSUENOITE_CRYSTAL = ITEMS.register("clinosuenoite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINOTHULITE_CHUNK = ITEMS.register("clinothulite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINOZOISITE_CRYSTALS = ITEMS.register("clinozoisite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CLINTONITE_SHEET = ITEMS.register("clintonite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COBALTITE_CHUNK = ITEMS.register("cobaltite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COCCINITE_CHUNK = ITEMS.register("coccinite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COESITE_CHUNK = ITEMS.register("coesite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COHENITE_CHUNK = ITEMS.register("cohenite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COLEMANITE_CRYSTALS = ITEMS.register("colemanite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COLUMBITE_CHUNK = ITEMS.register("columbite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CONICHALCITE_CRYSTALS = ITEMS.register("conichalcite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CONNELLITE_FIBERS = ITEMS.register("connellite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COOKEITE_CLUMP = ITEMS.register("cookeite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COOPERITE_CRYSTAL = ITEMS.register("cooperite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COPIAPITE_CLUMP = ITEMS.register("copiapite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COPPER_TELLURIC = ITEMS.register("copper_telluric",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CORDIERITE_CRYSTAL = ITEMS.register("cordierite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CORKITE_CRYSTAL = ITEMS.register("corkite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CORNWALLITE_CLUMP = ITEMS.register("cornwallite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CORONADITE_CLUMP = ITEMS.register("coronadite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CORUNDUM_CRYSTAL = ITEMS.register("corundum_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> COVELLITE_CRYSTAL = ITEMS.register("covellite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CRISTOBALITE_CRYSTAL = ITEMS.register("cristobalite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CROCIDOLITE_FIBERS = ITEMS.register("crocidolite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CROCOITE_CRYSTALS = ITEMS.register("crocoite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CRONSTEDTITE_CHUNK = ITEMS.register("cronstedtite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CROSSITE_CRYSTALS = ITEMS.register("crossite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CRYOLITE_CHUNK = ITEMS.register("cryolite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CUMMINGTONITE_CHUNK = ITEMS.register("cummingtonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CUPRITE_CRYSTAL = ITEMS.register("cuprite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> CUPRITE_CHALCOTRICHITE_CRYSTALS = ITEMS.register("cuprite_chalcotrichite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DACHIARDITE_FIBERS = ITEMS.register("dachiardite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DATOLITE_CRYSTAL = ITEMS.register("datolite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DAUBREELITE_CRYSTAL = ITEMS.register("daubreelite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DEMANTOID_CRYSTAL = ITEMS.register("demantoid_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DESCLOIZITE_CRYSTAL = ITEMS.register("descloizite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DEVILLINE_SHARDS = ITEMS.register("devilline_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DIAMOND = ITEMS.register("diamond",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DIASPORE_CRYSTAL = ITEMS.register("diaspore_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DICKITE_SHEET = ITEMS.register("dickite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DIOPSIDE_CHROMIUM_CRYSTAL = ITEMS.register("diopside_chromium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DIOPSIDE_CRYSTAL = ITEMS.register("diopside_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DOLOMITE_CRYSTAL = ITEMS.register("dolomite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DOLOMITE_IRON_CRYSTAL = ITEMS.register("dolomite_iron_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DORRITE_SHARD = ITEMS.register("dorrite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DOYLEITE_CLUMP = ITEMS.register("doyleite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DRAVITE_CRYSTAL = ITEMS.register("dravite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DRESSERITE_FIBERS = ITEMS.register("dresserite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DUFRENITE_SHARDS = ITEMS.register("dufrenite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DUFTITE_CRYSTAL = ITEMS.register("duftite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> DUGGANITE_CRYSTAL = ITEMS.register("dugganite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EASTONITE_SHEET = ITEMS.register("eastonite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ECKERMANNITE_CHUNK = ITEMS.register("eckermannite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EDENITE_CRYSTAL = ITEMS.register("edenite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ELBAITE_CRYSTAL = ITEMS.register("elbaite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ELECTRUM_CHUNK = ITEMS.register("electrum_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ELYITE_CRYSTALS = ITEMS.register("elyite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EMERALD = ITEMS.register("emerald",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EMERALD_TRAPICHE_CRYSTAL = ITEMS.register("emerald_trapiche_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ENARGITE_CRYSTAL = ITEMS.register("enargite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ENSTATITE_CRYSTAL = ITEMS.register("enstatite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EPHESITE_SHARDS = ITEMS.register("ephesite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EPIDOTE_CRYSTALS = ITEMS.register("epidote_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EPISTILBITE_CRYSTAL = ITEMS.register("epistilbite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EPSOMITE_FIBERS = ITEMS.register("epsomite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ERYTHRITE_FIBERS = ITEMS.register("erythrite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ESKOLAITE_CRYSTAL = ITEMS.register("eskolaite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EUDIALYTE_CRYSTAL = ITEMS.register("eudialyte_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> EUXENITE_SHARD = ITEMS.register("euxenite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FASSAITE_SHARD = ITEMS.register("fassaite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FAYALITE_CHUNK = ITEMS.register("fayalite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FELDSPAR_SHARDS = ITEMS.register("feldspar_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FERBERITE_SHARD = ITEMS.register("ferberite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FERRIHYDRITE_FIBERS = ITEMS.register("ferrihydrite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FERRONICKELPLATINUM_NODULE = ITEMS.register("ferronickelplatinum_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FERROSILITE_CRYSTALS = ITEMS.register("ferrosilite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUCKITE_FIBERS = ITEMS.register("fluckite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUOR_DRAVITE_CRYSTAL = ITEMS.register("fluor_dravite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUORAPATITE_CRYSTAL = ITEMS.register("fluorapatite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUORITE_ANTONOLITE_CHUNK = ITEMS.register("fluorite_antonilite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUORITE_CRYSTAL = ITEMS.register("fluorite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUORITE_FALSE_EMERALD_CRYSTAL = ITEMS.register("fluorite_false_emerald_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUORITE_FALSE_TOPAZ_CRYSTAL = ITEMS.register("fluorite_false_topaz_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FLUORITE_GREEN_CRYSTAL = ITEMS.register("fluorite_green_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FORSTERITE_CRYSTAL = ITEMS.register("forsterite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FOURMARIERITE_CRYSTAL = ITEMS.register("fourmarierite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> FUCHSITE_SHARDS = ITEMS.register("fuchsite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GADOLINITE_CRYSTAL = ITEMS.register("gadolinite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GALAXITE_CRYSTAL = ITEMS.register("galaxite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GALENA_CUBE = ITEMS.register("galena_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GALLITE_CHUNK = ITEMS.register("gallite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GARNET_CRYSTAL = ITEMS.register("garnet_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GARNET_YELLOW_CRYSTAL = ITEMS.register("garnet_yellow_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GARNIERITE_CLUMP = ITEMS.register("garnierite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GASPEITE_CLUMP = ITEMS.register("gaspeite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEDRITE_CHUNK = ITEMS.register("gedrite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEHLENITE_CUBE = ITEMS.register("gehlenite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GEIKIELITE_CRYSTAL = ITEMS.register("geikielite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GERMANITE_CHUNK = ITEMS.register("germanite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GIBBSITE_CLUMP = ITEMS.register("gibbsite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLASS_SLAG_CHUNK = ITEMS.register("glass_slag_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLASS_SLAG_CITRINE_CHUNK = ITEMS.register("glass_slag_citrine_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLASS_SLAG_ROSE_CHUNK = ITEMS.register("glass_slag_rose_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLASS_SLAG_BODEACHAT_CHUNK = ITEMS.register("glass_slag_bodeachat_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLASS_SLAG_FERROLITE_CHUNK = ITEMS.register("glass_slag_ferrolite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLAUBERITE_SHARDS = ITEMS.register("glauberite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLAUCONITE_CHUNK = ITEMS.register("glauconite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GLAUCOPHANE_CRYSTALS = ITEMS.register("glaucophane_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GMELINITE_CRYSTAL = ITEMS.register("gmelinite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GOBBINSITE_CHUNK = ITEMS.register("gobbinsite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GOLD_TELLURIC = ITEMS.register("gold_telluric",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GOLDMANITE_CRYSTAL = ITEMS.register("goldmanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GOSLARITE_CHUNK = ITEMS.register("goslarite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GRAPHITE_SHEET = ITEMS.register("graphite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GREENALITE_NODULE = ITEMS.register("greenalite_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GREENOCKITE_CRYSTAL = ITEMS.register("greenockite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GROSSULAR_CRYSTALS = ITEMS.register("grossular_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GUANGLINITE_SHARDS = ITEMS.register("guanglinite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GUMMITE_CHUNK = ITEMS.register("gummite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GYPSUM_FIBERS = ITEMS.register("gypsum_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GYPSUM_SATIN_SPAR_FIBERS = ITEMS.register("gypsum_satin_spar_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HAFNON_CRYSTAL = ITEMS.register("hafnon_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HALITE_CUBE = ITEMS.register("halite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HALLOYSITE_CLAY_CHUNK = ITEMS.register("halloysite_clay_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HALOTRICHITE_FIBERS = ITEMS.register("halotrichite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HANCOCKITE_CRYSTALS = ITEMS.register("hancockite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HARMOTOME_SHARD = ITEMS.register("harmotome_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HASTINGSITE_CRYSTAL = ITEMS.register("hastingsite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HAUYNE_CRYSTAL = ITEMS.register("hauyne_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HAXONITE_CUBE = ITEMS.register("haxonite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HEAZLEWOODITE_CHUNK = ITEMS.register("heazlewoodite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HEDENBERGITE_CRYSTAL = ITEMS.register("hedenbergite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HELIODOR_CRYSTAL = ITEMS.register("heliodor_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HEMATITE_CHUNK = ITEMS.register("hematite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HENRITERMIERITE_CRYSTAL = ITEMS.register("henritermierite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HERBERTSMITHITE_SHARDS = ITEMS.register("herbertsmithite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HERCYNITE_CRYSTAL = ITEMS.register("hercynite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HESSITE_CRYSTAL = ITEMS.register("hessite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HEULANDITE_SHEET = ITEMS.register("heulandite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HIBONITE_CRYSTAL = ITEMS.register("hibonite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HIORTDAHLITE_CRYSTAL = ITEMS.register("hiortdahlite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HOGBOMITE_CRYSTAL = ITEMS.register("hogbomite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HOLLANDITE_CLUMP = ITEMS.register("hollandite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HOLMQUISTITE_CRYSTAL = ITEMS.register("holmquistite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HONESSITE_FIBERS = ITEMS.register("honessite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HORNBLENDE_BASALTIC_CRYSTAL = ITEMS.register("hornblende_basaltic_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HORNBLENDE_CRYSTAL = ITEMS.register("hornblende_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HOWLITE_CRYSTALS = ITEMS.register("howlite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HUBERITE_CRYSTALS = ITEMS.register("huberite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HUMITE_CRYSTAL = ITEMS.register("humite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HYALOPHANE_CHUNK = ITEMS.register("hyalophane_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HYDROCERUSSITE_SHARD = ITEMS.register("hydrocerussite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HYDROGROSSULAR_CRYSTAL = ITEMS.register("hydrogrossular_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HYDROHONESSITE_CLUMP = ITEMS.register("hydrohonessite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HYDRONEPHELITE_CHUNK = ITEMS.register("hydronephelite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HYDROXYAPATITE_CRYSTAL = ITEMS.register("hydroxyapatite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> HYDROZINCITE_CLUMP = ITEMS.register("hydrozincite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IDDINGSITE_CHUNK = ITEMS.register("iddingsite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IDRIALITE_CHUNK = ITEMS.register("idrialite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ILLITE_SHEET = ITEMS.register("illite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ILMENITE_SHARDS = ITEMS.register("ilmenite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IMOGOLITE_CLAY_CHUNK = ITEMS.register("imogolite_clay_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IRIDIUM_NATIVE = ITEMS.register("iridium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IRON_METEORIC_CHUNK = ITEMS.register("iron_meteoric_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IRON_NATIVE = ITEMS.register("iron_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ISMIRODINE_CRYSTAL = ITEMS.register("ismirodine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> IVAITE_CRYSTAL = ITEMS.register("ivaite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JADEITE_CHUNK = ITEMS.register("jadeite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JAHNSITE_SHARDS = ITEMS.register("jahnsite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JAROLITE_CRYSTAL = ITEMS.register("jarolite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JASPER_NODULE = ITEMS.register("jasper_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JASPILLITE_NODULE = ITEMS.register("jaspillite_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JERVISITE_FIBERS = ITEMS.register("jervisite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JOHANNSENITE_CHUNK = ITEMS.register("johannsenite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JORDANITE_CRYSTAL = ITEMS.register("jordanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> JUNITOITE_SHEET = ITEMS.register("junitoite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KAERSUTITE_CRYSTAL = ITEMS.register("kaersutite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KALSILITE_CRYSTAL = ITEMS.register("kalsilite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KAMACITE_CHUNK = ITEMS.register("kamacite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KAMIOKITE_CHUNK = ITEMS.register("kamiokite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KAOLINITE_FIBERS = ITEMS.register("kaolinite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KARELIANITE_FIBERS = ITEMS.register("karelianite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KATOPHORITE_CRYSTAL = ITEMS.register("katophorite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KERNITE_SHARD = ITEMS.register("kernite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KESTERITE_CRYSTAL = ITEMS.register("kesterite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KORNERUPINE_CHUNK = ITEMS.register("kornerupine_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KOSMOCHLOR_SHEET = ITEMS.register("kosmochlor_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KUTNOHORITE_FIBERS = ITEMS.register("kutnohorite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> KYANITE_CRYSTAL = ITEMS.register("kyanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LABRADORITE_CRYSTAL = ITEMS.register("labradorite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAMPROPHYLLITE_CRYSTALS = ITEMS.register("lamprophyllite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LANARKITE_FIBERS = ITEMS.register("lanarkite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LANGITE_CRYSTAL = ITEMS.register("langite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LARIMAR_CLUMP = ITEMS.register("larimar_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LARNITE_CRYSTAL = ITEMS.register("larnite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAUEITE_CRYSTAL = ITEMS.register("laueite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAUMONTITE_CRYSTAL = ITEMS.register("laumontite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAURANIITE_SHARDS = ITEMS.register("lauraniite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAURITE_CRYSTAL = ITEMS.register("laurite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAVENITE_SHARD = ITEMS.register("lavenite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAWSONITE_CRYSTAL = ITEMS.register("lawsonite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAZULITE_CRYSTAL = ITEMS.register("lazulite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LAZURITE_CRYSTAL = ITEMS.register("lazurite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEAD_NATIVE = ITEMS.register("lead_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LECHATELIERITE_CHUNK = ITEMS.register("lechatelierite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEPIDOCROCITE_FIBERS = ITEMS.register("lepidocrocite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEPIDOLITE_SHEET = ITEMS.register("lepidolite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEUCITE_CRYSTAL = ITEMS.register("leucite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEUCOXENE_CRYSTAL = ITEMS.register("leucoxene_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LEVYNE_SHEET = ITEMS.register("levyne_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIBETHENITE_CRYSTAL = ITEMS.register("libethenite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIEBENBERG_SHARD = ITEMS.register("liebenberg_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LILEYITE_CUBE = ITEMS.register("lileyite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIMONITE_BROWN_CLUMP = ITEMS.register("limonite_brown_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIMONITE_YELLOW_CLUMP = ITEMS.register("limonite_yellow_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LINNAEITE_CRYSTAL = ITEMS.register("linnaeite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHARGE_CRYSTAL = ITEMS.register("litharge_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LITHIUM_NATIVE = ITEMS.register("lithium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LIZARDITE_SHARD = ITEMS.register("lizardite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LOLLINGITE_CRYSTALS = ITEMS.register("lollingite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LORANDITE_CRYSTAL = ITEMS.register("lorandite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LUDWIGITE_FIBERS = ITEMS.register("ludwigite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> LUZONITE_CHUNK = ITEMS.register("luzonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MACKINAWITE_CRYSTALS = ITEMS.register("mackinawite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGNESITE_CRYSTAL = ITEMS.register("magnesite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGNETITE_CRYSTAL = ITEMS.register("magnetite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGNETITE_TITANIUM_CRYSTAL = ITEMS.register("magnetite_titanium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGNETITE_VANADIUM_CRYSTAL = ITEMS.register("magnetite_vanadium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAGNOMAGNETITE_CRYSTAL = ITEMS.register("magnomagnetite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MAJORITE_FIBERS = ITEMS.register("majorite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MANGANESE_NATIVE = ITEMS.register("manganese_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MARCASITE_CHUNK = ITEMS.register("marcasite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MARGARITE_FIBERS = ITEMS.register("margarite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MARIALITE_CRYSTAL = ITEMS.register("marialite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MASCAGNITE_CRYSTALS = ITEMS.register("mascagnite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MASKELYNITE_CHUNK = ITEMS.register("maskelynite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MASSICOT_CHUNK = ITEMS.register("massicot_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MEIONITE_CRYSTAL = ITEMS.register("meionite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MELANOPHLOGITE_CLUMP = ITEMS.register("melanophlogite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MELANTERITE_CHUNK = ITEMS.register("melanterite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MELILITE_CHUNK = ITEMS.register("melilite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MELIPHANITE_SHARDS = ITEMS.register("meliphanite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MERRILLITE_NANOCRYSTAL = ITEMS.register("merrillite_nanocrystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MERWINITE_CHUNK = ITEMS.register("merwinite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> META_AUTUNITE_CRYSTAL = ITEMS.register("meta_autunite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> METAPHONOLITE_CHUNK = ITEMS.register("metaphonolite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> METAVANDENDRIESSCHEITE_SHARD = ITEMS.register("metavandendriesscheite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> METAVOLTINE_SHARDS = ITEMS.register("metavoltine_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MICA_SHEET = ITEMS.register("mica_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MICROCLINE_SHARD = ITEMS.register("microcline_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MILLERITE_FIBERS = ITEMS.register("millerite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MIMETITE_CRYSTAL = ITEMS.register("mimetite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MINIUM_CHUNK = ITEMS.register("minium_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MINRECORDITE_CLUMP = ITEMS.register("minrecordite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MIRABILITE_CRYSTALS = ITEMS.register("mirabilite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MITRIDATITE_CHUNK = ITEMS.register("mitridatite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MOGANITE_CHUNK = ITEMS.register("moganite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MOHAWKITE_CHUNK = ITEMS.register("mohawkite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MOISSANITE_CRYSTAL = ITEMS.register("moissanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MOLYBDENITE_SHARD = ITEMS.register("molybdenite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONAZITE_CRYSTAL = ITEMS.register("monazite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONAZITE_CERIUM_CRYSTAL = ITEMS.register("monazite_cerium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONAZITE_GADOLINIUM_CRYSTAL = ITEMS.register("monazite_gadolinium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONAZITE_LANTHANUM_CRYSTAL = ITEMS.register("monazite_lanthanum_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONAZITE_NEODYMIUM_CRYSTAL = ITEMS.register("monazite_neodymium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONAZITE_SAMARIUM_CRYSTAL = ITEMS.register("monazite_samarium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONTICELLITE_CRYSTAL = ITEMS.register("monticellite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MONTMORILLONITE_CLAY_CHUNK = ITEMS.register("montmorillonite_clay_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MOONSTONE_CHUNK = ITEMS.register("moonstone_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MORGANITE_CRYSTAL = ITEMS.register("morganite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MOTTRAMITE_CLUMP = ITEMS.register("mottramite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MUSCOVITE_SHEET = ITEMS.register("muscovite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> MUSGRAVITE_CLUMP = ITEMS.register("musgravite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NAKAURIITE_CLUMP = ITEMS.register("nakauriite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NAMANSILITE_FIBERS = ITEMS.register("namansilite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NATROLITE_FIBERS = ITEMS.register("natrolite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NEPHELINE_CRYSTAL = ITEMS.register("nepheline_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NICKEL_NATIVE = ITEMS.register("nickel_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NICKELINE_SHARD = ITEMS.register("nickeline_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NICKELPHOSPHIDE_NANOCRYSTAL = ITEMS.register("nickelphosphide_nanocrystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NIERITE_NANOCRYSTAL = ITEMS.register("nierite_nanocrystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NITRATINE_CHUNK = ITEMS.register("nitratine_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NITRE_NODULE = ITEMS.register("nitre_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NITROCALCITE_CRYSTAL = ITEMS.register("nitrocalcite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NOLANITE_CHUNK = ITEMS.register("nolanite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NONTRONITE_CLUMP = ITEMS.register("nontronite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NORDSTRANDITE_CLUMP = ITEMS.register("nordstrandite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NORSETHITE_CRYSTAL = ITEMS.register("norsethite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> NOSEAN_CRYSTAL = ITEMS.register("nosean_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OBSIDIAN_SNOWFLAKE_SHARD = ITEMS.register("obsidian_snowflake_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OKENITE_FIBERS = ITEMS.register("okenite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLDHAMITE_NODULE = ITEMS.register("oldhamite_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLEKMINSKITE_SHARDS = ITEMS.register("olekminskite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLENITE_CHUNK = ITEMS.register("olenite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLIGOCLASE_SHARDS = ITEMS.register("oligoclase_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLIVENITE_FIBERS = ITEMS.register("olivenite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLIVINE_CALCITE_SHARD = ITEMS.register("olivine_calcite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OLIVINE_CHUNK = ITEMS.register("olivine_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OMPHACITE_CRYSTAL = ITEMS.register("omphacite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ONYX_NODULE = ITEMS.register("onyx_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OPAL_BOULDER_SHARD = ITEMS.register("opal_boulder_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OPAL_COMMON_SHARD = ITEMS.register("opal_common_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ORPIMENT_SHARDS = ITEMS.register("orpiment_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ALKALI_FELDSPAR_CHUNK = ITEMS.register("alkali_feldspar_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ORTHOPYROXENE_CRYSTAL = ITEMS.register("orthopyroxene_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OSMIRIDIUM_CRYSTAL = ITEMS.register("osmiridium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OSUMILITE_CRYSTAL = ITEMS.register("osumilite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> OTAVITE_CRYSTAL = ITEMS.register("otavite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PADPARADSCHA_SHARD = ITEMS.register("padparadscha_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PALENZONAITE_CRYSTAL = ITEMS.register("palenzonaite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PALLADIUM_NATIVE = ITEMS.register("palladium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PALYGORSKITE_CLAY_CHUNK = ITEMS.register("palygorskite_clay_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PARAGONITE_FIBERS = ITEMS.register("paragonite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PARALSTONITE_SHARDS = ITEMS.register("paralstonite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PARATACAMITE_SHARDS = ITEMS.register("paratacamite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PARGASITE_CRYSTAL = ITEMS.register("pargasite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PATRONITE_CHUNK = ITEMS.register("patronite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PECORAITE_FIBERS = ITEMS.register("pecoraite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PECTOLITE_CLUMP = ITEMS.register("pectolite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PENNINE_SHEET = ITEMS.register("pennine_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PENTLANDITE_CRYSTAL = ITEMS.register("pentlandite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PERICLASE_CRYSTAL = ITEMS.register("periclase_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PERIDOT_CHUNK = ITEMS.register("peridot_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PEROVSKITE_CUBE = ITEMS.register("perovskite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PETALITE_CHUNK = ITEMS.register("petalite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PETZITE_CRYSTAL = ITEMS.register("petzite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PHARMACOLITE_FIBERS = ITEMS.register("pharmacolite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PHARMACOSIDERITE_CUBE = ITEMS.register("pharmacosiderite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PHENGITE_SHEET = ITEMS.register("phengite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PHLOGOPITE_SHEET = ITEMS.register("phlogopite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PHOSGENITE_CRYSTAL = ITEMS.register("phosgenite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PHOSPHOPHYLLITE_SHARDS = ITEMS.register("phosphophyllite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PICROMERITE_CRYSTAL = ITEMS.register("picromerite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PIEMONTITE_CRYSTAL = ITEMS.register("piemontite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PIGEONITE_SHARDS = ITEMS.register("pigeonite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PISEKITE_CRYSTAL = ITEMS.register("pisekite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLAGIOCLASE_CHUNK = ITEMS.register("plagioclase_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLATINIRIDIUM_CRYSTAL = ITEMS.register("platiniridium_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLATINUM_NATIVE = ITEMS.register("platinum_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLEONASTE_CRYSTAL = ITEMS.register("pleonaste_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLUMBOGUMMITE_CHUNK = ITEMS.register("plumbogummite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PLUMBOJAROSITE_SHARDS = ITEMS.register("plumbojarosite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> POLYBASITE_CRYSTAL = ITEMS.register("polybasite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> POLYHALITE_CRYSTAL = ITEMS.register("polyhalite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PORTLANDITE_CHUNK = ITEMS.register("portlandite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> POSNJAKITE_CRYSTAL = ITEMS.register("posnjakite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> POTASSIC_MAGNESIO_FLUORO_ARFVEDSONITE_CRYSTAL = ITEMS.register("potassic_magnesio_fluoro_arfvedsonite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> POUDRETTEITE_SHARD = ITEMS.register("poudretteite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> POWELLITE_SHARDS = ITEMS.register("powellite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PRASE_SHARD = ITEMS.register("prase_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PRASOLITE_CLUMP = ITEMS.register("prasolite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PREHNITE_CLUMP = ITEMS.register("prehnite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PSEUDOBROOKITE_CRYSTAL = ITEMS.register("pseudobrookite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PSEUDOMALACHITE_CRYSTAL = ITEMS.register("pseudomalachite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PSEUDOWOLLASTONITE_SHARDS = ITEMS.register("pseudowollastonite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PSILOMELANE_CHUNK = ITEMS.register("psilomelane_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PUMPELLYITE_FIBERS = ITEMS.register("pumpellyite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PURPURITE_CHUNK = ITEMS.register("purpurite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYRITE_CUBE = ITEMS.register("pyrite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYRITE_FRAMBOID = ITEMS.register("pyrite_framboid",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROCHLORE_CRYSTAL = ITEMS.register("pyrochlore_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROLUSITE_CLUMP = ITEMS.register("pyrolusite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROMORPHITE_CLUMP = ITEMS.register("pyromorphite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROPE_CRYSTAL = ITEMS.register("pyrope_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROPHANITE_SHEET = ITEMS.register("pyrophanite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROPHYLLITE_CHUNK = ITEMS.register("pyrophyllite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYROXENE_CHUNK = ITEMS.register("pyroxene_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> PYRRHOTITE_CRYSTAL = ITEMS.register("pyrrhotite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_FERRUGINOUS_CRYSTAL = ITEMS.register("quartz_ferruginous_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_HERKIMER_CRYSTAL = ITEMS.register("quartz_herkimer_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_HIGH_PURITY_CRYSTAL = ITEMS.register("quartz_high_purity_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_METAMORPHOSED_SHARD = ITEMS.register("quartz_metamorphosed_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_ROCK_CRYSTAL = ITEMS.register("quartz_rock_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_RUTILATED = ITEMS.register("quartz_rutilated",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZ_SHOCKED_CHUNK = ITEMS.register("quartz_shocked_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUARTZINE_NODULE = ITEMS.register("quartzine_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> QUETZALCOATLITE_FIBERS = ITEMS.register("quetzalcoatlite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RAGUINITE_CRYSTAL = ITEMS.register("raguinite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RANKINITE_CRYSTAL = ITEMS.register("rankinite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> REALGAR_CRYSTAL = ITEMS.register("realgar_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> REDGILLITE_CRYSTALS = ITEMS.register("redgillite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RHABDOPHANE_SHARD = ITEMS.register("rhabdophane_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RHODOCHROSITE_CRYSTAL = ITEMS.register("rhodochrosite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RHODOCHROSITE_COBALT_FIBERS = ITEMS.register("rhodochrosite_cobalt_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RHODONITE_CHUNK = ITEMS.register("rhodonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RHONITE_CRYSTAL = ITEMS.register("rhonite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RICHTERITE_CHUNK = ITEMS.register("richterite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RIEBECKITE_FIBERS = ITEMS.register("riebeckite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RINGWOODITE_CRYSTAL = ITEMS.register("ringwoodite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RINMANITE_CRYSTAL = ITEMS.register("rinmanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RIPIDOLITE_CRYSTAL = ITEMS.register("ripidolite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROCKBRIDGEITE_CHUNK = ITEMS.register("rockbridgeite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROMERITE_CRYSTAL = ITEMS.register("romerite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROSASITE_FIBERS = ITEMS.register("rosasite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ROSENBUSCHITE_CHUNK = ITEMS.register("rosenbuschite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RUBELLITE_CRYSTAL = ITEMS.register("rubellite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RUBICLINE_CHUNK = ITEMS.register("rubicline_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RUBY_CRYSTAL = ITEMS.register("ruby_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RUTHENIRIDOSMINE_CRYSTAL = ITEMS.register("rutheniridosmine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> RUTILE_CRYSTAL = ITEMS.register("rutile_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SALAMMONIAC_FIBERS = ITEMS.register("salammoniac_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SALITE_CHUNK = ITEMS.register("salite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAMARSKITE_CRYSTAL = ITEMS.register("samarskite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SANIDINE_SHARDS = ITEMS.register("sanidine_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SANROMANITE_CRYSTALS = ITEMS.register("sanromanite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAPONITE_CLAY_CHUNK = ITEMS.register("saponite_clay_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_CRYSTAL = ITEMS.register("sapphire_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRE_GREEN_CRYSTAL = ITEMS.register("sapphire_green_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SAPPHIRINE_CRYSTAL = ITEMS.register("sapphirine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCAPOLITE_CRYSTAL = ITEMS.register("scapolite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCHEELITE_CRYSTAL = ITEMS.register("scheelite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCHOEPITE_CRYSTALS = ITEMS.register("schoepite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCHORL_CRYSTAL = ITEMS.register("schorl_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCHREIBERSITE_CHUNK = ITEMS.register("schreibersite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCHULENBERGITE_CRYSTAL = ITEMS.register("schulenbergite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCOLECITE_FIBERS = ITEMS.register("scolecite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SCORODITE_CRYSTAL = ITEMS.register("scorodite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SEIDOZERITE_SHARDS = ITEMS.register("seidozerite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SEIFERTITE_NANOCRYSTAL = ITEMS.register("seifertite_nanocrystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SERENDIBITE_CHUNK = ITEMS.register("serendibite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SERPENTINE_FIBERS = ITEMS.register("serpentine_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SERPIERITE_FIBERS = ITEMS.register("serpierite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SIDERITE_CLUMP = ITEMS.register("siderite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SIDEROPHYLLITE_SHEET = ITEMS.register("siderophyllite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SILICOCARNOTITE_NANOFIBERS = ITEMS.register("silicocarnotite_nanofibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SILLIMANITE_FIBERS = ITEMS.register("sillimanite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SILVER_NATIVE = ITEMS.register("silver_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SKACHAITE_CRYSTAL = ITEMS.register("skachaite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SMECTITE_CLAY_CHUNK = ITEMS.register("smectite_clay_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SMITHSONITE_CHUNK = ITEMS.register("smithsonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SMYTHITE_SHARDS = ITEMS.register("smythite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SODALITE_CHUNK = ITEMS.register("sodalite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPERRYLITE_CRYSTAL = ITEMS.register("sperrylite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPESSARTINE_CRYSTAL = ITEMS.register("spessartine_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPHALERITE_CRYSTAL = ITEMS.register("sphalerite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPHEROCOBALTITE_CUBE = ITEMS.register("spherocobaltite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPINEL_CRYSTAL = ITEMS.register("spinel_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPODUMENE_CHUNK = ITEMS.register("spodumene_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SPURRITE_CHUNK = ITEMS.register("spurrite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STAUROLITE_CRYSTAL = ITEMS.register("staurolite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STEPHANITE_CHUNK = ITEMS.register("stephanite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STIBIOTANTALITE_CRYSTAL = ITEMS.register("stibiotantalite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STIBNITE_CRYSTALS = ITEMS.register("stibnite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STILBITE_CRYSTAL = ITEMS.register("stilbite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STILPNOMELANE_CHUNK = ITEMS.register("stilpnomelane_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STISHOVITE_CHUNK = ITEMS.register("stishovite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STRONALSITE_CHUNK = ITEMS.register("stronalsite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STRONTIANITE_FIBERS = ITEMS.register("strontianite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> STRUVITE_CRYSTAL = ITEMS.register("struvite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SUDOITE_SHEET = ITEMS.register("sudoite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SUENOITE_FIBERS = ITEMS.register("suenoite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SUGILITE_CRYSTAL = ITEMS.register("sugilite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SULFUR_NATIVE = ITEMS.register("sulfur_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SUNSTONE_CHUNK = ITEMS.register("sunstone_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SVABITE_FIBERS = ITEMS.register("svabite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SYLVANITE_CRYSTAL = ITEMS.register("sylvanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SYLVITE_CUBE = ITEMS.register("sylvite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SYNGENITE_CRYSTAL = ITEMS.register("syngenite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SZAIBELYITE_FIBERS = ITEMS.register("szaibelyite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> SZOMOLNOKITE_CHUNK = ITEMS.register("szomolnokite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TAENITE_CUBE = ITEMS.register("taenite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TALC_SHEET = ITEMS.register("talc_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TALC_BEACONITE_FIBERS = ITEMS.register("talc_beaconite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TANTALITE_CHUNK = ITEMS.register("tantalite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TANZANITE_CHUNK = ITEMS.register("tanzanite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZOISITE_CRYSTAL = ITEMS.register("zoisite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TAPIOLITE_CRYSTAL = ITEMS.register("tapiolite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TELLURITE_CRYSTAL = ITEMS.register("tellurite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TENNANTITE_CRYSTAL = ITEMS.register("tennantite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TENORITE_CLUMP = ITEMS.register("tenorite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TEPHROITE_SHARDS = ITEMS.register("tephroite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TETRAHEDRITE_CRYSTAL = ITEMS.register("tetrahedrite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TETRATAENITE_CRYSTAL = ITEMS.register("tetrataenite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THOMSONITE_CHUNK = ITEMS.register("thomsonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THORIANITE_CUBE = ITEMS.register("thorianite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THORITE_CRYSTAL = ITEMS.register("thorite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THORIUM_NATIVE = ITEMS.register("thorium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THORTVEITITE_FIBERS = ITEMS.register("thortveitite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THULITE_CHUNK = ITEMS.register("thulite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> THURINGITE_SHARDS = ITEMS.register("thuringite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TILLEYITE_FIBERS = ITEMS.register("tilleyite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TIN_NATIVE = ITEMS.register("tin_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TITANAUGITE_CRYSTALS = ITEMS.register("titanaugite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TITANITE_SHARD = ITEMS.register("titanite_shard",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TLALOCITE_CLUMP = ITEMS.register("tlalocite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TOCHILINITE_CRYSTALS = ITEMS.register("tochilinite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TODOROKITE_CRYSTALS = ITEMS.register("todorokite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TOPAZ_CRYSTAL = ITEMS.register("topaz_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TORBERNITE_CUBE = ITEMS.register("torbernite_cube",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TOURMALINE_CRYSTAL = ITEMS.register("tourmaline_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TREMOLITE_FIBERS = ITEMS.register("tremolite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TRIDYMITE_SHEET = ITEMS.register("tridymite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TRIPHYLITE_CRYSTAL = ITEMS.register("triphylite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TRIPLITE_CHUNK = ITEMS.register("triplite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TROILITE_SHARDS = ITEMS.register("troilite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TRONA_FIBERS = ITEMS.register("trona_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TRUFFITE_COAL = ITEMS.register("truffite_coal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TSAREGORODTSEVITE_CLUMP = ITEMS.register("tsaregorodtsevite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TSCHERMAKITE_CHUNK = ITEMS.register("tschermakite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TSCHERMIGITE_CRYSTAL = ITEMS.register("tschermigite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TUGTUPITE_SHARDS = ITEMS.register("tugtupite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> TURQUOISE_CHUNK = ITEMS.register("turquoise_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> URANINITE_CLUMP = ITEMS.register("uraninite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> URANIUM_NATIVE = ITEMS.register("uranium_native",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> URANOPHANE_CRYSTALS = ITEMS.register("uranophane_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> URANPYROCHLORE_CRYSTAL = ITEMS.register("uranpyrochlore_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> UVAROVITE_CRYSTAL = ITEMS.register("uvarovite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> UVITE_CRYSTAL = ITEMS.register("uvite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VANADINITE_CRYSTAL = ITEMS.register("vanadinite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VANDENDRIESSCHEITE_FIBERS = ITEMS.register("vandendriesscheite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VANTHOFFITE_SHARDS = ITEMS.register("vanthoffite_shards",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VARISCITE_NODULE = ITEMS.register("variscite_nodule",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VERMICULITE_SHEET = ITEMS.register("vermiculite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VESUVIANITE_CRYSTAL = ITEMS.register("vesuvianite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VIOLARITE_CHUNK = ITEMS.register("violarite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VIVIANITE_CRYSTALS = ITEMS.register("vivianite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VOLTAITE_CRYSTAL = ITEMS.register("voltaite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> VULCANITE_CHUNK = ITEMS.register("vulcanite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WAVELLITE_CHUNK = ITEMS.register("wavellite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WHEWELLITE_FIBERS = ITEMS.register("whewellite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WHITEITE_CRYSTALS = ITEMS.register("whiteite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WHITLOCKITE_CHUNK = ITEMS.register("whitlockite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WILLEMSEITE_CHUNK = ITEMS.register("willemseite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WITHERITE_CRYSTAL = ITEMS.register("witherite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WODGINITE_CHUNK = ITEMS.register("wodginite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WOHLERITE_CRYSTAL = ITEMS.register("wohlerite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WOLFRAMITE_CHUNK = ITEMS.register("wolframite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WOLLASTONITE_CHUNK = ITEMS.register("wollastonite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WOLSENDORFITE_FIBERS = ITEMS.register("wolsendorfite_fibers",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WROEWOLFEITE_SHEET = ITEMS.register("wroewolfeite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WULFENITE_CHUNK = ITEMS.register("wulfenite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> WURTZITE_CRYSTAL = ITEMS.register("wurtzite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> XANTHOCONITE_CRYSTALS = ITEMS.register("xanthoconite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> XENOTIME_CRYSTAL = ITEMS.register("xenotime_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> XINGZHONGITE_CRYSTAL = ITEMS.register("xingzhongite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> XOCOMECATLITE_CLUMP = ITEMS.register("xocomecatlite_clump",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> YAFSOANITE_CRYSTAL = ITEMS.register("yafsoanite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> YAVAPAIITE_CRYSTALS = ITEMS.register("yavapaiite_crystals",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> YTTROFLUORITE_CHUNK = ITEMS.register("yttrofluorite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> YUGAWARALITE_SHEET = ITEMS.register("yugawaralite_sheet",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZANAZZIITE_CRYSTAL = ITEMS.register("zanazziite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZEOLITE_CHUNK = ITEMS.register("zeolite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZINCITE_CHUNK = ITEMS.register("zincite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZINCOCHROMITE_CRYSTAL = ITEMS.register("zincochromite_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZIRCON_CRYSTAL = ITEMS.register("zircon_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZIRCON_CYRTOLITE_CHUNK = ITEMS.register("zircon_cyrtolite_chunk",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZIRCON_HYACINTH_CRYSTAL = ITEMS.register("zircon_hyacinth_crystal",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> ZORITE_CRYSTALS = ITEMS.register("zorite_crystals",
                () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
