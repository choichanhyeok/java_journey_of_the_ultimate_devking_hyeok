package study_log.reprac;
import java.util.Scanner;

/**
 * 백준 애너그램 만들기: 1919
 */
public class LetsMakeAnagram {
    private static final int alphabetSize = 26;

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        char[] sentenceA = sc.next().toCharArray();
        char[] sentenceB = sc.next().toCharArray();

        // TODO 1. 각 문자의 인덱스 번호에 따라 카운트를 하는 배열 선언
        int[] unDuplicatedAlphabetCnt = new int[alphabetSize];

        // TODO 2. A의 문자는 +1 B의 문자는 -1 처리 해서 중복되지 않은 
        for (char alphabet: sentenceA){
            unDuplicatedAlphabetCnt[alphabet - 'a'] += 1;
        }

        for (char alphabet: sentenceB){
            unDuplicatedAlphabetCnt[alphabet - 'a'] -= 1;
        }

        // TODO 3. 중복되지 않은 값들만 세기
        int answer = 0;
        for (int cnt: unDuplicatedAlphabetCnt){
            answer += Math.abs(cnt);
        }

        System.out.println(answer);
    }
}
