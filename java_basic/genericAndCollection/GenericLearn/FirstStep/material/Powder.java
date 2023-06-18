package genericAndCollection.GenericLearn.FirstStep.material;

public class Powder extends Material{
    public String toString(){
        return "재료는 Plastic 입니다.";
    }

    @Override
    public void doPrinting(){
        System.out.println("Powder 재료로 사용합니다.");
    }
}
