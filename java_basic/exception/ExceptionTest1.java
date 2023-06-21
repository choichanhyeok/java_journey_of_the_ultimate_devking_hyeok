package exception;

public class ExceptionTest1 {

    public static void exceptionTest1() {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        System.out.println("done!!");
    }
}
