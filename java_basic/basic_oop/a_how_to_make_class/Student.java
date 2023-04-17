package basic_oop.a_how_to_make_class;


public class Student {
    int student;
    String studentName;
    String studentAddress;

    public void showStudentInfo(){
        System.out.println(studentName + ", " + studentAddress);
    }

    public String getStudentName() {
        return studentName;
    }

    /**
     * 테스트용 메인 메서드
     * @param args
     */
    public static void main(String[] args) {
        Student studentChoi = new Student();
        Student studentPark = new Student();
        // bad member variable settings
        studentChoi.studentAddress = "천안시";
        studentChoi.studentName = "최찬혁";

        // Q. why that variable settings is bad case. what do you think about?
        // A. ... this class can't support capsulation. Because they are defalut level! I recommend you have to using private. and getter. or builder pattern. or using constructor.

        studentChoi.showStudentInfo();

        // Q. 두 객체를 각각 출력하면 무엇이 나올까요?
        // A. 각 객체의 주소값이 나옵니다. 객체는 힙에 할당되는데 이때 각자의 주소값을 가지게 됩니다.
        System.out.println(studentChoi);
        System.out.println(studentPark);
    }
}

