package net.junedev.junetech_geo.api.materials;

public class RadioisotopeBuilder {
    private String baseElement;
    private int atomicWeight;
    private int decayType; //1 = Alpha, 2 = Beta, 3 = Gamma
    private double halfLife;
    private String decayProduct;

    public Radioisotopes constructRadioisotope(String baseElement, int atomicWeight, int decayType, double halfLife, String decayProduct){
        return new Radioisotopes(
                baseElement,
                atomicWeight,
                decayType,
                halfLife,
                decayProduct
        );
    }
    public RadioisotopeBuilder setBaseElement(String baseElement){
        this.baseElement = baseElement;
        return this;
    }
    public RadioisotopeBuilder setAtomicWeight(int atomicWeight){
        this.atomicWeight = atomicWeight;
        return this;
    }
    public RadioisotopeBuilder setDecayType(int decayType){
        this.decayType = decayType;
        return this;
    }
    public RadioisotopeBuilder setHalfLife(double halfLife){
        this.halfLife = halfLife;
        return this;
    }
    public RadioisotopeBuilder setDecayProduct(String decayProduct){
        this.decayProduct = decayProduct;
        return this;
    }
}
