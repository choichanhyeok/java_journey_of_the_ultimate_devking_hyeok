package study_log.reprac;
import java.util.Scanner;

public class SearchDocs {
    
    public static void solved1543WithCompleteSearch(String sentence, String target){
        int answer = 0;

        // TODO2. 주어진 문장에 탐색 대상 단어가 몇 번 등장하는지 세야한다.
        for (int i = 0; i < sentence.length(); i ++){
            boolean isMatch = true;
            for (int j = 0; j < target.length(); j ++){
                if (sentence.length() <= (i+j) || sentence.charAt(i+j) != target.charAt(j)){
                    isMatch = false;
                    break;
                }
            }
            if (isMatch){
                answer += 1;
                i += target.length() - 1; // TODOD3. 동시에 셀 수 없으니 하나의 단어를 찾았다면 그 그 단어만큼 건너 띄어야한다.
            }
        }

        // TODOD4. 중복되지 않게 최대 몇번 등장했는지 출력하시오.  ex. 3
        System.out.println(answer);
    }

    public static void solved1543WithIndexOf(String sentence, String target){
        int startIdx = 0;
        int answer = 0;
        while(true){
            // TODO1. indexOf에 target문자열과 start 인덱스를 넣어 탐색 -> findIdx;
            int findIdx = sentence.indexOf(target, startIdx);

            // TODOD2. findIdx가 0보다 작으면 탈출
            if(findIdx < 0){
                break;
            }

            // TODO3. 시작 위치를 현재 찾은 위치 + 타겟의 크기로 변경 
            startIdx = findIdx + target.length();
            answer += 1; // TODO4. 탐색 단어가 존재하니 answer += 1
        }

        System.out.println(answer);
    }

    public static void solved1543WithReplace(String sentence, String target){
        // TODO1. sentence에서 target 단어 제거
        String replacedSentence = sentence.replace(target, "");

        // TODO2. 기존 sentence와 변경된 sentence의 차이에서 target의 길이를 나눔 (target이 몇 개 변경 되었는지 파악)
        System.out.println(((sentence.length() - replacedSentence.length()) / target.length()));
    }

    public static void solved1543(){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String target = sc.nextLine();

        solved1543WithReplace(sentence, target);
    }
}
