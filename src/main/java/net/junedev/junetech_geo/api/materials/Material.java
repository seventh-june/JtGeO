package net.junedev.junetech_geo.api.materials;

import net.minecraft.util.StringRepresentable;
import net.minecraftforge.common.util.INBTSerializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class Material implements StringRepresentable {
    private static int materialID;
    private final String name;
    private static String formula;
    private static float hardness;
    private static String crystalHabit;
    private static int color;
    private static String luster;
    @Nullable private static String customCondition;

    private Material(
            int materialID,
        String name, String formula,
        float harness, String crystalHabit,
        int color, String luster,
        String customConditions
) {
    this.materialID = materialID;
    this.name = name;
    this.formula = formula;
    this.hardness = harness;
    this.crystalHabit = crystalHabit;
    this.color = color;
    this.luster = luster;
    this.customCondition = customCondition;
}
    public static Builder create(String name) {
        return new Builder(name);
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }

    public static class Builder {
        private static int materialID;
        private final String name;
        private static String formula;
        private static float hardness;
        private static String crystalHabit;
        private static int color;
        private static String luster;
        @Nullable private static String customCondition;

        private Builder(String name) {
            this.name = name;
        }

        public Builder formula(String formula) {
            this.formula = formula;
            return this;
        }

        public Builder materialID(int materialID) {
            this.materialID = materialID;
            return this;
        }

        public Builder hardness(float hardness) {
            this.hardness = hardness;
            return this;
        }

        public Builder crystalHabit(String crystalHabit) {
            this.crystalHabit = crystalHabit;
            return this;
        }

        public Builder color(int color) {
            this.color = color;
            return this;
        }

        public Builder luster(String luster) {
            this.luster = luster;
            return this;
        }

        public Builder customCondition(String customCondition) {
            this.customCondition = customCondition;
            return this;
        }


        public Material build() {
            return new Material(
                    this.materialID,
                    this.name, this.formula,
                    this.hardness, this.crystalHabit,
                    this.color, this.luster,
                    this.customCondition
            );
        }
    }
}
