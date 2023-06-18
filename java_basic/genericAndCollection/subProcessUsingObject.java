package genericAndCollection;
import genericAndCollection.GenericLearn.FirstStep.ThreeDPrinterUsingObject;
import genericAndCollection.GenericLearn.FirstStep.material.Plastic;
import genericAndCollection.GenericLearn.FirstStep.material.Powder;

public class subProcessUsingObject {
    public static void run() {
        ThreeDPrinterUsingObject threeDPrinterUsingObject = new ThreeDPrinterUsingObject();
        Plastic plastic = new Plastic();
        Powder powder = new Powder();

        // 1. plastic이든 powder든 아무거나 넣어줄 수 있음
        threeDPrinterUsingObject.setMaterail(plastic);
        threeDPrinterUsingObject.setMaterail(powder);

        // 2. 하지만 get의 경우 Object로 나오기 떄문에 형변환을 해줘야함
        Powder temp = (Powder)threeDPrinterUsingObject.getMaterial();
    }
}
