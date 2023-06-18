package genericAndCollection.GenericLearn.FirstStep;
import genericAndCollection.GenericLearn.FirstStep.material.Material;

public class ThreeDPrinterUsingGenericExtends<T extends Material> {
    private T material;

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return this.material;
    }

    public String toStirng(){
        return material.toString();
    }

    public void doPrinting(){
        material.doPrinting();
    }
}
