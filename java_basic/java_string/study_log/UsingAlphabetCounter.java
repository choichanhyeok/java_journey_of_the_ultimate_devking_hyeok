package study_log;
import java.util.Scanner;


public class UsingAlphabetCounter {

    private static int[] getCountArray(String str){
        int[] countArray = new int[26];
        for (int i = 0; i < str.length(); i ++){
            countArray[(str.charAt(i))-'a'] += 1;
        }

        return countArray;
    }

    private static int getDifferenceEachCntArray(int[] arrayA, int[]arrayB){
        int answer = 0;
        for (int i = 0; i < 26; i ++){
            answer += Math.abs(arrayA[i] - arrayB[i]);
        }

        return answer;
    }

    public static void isAnagram(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] cntA = getCountArray(a);
        int[] cntB = getCountArray(b);

        System.out.println(getDifferenceEachCntArray(cntA, cntB));
    }
}
