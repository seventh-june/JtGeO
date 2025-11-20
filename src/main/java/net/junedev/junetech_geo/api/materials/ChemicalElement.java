package net.junedev.junetech_geo.api.materials;

import net.minecraft.util.StringRepresentable;
import net.minecraftforge.common.util.INBTSerializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Class defining a chemical element. A chemical element datagens recipes and automatically defines block/item
 * properties during registration.
 * <br>
 * TODO: A reaction method that takes the processing machine and {@link ChemicalElement} inputs as args, then outputs another {@link ChemicalElement}?
 * <br><br>
 * I've elected to tackle the implementation of {@link ChemicalElements} from an object-oriented approach instead. I may end
 * up repurposing that class using the same paradigm Mojang & Forge uses, see {@link net.minecraft.world.level.block.Blocks}
 * and {@link net.minecraft.world.level.block.Block}. This may or may not need to implement {@link INBTSerializable}
 * for datagen purposes. I'll cross that bridge as I get more familiar with what we're doing w/ this project.
 * <br><br>
 * This is a {@link StringRepresentable} whose serialized name is simply the name (non-IUPAC) of the chemical.
 * @author kawaiicakes
 */
@ParametersAreNonnullByDefault
public class ChemicalElement implements StringRepresentable {
    private final String name;
    private final String formula;
    private final float pH;
    private final float melting;
    private final float boiling;
    private final int color; // Use the hex colour for this as opposed to a String
    private final int transparency;
    private final boolean soluble;
    private final String mineralAssociate;
    private final float enthalpyOfFormation;

    private ChemicalElement(
            String name, String formula,
            float pH, float melting, float boiling,
            int color, int transparency,
            boolean soluble,
            @Nullable String mineralAssociate, // FIXME - figure this out...
            float enthalpyOfFormation
    ) {
        this.name = name;
        this.formula = formula;
        this.pH = pH;
        this.melting = melting;
        this.boiling = boiling;
        this.color = color;
        this.transparency = transparency;
        this.soluble = soluble;
        this.mineralAssociate = mineralAssociate;
        this.enthalpyOfFormation = enthalpyOfFormation;
    }

    @Override
    public @NotNull String getSerializedName() {
        return this.name;
    }

    // TODO - add the actual meat of the class lmao (datagen, property generation, reaction stuff)
    // TODO - Radioisotopes should probably go in here as well. Figure that out

    /**
     * @param name the name for the chemical. If an IUPAC name is not defined, {@code name} will take its place.
     */
    public static Builder create(String name) {
        return new Builder(name);
    }

    /**
     * This is mostly boilerplate lmaoooo
     */
    public static class Builder {
        private final String name;
        private String formula = "NULL";
        private float pH = 0;
        private float melting = 0;
        private float boiling = 0;
        private int color = 0xFFFFFF;
        private int transparency = 0;
        private boolean soluble = false;
        private String mineralAssociate = null;
        private float enthalpyOfFormation = 0;

        private Builder(String name) {
            this.name = name;
        }

        public Builder formula(String formula) {
            this.formula = formula;
            return this;
        }

        public Builder pH(float pH) {
            this.pH = pH;
            return this;
        }

        public Builder melting(float melting) {
            this.melting = melting;
            return this;
        }

        public Builder boiling(float boiling) {
            this.boiling = boiling;
            return this;
        }

        public Builder color(int color) {
            this.color = color;
            return this;
        }

        public Builder transparency(int transparency) {
            this.transparency = transparency;
            return this;
        }

        public Builder soluble(boolean soluble) {
            this.soluble = soluble;
            return this;
        }

        public Builder mineralAssociate(String mineralAssociate) {
            this.mineralAssociate = mineralAssociate;
            return this;
        }

        public Builder formationEnthalpy(float enthalpyOfFormation) {
            this.enthalpyOfFormation = enthalpyOfFormation;
            return this;
        }


        public ChemicalElement build() {
            return new ChemicalElement(
                    this.name, this.formula,
                    this.pH, this.melting, this.boiling,
                    this.color, this.transparency,
                    this.soluble,
                    this.mineralAssociate,
                    this.enthalpyOfFormation
            );
        }
    }
}
