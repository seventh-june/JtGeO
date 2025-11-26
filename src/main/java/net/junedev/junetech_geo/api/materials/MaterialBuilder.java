/* package net.junedev.junetech_geo.api.materials;

public class MaterialBuilder {
    private final int materialID;
    private String name;
    private final String localName;
    private String associatedBlock = null;
    private String formula = null;
    private int hardness = 3;
    private String crystalHabit = null;
    private int r = 255, g = 255, b = 255, a = 0;
    private String luster = null;
    private int rarity = 1;
    private String group = null;
    private String customCondition = null;

//    private List<MaterialItems> materialList = new ArrayList<>();

    public MaterialBuilder(int materialID, String localName) {
        this.materialID = materialID;
        if (localName.equals("NULL")){
            this.localName = name;
        } else {
            this.name = localName.replace(" ", "")
                    .replace("-", "");
            this.localName = localName;
        }
    }
    public Materials constructMaterial(int materialID, String name, String associatedBlock, String formula, int hardness, String textureTemplate, int r, int g, int b, int a, String luster, int rarity, String group, String customCondition) {
        return new Materials(
                materialID,
                name,
                localName,
                associatedBlock,
                formula,
                hardness,
                crystalHabit,
                r, g, b, a,
                luster,
                rarity,
                group,
                customCondition
        );
    }
    public MaterialBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public MaterialBuilder setBlock(String associatedBlock) {
        this.associatedBlock = associatedBlock;
        return this;
    }
    public MaterialBuilder setFormula(String formula) {
        this.formula = formula;
        return this;
    }
    public MaterialBuilder setHardness(int hardness) {
        this.hardness = hardness;
        return this;
    }
    public MaterialBuilder setTextures(String crystalHabit) {
        this.crystalHabit = crystalHabit;
        return this;
    }
    public MaterialBuilder setLuster(String luster) {
        this.luster = luster;
        return this;
    }

    public MaterialBuilder setGroup(String group) {
        this.group = group;
        return this;
    }

    public MaterialBuilder setCustom(String customCondition) {
        this.customCondition = customCondition;
        return this;
    }


    public MaterialBuilder setRGBA(int r, int g, int b, int a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
        return this;
    }

    public MaterialBuilder setRGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        return this;
    }

    public MaterialBuilder setRGB(int rgb) {
        this.r = (rgb >> 16) & 0xFF;
        this.g = (rgb >> 8) & 0xFF;
        this.b = rgb & 0xFF;
        return this;
    }
}
 */
