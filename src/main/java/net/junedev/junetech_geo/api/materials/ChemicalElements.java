package net.junedev.junetech_geo.api.materials;

public class ChemicalElements { 
        public static final ChemicalElement HYDROGEN;
        public static final ChemicalElement HELIUM;
        /* TODO - add these. We could probably read these values from a JSON or CSV or something prior to the registry loading.
        public static final ChemicalElement LITHIUM;
        public static final ChemicalElement BERYLLIUM;
        public static final ChemicalElement BORON;
        public static final ChemicalElement CARBON;
        public static final ChemicalElement NITROGEN;
        public static final ChemicalElement OXYGEN;
        public static final ChemicalElement FLUORINE;
        public static final ChemicalElement NEON;
        public static final ChemicalElement SODIUM;
        public static final ChemicalElement MAGNESIUM;
        public static final ChemicalElement ALUMINIUM;
        public static final ChemicalElement SILICON;
        public static final ChemicalElement PHOSPHORUS;
        public static final ChemicalElement SULFUR;
        public static final ChemicalElement CHLORINE;
        public static final ChemicalElement ARGON;
        public static final ChemicalElement POTASSIUM;
        public static final ChemicalElement CALCIUM;
        public static final ChemicalElement SCANDIUM;
        public static final ChemicalElement TITANIUM;
        public static final ChemicalElement VANADIUM;
        public static final ChemicalElement CHROMIUM;
        public static final ChemicalElement MANGANESE;
        public static final ChemicalElement IRON;
        public static final ChemicalElement COBALT;
        public static final ChemicalElement NICKEL;
        public static final ChemicalElement COPPER;
        public static final ChemicalElement ZINC;
        public static final ChemicalElement GALLIUM;
        public static final ChemicalElement GERMANIUM;
        public static final ChemicalElement ARSENIC;
        public static final ChemicalElement SELENIUM;
        public static final ChemicalElement BROMINE;
        public static final ChemicalElement KRYPTON;
        public static final ChemicalElement RUBIDIUM;
        public static final ChemicalElement STRONTIUM;
        public static final ChemicalElement YTTRIUM;
        public static final ChemicalElement ZIRCONIUM;
        public static final ChemicalElement NIOBIUM;
        public static final ChemicalElement MOLYBDENUM;
        public static final ChemicalEmelemt TECHNETIUM;
        public static final ChemicalElement RUTHENIUM;
        public static final ChemicalElement RHODIUM;
        public static final ChemicalElement PALLADIUM;
        public static final ChemicalElement SILVER;
        public static final ChemicalElement CADMIUM;
        public static final ChemicalElement INDIUM;
        public static final ChemicalElement TIN;
        public static final ChemicalElement ANTIMONY;
        public static final ChemicalElement TELLURIUM;
        public static final ChemicalElement IODINE;
        public static final ChemicalElement XENON;
        public static final ChemicalElement CAESIUM;
        public static final ChemicalElement BARIUM;
        public static final ChemicalElement LANTHANUM;
        public static final ChemicalElement CERIUM;
        public static final ChemicalElement PRASEODYMIUM;
        public static final ChemicalElement NEODYMIUM;
        public static final ChemicalElement PROMETHIUM;
        public static final ChemicalElement SAMARIUM;
        public static final ChemicalElement EUROPIUM;
        public static final ChemicalElement GADOLINIUM;
        public static final ChemicalElement TERBIUM;
        public static final ChemicalElement DYSPROSIUM;
        public static final ChemicalElement HOLMIUM;
        public static final ChemicalElement ERBIUM;
        public static final ChemicalElement THULIUM;
        public static final ChemicalElement YTTERBIUM;
        public static final ChemicalElement LUTETIUM;
        public static final ChemicalElement HAFNIUM;
        public static final ChemicalElement TANTALUM;
        public static final ChemicalElement TUNGSTEN;
        public static final ChemicalElement RHENIUM;
        public static final ChemicalElement OSMIUM;
        public static final ChemicalElement IRIDIUM;
        public static final ChemicalElement PLATINUM;
        public static final ChemicalElement GOLD;
        public static final ChemicalElement MERCURY;
        public static final ChemicalElement THALLIUM;
        public static final ChemicalElement LEAD;
        public static final ChemicalElement BISMUTH;
        public static final ChemicalElement POLONIUM;
        public static final ChemicalElement ASTATINE;
        public static final ChemicalElement RADON;
        public static final ChemicalElement FRANCIUM;
        public static final ChemicalElement RADIUM;
        public static final ChemicalElement ACTINIUM;
        public static final ChemicalElement THORIUM;
        public static final ChemicalElement URANIUM;
        public static final ChemicalElement NEPTUNIUM;
        public static final ChemicalElement PLUTONIUM;


         */
        
        static {
                HYDROGEN = ChemicalElement.create("Hydrogen")
                        .formula("H₂")
                        .melting(-259.16F)
                        .boiling(-252.87F)
                        .color(0xFFFFFF) // replace w/ hex colour for "PaleBlue"
                        .transparency(50)
                        .formationEnthalpy(0) // fix this
                        .build();

                HELIUM = ChemicalElement.create("Helium")
                        .formula("He")
                        .melting(-268.93F)
                        .boiling(-268.93F)
                        .color(0xFFFFFF) // replace w/ hex colour for "CoolGrey10"
                        .transparency(50)
                        .formationEnthalpy(0) // fix this
                        .build();
        }
}
