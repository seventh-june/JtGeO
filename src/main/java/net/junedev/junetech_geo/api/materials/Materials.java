package net.junedev.junetech_geo.api.materials;

public class Materials {
    public static final Material QUARTZ;
    /*

     */
    static {
        QUARTZ = Material.create("Quartz")
                .materialID(1)
                .formula("SiO₂")
                .hardness(7)
                .crystalHabit("Quartz")
                .color(1)
                .luster("Vitreous")
                .rarity(0)
                .customCondition(null)
                .build();
    }
}