package java_string.study_log;
import java.util.Scanner;

public class AlphabetCount {
    /**
     * 문자열을 순회하면서 해당 단어의 숫자를 세야함
     * TODO 1. 하지만 대, 소문자 구분이 없기 때문에 대문자로 통일 (즉, 소문자인 경우 대문자로 변경해 해당 알파벳의 카운트 주소에 +=1)
     * @return 각 알파벳 별 카운팅을 진행한 int형 배열
     */
    public static int[] countAlphabet(String word){
        int[] alphabetCntArray = new int[26];

        for (int i = 0; i < word.length(); i ++){
            char nowWord = word.charAt(i);
            if ('a' <= nowWord && nowWord <= 'z'){
                nowWord = (char)('a' - nowWord + 'A');
            }
            alphabetCntArray['A' - nowWord] += 1;
        }

        return alphabetCntArray;
    }

    /**
     * 카운트 배열에서 가장 큰 값을 찾는 메서드
     */
    public static char getMaxValue(int[] alphabetCntArray){
        int maxValue = 0;
        int maxIdx = 0;
        for (int i = 0; i < 26; i ++){
            maxValue = Math.max(maxValue, alphabetCntArray[i]);
            maxIdx = i;
        }
        return (char)('A' + maxIdx);
    }

    public static void solve1157(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] alphabetCntArray = countAlphabet(str);
        System.out.println(getMaxValue(alphabetCntArray));
    }
}
