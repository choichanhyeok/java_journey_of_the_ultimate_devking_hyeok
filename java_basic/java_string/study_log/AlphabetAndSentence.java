package java_string.study_log;
import java.util.Scanner;


public class AlphabetAndSentence {
    
    public static void solved27866(){
        Scanner sc = new Scanner(System.in);

        // TODO 1.단어 S와 탐색할 정수형 주소 i를 입력받기
        String sentence = sc.next();
        int idx = sc.nextInt();

        // TODO 2. 단어 S의 i번째 요소 찾기
        System.out.println(sentence.charAt(idx-1));
    }
}
