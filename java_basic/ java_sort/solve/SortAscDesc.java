package solve;
import java.util.Scanner;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class SortAscDesc {
    /**
     * 주어진 배열을 정렬후 출력하는 메서드
     */
    private static void sortAndPrint(int[] numberArray){
        // TODO 2-1. 정렬 후 출력
        int[] numberArrayAsc = numberArray;

        Arrays.sort(numberArrayAsc);
        printArray(numberArrayAsc);

        // TODO 2-2. 역순 정렬 후 출력

        Integer[] numberArrayDesc = Arrays.stream(numberArray).boxed().toArray(Integer[]::new);
        Arrays.sort(numberArrayDesc, Collections.reverseOrder());

        // Integer[] numberArrayDesc = Arrays.stream(numberArray).boxed().toArray(Integer[]::new); // 방법 1.
        // Arrays.sort(numberArrayDesc, Collections.reverseOrder()); 

        for (Integer number: numberArrayDesc){
            System.out.print(number + " ");
        }
        System.out.println();

        // List<Integer> numberArrayDescAsInteger = Arrays.stream(numberArray).boxed().collect(Collectors.toList());
        // Collections.sort(numberArrayDescAsInteger, Collections.reverseOrder()); // 방법 2.
    }

    private static void printArray(int[] numberArray){
        for (int number: numberArray){
            System.out.print(number + " ");
        }
        System.out.println();
    }


    public static void sortAscDescSolve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numberArray = new int[n];

        // TODO1. 숫자 배열 값 받기
        for (int i = 0; i < numberArray.length; i ++){
            numberArray[i] = sc.nextInt();
        }

        // TODO2. 숫자 배열 정렬 및 역순 정렬 후 출력하는 메서드 호출
        sortAndPrint(numberArray);

    }
}
