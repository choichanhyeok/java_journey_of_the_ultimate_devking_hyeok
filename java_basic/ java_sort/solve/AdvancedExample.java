package solve;
import java.util.Scanner;
import java.util.Arrays;

public class AdvancedExample {
    private static final int MAX_VALUE = 100;

    /**
    * 문자열 t를 입력받으면 해당 sentence가 t로 시작하는지 검증
    **/
    private static boolean startWith(String sentence, String t){

        if (sentence.length() < t.length()){ // 비교 대상인 t보다 sentence의 길이가 작으면 false 리턴
            return false;
        }

        boolean isStartWith = true;
        for (int i = 0; i < t.length(); i ++){
            if (sentence.charAt(i) != t.charAt(i)){
                isStartWith = false;
                break;
            }
        }

        return isStartWith ? true: false;
    }

    public static void solved() {

        Scanner sc = new Scanner(System.in);
        // TODO 0. 입력: 단어: n, 문자열: t, 사전순으로 정렬했을 때 출력할 인덱스: k
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        String[] strArrays = new String[MAX_VALUE];
        int strArraysIdx = 0;

        // TODO 1. n개에 줄에 걸쳐 단어 하나씩 적재 (단, 문자열 t로 시작하는 단어만 적재)
        for (int i = 0; i < n; i ++){
            String sentence = sc.next();

            if(startWith(sentence, t)){
                strArrays[strArraysIdx] = sentence;
                strArraysIdx += 1;
            };
        }

        // TODO 2. 저장된 String 배열을 정렬후 K번째 요소를 출력
        Arrays.sort(strArrays, 0, strArraysIdx);
        System.out.println(strArrays[k-1]);
    }
}
