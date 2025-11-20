package net.junedev.junetech_geo.api.materials;

// FIXME - In terms of style guidelines, static fields should have names ALL IN CAPS
public class ChemicalElements { 
        public static final ChemicalElement HYDROGEN;
        public static final ChemicalElement HELIUM;
        /* TODO - add these. We could probably read these values from a JSON or CSV or something prior to the registry loading.
        public static final ChemicalElement Lithium;
        public static final ChemicalElement Beryllium;
        public static final ChemicalElement Boron;
        public static final ChemicalElement Carbon;
        public static final ChemicalElement Nitrogen;
        public static final ChemicalElement Oxygen;
        public static final ChemicalElement Fluorine;
        public static final ChemicalElement Neon;
        public static final ChemicalElement Sodium;
        public static final ChemicalElement Magnesium;
        public static final ChemicalElement Aluminium;
        public static final ChemicalElement Silicon;
        public static final ChemicalElement Phosphorus;
        public static final ChemicalElement Sulfur;
        public static final ChemicalElement Chlorine;
        public static final ChemicalElement Argon;
        public static final ChemicalElement Potassium;
        public static final ChemicalElement Calcium;
        public static final ChemicalElement Scandium;
        public static final ChemicalElement Titanium;
        public static final ChemicalElement Vanadium;
        public static final ChemicalElement Chromium;
        public static final ChemicalElement Manganese;
        public static final ChemicalElement Iron;
        public static final ChemicalElement Cobalt;
        public static final ChemicalElement Nickel;
        public static final ChemicalElement Copper;
        public static final ChemicalElement Zinc;
        public static final ChemicalElement Gallium;
        public static final ChemicalElement Germanium;
        public static final ChemicalElement Arsenic;
        public static final ChemicalElement Selenium;
        public static final ChemicalElement Rubidium;
        public static final ChemicalElement Strontium;
        public static final ChemicalElement Yttrium;
        public static final ChemicalElement Zirconium;
        public static final ChemicalElement Niobium;
        public static final ChemicalElement Molybdenum;
        public static final ChemicalElement Ruthenium;
        public static final ChemicalElement Rhodium;
        public static final ChemicalElement Palladium;
        public static final ChemicalElement Silver;
        public static final ChemicalElement Cadmium;
        public static final ChemicalElement Indium;
        public static final ChemicalElement Tin;
        public static final ChemicalElement Antimony;
        public static final ChemicalElement Tellurium;
        public static final ChemicalElement Iodine;
        public static final ChemicalElement Caesium;
        public static final ChemicalElement Barium;
        public static final ChemicalElement Lanthanum;
        public static final ChemicalElement Cerium;
        public static final ChemicalElement Praseodymium;
        public static final ChemicalElement Neodymium;
        public static final ChemicalElement Samarium;
        public static final ChemicalElement Europium;
        public static final ChemicalElement Gadolinium;
        public static final ChemicalElement Terbium;
        public static final ChemicalElement Dysprosium;
        public static final ChemicalElement Holmium;
        public static final ChemicalElement Erbium;
        public static final ChemicalElement Thulium;
        public static final ChemicalElement Ytterbium;
        public static final ChemicalElement Lutetium;
        public static final ChemicalElement Hafnium;
        public static final ChemicalElement Tantalum;
        public static final ChemicalElement Tungsten;
        public static final ChemicalElement Rhenium;
        public static final ChemicalElement Osmium;
        public static final ChemicalElement Iridium;
        public static final ChemicalElement Platinum;
        public static final ChemicalElement Gold;
        public static final ChemicalElement Mercury;
        public static final ChemicalElement Thallium;
        public static final ChemicalElement Lead;
        public static final ChemicalElement Bismuth;
        public static final ChemicalElement Polonium;
        public static final ChemicalElement Astatine;
        public static final ChemicalElement Actinium;
        public static final ChemicalElement Thorium;
        public static final ChemicalElement Uranium;
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
