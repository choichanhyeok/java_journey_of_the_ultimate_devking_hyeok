package study_log.reprac;
import java.util.Scanner;

public class StudyWord{
    private static void getAnswer(char[] sentence){
        int now_idx = 0;
        int[] countArray = new int[26];
        int maxValue = 0;
        int maxIdx = 0;

        // TODO 1-2. 단어의 각 알파벳 순회, 
        for (char alphabet: sentence){
            if ('A' <= alphabet && alphabet <= 'Z'){
                now_idx = (alphabet - 'A');
            }else if('a' <= alphabet && alphabet <= 'z'){
                now_idx = (alphabet - 'a');
            }

            // TODO 1-3. 현재 알파벳의 인덱스에 += 1
            countArray[now_idx] += 1;
            // TODO 1-4. 현재 추가된 알파벳의 빈도수가 최빈 알파벳의 빈도수를 넘어섰다면 스왑
            if (maxValue < countArray[now_idx]){
                maxValue = countArray[now_idx];
                maxIdx = now_idx;
            }
        }

        int maxValueCnt = 0;

        for(int cnt: countArray){
            if (maxValue == cnt){
                maxValueCnt += 1;
            }
            if (maxValueCnt == 2){
                System.out.println('?');
                return;
            }
        }

        System.out.println((char)('A' + maxIdx));
    }

    public static void solved1557(){
        Scanner sc = new Scanner(System.in);        
        // TODO1. 알파벳 대소문자가 주어지면
        char[] sentence = sc.next().toCharArray();

        // TODO2. 가장 많이 사용된 알파벳이 뭔지 찾기
        getAnswer(sentence);
    }
}