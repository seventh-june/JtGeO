package net.junedev.junetech_geo.block;

import net.junedev.junetech_geo.JunetechGeo;
import net.junedev.junetech_geo.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.junedev.junetech_geo.util.CompositionConstants.CASO4;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JunetechGeo.MOD_ID);
// geology \\
    public static final RegistryObject<Block> ADAKITE = registerBlock("adakite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADAKITE_BRICKS = registerBlock("adakite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ADAKITE_SMALL_BRICKS = registerBlock("adakite_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SMOOTH_ADAKITE = registerBlock("smooth_adakite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ALLOPHANE = registerBlock("allophane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMPHIBOLE = registerBlock("amphibole",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMPHIBOLITE = registerBlock("amphibolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDALUSITE = registerBlock("andalusite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDERSONITE = registerBlock("andersonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_ICELANDITE = registerBlock("andesite_icelandite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_WEATHERED = registerBlock("andesite_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_VOLCANIC = registerBlock("andesite_volcanic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_RED = registerBlock("andesite_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANORTHITE = registerBlock("anorthite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANORTHOSITE = registerBlock("anorthosite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANTHODITE_FLOWER = registerBlock("anthodite_flower",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE = registerBlock("anthracite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE_BRICKS = registerBlock("anthracite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE_BRICKS_SMALL = registerBlock("anthracite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE_POLISHED = registerBlock("anthracite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ANTHRACITE_RESINITE = registerBlock("anthracite_resinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARAGONITE_CRYSTAL = registerBlock("aragonite_crystal",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ARGILLITE = registerBlock("argillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARGILLITE_COBBLESTONE = registerBlock("argillite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARGILLITE_BRICKS = registerBlock("argillite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ARGILLITE_BRICKS_SMALL = registerBlock("argillite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ARGILLITE_POLISHED = registerBlock("argillite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ARGILLITE_MARINITE = registerBlock("argillite_marinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AUGITE = registerBlock("augite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BANDED_IRON_FORMATION = registerBlock("banded_iron_formation",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_AGGLOMERATE = registerBlock("basalt_agglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_BONINITE = registerBlock("basalt_boninite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BASALT_HAWAIITE = registerBlock("basalt_hawaiite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BASALT_LAYERED = registerBlock("basalt_layered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BASALT_PICRITE = registerBlock("basalt_picrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BASALT_PILLOW = registerBlock("basalt_pillow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> BAUXITE_CALCAREOUS = registerBlock("bauxite_calcareous",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAUXITE_LATERITE = registerBlock("bauxite_laterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BITUMEN = registerBlock("bitumen",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.SAND)));
    public static final RegistryObject<Block> BITUMEN_BRICKS = registerBlock("bitumen_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BITUMEN_BRICKS_SMALL = registerBlock("bitumen_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BITUMEN_POLISHED = registerBlock("bitumen_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BITUMEN_RESINITE = registerBlock("bitumen_resinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BITUMEN_SHUNGITE = registerBlock("bitumen_shungite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.SAND)));
    public static final RegistryObject<Block> BLACK_SMOKER_LARGE = registerBlock("black_smoker_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BLACK_SMOKER_SMALL = registerBlock("black_smoker_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BLAIRMORITE = registerBlock("blairmorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BOG_IRON = registerBlock("bog_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).sound(SoundType.ROOTED_DIRT)));
    public static final RegistryObject<Block> BRECCIA = registerBlock("breccia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_VARIANT_FINE_GRAINED = registerBlock("breccia_variant_fine_grained",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_VARIANT_GRAVELLY = registerBlock("breccia_variant_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_VARIANT_DIFFUSED = registerBlock("breccia_variant_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_VARIANT_PINK = registerBlock("breccia_variant_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_BRICKS = registerBlock("breccia_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BRECCIA_BRICKS_SMALL = registerBlock("breccia_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BRECCIA_POLISHED = registerBlock("breccia_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BRECCIA_DALLASITE = registerBlock("breccia_dallasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_GRAVEL = registerBlock("breccia_gravel",
            () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> CALCFLINTA = registerBlock("calcflinta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALTHEMITE = registerBlock("calthemite",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CARBONATITE_FENITE = registerBlock("carbonatite_fenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CARBONATITE_SOVITE = registerBlock("carbonatite_sovite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CATACLASITE = registerBlock("cataclasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CATACLASITE_BRICKS = registerBlock("cataclasite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CATACLASITE_BRICKS_SMALL = registerBlock("cataclasite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CATACLASITE_POLISHED = registerBlock("cataclasite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CAVE_POPCORN = registerBlock("cave_popcorn",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHALCONATRONITE = registerBlock("chalconatronite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK = registerBlock("chalk",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_VARIANT_CLEAN = registerBlock("chalk_variant_clean",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_VARIANT_VERTICAL = registerBlock("chalk_variant_vertical",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_BRICKS = registerBlock("chalk_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_BRICKS_SMALL = registerBlock("chalk_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_POLISHED = registerBlock("chalk_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHALK_COBBLESTONE = registerBlock("chalk_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT = registerBlock("chert",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_BRICKS = registerBlock("chert_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_BRICKS_SMALL = registerBlock("chert_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_POLISHED = registerBlock("chert_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE = registerBlock("chert_agate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_BRICKS = registerBlock("chert_agate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_BRICKS_SMALL = registerBlock("chert_agate_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_POLISHED = registerBlock("chert_agate_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_FIRE = registerBlock("chert_agate_fire",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_MOSS = registerBlock("chert_agate_moss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_AGATE_PURPLE = registerBlock("chert_agate_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY = registerBlock("chert_chalcedony",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_COBBLESTONE = registerBlock("chert_chalcedony_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_BRICKS = registerBlock("chert_chalcedony_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_BRICKS_SMALL = registerBlock("chert_chalcedony_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_POLISHED = registerBlock("chert_chalcedony_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_CARNELIAN = registerBlock("chert_chalcedony_carnelian",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHALCEDONY_CHROME = registerBlock("chert_chalcedony_chrome",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_CHRYSOPAGE = registerBlock("chert_chrysopage",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_COBBLESTONE = registerBlock("chert_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_DIATOMIC = registerBlock("chert_diatomic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_FLINTSTONE = registerBlock("chert_flintstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_FLINTSTONE_EMPTY = registerBlock("chert_flintstone_empty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER = registerBlock("chert_jasper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER_BRICKS = registerBlock("chert_jasper_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER_BRICKS_SMALL = registerBlock("chert_jasper_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER_POLISHED = registerBlock("chert_jasper_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER_HELIOTROPE = registerBlock("chert_jasper_heliotrope",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPILLITE = registerBlock("chert_jaspillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_MOZARKITE = registerBlock("chert_mozarkite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE = registerBlock("chert_novaculite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE_COBBLESTONE = registerBlock("chert_novaculite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE_BRICKS = registerBlock("chert_novaculite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE_BRICKS_SMALL = registerBlock("chert_novaculite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_NOVACULITE_POLISHED = registerBlock("chert_novaculite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_PIETERSITE = registerBlock("chert_pietersite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_RADIOLARIAN = registerBlock("chert_radiolarian",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_ROTTENSTONE = registerBlock("chert_rottenstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHLORASTOLITE = registerBlock("chlorastolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHROMITITE = registerBlock("chromitite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHRYSOCOLLA_BLUE = registerBlock("chrysocolla_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHRYSOCOLLA_GREEN = registerBlock("chrysocolla_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLINOPYROXENE = registerBlock("clinopyroxene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE = registerBlock("conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_VARIANT_FINE_GRAINED = registerBlock("conglomerate_variant_fine_grained",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_VARIANT_GRAVELLY = registerBlock("conglomerate_variant_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_VARIANT_DIFFUSED = registerBlock("conglomerate_variant_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_VARIANT_PINK = registerBlock("conglomerate_variant_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_BRICKS = registerBlock("conglomerate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_BRICKS_SMALL = registerBlock("conglomerate_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_POLISHED = registerBlock("conglomerate_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONGLOMERATE_GRAVEL = registerBlock("conglomerate_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORIUM = registerBlock("corium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDITE = registerBlock("corundite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_RUBY = registerBlock("corundum_ruby",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_MIXED = registerBlock("corundum_mixed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_SAPPHIRE = registerBlock("corundum_sapphire",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORUNDUM_RUBBLE = registerBlock("corundum_rubble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DACITE = registerBlock("dacite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DACITE_BRICKS = registerBlock("dacite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DACITE_BRICKS_SMALL = registerBlock("dacite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DACITE_POLISHED = registerBlock("dacite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIABASE = registerBlock("diabase",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE = registerBlock("diamictite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_COBBLESTONE = registerBlock("diamictite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_BRICKS = registerBlock("diamictite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_BRICKS_SMALL = registerBlock("diamictite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_POLISHED = registerBlock("diamictite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_TILLITE = registerBlock("diamictite_tillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIATOMITE = registerBlock("diatomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_NAPOLEONITE = registerBlock("diorite_napoleonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_BLACK = registerBlock("diorite_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_HORNBLENDE = registerBlock("diorite_hornblende",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_QUARTZ = registerBlock("diorite_quartz",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_SAPROLITE = registerBlock("dirt_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE = registerBlock("dolomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_LIMESTONE = registerBlock("dolomite_variant_limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_HORIZONTAL = registerBlock("dolomite_variant_horizontal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_BURROWS = registerBlock("dolomite_variant_burrows",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_DIFFUSED = registerBlock("dolomite_variant_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_VARIANT_CHALKY = registerBlock("dolomite_variant_chalky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_BRICKS = registerBlock("dolomite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_BRICKS_SMALL = registerBlock("dolomite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_POLISHED = registerBlock("dolomite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_COBBLESTONE = registerBlock("dolomite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_DOLARENITE = registerBlock("dolomite_dolarenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_DOLOLUTITE = registerBlock("dolomite_dololutite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_DOLORUDITE = registerBlock("dolomite_dolorudite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_DOLOSILTITE = registerBlock("dolomite_dolosiltite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE = registerBlock("eclogite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE_COBBLESTONE = registerBlock("eclogite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE_BRICKS = registerBlock("eclogite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE_BRICKS_SMALL = registerBlock("eclogite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITE_POLISHED = registerBlock("eclogite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> EMERY = registerBlock("emery",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> EPIDOSITE = registerBlock("epidosite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));    
    public static final RegistryObject<Block> FELSITE = registerBlock("felsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FLOWSTONE_TOP = registerBlock("flowstome_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> FLOWSTONE_MIDDLE = registerBlock("flowstone_middle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> FLOWSTONE_TIP = registerBlock("flowstone_tip",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> FOIDOLITE = registerBlock("foidolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FORDITE = registerBlock("fordite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FROZEN_OIL = registerBlock("frozen_oil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FULGURITE = registerBlock("fulgurite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); // You Are Here
    public static final RegistryObject<Block> GABBRO = registerBlock("gabbro",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_BRICKS = registerBlock("gabbro_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_BRICKS_SMALL = registerBlock("gabbro_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_POLISHED = registerBlock("gabbro_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_ESSEXITE = registerBlock("gabbro_essexite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_NORITE = registerBlock("gabbro_norite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GABBRO_THERALITE = registerBlock("gabbro_theralite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GEYSERITE_OPALINE = registerBlock("geyserite_opaline",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GEYSERITE_PEARLESCENT = registerBlock("geyserite_pearlescent",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GEYSERITE_PRISMATIC = registerBlock("geyserite_prismatic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS = registerBlock("gneiss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_COBBLESTONE = registerBlock("gneiss_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_FOLDED = registerBlock("gneiss_folded",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_PORPHYROCLASTIC = registerBlock("gneiss_porphyroclastic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_BRICKS = registerBlock("gneiss_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_BRICKS_SMALL = registerBlock("gneiss_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_POLISHED = registerBlock("gneiss_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GNEISS_LITCHFIELDITE = registerBlock("gneiss_litchfieldite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOSSAN_AZURITE = registerBlock("gossan_azurite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOSSAN_HEMATITE = registerBlock("gossan_hematite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOSSAN_MALACHITE = registerBlock("gossan_malachite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_APPINITE = registerBlock("granite_appinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_APPINITE_POLISHED = registerBlock("granite_appinite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLACK = registerBlock("granite_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLACK_BRICKS = registerBlock("granite_black_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLACK_BRICKS_SMALL = registerBlock("granite_black_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLACK_POLISHED = registerBlock("granite_black_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLUE = registerBlock("granite_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_BLUE_POLISHED = registerBlock("granite_blue_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE = registerBlock("granite_charnockite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_BRICKS = registerBlock("granite_charnockite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_BRICKS_SMALL = registerBlock("granite_charnockite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_POLISHED = registerBlock("granite_charnockite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_ENDERBITE = registerBlock("granite_charnockite_enderbite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_ENDERBITE_POLISHED = registerBlock("granite_charnockite_enderbite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_MANGERITE = registerBlock("granite_charnockite_mangerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_CHARNOCKITE_MANGERITE_POLISHED = registerBlock("granite_charnockite_mangerite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_GOLD = registerBlock("granite_gold",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_GOLD_BRICKS = registerBlock("granite_gold_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_GOLD_BRICKS_SMALL = registerBlock("granite_gold_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_GOLD_POLISHED = registerBlock("granite_gold_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_LUXULLIANITE = registerBlock("granite_luxullianite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_LUXULLIANITE_POLISHED = registerBlock("granite_luxullianite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PEGMATITE = registerBlock("granite_pegmatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PEGMATITE_BERYL = registerBlock("granite_pegmatite_beryl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PORPHYRY = registerBlock("granite_porphyry",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PORPHYRY_BRICKS = registerBlock("granite_porphyry_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PORPHYRY_BRICKS_SMALL = registerBlock("granite_porphyry_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PORPHYRY_POLISHED = registerBlock("granite_porphyry_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_RAPAKIVI = registerBlock("granite_rapakivi",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_RAPAKIVI_POLISHED = registerBlock("granite_rapakivi_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_UNAKITE = registerBlock("granite_unakite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_UNAKITE_POLISHED = registerBlock("granite_unakite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_WHITE = registerBlock("granite_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_WHITE_BRICKS = registerBlock("granite_white_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_WHITE_BRICKS_SMALL = registerBlock("granite_white_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_WHITE_POLISHED = registerBlock("granite_white_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANODIORITE = registerBlock("granodiorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANODIORITE_POLISHED = registerBlock("granodiorite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANULITE = registerBlock("granulite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREENSTONE = registerBlock("greenstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREISENS_CONTACT = registerBlock("greisens_contact",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREISENS_PEGMATITE = registerBlock("greisens_pegmatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRITSTONE = registerBlock("gritstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM = registerBlock("gypsum",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), CASO4, true));
   public static final RegistryObject<Block> GYPSUM_BRICKS = registerBlock("gypsum_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM_BRICKS_SMALL = registerBlock("gypsum_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GYPSUM_POLISHED = registerBlock("gypsum_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE = registerBlock("halite",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "NaCl", true));
    public static final RegistryObject<Block> HALITE_VARIANT_DIFFUSED = registerBlock("halite_variant_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_VARIANT_LIGHT = registerBlock("halite_variant_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_VARIANT_PINK = registerBlock("halite_variant_pink",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_VARIANT_WHITE = registerBlock("halite_variant_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_HIMALAYAN_SALT = registerBlock("halite_himalayan_salt",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "NaCl", true));
    public static final RegistryObject<Block> HALITE_BRICKS = registerBlock("halite_bricks",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "NaCl", true));
    public static final RegistryObject<Block> HALITE_BRICKS_SMALL = registerBlock("halite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_POLISHED = registerBlock("halite_polished",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "NaCl", true));
    //TODO: figure out background rendering issues on cross blocks like the helictite.
    public static final RegistryObject<Block> HELICTITE = registerBlock("helictite",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.CORNFLOWER).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> HEMATITE_BLOCK = registerBlock("hematite_block",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "Fe₂O₃", true));
    public static final RegistryObject<Block> HORNBLENDE = registerBlock("hornblende",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "Ca₂(Mg,Fe,Al)₅(Al,Si)₈O₂₂(OH)₂", true));
    public static final RegistryObject<Block> HORNBLENDE_BRICKS = registerBlock("hornblende_bricks",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "Ca₂(Mg,Fe,Al)₅(Al,Si)₈O₂₂(OH)₂", true));
    public static final RegistryObject<Block> HORNBLENDE_BRICKS_SMALL = registerBlock("hornblende_bricks_small",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "Ca₂(Mg,Fe,Al)₅(Al,Si)₈O₂₂(OH)₂", true));
    public static final RegistryObject<Block> HORNBLENDE_POLISHED = registerBlock("hornblende_polished",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "Ca₂(Mg,Fe,Al)₅(Al,Si)₈O₂₂(OH)₂", true));
    public static final RegistryObject<Block> HORNFELS = registerBlock("hornfels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYALOCLASITE = registerBlock("hyaloclasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYALOCLASITE_BRICKS = registerBlock("hyaloclasite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYALOCLASITE_BRICKS_SMALL = registerBlock("hyaloclasite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYALOCLASITE_POLISHED = registerBlock("hyaloclasite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYDRACEUM = registerBlock("hydraceum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HYPERSTHENE = registerBlock("hypersthene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRONSTONE = registerBlock("ironstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> JASPEROID_AMETHYST = registerBlock("jasperoid_amethyst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> JASPEROID_CITRINE = registerBlock("jasperoid_citrine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KIMBERLITE = registerBlock("kimberlite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KIMBERLITE_DIAMOND_BEARING = registerBlock("kimberlite_diamond_bearing",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KOMATIITE = registerBlock("komatiite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KOMATIITE_BRICKS = registerBlock("komatiite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KOMATIITE_BRICKS_SMALL = registerBlock("komatiite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KOMATIITE_POLISHED = registerBlock("komatiite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_LACUSTRINE = registerBlock("sand_lacustrine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LACUSTRINE = registerBlock("lacustrine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMINA = registerBlock("lamina",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMPROITE = registerBlock("lamproite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMPROPHYRE = registerBlock("lamprophyre",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMPROPHYRE_MINETTE = registerBlock("lamprophyre_minette",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAMPROPHYRE_VOGESITE = registerBlock("lamprophyre_vogesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LATERITE = registerBlock("laterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LHERZOLITE = registerBlock("lherzolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGNITE = registerBlock("lignite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGNITE_RESINITE = registerBlock("lignite_resinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGNITE_JET = registerBlock("lignite_jet",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_HORIZONTAL = registerBlock("limestone_variant_horizontal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CHERT_NODULES = registerBlock("limestone_chert_nodules",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_STAINED_HEMATITE = registerBlock("limestone_variant_stained_hematite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_STAINED_MANGANESE = registerBlock("limestone_variant_stained_manganese",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_STAINED_MAGNESIUM = registerBlock("limestone_variant_stained_magnesium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_REVERSE = registerBlock("limestone_variant_reverse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_HORIZONTAL_SATURATED = registerBlock("limestone_variant_horizontal_saturated",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_SMOOTH = registerBlock("limestone_variant_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_UPSIDE_DOWN = registerBlock("limestone_variant_upside_down",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_UPSIDE_DOWN_DIFFUSED = registerBlock("limestone_variant_upside_down_diffused",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_CALCITE = registerBlock("limestone_variant_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICKS_SMALL = registerBlock("limestone_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_POLISHED = registerBlock("limestone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_AEOLIANITE = registerBlock("limestone_aeolianite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK = registerBlock("limestone_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_BRICKS = registerBlock("limestone_black_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_BRICKS_SMALL = registerBlock("limestone_black_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_POLISHED = registerBlock("limestone_black_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_COBBLESTONE = registerBlock("limestone_black_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCARENITE = registerBlock("limestone_calcarenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCAREOUS_SHALE = registerBlock("limestone_calcareous_shale",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCILUTITE = registerBlock("limestone_calcilutite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCIRUDITE = registerBlock("limestone_calcirudite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CALCISILTITE = registerBlock("limestone_calcisiltite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = registerBlock("limestone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA = registerBlock("limestone_coquina",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_BRICKS = registerBlock("limestone_coquina_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_BRICKS_SMALL = registerBlock("limestone_coquina_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_POLISHED = registerBlock("limestone_coquina_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_COBBLESTONE = registerBlock("limestone_coquina_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COQUINA_DEFOSSILIZED = registerBlock("limestone_coquina_defossilized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_FOSSILIFEROUS = registerBlock("limestone_fossiliferous",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_FOSSILIFEROUS_VARIANT = registerBlock("limestone_fossiliferous_variant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BLACK_VARIANT_HORIZONTAL = registerBlock("limestone_black_variant_horizontal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_FOSSILIFEROUS_POLISHED = registerBlock("limestone_fossiliferous_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_KARST = registerBlock("limestone_karst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_KARST_VARIANT = registerBlock("limestone_karst_variant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_KARST_POLISHED = registerBlock("limestone_karst_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LIMESTONE_MOONMILK = registerBlock("limestone_moonmilk",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_OOLITIC = registerBlock("limestone_oolitic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_WEATHERED = registerBlock("limestone_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_WEATHERED = registerBlock("limestone_cobblestone_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_FOSSILIFEROUS_WEATHERED = registerBlock("limestone_fossiliferous_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_KARST_WEATHERED = registerBlock("limestone_karst_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM = registerBlock("loam",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_SAPROLITE = registerBlock("loam_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOESS = registerBlock("loess",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGMA_BLOCK_PAHOEHOE = registerBlock("magma_block_pahoehoe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BLACK = registerBlock("marble_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BLACK_COBBLESTONE = registerBlock("marble_black_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_WEATHERED_LIGHTLY = registerBlock("marble_weathered_lightly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_WEATHERED_HEAVILY = registerBlock("marble_weathered_heavily",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_CARRARA = registerBlock("marble_carrara",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_RUIN = registerBlock("marble_ruin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_GRAND_ANTIQUE = registerBlock("marble_grand_antique",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BRICKS = registerBlock("marble_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BRICKS_SMALL = registerBlock("marble_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_POLISHED = registerBlock("marble_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_COBBLESTONE = registerBlock("marble_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_DOLOMITE = registerBlock("marble_dolomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_SKARN = registerBlock("marble_skarn",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE = registerBlock("metaconglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_BRICKS = registerBlock("metaconglomerate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_BRICKS_SMALL = registerBlock("metaconglomerate_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_POLISHED = registerBlock("metaconglomerate_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_GRAVEL = registerBlock("metaconglomerate_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METACONGLOMERATE_POLYMICT = registerBlock("metaconglomerate_polymict",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METAPELITE = registerBlock("metapelite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_ACHONDRITE = registerBlock("meteorite_achondrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_CHONDRITE = registerBlock("meteorite_chondrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_FOSSIL = registerBlock("meteorite_fossil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_MESOSIDERITE = registerBlock("meteorite_mesosiderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_PALLASITE = registerBlock("meteorite_pallasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METEORITE_RUSTY_IRON = registerBlock("meteorite_rusty_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BIOTITE = registerBlock("biotite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MICROCLINE = registerBlock("microcline",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZODIORITE = registerBlock("monzodiorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZOGRANITE = registerBlock("monzogranite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZOGRANITE_POLISHED = registerBlock("monzogranite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZONITE = registerBlock("monzonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZONITE_LARVIKITE = registerBlock("monzonite_larvikite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MONZONITE_QUARTZ = registerBlock("monzonite_quartz",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE = registerBlock("mudstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_COBBLESTONE = registerBlock("mudstone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_BRICKS = registerBlock("mudstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_BRICKS_SMALL = registerBlock("mudstone_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_POLISHED = registerBlock("mudstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_CLAYSTONE = registerBlock("mudstone_claystone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_MARL = registerBlock("mudstone_marl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUGEARITE = registerBlock("mugearite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUGEARITE_BRICKS = registerBlock("mugearite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUGEARITE_BRICKS_SMALL = registerBlock("mugearite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUGEARITE_POLISHED = registerBlock("mugearite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MYLONITE = registerBlock("mylonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MYLONITE_BRICKS = registerBlock("mylonite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MYLONITE_BRICKS_SMALL = registerBlock("mylonite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MYLONITE_POLISHED = registerBlock("mylonite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NEPHELINITE = registerBlock("nephelinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OCHRE_CLAY = registerBlock("ochre_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OCHRE_TERRACOTTA = registerBlock("ochre_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OCHRE_TERRACOTTA_GLAZED = registerBlock("ochre_terracotta_glazed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OCHRE_CLAY_SAPROLITE = registerBlock("ochre_clay_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OILSANDS = registerBlock("oilsands",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_OIL = registerBlock("shale_oil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIGOCLASE = registerBlock("oligoclase",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "NaAlSi₃O₈·CaAl₂Si₂O₈", true));
    public static final RegistryObject<Block> OLIVINE = registerBlock("olivine",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "(Mg,Fe)₂·SiO₄", true));
    public static final RegistryObject<Block> OLIVINE_BRICKS = registerBlock("olivine_bricks",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "(Mg,Fe)₂·SiO₄", true));
    public static final RegistryObject<Block> OLIVINE_BRICKS_SMALL = registerBlock("olivine_bricks_small",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "(Mg,Fe)₂·SiO₄", true));
    public static final RegistryObject<Block> OLIVINE_POLISHED = registerBlock("olivine_polished",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "(Mg,Fe)₂·SiO₄", true));
    public static final RegistryObject<Block> OLIVINE_DUNITE = registerBlock("olivine_dunite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIVINE_FORSTERITE = registerBlock("olivine_forsterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OLIVINE_WEHRLITE = registerBlock("olivine_wehrlite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SARDONYX = registerBlock("sardonyx",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "SiO₂", true));
    public static final RegistryObject<Block> ONYX = registerBlock("onyx",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "SiO₂", true));
    public static final RegistryObject<Block> ONYX_TILES = registerBlock("onyx_tiles",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "SiO₂", true));
    public static final RegistryObject<Block> ALKALI_FELDSPAR = registerBlock("alkali_feldspar",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "K(AlSi₃O₈)", true));
    public static final RegistryObject<Block> ALKALI_FELDSPAR_BRICKS = registerBlock("alkali_feldspar_bricks",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "K(AlSi₃O₈)", true));
    public static final RegistryObject<Block> ALKALI_FELDSPAR_BRICKS_SMALL = registerBlock("alkali_feldspar_bricks_small",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "K(AlSi₃O₈)", true));
    public static final RegistryObject<Block> ALKALI_FELDSPAR_POLISHED = registerBlock("alkali_feldspar_polished",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "K(AlSi₃O₈)", true));
    public static final RegistryObject<Block> PLAGIOCLASE_FELDSPAR = registerBlock("plagioclase_feldspar",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "NaAlSi₃O₈·CaAl₂Si₂O₈", true));
    public static final RegistryObject<Block> PLAGIOCLASE_FELDSPAR_BRICKS = registerBlock("plagioclase_feldspar_bricks",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "NaAlSi₃O₈·CaAl₂Si₂O₈", true));
    public static final RegistryObject<Block> PLAGIOCLASE_FELDSPAR_BRICKS_SMALL = registerBlock("plagioclase_feldspar_bricks_small",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "NaAlSi₃O₈·CaAl₂Si₂O₈", true));
    public static final RegistryObject<Block> PLAGIOCLASE_FELDSPAR_POLISHED = registerBlock("plagioclase_feldspar_polished",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "NaAlSi₃O₈·CaAl₂Si₂O₈", true));
    public static final RegistryObject<Block> ORTHOPYROXENE = registerBlock("orthopyroxene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PELES_HAIR = registerBlock("peles_hair",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOTITE = registerBlock("peridotite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOTITE_BRICKS = registerBlock("peridotite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOTITE_BRICKS_SMALL = registerBlock("peridotite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOTITE_POLISHED = registerBlock("peridotite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST = registerBlock("permafrost",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_SOIL = registerBlock("permafrost_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_SAPROLITE = registerBlock("permafrost_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHONOTEPRHITE = registerBlock("phonotephrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSGENITE = registerBlock("phosgenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE = registerBlock("phyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_BRICKS = registerBlock("phyllite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_BRICKS_SMALL = registerBlock("phyllite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_POLISHED = registerBlock("phyllite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_COBBLESTONE = registerBlock("phyllite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_DUKE_STONE = registerBlock("phyllite_duke_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHYLLITE_SERICITE = registerBlock("phyllite_sericite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POZZOLANA = registerBlock("pozzolana",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PREHNITE = registerBlock("prehnite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PSEUDOTACHYLITE = registerBlock("pseudotachylite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMICE = registerBlock("pumice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMICE_BRICKS = registerBlock("pumice_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMICE_BRICKS_SMALL = registerBlock("pumice_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMICE_POLISHED = registerBlock("pumice_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PUMPELLYITE = registerBlock("pumpellyite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROBITUMEN = registerBlock("pyrobitumen",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE = registerBlock("pyroxene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_BRICKS = registerBlock("pyroxene_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_BRICKS_SMALL = registerBlock("pyroxene_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_POLISHED = registerBlock("pyroxene_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_HARZBURGITE = registerBlock("pyroxene_harzburgite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENE_WEBSTERITE = registerBlock("pyroxene_websterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENITE = registerBlock("pyroxenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORTHOQUARTZITE = registerBlock("orthoquartzite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE = registerBlock("quartzite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_BRICKS = registerBlock("quartzite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_BRICKS_SMALL = registerBlock("quartzite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_POLISHED = registerBlock("quartzite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_COBBLESTONE = registerBlock("quartzite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_WEATHERED = registerBlock("quartzite_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_STIPERSTONE = registerBlock("quartzite_stiperstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZOLITE = registerBlock("quartzolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY = registerBlock("red_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_TERRACOTTA = registerBlock("red_clay_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_TERRACOTTA_GLAZED = registerBlock("red_clay_terracotta_glazed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_SAPROLITE = registerBlock("red_clay_saprolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHODOCHROSITE_BANDED = registerBlock("rhodochrosite_banded",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYODACITE = registerBlock("rhyodacite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE = registerBlock("rhyolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_BRICKS = registerBlock("rhyolite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_BRICKS_SMALL = registerBlock("rhyolite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_POLISHED = registerBlock("rhyolite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_COMENDITE = registerBlock("rhyolite_comendite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_LLANITE = registerBlock("rhyolite_llanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RHYOLITE_PANTELLERITE = registerBlock("rhyolite_pantellerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SALT_FLAT = registerBlock("salt_flat",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARKOSE = registerBlock("arkose",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); //TODO
    public static final RegistryObject<Block> ARKOSE_RUBBLE = registerBlock("arkose_rubble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARKOSE_CROSSBEDDED = registerBlock("arkose_crossbedded",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> SANDSTONE_ARKOSE_BRICKS = registerBlock("sandstone_arkose_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ARKOSE_BRICKS_SMALL = registerBlock("sandstone_arkose_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ARKOSE_POLISHED = registerBlock("sandstone_arkose_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ARKOSE_COBBLESTONE = registerBlock("sandstone_arkose_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE = registerBlock("sandstone_feldspathic_arenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE_BRICKS = registerBlock("sandstone_feldspathic_arenite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE_BRICKS_SMALL = registerBlock("sandstone_feldspathic_arenite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE_POLISHEd = registerBlock("sandstone_feldspathic_arenite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_ARENITE_COBBLESTONE = registerBlock("sandstone_feldspathic_arenite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GANISTER = registerBlock("sandstone_ganister",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GANISTER_ROOT_TRACED = registerBlock("sandstone_ganister_root_traced",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE = registerBlock("sandstone_greywacke",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE_BRICKS = registerBlock("sandstone_greywacke_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE_BRICKS_SMALL = registerBlock("sandstone_greywacke_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE_POLISHED = registerBlock("sandstone_greywacke_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE_COBBLESTONE = registerBlock("sandstone_greywacke_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_ITACOLUMNITE = registerBlock("sandstone_itacolumnite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_ARENITE = registerBlock("quartz_arenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_QUARTZ_ARENITE_BRICKS = registerBlock("sandstone_quartz_arenite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_QUARTZ_ARENITE_BRICKS_SMALL = registerBlock("sandstone_quartz_arenite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_QUARTZ_ARENITE_POLISHED = registerBlock("sandstone_quartz_arenite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_QUARTZ_ARENITE_COBBLESTONE = registerBlock("sandstone_quartz_arenite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_TURBIDITE = registerBlock("sandstone_turbidite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANIDINE = registerBlock("sanidine",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "K(AlSi₃O₈)", true));
    public static final RegistryObject<Block> SCHIST_BLUE = registerBlock("schist_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_BLUE_BRICKS = registerBlock("schist_blue_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_BLUE_BRICKS_SMALL = registerBlock("schist_blue_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_BLUE_POLISHED = registerBlock("schist_blue_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_BLUE_COBBLESTONE = registerBlock("schist_blue_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN = registerBlock("schist_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN_BRICKS = registerBlock("schist_green_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN_BRICKS_SMALL = registerBlock("schist_green_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN_POLISHED = registerBlock("schist_green_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_GREEN_COBBLESTONE = registerBlock("schist_green_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MICA = registerBlock("mica",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_WHITE = registerBlock("schist_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_WHITE_COBBLESTONE = registerBlock("schist_white_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA = registerBlock("scoria",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA_BRICKS = registerBlock("scoria_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA_BRICKS_SMALL = registerBlock("scoria_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA_POLISHED = registerBlock("scoria_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCORIA_BLACK = registerBlock("scoria_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCREE = registerBlock("scree",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SELENITE_CRYSTAL = registerBlock("selenite_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE = registerBlock("serpentine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_COBBLESTONE = registerBlock("serpentine_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_BRICKS = registerBlock("serpentine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_BRICKS_SMALL = registerBlock("serpentine_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_POLISHED = registerBlock("serpentine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_JADEITITE = registerBlock("serpentine_jadeitite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINE_RODINGITE = registerBlock("serpentine_rodingite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINITE = registerBlock("serpentinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE = registerBlock("shale",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_COBBLESTONE = registerBlock("shale_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_BRICKS = registerBlock("shale_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_BRICKS_SMALL = registerBlock("shale_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_POLISHED = registerBlock("shale_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI = registerBlock("shale_hakatai",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI_COBBLESTONE = registerBlock("shale_hakatai_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI_BRICKS = registerBlock("shale_hakatai_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI_BRICKS_SMALL = registerBlock("shale_hakatai_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_HAKATAI_POLISHED = registerBlock("shale_hakatai_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_LAMINA = registerBlock("shale_lamina",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_RADON = registerBlock("shale_radon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_BLACK = registerBlock("shale_black",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_CANNEL_COAL = registerBlock("shale_cannel_coal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BOGHEAD_COAL = registerBlock("boghead_coal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_TASMANITE = registerBlock("shale_tasmanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_KUKERSITE = registerBlock("shale_kukersite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHOSHONITE = registerBlock("shoshonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHOSHONITE_BRICKS = registerBlock("shoshonite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHOSHONITE_BRICKS_SMALL = registerBlock("shoshonite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHOSHONITE_POLISHED = registerBlock("shoshonite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SIDERITE_BLOCK = registerBlock("siderite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SIDEROPHYLLITE = registerBlock("siderophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT = registerBlock("silt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE = registerBlock("siltstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_COBBLESTONE = registerBlock("siltstone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_BRICKS = registerBlock("siltstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_BRICKS_SMALL = registerBlock("siltstone_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_POLISHED = registerBlock("siltstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SLATE_BLUE = registerBlock("slate_blue",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SLATE_BLUE_COBBLESTONE = registerBlock("slate_blue_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE = registerBlock("soapstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_BRICKS = registerBlock("soapstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_BRICKS_SMALL = registerBlock("soapstone_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_POLISHED = registerBlock("soapstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_WEATHERED = registerBlock("soapstone_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_JADE = registerBlock("soapstone_jade",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STROMATOLITE = registerBlock("stromatolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SUNSTONE = registerBlock("sunstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SUNSTONE_RAINBOW_LATTICE = registerBlock("sunstone_rainbow_lattice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE = registerBlock("syenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_BRICKS = registerBlock("syenite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_BRICKS_SMALL = registerBlock("syenite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_POLISHED = registerBlock("syenite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_FOYAITE = registerBlock("syenite_foyaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_LARIMAR = registerBlock("syenite_larimar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_MIASKITE = registerBlock("syenite_miaskite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_NEPHELINE = registerBlock("syenite_nepheline",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_PECTOLITE = registerBlock("syenite_pectolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_SHONKINITE = registerBlock("syenite_shonkinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYLVINITE = registerBlock("sylvinite",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "KCl·(NaCl)₂", true));
    public static final RegistryObject<Block> SYLVITE_BLOCK = registerBlock("sylvite_block",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), "KCl", true));
    public static final RegistryObject<Block> TACHYLITE = registerBlock("tachylite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TACONITE = registerBlock("taconite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TALUS = registerBlock("talus",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE = registerBlock("tektite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_COESITE = registerBlock("tektite_coesite",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).sound(SoundType.AMETHYST), "SiO₂", true));
    public static final RegistryObject<Block> TEKTITE_DARWIN_GLASS = registerBlock("tektite_darwin_glass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_IMPACT_BRECCIA = registerBlock("tektite_impact_breccia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_LECHATELIERITE = registerBlock("tektite_lechatelierite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_MOLDAVITE = registerBlock("tektite_moldavite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEKTITE_REIDITE = registerBlock("tektite_reidite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEPHRIPHONOLITE = registerBlock("tephriphonolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TEPHRITE = registerBlock("tephrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TESCHENITE = registerBlock("teschenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THOLEIITE = registerBlock("tholeiite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THOLEIITE_BRICKS = registerBlock("tholeiite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THOLEIITE_BRICKS_SMALL = registerBlock("tholeiite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THOLEIITE_POLISHED = registerBlock("tholeiite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE = registerBlock("tonalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE_WEATHERED = registerBlock("tonalite_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE_BRICKS = registerBlock("tonalite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE_BRICKS_SMALL = registerBlock("tonalite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TONALITE_POLISHED = registerBlock("tonalite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOURMALINE_DRAVITE = registerBlock("tourmaline_dravite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOURMALINE_ELBAITE = registerBlock("tourmaline_elbaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TOURMALINE_SCHORL = registerBlock("tourmaline_schorl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYANDESITE = registerBlock("trachyandesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYANDESITE_BENMOREITE = registerBlock("trachyandesite_benmoreite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYBASALT = registerBlock("trachybasalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE = registerBlock("trachyite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_BRICKS = registerBlock("trachyite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_BRICKS_SMALL = registerBlock("trachyite_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_POLISHED = registerBlock("trachyite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_KENYTE = registerBlock("trachyite_kenyte",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRACHYITE_PHONOLITE = registerBlock("trachyite_phonolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_LIME = registerBlock("travertine_lime",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_LIME_BRICKS = registerBlock("travertine_lime_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_LIME_BRICKS_SMALL = registerBlock("travertine_lime_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_LIME_POLISHED = registerBlock("travertine_lime_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TRAVERTINE_PEACH = registerBlock("travertine_peach",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_PEACH_BRICKS = registerBlock("travertine_peach_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_PEACH_BRICKS_SMALL = registerBlock("travertine_peach_bricks_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_PEACH_POLISHED = registerBlock("travertine_peach_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TUFA = registerBlock("tufa",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRINITITE = registerBlock("trinitite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TROCTOLITE = registerBlock("troctolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRONDHJEMITE = registerBlock("trondhjemite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_IGNIMBRITE = registerBlock("tuff_ignimbrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_PALAGONITE = registerBlock("tuff_palagonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> UMBER = registerBlock("umber",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VARIOLITE = registerBlock("variolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VARVE = registerBlock("varve",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VOLCANIC_ASH = registerBlock("volcanic_ash",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> WHITE_SMOKER_LARGE = registerBlock("white_smoker_large",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> WHITE_SMOKER_SMALL = registerBlock("white_smoker_small",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ZIRCON = registerBlock("zircon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_RUBY = registerBlock("raw_ruby",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_SAPPHIRE = registerBlock("raw_sapphire",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SODALITOLITE = registerBlock("sodalitolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHAROITITE = registerBlock("charoitite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHAROITITE_TINAKSITE = registerBlock("charoitite_tinaksite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LISTVENITE = registerBlock("listvenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ASTORITE = registerBlock("astorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENOGRANITE = registerBlock("syenogranite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENITE_NEPHELINE_PEGMATITE = registerBlock("syenite_nepheline_pegmatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CARBONATITE_ALVIKITE = registerBlock("carbonatite_alvikite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MELILITOLITE = registerBlock("melilitolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BUCHITE = registerBlock("buchite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GARNETITE = registerBlock("garnetite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ECLOGITOID = registerBlock("eclogitoid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROBASALT = registerBlock("tartarobasalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROGRANITE = registerBlock("tartarogranite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROPERIDOTITE = registerBlock("tartaroperidotite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTARODIABASE = registerBlock("tartarodiabase",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROGABBRO = registerBlock("tartarogabbro",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROKOMATIITE = registerBlock("tartarokomatiite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROLHERZOLITE = registerBlock("tartarolherzolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRIGDMANITITE = registerBlock("bridgmanitite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTARODIORITE = registerBlock("tartarodiorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROANDESITE = registerBlock("tartaroandesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROTUFF = registerBlock("tartarotuff",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROCARBONATITE = registerBlock("tartarocarbonatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROMYLONITE = registerBlock("tartaromylonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROBRIDGMANITE = registerBlock("tartarobridgmanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROGNEISS = registerBlock("tartarogneiss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROGNEISS_FOLDED = registerBlock("tartarogneiss_folded",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROGNEISS_PORPHYROCLASTIC = registerBlock("tartarogneiss_porphyroclastic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROBRECCIA = registerBlock("tartarobreccia",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TARTAROBRECCIA_SOUL_SAND = registerBlock("tartarobreccia_soul_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LEUCOGRANITE_POLISHED = registerBlock("leucogranite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SYENOGRANITE_POLISHED = registerBlock("syenogranite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAGMA_BLOCK_BASALT = registerBlock("magma_block_basalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_GRANITE = registerBlock("magma_block_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_PERIDOTITE = registerBlock("magma_block_peridotite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_LHERZOLITE = registerBlock("magma_block_lherzolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_GRANITE_COOLED = registerBlock("magma_block_granite_cooled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_CARBONATITE = registerBlock("magma_block_carbonatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_LEUCOCRATIC = registerBlock("magma_block_leucocratic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_FELSIC = registerBlock("magma_block_felsic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_INTERMEDIATE = registerBlock("magma_block_intermediate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_MAFIC = registerBlock("magma_block_mafic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> MAGMA_BLOCK_ULTRAMAFIC = registerBlock("magma_block_ultramafic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGMA_BLOCK).sound(SoundType.BASALT)));
    public static final RegistryObject<Block> AGATIZED_DOOR = registerBlock("agatized_door",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); //TODO: Door
    public static final RegistryObject<Block> AGATIZED_LOG = registerBlock("agatized_log",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); //TODO: model
    public static final RegistryObject<Block> AGATIZED_LOG_STRIPPED = registerBlock("agatized_log_stripped",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); //TODO: model
    public static final RegistryObject<Block> AGATIZED_OPALINE_WOOD_PLANKS = registerBlock("agatized_opaline_wood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AGATIZED_WOOD_PLANKS = registerBlock("agatized_wood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AGATIZED_TRAPDOOR = registerBlock("agatized_trapdoor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); //TODO: Trapdoor
    public static final RegistryObject<Block> AGMATITE = registerBlock("agmatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARAGONITE_FLOS_FERRI = registerBlock("aragonite_flos_ferri",
            () -> new DeadBushBlock(BlockBehaviour.Properties.copy(Blocks.POINTED_DRIPSTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AURA_QUARTZ_BLOCK = registerBlock("aura_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BANDED_IRON_FORMATION_BLOCK = registerBlock("banded_iron_formation_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BANDED_IRON_FORMATION_BLOCK_THIN = registerBlock("banded_iron_formation_block_thin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAUXITE_BRICKS = registerBlock("bauxite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUE_CALCITE_BLOCK = registerBlock("blue_calcite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_BRICKS = registerBlock("clay_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLINOPYROXENITE = registerBlock("clinopyroxenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COPPER_CARBONATE_BLOCK = registerBlock("copper_carbonate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COPPER_OXIDE_BLOCK = registerBlock("copper_oxide_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COPPER_SULFIDE_BLOCK = registerBlock("copper_sulfide_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_BRICKS = registerBlock("dirt_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLASS_SLAG = registerBlock("glass_slag",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLASS_SLAG_BODEACHAT = registerBlock("glass_slag_bodeachat",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLASS_SLAG_CITRINE = registerBlock("glass_slag_citrine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLASS_SLAG_FERROLITE = registerBlock("glass_slag_ferrolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLASS_SLAG_ROSE = registerBlock("glass_slag_rose",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOLD_VEIN_QUARTZ_BLOCK = registerBlock("gold_vein_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOLD_VEIN_QUARTZ_CHISELED = registerBlock("gold_vein_quartz_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANULITE_KINZIGITE = registerBlock("granulite_kinzigite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRON_CARBONATE_ORE_BLOCK = registerBlock("iron_carbonate_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRON_HYDROXIDE_ORE_BLOCK = registerBlock("iron_hydroxide_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRON_OXIDE_ORE_BLOCK = registerBlock("iron_oxide_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRON_SULFIDE_ORE_BLOCK = registerBlock("iron_sulfide_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KIDNEY_ORE_BLOCK = registerBlock("kidney_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KIMBERLITE_DIAMOND_ORE_BLOCK = registerBlock("kimberlite_diamond_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LATITE = registerBlock("latite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LATITE_QUARTZ = registerBlock("latite_quartz",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LITHIUM_SALT_ORE_BLOCK = registerBlock("lithium_salt_ore_blocl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LITHIUM_SILICATE_ORE_BLOCK = registerBlock("lithium_silicate_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_BRICKS = registerBlock("loam_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MIGMATITE_MAFIC = registerBlock("migmatite_mafic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NICKEL_LATERITE_ORE_BLOCK = registerBlock("nickel_laterite_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NICKEL_SULFIDE_ORE_BLOCK = registerBlock("nickel_sulfide_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OCHRE_CLAY_BRICKS = registerBlock("ochre_clay_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORTHOPYROXENITE = registerBlock("orthopyroxenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEACOCK_ORE_BLOCK = registerBlock("peacock_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEAT_BRICKS = registerBlock("peat_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROXENITE_GARNET = registerBlock("pyroxenite_garnet",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_BRICKS = registerBlock("red_clay_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHALENBLENDE_BLOCK = registerBlock("schalenblende_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_MICA_GARNET = registerBlock("schist_mica_garnet",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_RED = registerBlock("schist_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SCHIST_RED_COBBLESTONE = registerBlock("schist_red_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SERPENTINITE_OPHICARBONATE = registerBlock("serpentinite_ophicarbonate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_BRICKS = registerBlock("silt_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOUL_SANDSTONE = registerBlock("soul_sandstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOUL_SANDSTONE_CUT = registerBlock("soul_sandstone_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); //TODO: model
    public static final RegistryObject<Block> SOUL_SANDSTONE_SMOOTH = registerBlock("soul_sandstone_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); //TODO: model
    public static final RegistryObject<Block> SOUL_SHALE = registerBlock("soul_shale",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE))); //TODO: model
    public static final RegistryObject<Block> SOUL_STONE = registerBlock("soul_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOUL_STONE_SMOOTH = registerBlock("soul_stone_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOUL_STONE_COBBLESTONE = registerBlock("soul_stone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STRICKBLENDE_BLOCK = registerBlock("strickblende_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TIN_OXIDE_ORE_BLOCK = registerBlock("tin_oxide_ore_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VOLCANIC_ASH_BRICKS = registerBlock("volcanic_ash_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_FELDSPATHIC_CONGLOMERATE = registerBlock("chiseled_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_MUDDY_CONGLOMERATE = registerBlock("chiseled_muddy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_SANDY_CONGLOMERATE = registerBlock("chiseled_sandy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FELDSPATHIC_CONGLOMERATE_BASE = registerBlock("feldspathic_conglomerate_base",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FELDSPATHIC_CONGLOMERATE_RUBBLE = registerBlock("feldspathic_conglomerate_rubble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FELSIC_FELDSPATHIC_CONGLOMERATE = registerBlock("felsic_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FELSIC_MUDDY_CONGLOMERATE = registerBlock("felsic_muddy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FELSIC_SANDY_CONGLOMERATE = registerBlock("felsic_sandy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KSPAR_FELDSPATHIC_CONGLOMERATE = registerBlock("kspar_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KSPAR_MUDDY_CONGLOMERATE = registerBlock("kspar_muddy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> KSPAR_SANDY_CONGLOMERATE = registerBlock("kspar_sandy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LITHIC_FELDSPATHIC_CONGLOMERATE = registerBlock("lithic_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LITHIC_MUDDY_CONGLOMERATE = registerBlock("lithic_muddy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAFIC_FELDSPATHIC_CONGLOMERATE = registerBlock("mafic_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAFIC_MUDDY_CONGLOMERATE = registerBlock("mafic_muddy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MAFIC_SANDY_CONGLOMERATE = registerBlock("mafic_sandy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MIXED_FELDSPAR_FELDSPATHIC_CONGLOMERATE = registerBlock("mixed_feldspar_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MIXED_FELDSPAR_SANDY_CONGLOMERATE = registerBlock("mixed_feldspar_sandy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDDY_CONGLOMERATE_BASE = registerBlock("muddy_conglomerate_base",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLAGIOCLASE_FELDSPATHIC_CONGLOMERATE = registerBlock("plagioclase_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLAGIOCLSE_MUDDY_CONGLOMERATE = registerBlock("plagioclase_muddy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLAGIOCLASE_SANDY_CONGLOMERATE = registerBlock("plagioclase_sandy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_FELDSPATHIC_CONGLOMERATE = registerBlock("quartz_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_KSPAR_FELDSPATHIC_CONGLOMERATE = registerBlock("quartz_kspar_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_KSPAR_MUDDY_CONGLOMERATE = registerBlock("quartz_kspar_muddy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_KSPAR_SANDY_CONGLOMERATE = registerBlock("quartz_kspar_sandy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_LITHIC_FELDSPATHIC_CONGLOMERATE = registerBlock("quartz_lithic_feldspathic_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_LITHIC_MUDDY_CONGLOMERATE = registerBlock("quartz_lithic_muddy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_MUDDY_CONGLOMERATE = registerBlock("quartz_muddy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_SANDY_CONGLOMERATE = registerBlock("quartz_sandy_conglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDY_CONGLOMERATE_BASE = registerBlock("sandy_conglomerate_base",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SEDIMENTARY_GANGUE_RUBBLE = registerBlock("sedimentary_gangue_rubble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));


    //
    //
// blocks of X \\
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
        () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK), "Al", true));
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_BLOCK = registerBlock("ametrine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANTIMONY_BLOCK = registerBlock("antimony_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMBER_TILES = registerBlock("amber_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANTHRACITE_BLOCK = registerBlock("anthracite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARSENIC_BLOCK = registerBlock("arsenic_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> AVENTURINE_BLOCK = registerBlock("aventurine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BARIUM_BLOCK = registerBlock("barium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BERYLLIUM_BLOCK = registerBlock("beryllium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BISMUTH_BLOCK = registerBlock("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> BLOODSTONE_BLOCK = registerBlock("bloodstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BORON_BLOCK = registerBlock("boron_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CADMIUM_BLOCK = registerBlock("cadmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CALCIUM_BLOCK = registerBlock("calcium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CARBON_BLOCK = registerBlock("carbon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CERIUM_BLOCk = registerBlock("cerium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CESIUM_BLOCK = registerBlock("cesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHARCOAL_BLOCK = registerBlock("charcoal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHROMIUM_BLOCK = registerBlock("chromium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DUMORTIERITE_BLOCK = registerBlock("dumortierite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DYSPROSIUM_BLOCK = registerBlock("dysprosium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ERBIUM_BLOCK = registerBlock("erbium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> EUROPIUM_BLOCK = registerBlock("europium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> FLINT_BLOCK = registerBlock("flint_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GADOLINIUM_BLOCK = registerBlock("gadolinium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> GALLIUM_BLOCK = registerBlock("gallium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> GERMANIUM_BLOCK = registerBlock("germanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> HAFNIUM_BLOCK = registerBlock("hafnium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> HOLMIUM_BLOCK = registerBlock("holmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> INDIUM_BLOCK = registerBlock("indium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> IODINE_BLOCK = registerBlock("iodine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> IRIDIUM_BLOCK = registerBlock("iridium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LANTHANUM_BLOCK = registerBlock("lanthanum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LITHIUM_BLOCK = registerBlock("lithium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> LUTETIUM_BLOCK = registerBlock("lutetium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MAGNESIUM_BLOCK = registerBlock("magnesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MANGANESE_BLOCK = registerBlock("manganese_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MERCURY_BLOCK = registerBlock("mercury_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MOLYBDENUM_BLOCK = registerBlock("molybdenum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> MORTAR_BLOCK = registerBlock("mortar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MULLITE_BLOCK = registerBlock("mullite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MULLITE_TILES = registerBlock("mullite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NEODYMIUM_BLOCK = registerBlock("neodymium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> NEPTUNIUM_BLOCK = registerBlock("neptunium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> NIOBIUM_BLOCK = registerBlock("niobium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OSMIUM_BLOCK = registerBlock("osmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PALLADIUM_BLOCK = registerBlock("palladium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PEARL_BLOCK = registerBlock("pearl_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSPHORUS_BLOCK = registerBlock("phosphorus_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PLUTONIUM_BLOCK = registerBlock("plutonium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> POTASSIUM_BLOCK = registerBlock("potassium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PRASEODYMIUM_BLOCK = registerBlock("praseodymium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> PRASIOLITE_BLOCK = registerBlock("prasiolite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PROTACTINIUM_BLOCK = registerBlock("protactinium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> RHENIUM_BLOCK = registerBlock("rhenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> RHODIUM_BLOCK = registerBlock("rhodium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ROSE_BLOCK = registerBlock("rose_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUBIDIUM_BLOCK = registerBlock("rubidium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> RUTHENIUM_BLOCk = registerBlock("ruthenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAMARIUM_BLOCK = registerBlock("samarium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SCANDIUM_BLOCK = registerBlock("scandium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SELENIUM_BLOCK = registerBlock("selenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SILICON_BLOCK = registerBlock("silicon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SMOKY_BLOCK = registerBlock("smoky_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SODIUM_BLOCK = registerBlock("sodium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> STRONTIUM_BLOCK = registerBlock("strontium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> SUGAR_BLOCK = registerBlock("sugar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock("sulfur_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TANTALUM_BLOCK = registerBlock("tantalum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TELLURIUM_BLOCK = registerBlock("tellurium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TERBIUM_BLOCK = registerBlock("terbium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> THALLIUM_BLOCK = registerBlock("thallium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> THORIUM_BLOCK = registerBlock("thorium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> THULIUM_BLOCK = registerBlock("thulium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> VANADIUM_BLOCK = registerBlock("vanadium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> YTTERBIUM_BLOCK = registerBlock("ytterbium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> YTTRIUM_BLOCK = registerBlock("yttrium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> ZIRCONIUM_BLOCK = registerBlock("zirconium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK)));
// construction \\
    public static final RegistryObject<Block> ADOBE = registerBlock("adobe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADOBE_BRICKS = registerBlock("adobe_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADOBE_REINFORCED = registerBlock("adobe_reinforced",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALABASTER = registerBlock("alabaster",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), CASO4, true));
    public static final RegistryObject<Block> ALABASTER_TILES = registerBlock("alabaster_tiles",
            () -> new BlockWithTooltip(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE), CASO4, true));
    public static final RegistryObject<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETHYST_CHISELED = registerBlock("amethyst_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETHYST_PILLAR = registerBlock("amethyst_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETHYST_POLISHED = registerBlock("amethyst_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETRINE_BRICKS = registerBlock("ametrine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETRINE_CHISELED = registerBlock("ametrine_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETRINE_PILLAR = registerBlock("ametrine_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMETRINE_POLISHED = registerBlock("ametrine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AQUARIUM_GRAVEL = registerBlock("aquarium_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AQUARIUM_GRAVEL_NEON = registerBlock("aquarium_gravel_neon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ASPHALT = registerBlock("asphalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ASPHALT_WEATHERED = registerBlock("asphalt_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_BRICKS = registerBlock("aventurine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AVENTURINE_CHISELED = registerBlock("aveturine_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AVENTURINE_PILLAR = registerBlock("aventurine_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AVENTURINE_POLISHED = registerBlock("aventurine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BLOODSTONE_BRICKS = registerBlock("bloodstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BLOODSTONE_CHISELED = registerBlock("bloodstone_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BLOODSTONE_PILLAR = registerBlock("bloodstone_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BLOODSTONE_POLISHED = registerBlock("bloodstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CITRINE_BRICKS = registerBlock("citrine_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CITRINE_CHISELED = registerBlock("citrine_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CITRINE_PILLAR = registerBlock("citrine_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CITRINE_POLISHED = registerBlock("citrine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CONCRETE_CALCITE = registerBlock("concrete_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_CALCITE = registerBlock("concrete_powder_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_HEMATITE = registerBlock("concrete_hematite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_HEMATITE = registerBlock("concrete_powder_hematite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_SIDERITE = registerBlock("concrete_siderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_SIDERITE = registerBlock("concrete_powder_siderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_SILICA = registerBlock("concrete_silica",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_SILICA = registerBlock("concrete_powder_silica",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_METACONGLOMERATE = registerBlock("concrete_metaconglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CONCRETE_POWDER_METACONGLOMERATE = registerBlock("concrete_powder_metaconglomerate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROMAN_CONCRETE = registerBlock("roman_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY = registerBlock("ivory",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_CRACKED = registerBlock("ivory_cracked",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_TILES = registerBlock("ivory_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_BONE_BLOCK = registerBlock("ivory_bone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_WEATHERED = registerBlock("ivory_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_WEATHERED_CRACKED = registerBlock("ivory_weathered_cracked",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_WEATHERED_TILES = registerBlock("ivory_weathered_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IVORY_WEATHERED_BONE_BLOCK = registerBlock("ivory_weathered_bone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAVINITE = registerBlock("lavinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LEAD_LINED_CASE = registerBlock("lead_lined_case",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN = registerBlock("porcelain",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_CRACKED = registerBlock("porcelain_cracked",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_BLUE_TILES = registerBlock("porcelain_blue_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_FISH = registerBlock("porcelain_fish",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_FLOWER = registerBlock("porcelain_flower",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_MIXED_TILES = registerBlock("porcelain_mixed_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_RED_TILES = registerBlock("porcelain_red_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_DRAGON = registerBlock("porcelain_dragon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_PILLAR = registerBlock("porcelain_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_KINTSUGI = registerBlock("porcelain_kintsugi",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PORCELAIN_KINTSUGI_TILES = registerBlock("porcelain_kintsugi_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_BRICKS = registerBlock("prasiolite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PRASIOLITE_CHISELED = registerBlock("prasiolite_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PRASIOLITE_PILLAR = registerBlock("prasiolite_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PRASIOLITE_POLISHED = registerBlock("prasiolite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSE_BRICKS = registerBlock("rose_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSE_CHISELED = registerBlock("rose_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSE_PILLAR = registerBlock("rose_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSE_POLISHED = registerBlock("rose_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMOKY_BRICKS = registerBlock("smoky_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMOKY_CHISELED = registerBlock("smoky_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMOKY_PILLAR = registerBlock("smoky_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMOKY_POLISHED = registerBlock("smoky_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRANITE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OBSIDIAN_GLASS = registerBlock("obsidian_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> OBSIDIAN_GLASS_PANE = registerBlock("obsidian_glass_pane",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> URANIUM_GLASS = registerBlock("uranium_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> URANIUM_GLASS_PANE = registerBlock("uranium_glass_pane",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    // sediment + \\ YOU ARE HERE in block models
    public static final RegistryObject<Block> LOAM_DENSE = registerBlock("loam_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_DIRTY = registerBlock("loam_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_COARSE = registerBlock("loam_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_ROOTED = registerBlock("loam_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_GRASSY = registerBlock("loam_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LOAM_ROCKY = registerBlock("loam_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_LOAMY = registerBlock("red_clay_loamy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_LOAMY = registerBlock("clay_loamy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_LOAMY = registerBlock("silt_loamy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_DENSE = registerBlock("dirt_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_DENSE_GRASSY = registerBlock("dirt_dense_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_ROCKY = registerBlock("dirt_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_RED = registerBlock("dirt_red",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_DIRTY = registerBlock("clay_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_DIRTY = registerBlock("silt_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEAT = registerBlock("peat",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEAT_DENSE = registerBlock("peat_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_COARSE_DENSE = registerBlock("dirt_coarse_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_COARSE_ROOTED = registerBlock("dirt_coarse_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_COARSE_ROCKY = registerBlock("dirt_coarse_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_ROOTED_DENSE = registerBlock("dirt_rooted_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_ROOTED_STONY = registerBlock("dirt_rooted_stony",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIRT_RED_ROOTED = registerBlock("dirt_red_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_DIRTY_ROOTED = registerBlock("clay_dirty_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEAT_GRASSY = registerBlock("peat_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLUEGRASS = registerBlock("bluegrass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_DIRTY_GRASSY = registerBlock("silt_dirty_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PEAT_ROCKY = registerBlock("peat_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_OVERGROWN = registerBlock("stone_overgrowm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_DENSE = registerBlock("stone_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_DENSE = registerBlock("red_clay_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_COARSE = registerBlock("red_clay_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_ROOTED = registerBlock("red_clay_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_GRASSY = registerBlock("red_clay_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_ROCKY = registerBlock("red_clay_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MIXED_CLAY_DENSE = registerBlock("mixed_clay_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_COARSE = registerBlock("clay_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_ROOTED = registerBlock("clay_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_GRASSY = registerBlock("clay_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_ROCKY = registerBlock("clay_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MIXED_CLAY = registerBlock("mixed_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_DENSE = registerBlock("clay_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_COARSE = registerBlock("silt_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_ROOTED = registerBlock("silt_rooted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_GRASSY = registerBlock("silt_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_ROCKY = registerBlock("silt_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_SILTY = registerBlock("red_clay_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_SILTY = registerBlock("clay_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILT_DENSE = registerBlock("silt_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_DIRTY = registerBlock("sand_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_COARSE = registerBlock("sand_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_DIRTY_GRASSY = registerBlock("sand_dirty_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_ROCKY = registerBlock("sand_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_SANDY = registerBlock("red_clay_sandy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_SANDY = registerBlock("clay_sandy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_SILTY = registerBlock("sand_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_DENSE = registerBlock("sand_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_MIXED = registerBlock("sand_mixed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_DIRTY = registerBlock("sand_red_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_COARSE = registerBlock("sand_red_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_DIRTY_GRASSY = registerBlock("sand_red_dirty_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_ROCKY = registerBlock("sand_red_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAUXITE_SOIL = registerBlock("bauxite_soil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_SILTY = registerBlock("sand_red_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_DENSE = registerBlock("sand_red_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_LOAMY = registerBlock("gravel_loamy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_DIRTY = registerBlock("gravel_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_COARSE = registerBlock("gravel_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_ROCKY = registerBlock("gravel_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_CLAY_GRAVELLY = registerBlock("red_clay_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CLAY_GRAVELLY = registerBlock("clay_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_SILTY = registerBlock("gravel_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_GRAVELLY = registerBlock("sand_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_RED_GRAVELLY = registerBlock("sand_red_gravelly",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_DENSE = registerBlock("gravel_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRAVEL_FROSTY = registerBlock("gravel_frosty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUCK = registerBlock("muck",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_DIRTY = registerBlock("permafrost_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_COARSE = registerBlock("permafrost_coarse",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUCK_GRASSY = registerBlock("muck_grassy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_ROCKY = registerBlock("permafrost_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_SILTY = registerBlock("permafrost_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERMAFROST_DENSE = registerBlock("permafrost_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VOLCANIC_ASH_DIRTY = registerBlock("volcanic_ash_dirty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VOLCANIC_ASH_SILTY = registerBlock("volcanic_ash_silty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> VOLCANIC_ASH_DENSE = registerBlock("volcanic_ash_dense",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOOT = registerBlock("soot",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAPILLI_GRAVEL = registerBlock("lapilli_gravel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAPILLI_GRAVEL_ACCRETIONARY = registerBlock("lapilli_gravel_accretionary",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_LAPILLI = registerBlock("tuff_lapilli",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_LAPILLI_ACCRETIONARY = registerBlock("tuff_lapilli_accretionary",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    // vanilla + \\ NOW HERE
    public static final RegistryObject<Block> CORALSTONE_FOSSILIZED = registerBlock("coralstone_fossilized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_COQUINA = registerBlock("coralstone_coquina",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_PRISMARINE = registerBlock("coralstone_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_DARK_PRISMARINE = registerBlock("coralstone_dark_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_LARGE_BRICKS = registerBlock("coralstone_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_SMALL_BRICKS = registerBlock("coralstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CORALSTONE_POLISHED = registerBlock("coralstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_LARGE_BRICKS = registerBlock("andesite_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANDESITE_SMALL_BRICKS = registerBlock("andesite_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_LARGE_BRICKS = registerBlock("diorite_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIORITE_SMALL_BRICKS = registerBlock("diorite_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_GRANITE_LARGE_BRICKS = registerBlock("red_granite_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_GRANITE_SMALL_BRICKS = registerBlock("red_granite_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_SMOOTH_FACETED = registerBlock("basalt_smooth_faceted",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_LARGE_BRICKS = registerBlock("basalt_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BASALT_SMALL_BRICKS = registerBlock("basalt_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_SMALL_BRICKS = registerBlock("tuff_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALCITE_POLISHED = registerBlock("calcite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALCITE_LARGE_BRICKS = registerBlock("calcite_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALCITE_SMALL_BRICKS = registerBlock("calcite_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DRIPSTONE_POLISHED = registerBlock("dripstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DRIPSTONE_LARGE_BRICKS = registerBlock("dripstone_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DRIPSTONE_SMALL_BRICKS = registerBlock("dripstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DRIPSTONE_COBBLESTONE = registerBlock("dripstone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OBSIDIAN_POLISHED = registerBlock("obsidian_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OBSIDIAN_LARGE_BRICKS = registerBlock("obsidian_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OBSIDIAN_SMALL_BRICKS = registerBlock("obsidian_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_LARGE_BRICKS = registerBlock("sandstone_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_SMALL_BRICKS = registerBlock("sandstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_RED_LARGE_BRICKS = registerBlock("sandstone_red_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_RED_SMALL_BRICKS = registerBlock("sandstone_red_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DEEPSLATE_SMALL_BRICKS = registerBlock("deepslate_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLACKSTONE_SMALL_BRICKS = registerBlock("blackstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLOWSTONE_POLISHED = registerBlock("glowstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLOWSTONE_LARGE_BRICKS = registerBlock("glowstone_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GLOWSTONE_SMALL_BRICKS = registerBlock("glowstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ENDSTONE_POLISHED = registerBlock("endstone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ENDSTONE_SMALL_BRICKS = registerBlock("endstone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_POLISHED = registerBlock("stone_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> STONE_SMALL_BRICKS = registerBlock("stone_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPURITE = registerBlock("purpurite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPURITE_POLISHED = registerBlock("purpurite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPURITE_SMALL_TILES = registerBlock("purpurite_small_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRISMARINE_POLISHED = registerBlock("prismarine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRISMARINE_SMALL_BRICKS = registerBlock("prismarine_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DARK_PRISMARINE_RAW = registerBlock("dark_prismarine_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DARK_PRISMARINE_POLISHED = registerBlock("dark_prismarine_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DARK_PRISMARINE_LARGE_TILES = registerBlock("dark_prismarine_large_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHERRACK_POLISHED = registerBlock("netherrack_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHERRACK_LARGE_BRICKS = registerBlock("netherrack_large_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NETHERRACK_SMALL_BRICKS = registerBlock("netherrack_small_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_BASALT = registerBlock("sand_basalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BASALT = registerBlock("sandstone_basalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BASALT_SMOOTH = registerBlock("sandstone_basalt_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BASALT_CUT = registerBlock("sandstone_basalt_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_CASSITERITE = registerBlock("sand_cassiterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_CASSITERITE = registerBlock("sandstone_cassiterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_CASSITERITE_SMOOTH = registerBlock("sandstone_cassiterite_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_CASSITERITE_CUT = registerBlock("sandstone_cassiterite_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_GLAUCONITE = registerBlock("sand_glauconite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GLAUCONITE = registerBlock("sandstone_glauconite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GLAUCONITE_SMOOTH = registerBlock("sandstone_glauconite_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GLAUCONITE_CUT = registerBlock("sandstone_glauconite_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_GRANITE = registerBlock("sand_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GRANITE = registerBlock("sandstone_granite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GRANITE_SMOOTH = registerBlock("sandstone_granite_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GRANITE_CUT = registerBlock("sandstone_granite_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_K_FELDSPAR = registerBlock("sand_k_feldspar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_K_FELDSPAR = registerBlock("sandstone_k_feldspar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_K_FELDSPAR_SMOOTH = registerBlock("sandstone_k_feldspar_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_K_FELDSPAR_CUT = registerBlock("sandstone_k_feldspar_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_PLAGIOCLASE_FELDSPAR = registerBlock("sand_plagioclase_feldspar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_PLAGIOCLASE_FELDSPAR = registerBlock("sandstone_plagioclase_feldspar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_PLAGIOCLASE_FELDSPAR_SMOOTH = registerBlock("sandstone_plagioclase_feldspar_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_PLAGIOCLASE_FELDSPAR_CUT = registerBlock("sandstone_plagioclase_feldspar_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SAND_SODALITE = registerBlock("sand_sodalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_SODALITE = registerBlock("sandstone_sodalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_SODALITE_SMOOTH = registerBlock("sandstone_sodalite_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_SODALITE_CUT = registerBlock("sandstone_sodalite_cut",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    // features \\
    public static final RegistryObject<Block> PETRIFIED_LOG = registerBlock("petrified_log",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_TOP = registerBlock("petrified_log_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_SIDE = registerBlock("petrified_log_side",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED = registerBlock("petrified_log_stripped",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_TOP = registerBlock("petrified_log_stripped_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_SIDE = registerBlock("petrified_log_stripped_side",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_OPALIZED = registerBlock("petrified_log_opalized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_OPALIZED_TOP = registerBlock("petrified_log_opalized_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_OPALIZED_SIDE = registerBlock("petrified_log_opalized_side",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_OPALIZED = registerBlock("petrified_log_stripped_opalized",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_OPALIZED_TOP = registerBlock("petrified_log_stripped_opalized_top",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_LOG_STRIPPED_OPALIZED_SIDE = registerBlock("petrified_log_stripped_opalized_side",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PETRIFIED_WOOD_PLANKS = registerBlock("petrified_wood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TORCH_STRONTIUM = registerBlock("torch_strontium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_CALCIUM = registerBlock("torch_calcium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_IRON = registerBlock("torch_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_SALT_NACL = registerBlock("torch_salt_nacl",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_BARIUM = registerBlock("torch_barium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_COPPER = registerBlock("torch_copper",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_SYLVITE = registerBlock("torch_sylvite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_ZINC = registerBlock("torch_zinc",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_NITRE = registerBlock("torch_nitre",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_LITHIUM = registerBlock("torch_lithium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_MAGNESIUM = registerBlock("torch_magnesium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TORCH_ALUMINUM = registerBlock("torch_aluminum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCH).sound(SoundType.WOOD)));
    // Large Geodes
    public static final RegistryObject<Block> ROSE_CRYSTAL_BLOCK = registerBlock("rose_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_BUDDING_CRYSTAL_BLOCK = registerBlock("rose_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_CLUSTER = registerBlock("rose_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_LARGE_BUD = registerBlock("rose_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_MEDIUM_BUD = registerBlock("rose_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_SMALL_BUD = registerBlock("rose_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_CRYSTAL_BLOCK = registerBlock("smoky_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_BUDDING_CRYSTAL_BLOCK = registerBlock("smoky_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_CLUSTER = registerBlock("smoky_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_LARGE_BUD = registerBlock("smoky_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_MEDIUM_BUD = registerBlock("smoky_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SMOKY_SMALL_BUD = registerBlock("smoky_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_CRYSTAL_BLOCK = registerBlock("prasiolite_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_BUDDING_CRYSTAL_BLOCK = registerBlock("prasiolite_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_CLUSTER = registerBlock("prasiolite_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_LARGE_BUD = registerBlock("prasiolite_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_MEDIUM_BUD = registerBlock("prasiolite_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PRASIOLITE_SMALL_BUD = registerBlock("brasiolite_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_CRYSTAL_BLOCK = registerBlock("dumortierite_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_BUDDING_CRYSTAL_BLOCK = registerBlock("dumortierite_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_CLUSTER = registerBlock("dumortierite_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_LARGE_BUD = registerBlock("dumortierite_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_MEDIUM_BUD = registerBlock("dumortierite_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_SMALL_BUD = registerBlock("dumortierite_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_CRYSTAL_BLOCK = registerBlock("bloodstone_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_BUDDING_CRYSTAL_BLOCK = registerBlock("bloodstone_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_CLUSTER = registerBlock("bloodstone_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_LARGE_BUD = registerBlock("bloodstone_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_MEDIUM_BUD = registerBlock("bloodstone_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BLOODSTONE_SMALL_BUD = registerBlock("bloodstone_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_CRYSTAL_BLOCK = registerBlock("aventurine_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_BUDDING_CRYSTAL_BLOCK = registerBlock("aventurine_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_CLUSTER = registerBlock("aventurine_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_LARGE_BUD = registerBlock("aventurine_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_MEDIUM_BUD = registerBlock("aventurine_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_CRYSTAL_BLOCK = registerBlock("ametrine_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_BUDDING_CRYSTAL_BLOCK = registerBlock("ametrine_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_CLUSTER = registerBlock("ametrine_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_LARGE_BUD = registerBlock("ametrine_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_MEDIUM_BUD = registerBlock("ametrine_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETRINE_SMALL_BUD = registerBlock("ametrine_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_CRYSTAL_BLOCK = registerBlock("citrine_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_BUDDING_CRYSTAL_BLOCK = registerBlock("citrine_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_CLUSTER = registerBlock("citrine_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_LARGE_BUD = registerBlock("citrine_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_MEDIUM_BUD = registerBlock("citrine_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_SMALL_BUD = registerBlock("citrine_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_CRYSTAL_BLOCK = registerBlock("quartz_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_BUDDING_CRYSTAL_BLOCK = registerBlock("quartz_budding_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_CLUSTER = registerBlock("quartz_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_LARGE_BUD = registerBlock("quartz_large_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_MEDIUM_BUD = registerBlock("quartz_medium_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZ_SMALL_BUD = registerBlock("quartz_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    //more
    public static final RegistryObject<Block> BAUXITE_KARST = registerBlock("bauxite_karst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FIRECLAY = registerBlock("fireclay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FLINT_CLAY = registerBlock("flint_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GANISTER_CLAY = registerBlock("ganister_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALICHE_AQUATIC = registerBlock("caliche_aquatic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALICHE_TERRAGENOUS = registerBlock("caliche_terragenous",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BENTONITE_ASH = registerBlock("bentonite_ash",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TUFF_IGNIMBRITE_LAPILLI = registerBlock("tuff_ignimbrite_lapilli",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OPAL_BLOCK_COMMON = registerBlock("opal_block_common",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> OPAL_BLOCK_BOULDER = registerBlock("opal_block_boulder",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_RED_PEGMATITE = registerBlock("granite_red_pegmatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_PORPHYRY_PEGMATITE = registerBlock("granite_porphyry_pegmatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANITE_WHITE_PEGMATITE = registerBlock("granite_white_pegmatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BUDDINGTONITE = registerBlock("buddingtonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_BRICKS = registerBlock("dumortierite_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_PILLAR = registerBlock("dumortierite_pillar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_CHISELED = registerBlock("dumortierite_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DUMORTIERITE_POLISHED = registerBlock("dumortierite_polished",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IDDINGSITE = registerBlock("iddingsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SOAPSTONE_COBBLESTONE = registerBlock("soapstone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FULGURITE_CLUSTER = registerBlock("fulgurite_cluster",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AVENTURINE_SMALL_BUD = registerBlock("aventurine_small_bud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    //2025
    public static final RegistryObject<Block> LIMESTONE_VARIANT_BEDDED = registerBlock("limestone_variant_bedded",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_VARIANT_UNALTERED = registerBlock("limestone_variant_unaltered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_REGOLITH = registerBlock("limestone_regolith",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_REGOLITH_VARIANT_SMOOTH = registerBlock("limestone_regolith_variant_smooth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CRYSTALLINE_CALCITE = registerBlock("limestone_crystalline_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_CRSTALLINE_ARAGONITE = registerBlock("limestone_crystalline_aragonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_JURA_BEIGE = registerBlock("limestone_jura_beige",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_RADIOLARIAN = registerBlock("limestone_radiolarian",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CALCITE_CAVE_ONYX = registerBlock("calcite_cave_onyx",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_SEPTARIAN = registerBlock("limestone_septarian",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_AEOLIANITE = registerBlock("sandstone_aeolianite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_STONY = registerBlock("limestone_stony",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_STONY_ERODED = registerBlock("limestone_stony_eroded",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUICKLIME = registerBlock("quicklime",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_PISOLITIC = registerBlock("limestone_pisolitic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TRAVERTINE_WHITE = registerBlock("travertine_white",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_VARIANT_PURE = registerBlock("chalk_variant_pure",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_APATITE = registerBlock("chalk_apatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHALK_WEATHERED = registerBlock("chalk_weathered",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_KARST = registerBlock("dolomite_karst",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_CRYSTALLINE_CALCITE = registerBlock("dolomite_crystalline_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_CAPPUCCINO = registerBlock("dolomite_cappuccino",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DOLOMITE_ONCOLITIC = registerBlock("dolomite_oncolitic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSPHORITE = registerBlock("phosphorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSPHORITE_PELOIDAL = registerBlock("phosphorite_peloidal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSPHORITE_FOSSILIFEROUS = registerBlock("phosphorite_fossiliferous",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GUANO = registerBlock("guano",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSPHORITE_APATITE = registerBlock("phosphorite_apatite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSPHORITE_DOLOMITE = registerBlock("phosphorite_dolomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHOSPHORITE_COBBLED = registerBlock("phosphorite_cobbled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANHYDRITE = registerBlock("anhydrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HALITE_SEA_SALT = registerBlock("halite_sea_salt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BORAX = registerBlock("borax",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NITRE = registerBlock("nitre",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_JASPER_ZEBRA = registerBlock("chert_jasper_zebra",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_FLINTSTONE_COBBLESTONE = registerBlock("chert_flintstone_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHERT_LYDITE = registerBlock("chert_lydite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PROTOBITUMEN = registerBlock("protobitumen",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PROTOGRAPHITE = registerBlock("protographite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREYWACKE_LITHIC = registerBlock("sandstone_greywacke_lithic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_MANGANESE = registerBlock("sandstone_manganese",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_GREENSAND = registerBlock("sandstone_greensand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_FELDSPATHIC_METAXITE = registerBlock("sandstone_feldspathic_metaxite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BAKED_COLUMNAR = registerBlock("sandstone_baked_columnar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BAKED_BRECCIATED = registerBlock("sandstone_baked_brecciated",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDSTONE_BAKED_COBBLESTONE = registerBlock("sandstone_baked_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_COMPRESSED = registerBlock("siltstone_compressed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_COMPRESSED = registerBlock("mudstone_compressed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_MARL_SHELLS = registerBlock("mudstone_marl_shells",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MUDSTONE_CLAYSTONE_BENTONITE = registerBlock("mudstone_claystone_bentonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILTSTONE_PRINTSTONE = registerBlock("siltstone_printstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ARGILLITE_ZEBRA_STONE = registerBlock("argillite_zebra_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DIAMICTITE_TILLITE_EMPTY = registerBlock("diamictite_tillite_empty",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BRECCIA_VERDOLITE = registerBlock("breccia_verdolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BAUXITE_COBBLESTONE = registerBlock("bauxite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GOSSAN_CRYPTOMELANE = registerBlock("gossan_cryptomelane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAPIS_LAZULI = registerBlock("lapis_lazuli",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAPIS_LAZULI_VARIANT_ROCKY = registerBlock("lapis_lazuli_variant_rocky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAPIS_LAZULI_CHISELED = registerBlock("lapis_lazuli_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAPIS_LAZULI_COBBLESTONE = registerBlock("lapis_lazuli_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> METANOVACULITE = registerBlock("metanovaculite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HORNFELS_UNBANDED = registerBlock("hornfels_unbanded",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> HORNFELS_COBBLESTONE = registerBlock("hornfels_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GRANUFELS = registerBlock("granufels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TACTITE = registerBlock("tactite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> QUARTZITE_VARIANT_STREAKY = registerBlock("quartzite_variant_streaky",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_POPCORN_CALCITE = registerBlock("marble_popcorn_calcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));

//Mineral Blocks
    public static final RegistryObject<Block> ABELLAITE_BLOCK = registerBlock("abellaite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ACANTHITE_BLOCK = registerBlock("acanthite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ACTINOLITE_BLOCK = registerBlock("actinolite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ADACHIITE_BLOCK = registerBlock("adachiite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ADAMITE_BLOCK = registerBlock("adamite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ADULARIA_BLOCK = registerBlock("adularia_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AEGIRINE_BLOCK = registerBlock("aegirine_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> AENIGMATITE_BLOCK = registerBlock("aenigmatite_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> AFGHANITE_BLOCK = registerBlock("afghanite_BLOCK",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AGARDITE_BLOCK = registerBlock("agardite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AGATE_GEODE_BLOCK = registerBlock("agate_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> AGRELLITE = registerBlock("agrellite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AKERMANITE = registerBlock("akermanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALABANDITE = registerBlock("alabandite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALBITE = registerBlock("albite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALEXANDRITE = registerBlock("alexandrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALFORSITE = registerBlock("alforsite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ALITE = registerBlock("alite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ALLANITE = registerBlock("allanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALLOCLASITE = registerBlock("alloclasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALLUAUITE = registerBlock("alluauite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALMANDINE = registerBlock("almandine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALUM = registerBlock("alum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALUMINUM_RAW = registerBlock("aluminum_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ALUNITE = registerBlock("alunite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AMAZONITE = registerBlock("amazonite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> AMBLYGONITE = registerBlock("amblygonite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> AMESITE = registerBlock("amesite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ANALCIME = registerBlock("analcime",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANATASE = registerBlock("anatase",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANCYLITE = registerBlock("ancylite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANDESINE = registerBlock("andesine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANDRADITE = registerBlock("andradite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANGLESITE = registerBlock("anglesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANHYDRITE_HYDROTHERMAL = registerBlock("anhydrite_hydrothermal",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ANKERITE = registerBlock("ankerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANNITE = registerBlock("annite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANORTHOCLASE = registerBlock("anorthoclase",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANTHOPHYLLITE = registerBlock("anthophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANTIGORITE = registerBlock("antigorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ANTLERITE = registerBlock("antlerite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> ANTONOZITE = registerBlock("antonozite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> APATITE = registerBlock("apatite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> APATITE_COLLOPHANE = registerBlock("apatite_collophane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> APHROSIDERITE = registerBlock("aphrosiderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> APHTHITALITE = registerBlock("aphthitalite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> APOPHYLLITE = registerBlock("apophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AQUALITE = registerBlock("aqualite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AQUAMARINE = registerBlock("aquamarine",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ARFVEDSONITE = registerBlock("arfvedsonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ARGYRODITE = registerBlock("argyrodite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ARSENIC_RAW = registerBlock("arsenic_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ARSENOPYRITE = registerBlock("arsenopyrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ASBESTOS = registerBlock("asbestos",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ASTROPHYLLITE = registerBlock("astrophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ATACAMITE = registerBlock("atacamite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AURICHALCITE = registerBlock("aurichalcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AUTUNITE = registerBlock("autunite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AXINITE = registerBlock("axinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> AZURITE = registerBlock("azurite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BABINGTONITE = registerBlock("babingtonite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> BAILEYCHLORE = registerBlock("baileychlore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BANALSITE = registerBlock("banalsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BARKEVIKITE = registerBlock("barkevikite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BARRINGERITE = registerBlock("barringerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BARYTE = registerBlock("baryte",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BARYTOCALCITE = registerBlock("barytocalcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BASTNASITE = registerBlock("bastnasite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> BAURANOITE = registerBlock("bauranoite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BEIDELLITE_CLAY = registerBlock("beidellite_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BENITOITE = registerBlock("benitoite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BENTONITE_CLAY = registerBlock("bentonite_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BERTHIERINE = registerBlock("berthierine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BERYL_RED = registerBlock("beryl_red",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> BERYL = registerBlock("beryl",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> BERYLLIUM_RAW = registerBlock("beryllium_raw",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> BERZEILITE = registerBlock("berzeilite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> BETAFITE = registerBlock("betafite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BISCHOFITE = registerBlock("bischofite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BISMUTH_PURE = registerBlock("bismuth_pure",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BISMUTH_SYNTHETIC = registerBlock("bismuth_synthetic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BISMUTHINITE = registerBlock("bismuthinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BISMUTITE = registerBlock("bismutite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BOEHMITE = registerBlock("boehmite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BORACITE = registerBlock("boracite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> BORNITE = registerBlock("bornite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BOROMUSCOVITE = registerBlock("boromuscovite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BOUSSINGAULTITE = registerBlock("boussingaltite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BRACKEBUSCHITE = registerBlock("brackebuschite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BRAZILIANITE = registerBlock("brazilianite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> BRIANYOUNGITE = registerBlock("brianyoungite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BRIDGMANITE = registerBlock("bridgmanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BROCHANTITE = registerBlock("brochantite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BRONZITE = registerBlock("bronzite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BROOKITE = registerBlock("brookite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BROWNMILLERITE = registerBlock("brownmillerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BRUCITE = registerBlock("brucite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BRUSHITE = registerBlock("brushite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BURBANKITE = registerBlock("burbankite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> BUSTAMITE = registerBlock("bustamite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BYTOWNITE = registerBlock("bytownite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CADMIUM_RAW = registerBlock("cadmium_raw",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CALAVERITE = registerBlock("calaverite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CALCIOFERRITE = registerBlock("calcioferrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CALDERITE = registerBlock("calderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CALOMEL = registerBlock("calomel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CANCRINITE = registerBlock("cancrinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CARLSBERGITE = registerBlock("carlsbergite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CARNELIAN_GEODE_BLOCK = registerBlock("carnelian_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CARNOTITE = registerBlock("carnotite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CARPHOLITE = registerBlock("carpholite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CARROLLITE = registerBlock("carrollite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CASSITERITE = registerBlock("cassiterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CATAPLEIITE = registerBlock("catapleiite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CELADONITE_GEODE_BLOCK = registerBlock("celadonite_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CELESTINE = registerBlock("celestine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CELSIAN = registerBlock("celsian",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CERUSSITE = registerBlock("cerussite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHABAZITE = registerBlock("chabazite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHALCEDONY_GEODE_BLOCK = registerBlock("chalcedony_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CHALCOCITE = registerBlock("chalcocite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHALCOPYRITE = registerBlock("chalcopyrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHAMOSITE = registerBlock("chamosite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHAROITE = registerBlock("charoite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHENITE = registerBlock("chenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHIBAITE = registerBlock("chibaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHLORAPATITE = registerBlock("chlorapatite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CHLORARGYRITE = registerBlock("chlorargyrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHLORITE = registerBlock("chlorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHLORITOID = registerBlock("chloritoid",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CHLOROMELANITE = registerBlock("chloromelanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHONDRODITE = registerBlock("chondrodite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHROMFERIDE = registerBlock("chromferide",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHROMITE = registerBlock("chromite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHRYSOBERYL = registerBlock("chrysoberyl",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CHRYSOPRASE_GEODE_BLOCK = registerBlock("chrysoprase_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CHRYSOTILE = registerBlock("chrysotile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHUDOBAITE = registerBlock("chudobaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CHURCHITE = registerBlock("churchite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CINNABAR = registerBlock("cinnabar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CLARKEITE = registerBlock("clarkeite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CLINOCHLORE = registerBlock("clinochlore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CLINOCLASE = registerBlock("clinoclase",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CLINOFERROSILITE = registerBlock("clinoferrosilite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CLINOHUMITE = registerBlock("clinohumite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CLINOSUENOITE = registerBlock("clinosuenoite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> CLINOTHULITE = registerBlock("clinothulite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CLINOZOISITE = registerBlock("clinozoisite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CLINTONITE = registerBlock("clintonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> COBALTITE = registerBlock("cobaltite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> COCCINITE = registerBlock("coccinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> COHENITE = registerBlock("cohenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> COLEMANITE = registerBlock("colemanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> COLUMBITE = registerBlock("columbite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CONICHALCITE = registerBlock("conichalcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CONNELLITE = registerBlock("connellite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> COOKEITE = registerBlock("cookeite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> COOPERITE = registerBlock("cooperite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> COPIAPITE = registerBlock("copiapite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CORDIERITE = registerBlock("cordierite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> CORKITE = registerBlock("corkite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CORNWALLITE = registerBlock("cornwallite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CORONADITE = registerBlock("coronadite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CORUNDUM_PURE = registerBlock("corundum_pure",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> COVELLITE = registerBlock("covellite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> CRISTOBALITE = registerBlock("cristobalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CROCIDOLITE = registerBlock("crocidolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CROCOITE = registerBlock("crocoite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CRONSTEDTITE = registerBlock("cronstedtite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CROSSITE = registerBlock("crossite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CRYOLITE = registerBlock("cryolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CUMMINGTONITE = registerBlock("cummingtonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CUPRITE = registerBlock("cuprite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CUPRITE_CHALCOTRICHITE = registerBlock("cuprite_chalcotrichite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DACHIARDITE = registerBlock("dachiardite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DATOLITE = registerBlock("datolite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> DAUBREELITE = registerBlock("daubreelite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DEMANTOID = registerBlock("demantoid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DESCLOIZITE = registerBlock("descloizite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DEVILLINE = registerBlock("devilline",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DIASPORE = registerBlock("diaspore",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> DICKITE = registerBlock("dickite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DIOPSIDE = registerBlock("diopside",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> DIOPSIDE_CHROMIUM = registerBlock("diopside_chromium",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> DOLOMITE_CRYSTAL_BLOCK = registerBlock("dolomite_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DOLOMITE_IRON = registerBlock("dolomite_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DORRITE = registerBlock("dorrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DOYLEITE = registerBlock("doyleite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DRESSERITE = registerBlock("dresserite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DUFRENITE = registerBlock("dufrenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DUFTITE = registerBlock("duftite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DUGGANITE = registerBlock("dugganite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> EASTONITE = registerBlock("eastonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ECKERMANNITE = registerBlock("eckermannite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> EDENITE = registerBlock("edenite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ELECTRUM_RAW = registerBlock("electrum_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ELYITE = registerBlock("elyite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> EMERALD_RAW = registerBlock("emerald_raw",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> EMERALD_TRAPICHE_BLOCK = registerBlock("emerald_trapiche_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ENARGITE = registerBlock("enargite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ENSTATITE = registerBlock("enstatite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> EPHESITE = registerBlock("ephesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> EPIDOTE = registerBlock("epidote",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> EPISTILBITE = registerBlock("epistilbite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> EPSOMITE = registerBlock("epsomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ERYTHITE = registerBlock("erythite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ESKOLAITE = registerBlock("eskolaite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> EUDIALYTE = registerBlock("eudialyte",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> EUXENITE = registerBlock("euxenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FASSAITE = registerBlock("fassaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FELDSPAR_MIXED = registerBlock("feldspar_mixed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FERBERITE = registerBlock("ferberite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FERRIHYDRITE = registerBlock("ferrihydrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FERRONICKELPLATINUM_GEODE_BLOCK = registerBlock("ferronickelplatinum_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> FERROSILITE = registerBlock("ferrosilite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FLUCKITE = registerBlock("fluckite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FLUORAPATITE = registerBlock("fluorapatite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> FLUOR_DRAVITE = registerBlock("fluor_dravite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> FLUORITE_FALSE_EMERALD = registerBlock("fluorite_false_emerald",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> FLUORITE_FALSE_TOPAZ = registerBlock("fluorite_false_topaz",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> FLUORITE_GREEN = registerBlock("fluorite_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FLUORITE_PURPLE = registerBlock("fluorite_purple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FOURMARIERITE = registerBlock("fourmarierite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FUCHSITE = registerBlock("fuchsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GADOLINITE = registerBlock("gadolinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GALAXITE = registerBlock("galaxite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GALENA = registerBlock("galena",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GALLITE = registerBlock("gallite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GARNET = registerBlock("garnet",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GARNET_YELLOW = registerBlock("garnet_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GARNIERITE = registerBlock("garnierite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GASPEITE = registerBlock("gaspeite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GEDRITE = registerBlock("gedrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GEHLENITE = registerBlock("gehlenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GEIKIELITE = registerBlock("geikielite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> GERMANITE = registerBlock("germanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GIBBSITE = registerBlock("gibbsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GLAUBERITE = registerBlock("glauberite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GLAUCONITE = registerBlock("glauconite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GLAUCOPHANE = registerBlock("glaucophane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GMELINITE = registerBlock("gmelinite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> GOBBINSITE = registerBlock("gobbinsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GOLDMANITE = registerBlock("goldmanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GOSLARITE = registerBlock("goslarite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GRAPHITE = registerBlock("graphite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GREENALITE_GEODE_BLOCK = registerBlock("greenalite_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> GREENOCKITE = registerBlock("greenockite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> GROSSULAR = registerBlock("grossular",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GRUNERITE = registerBlock("grunerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GUANGLINITE = registerBlock("guanglinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GUMMITE = registerBlock("gymmite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> GYPSUM_SATIN_SPAR = registerBlock("gypsum_satin_spar",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HAFNON = registerBlock("hafnon",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HALLOYSITE_CLAY = registerBlock("halloysite_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HALOTRICHITE = registerBlock("halotrichite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HANCOCKITE = registerBlock("hancockite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HARMOTOME = registerBlock("harmotome",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HASTINGSITE = registerBlock("hastingsite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> HAUYNE = registerBlock("hauyne",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HAXONITE = registerBlock("haxonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HEAZLEWOODITE = registerBlock("heazlewoodite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HEDENBERGITE = registerBlock("hedenbergite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> HELIODOR = registerBlock("heliodor",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> HENRITERMIERITE = registerBlock("henritermierite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HERBERTSMITHITE = registerBlock("herbertsmithite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HERCYNITE = registerBlock("hercynite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HESSITE = registerBlock("hessite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HEYLANDITE = registerBlock("heylandite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HIBONITE = registerBlock("hibonite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> HIORTDAHLITE = registerBlock("hiortdahlite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> HOGBOMITE = registerBlock("hogbomite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HOLLANDITE = registerBlock("hollandite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HOLMQUISTITE = registerBlock("holmquistite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> HONESSITE = registerBlock("honessite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HOWLITE = registerBlock("howlite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HUBNITE = registerBlock("hubnite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HUMITE = registerBlock("humite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HYALOPHANE = registerBlock("hyalophane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HYDROCERUSSITE = registerBlock("hydrocerussite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HYDROGROSSULAR = registerBlock("hydrogrossular",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HYDROHONESSITE = registerBlock("hydrohonessite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HYDRONEPHELITE = registerBlock("hydronephelite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HYDROXYAPATITE = registerBlock("hydroxyapatite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> HYDROZINCITE = registerBlock("hydrozincite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> IDRIALITE = registerBlock("idrialite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ILLITE = registerBlock("illite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ILMENITE = registerBlock("ilmenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ILVAITE = registerBlock("ilvaite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> IMOGOLITE_CLAY = registerBlock("imogolite_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> IRIDIUM_RAW = registerBlock("iridium_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ISMIRODINE = registerBlock("ismirodine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JADEITE = registerBlock("jadeite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JAHNSITE = registerBlock("jahnsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JAROSITE = registerBlock("jarosite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JASPER_GEODE_BLOCK = registerBlock("jasper_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> JASPILLITE_GEODE_BLOCK = registerBlock("jaspillite_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> JERVISITE = registerBlock("jervisite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JOHANNSENITE = registerBlock("johannsenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JORDANITE = registerBlock("jordanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JUNITOITE = registerBlock("junitoite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KAERSUTITE = registerBlock("kaersutite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> KAINITE = registerBlock("kainite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KALSILITE = registerBlock("kalsilite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> KAMACITE = registerBlock("kamacite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KAMIOKITE = registerBlock("kamiokite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KAOLINITE = registerBlock("kaolinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KARELIANITE = registerBlock("karelianite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KATOPHORITE = registerBlock("katophorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KERNITE = registerBlock("kernite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KESTERITE = registerBlock("kesterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KORNERUPINE = registerBlock("kornerupine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KOSMOCHLOR = registerBlock("kosmochlor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KUTNOHORITE = registerBlock("kutnohorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> KYANITE = registerBlock("kyanite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> LABRADORITE = registerBlock("labradorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LAMPROPHYLLITE = registerBlock("lamprophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LANARKITE = registerBlock("lanarkite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LANGITE = registerBlock("langite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> LARNITE = registerBlock("larnite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> LAUEITE = registerBlock("laueite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LAUMONTITE = registerBlock("laumontite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LAURANIITE = registerBlock("lauraniite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LAURITE = registerBlock("laurite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> LAVENITE = registerBlock("lavenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LAWSONITE = registerBlock("lawsonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LAZULITE = registerBlock("lazulite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LAZURITE = registerBlock("lazurite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LEAD_RAW = registerBlock("lead_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LEPIDOCROCITE = registerBlock("lepidocrocite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LEPIDOLITE = registerBlock("lepidolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LEUCITE = registerBlock("leucite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LEUCOXENE = registerBlock("leucoxene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LEVYNE = registerBlock("levyne",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LIBETHENITE = registerBlock("libethenite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> LIEBENBERGITE = registerBlock("liebenbergite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LILLEYITE = registerBlock("lilleyite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LIMONITE = registerBlock("limonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LIMONITE_BROWN = registerBlock("limonite_brown",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LIMONITE_YELLOW = registerBlock("limonite_yellow",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LINNAEITE = registerBlock("linnaeite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LITHARGE = registerBlock("litharge",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LITHIUM_RAW = registerBlock("lithium_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LIZARDITE = registerBlock("lizardite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LOLLINGITE = registerBlock("lollingite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LORANDITE = registerBlock("lorandite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LUDWIGITE = registerBlock("ludwigite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> LUZONITE = registerBlock("luzonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MACKINAWITE = registerBlock("mackinawite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MAGNESITE = registerBlock("magnesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MAGNETITE = registerBlock("magnetite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MAGNETITE_TITANIUM = registerBlock("magnetite_titanium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MAGNETITE_VANADIUM = registerBlock("magnetite_vanadium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MAGNOMAGNESITE = registerBlock("magnomagnesite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MAJORITE = registerBlock("majorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MALACHITE = registerBlock("malachite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MANANDONITE = registerBlock("manandonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MANGANESE_RAW = registerBlock("manganese_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MARCASITE = registerBlock("marcasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MARGARITE = registerBlock("margarite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MARIALITE = registerBlock("marialite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> MASCAGNITE = registerBlock("mascagnite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MASKELYNITE = registerBlock("maskelynite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MASSICOT = registerBlock("massicot",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MEIONITE = registerBlock("meionite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> MELANOPHLOGITE = registerBlock("melanophlogite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MELANTERITE = registerBlock("melanterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MELILITE = registerBlock("melilite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MELIPHANITE = registerBlock("meliphanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MERILLITE = registerBlock("merillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> MERWINITE = registerBlock("merwinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> META_AUTUNITE = registerBlock("meta_autunite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> METAPHONOLITE = registerBlock("metaphonolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> METAVANDENDRIESSCHEITE = registerBlock("metavandendriesscheite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> METAVOLTINE = registerBlock("metavoltine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> METEORIC_IRON = registerBlock("meteoric_iron",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MILLERITE = registerBlock("millerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MIMETITE = registerBlock("mimetite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> MINIUM = registerBlock("minium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MINRECORDITE = registerBlock("minrecordite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MIRABILITE = registerBlock("mirabilite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MITRIDALITE = registerBlock("mitridalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MOGANITE = registerBlock("moganite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MOHAWKITE = registerBlock("mohawkite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MOHRITE = registerBlock("mohrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MOISSANITE = registerBlock("moissanite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> MOLYBDENITE = registerBlock("molybdenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MONAZITE = registerBlock("monazite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MONAZITE_CERIUM = registerBlock("monazite_cerium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MONAZITE_GADOLINIUM = registerBlock("monazite_gadolinium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MONAZITE_LANTHANUM = registerBlock("monazite_lanthanum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MONAZITE_NEODYMIUM = registerBlock("monazite_neodymium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MONAZITE_SAMARIUM = registerBlock("monazite_samarium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MONTICELLITE = registerBlock("monticellite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MONTMORILLONITE_CLAY = registerBlock("montmorillonite_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MOONSTONE = registerBlock("moonstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MORGANITE = registerBlock("morganite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> MOTTRAMITE = registerBlock("mottramite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MUSCOVITE = registerBlock("muscovite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> MUSGRAVITE = registerBlock("musgravite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NAKAURIITE = registerBlock("nakauriite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NAMANSILLITE = registerBlock("namansillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NATROLITE = registerBlock("natrolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NEPHELINE = registerBlock("nepheline",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> NICKEL_RAW = registerBlock("nickel_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NICKELINE = registerBlock("nickeline",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NICKELPHOSPHIDE = registerBlock("nickelphosphide",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NIERITE = registerBlock("nierite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> NITRATINE = registerBlock("nitratine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NITRE_GEODE_BLOCK = registerBlock("nitre_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> NITROCALCITE = registerBlock("nitrocalcite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NOLANITE = registerBlock("nolanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NONTRONITE = registerBlock("nontronite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NORDSTRANITE = registerBlock("nordstranite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> NORSETHITE = registerBlock("norsethite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> NOSEAN = registerBlock("nosean",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OKENITE = registerBlock("okenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OLENITE = registerBlock("olenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OLDHAMITE = registerBlock("oldhamite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OLEKMINSKITE = registerBlock("olekminskite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OLIVENITE = registerBlock("olivenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OLIVINE_CALCIUM = registerBlock("olivine_calcium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OLIVINE_FAYALITE = registerBlock("olivine_fayalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OMPHACITE = registerBlock("omphacite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ONYX_GEODE_BLOCK = registerBlock("onyx_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ORPIMENT = registerBlock("orpiment",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ORTHOCLASE_FELDSPAR_BLOCK = registerBlock("orthoclase_feldspar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OSMIRIDIUM = registerBlock("osmiridium",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> OSUMILITE = registerBlock("osumilite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> OTAVITE = registerBlock("otavite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OXYHORNBLENDE = registerBlock("oxyhornblende",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> PADPARADSCHA = registerBlock("padparadscha",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PALENZONAITE = registerBlock("palenzonaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PALLADIUM_RAW = registerBlock("palladium_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PALYGORSKITE_CLAY = registerBlock("palygorskite_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PARAGONITE = registerBlock("paragonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PARALSTONITE = registerBlock("paralstonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PARATACAMITE = registerBlock("paratacamite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PARGASITE = registerBlock("pargasite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> PATRONITE = registerBlock("patronite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PECORAITE = registerBlock("pecoraite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PECTOLITE = registerBlock("pectolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PENNINE = registerBlock("pennine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PENTLANDITE = registerBlock("pentlandite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PERICLASE = registerBlock("periclase",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PERIDOT = registerBlock("peridot",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PEROVSKITE = registerBlock("perovskite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PETALITE = registerBlock("petalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PETZITE = registerBlock("petzite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PHARMACOLITE = registerBlock("pharmacolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PHARMACOSIDERITE = registerBlock("pharmacosiderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PHENGITE = registerBlock("phengite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PHLOGOPITE = registerBlock("phlogopite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PHOSPHOPHYLLITE = registerBlock("phosphophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PICROMERITE = registerBlock("picromerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PIEMONTITE = registerBlock("piemontite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> PIGEONITE = registerBlock("pigeonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PISEKITE = registerBlock("pisekite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> PLATINIRIDIUM = registerBlock("platiniridium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PLATINUM_RAW = registerBlock("platinum_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PLEONASTE = registerBlock("pleonaste",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PLUMBOGUMMITE = registerBlock("plumbogummite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PLUMBOJAROSITE = registerBlock("plumbojarosite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> POLYBASITE = registerBlock("polybasite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> POLYHALITE = registerBlock("polyhalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PORTLANDITE = registerBlock("portlandite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> POSNJAKITE = registerBlock("posnjakite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> POTASSIC_MAGNESIO_FLUORO_ARFVEDSONITE = registerBlock("potassic_magnesio_fluoro_arfvedsonite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> POUDRETTEITE = registerBlock("poudretteite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> POWELLITE = registerBlock("powellite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PRASE_CRYSTAL_BLOCK = registerBlock("prase_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PRASOLITE = registerBlock("prasolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PSEUDOBROOKITE = registerBlock("pseudobrookite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PSEUDOMALACHITE = registerBlock("pseudomalachite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PSEUDOWOLLASTONITE = registerBlock("pseudowollastonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PSILOMELANE = registerBlock("psilomelane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PYRITE_BLOCK = registerBlock("pyrite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PYROCHLORE = registerBlock("pyrochlore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PYROLUSITE = registerBlock("pyrolusite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PYROMORPHITE = registerBlock("pyromorphite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PYROPE = registerBlock("pyrope",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PYROPHANITE = registerBlock("pyrophanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PYROPHYLLITE = registerBlock("pyrophyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PYRRHOTITE = registerBlock("pyrrhotite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> QUARTZ_FERRUGINOUS_BLOCk = registerBlock("quartz_ferruginous_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> QUARTZ_HERKIMER_DIAMOND_BLOCK = registerBlock("quartz_herkimer_diamond_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> QUARTZ_HIGH_PURITY_BLOCK = registerBlock("quartz_high_purity_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> QUARTZ_METAMORPHOSED = registerBlock("quartz_metamorphosed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> QUARTZ_RUTILATED_CRYSTAL_BLOCK = registerBlock("quartz_rutilated_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> QUARTZ_SHOCKED_BLOCK = registerBlock("quartz_shocked_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> QUARTZINE_GEODE_BLOCK = registerBlock("quartzine_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> QUETZALCOATLITE = registerBlock("quetzalcoatlite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAGUINITE = registerBlock("raguinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RANKINITE = registerBlock("rankinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> REALGAR = registerBlock("realgar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> REDGILLITE = registerBlock("redgillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RHABDOPHANE = registerBlock("rhabdophane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RHODOCHROSITE = registerBlock("rhodochrosite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RHODOCHROSITE_COBALT = registerBlock("rhodochrosite_cobalt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RHODONITE = registerBlock("rhodonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RHONITE = registerBlock("rhonite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> RICHTERITE = registerBlock("richterite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RIEBECKITE = registerBlock("riebeckite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RIECHENBACHITE = registerBlock("riechenbachite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RINGWOODITE = registerBlock("ringwoodite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RINMANITE = registerBlock("rinmanite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> RIPIDOLITE = registerBlock("ripidolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROCK_CRYSTAL = registerBlock("rock_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROCKBRIDGEITE = registerBlock("rockbridgeite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROMERITE = registerBlock("romerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSASITE = registerBlock("rosasite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROSENBUSCHITE = registerBlock("rosenbuschite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RUBELLITE = registerBlock("rubellite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> RUBICLINE = registerBlock("rubicline",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RUBY = registerBlock("ruby",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RUTHENIRIDOSMINE = registerBlock("rutheniridosmine",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> RUTILE = registerBlock("rutile",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SALAMMONIAC = registerBlock("salammoniac",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SALITE = registerBlock("salite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAMARSKITE = registerBlock("samarskite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SANROMANITE = registerBlock("sanromanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPONITE_CLAY = registerBlock("saponite_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRE = registerBlock("sapphire",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRE_GREEN = registerBlock("sapphire_green",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SAPPHIRINE = registerBlock("sapphirine",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SCAPOLITE = registerBlock("scapolite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SCHEELITE = registerBlock("scheelite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SCHOEPITE = registerBlock("schoepite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SCHREIBERSITE = registerBlock("schreibersite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SCHULENBERGITE = registerBlock("schulenbergite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SCOLECITE = registerBlock("scolecite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SCORODITE = registerBlock("scorodite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SEIDOZERITE = registerBlock("seidozerite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SEIFERTITE = registerBlock("seifertite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SERENDIBITE = registerBlock("serendibite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SERPIERITE = registerBlock("serpierite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SILICOCARNOTITE = registerBlock("silicocarnotite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SILLIMANITE = registerBlock("sillimanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SILVER_RAW = registerBlock("silver_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SKACHAITE = registerBlock("skachaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SMECTITE_CLAY = registerBlock("smectite_clay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMITHSONITE = registerBlock("smithsonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SMYTHITE = registerBlock("smythite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SODALITE = registerBlock("sodalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SPERRYLITE = registerBlock("sperrylite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SPESSARTINE = registerBlock("spessartine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SPHALERITE = registerBlock("sphalerite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SPHEROCOBALTITE = registerBlock("spherocobaltite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SPINEL = registerBlock("spinel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SPODUMENE = registerBlock("spodumene",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SPURRITE = registerBlock("spurrite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> STAUROLITE = registerBlock("staurolite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> STEPHANITE = registerBlock("stephanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> STIBIOTANTALITE = registerBlock("stibiotantalite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> STIBNITE = registerBlock("stibnite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> STILBITE = registerBlock("stilbite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> STILPNOMELANE = registerBlock("stilpnomelane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> STISHOVITE = registerBlock("stishovite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> STRONALSITE = registerBlock("stronalsite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> STRONTIANITE = registerBlock("strontianite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> STRUVITE = registerBlock("struvite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SUDOLITE = registerBlock("sudolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SUENOITE = registerBlock("suenoite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SUGILITE = registerBlock("sugilite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SULFUR_RAW = registerBlock("sulfur_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SVABITE = registerBlock("svabite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SYLVANITE = registerBlock("sylvanite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SYNGENITE = registerBlock("syngenite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> SZAIBELYITE = registerBlock("szaibelyite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SZOMOLKONITE = registerBlock("szomolkonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TAENITE = registerBlock("taenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TALC = registerBlock("talc",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TALC_BEACONITE = registerBlock("talc_beaconite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TANTALITE = registerBlock("tantalite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TANZANITE = registerBlock("tanzanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TAPIOLITE = registerBlock("tapiolite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> TELLURITE = registerBlock("tellurite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TENNANTITE = registerBlock("tennantite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TENORITE = registerBlock("tenorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TEPHROITE = registerBlock("tephroite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TETRAHEDRITE = registerBlock("tetrahedrite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> TETRATAENITE = registerBlock("tetrataenite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL2
    public static final RegistryObject<Block> THOMSONITE = registerBlock("thomsonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> THORIANITE = registerBlock("thorianite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> THORITE = registerBlock("thorite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> TITANITE = registerBlock("titanite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> THORIUM_RAW = registerBlock("thorium_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> THORTVEITITE = registerBlock("thortveitite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> THULITE = registerBlock("thulite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> THURINGITE = registerBlock("thuringite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TILLEYITE = registerBlock("tilleyite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TIN_RAW = registerBlock("tin_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TITANAUGITE = registerBlock("titanaugite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TLALOCITE = registerBlock("tlalocite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TOCHILINITE = registerBlock("tochilinite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TODOROKITE = registerBlock("todorokite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TOPAZ = registerBlock("topaz",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TORBERNITE = registerBlock("torbernite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TOURMALINE = registerBlock("tourmaline",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> TREMOLITE = registerBlock("tremolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TRIDYMITE = registerBlock("tridymite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TRIPHYLLITE = registerBlock("triphyllite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TRIPLITE = registerBlock("triplite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TROILLITE = registerBlock("troillite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TRONA = registerBlock("trona",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TRUFFITE = registerBlock("truffite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TSAREGORODTSEVITE = registerBlock("tsaregorodtsevite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TSCHERMAKITE = registerBlock("tschermakite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TSCHERMIGITE = registerBlock("tschermigite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TUGTUPITE = registerBlock("tugtupite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> TURQUOISE = registerBlock("turquoise",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> URANINITE = registerBlock("uraninite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> URANIUM_RAW = registerBlock("uranium_raw",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> URANOPHANE = registerBlock("uranophane",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> URANPYROCHLORE = registerBlock("uranpyrochlore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> UVAROVITE = registerBlock("uvarovite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> UVITE = registerBlock("uvite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> VANADINITE = registerBlock("vanadinite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> VANDENDRIESSCHEITE = registerBlock("vandendriesscheite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> VANTHOFFITE = registerBlock("vanthoffite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> VARSICITE_GEODE_BLOCK = registerBlock("variscite_geode_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> VERMICULITE = registerBlock("vermiculite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> VESUVIANITE = registerBlock("vesuvianite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> VIOLARITE = registerBlock("violarite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> VIVIANITE = registerBlock("vivianite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> VOLTAITE = registerBlock("voltaite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> VULCANITE = registerBlock("vulcanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WAVELLITE = registerBlock("wavellite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WHEWELLITE = registerBlock("whewellite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WHITEITE = registerBlock("whiteite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WHITLOCKITE = registerBlock("whitlockite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WILLEMSEITE = registerBlock("willemseite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WITHERITE = registerBlock("witherite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> WODGINITE = registerBlock("wodginite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WOHLERITE = registerBlock("wohlerite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> WOLFRAMITE = registerBlock("wolframite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WOLLASTONITE = registerBlock("wollastonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WOLSENDORFITE = registerBlock("wolsendorfite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WROEWOLFEITE = registerBlock("wroewolfeite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WULFENITE = registerBlock("wulfenite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WURTZITE = registerBlock("wurtzite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> XANTHOCONITE = registerBlock("xanthoconite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> XENOTIME = registerBlock("xenotime",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> XINGZHONGITE = registerBlock("xingzhongite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> XOCOMECATLITE = registerBlock("xocomecatlite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> YAFSOANITE = registerBlock("yafsoanite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> YAVAPAIITE = registerBlock("yavapaiite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> YTTROFLUORITE = registerBlock("yttrofluorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> YUGAWARALITE = registerBlock("yugawaralite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ZANAZZITE = registerBlock("zanazzite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ZEOLITE = registerBlock("zeolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ZINCITE = registerBlock("zincite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ZINCOCHROMITE = registerBlock("zincochromite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ZIRCON_CYRTOLITE = registerBlock("zircon_cyrtolite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ZIRCON_JACINTH = registerBlock("zircon_jacinth",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ZOISITE = registerBlock("zoisite",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST))); //MODEL
    public static final RegistryObject<Block> ZORITE = registerBlock("zorite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
