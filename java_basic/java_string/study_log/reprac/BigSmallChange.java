package study_log.reprac;
import java.util.Scanner;

public class BigSmallChange{
    public static void bigSmall(char[] sentence){
        for (int i = 0; i < sentence.length; i ++){
            if(isBig(sentence[i])){
                sentence[i] = (char)(sentence[i] - 'A' + 'a');
            }else{
                sentence[i] = (char)(sentence[i] - 'a' + 'A');
            }
        }
    }

    public static boolean isBig(char alphabet){
        return 'A' <= alphabet && alphabet <= 'Z' ? true : false;
    }
    public static void solve2744(){
        Scanner sc = new Scanner(System.in);
        
        // TODO1. 영어 대문자와 소문자로 이루어진 알파벳을 받는다.
        char[] sentence = sc.next().toCharArray();

        // TODO2. 대문자와 소문자를 스왑
        bigSmall(sentence);

        for(int i = 0; i < sentence.length; i ++){
            System.out.print(sentence[i]);
        }
    }
}