package genericAndCollection;
import genericAndCollection.GenericLearn.FirstStep.ThreeDPrinterUsingGeneric;
import genericAndCollection.GenericLearn.FirstStep.ThreeDPrinterUsingObject;
import genericAndCollection.GenericLearn.FirstStep.material.Plastic;
import genericAndCollection.GenericLearn.FirstStep.material.Powder;

public class subProcessUsingGeneric {
    public static void run() {
        ThreeDPrinterUsingGeneric<Powder> threeDPrinterUsingGenericPowder = new ThreeDPrinterUsingGeneric<>();
        threeDPrinterUsingGenericPowder.setMaterial(new Powder());
        System.out.println(threeDPrinterUsingGenericPowder.toStirng());

        ThreeDPrinterUsingGeneric<Plastic> threeDPrinterUsingGenericPlastic = new ThreeDPrinterUsingGeneric<>();
        threeDPrinterUsingGenericPlastic.setMaterial(new Plastic());
        System.out.println(threeDPrinterUsingGenericPowder.toStirng());
    }
}
