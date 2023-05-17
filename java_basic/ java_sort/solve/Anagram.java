package solve;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void solve() {
        Scanner sc = new Scanner(System.in);

        // TODO1.  두개의 단어 입력
        char[] sentenceA = sc.nextLine().toCharArray();
        char[] sentenceB = sc.nextLine().toCharArray();

        // TODO2.  정렬
        Arrays.sort(sentenceA);
        Arrays.sort(sentenceB);

        // TODO3. 두 단어가 같은지 검사 후 결과 출력
        if (new String(sentenceA).equals(new String(sentenceB))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
