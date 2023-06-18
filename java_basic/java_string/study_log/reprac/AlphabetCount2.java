package java_string.study_log.reprac;
import java.util.Scanner;

public class AlphabetCount2{
    public static int[] countEachAlphabet(String word){
        int[] answer = new int[26];

        for (int i = 0; i < word.length(); i ++){
            char nowWord = word.charAt(i);
            if ('a' <= word.charAt(i) && word.charAt(i) <= 'z'){
                nowWord = (char)(word.charAt(i) - 'a' + 'A');
            }
            answer[(nowWord-'A')] += 1;
        }

        return answer;
    }

    /**
     * alphabetCntArray를 순회하며 최대 값 찾기
     * @param alphabetCntArray
     * @return
     */
    public static char maxCountAlphabet(int[] alphabetCntArray){
        char answer;

        int maxValue = 0;
        int maxIdx = 0;

        for (int i = 0; i < alphabetCntArray.length; i ++){
            int nowValue = alphabetCntArray[i];
            if (maxValue < nowValue){
                maxValue = nowValue;
                maxIdx = i;
            }
        }

        int max_cnt = 0;
        for (int i = 0; i < alphabetCntArray.length; i++){
            if (alphabetCntArray[i] == maxValue){
                max_cnt += 1;
            }
            if (max_cnt == 2){
                return '?';
            }
        }

        answer = (char)('A' + maxIdx);
        return answer;
    }

    public static void reSolve1157(){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int[] countAlphabetArray = countEachAlphabet(word);
        // 각 알파벳 빈도중 가장 큰 것 찾기
        char answer = maxCountAlphabet(countAlphabetArray);
        System.out.println(answer);
    }
}