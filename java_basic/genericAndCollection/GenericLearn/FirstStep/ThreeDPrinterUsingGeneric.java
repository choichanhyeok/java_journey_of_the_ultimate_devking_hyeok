package genericAndCollection.GenericLearn.FirstStep;

public class ThreeDPrinterUsingGeneric<T> {
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
}
