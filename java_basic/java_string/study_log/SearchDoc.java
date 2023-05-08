package study_log;
import java.util.Scanner;


public class SearchDoc {
    /**
     * 단순하게 문자열을 순회하며 각 문자 비교해서 찾기
     * @author          Hyeok the king of devlopers
     * @param doc       탐색 대상 문서
     * @param target    탐색할 단어
     * @return          doc(탐색 대상 문서)에 target(탐색할 단어))가 몇개 들었는지 개수 리턴
     */
    private static int findWord(String doc, String target){
        int answer = 0;

        for (int i = 0; i < doc.length(); i ++){
            boolean isMatch = true;
            for (int j = 0; j < target.length(); j ++){
                if (i + j >= doc.length() || doc.charAt(i+j) != target.charAt(j)){
                    isMatch = false;
                    break;
                }
            }

            if (isMatch){
                answer += 1;
                i += target.length()-1;
            }
        }
        
        return answer;
    }


    /**
     * String.indexOf를 이용해 문제를 해결
     * @author          Hyeok, the king of Devlopers.
     */
    private static int findWordUsingIndexOf(String doc, String target){
        int startIndex = 0;
        int answer = 0;
        while(true){
            int findIndex = doc.indexOf(target, startIndex);
            if (findIndex < 0){
                break;
            }

            answer += 1;
            startIndex = findIndex + target.length();
        }

        return answer;
    }

    /**
     * Stirng.replace를 이용해 문제 해결
     * @author          Hyeok, the king of Devlopers
     */
    private static int findWordUsingReplace(String doc, String target){
        String replaced = doc.replace(target, "");
        int answer = (doc.length() - replaced.length()) / target.length();

        return answer;
    }


    public static void solve1543(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.nextLine();

        System.out.println(findWordUsingReplace(str, target));
    }
}





  