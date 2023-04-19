package study_log;
import java.util.Scanner;

/**
 * 2744번은 주어진 문자열(ex. abAcs)에서
 * 각각의 문자에 대해 대문자 소문자를 반전시키는 문제이다.
 * 결과 값 저장을 위해 String과 char Array 두 가지 방법을 사용할 수 있다.
 */
public class WhatDifferencesCharArrayAndString {
    public static void question2744(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char[] answer = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                answer[i] = (char)('a' + str.charAt(i) - 'A');             // 본 코드에서는 char Array를 이용해 주었다. 이 경우 인덱스에 바로 값 교체가 가능하다. 
            }else if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){        // 만약 string을 썼다면 immutable한 속성 때문에 값 교체 과정에서 n번의 재할당이 발생한다.
                answer[i] = (char)('A' + str.charAt(i) - 'a');
            }
        }

        for(int i = 0; i < answer.length; i ++){
            System.out.print(answer[i]);
        }
    }

    public static void question2744Type2(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";
        for (int i = 0; i < str.length(); i ++){
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                answer += (char)('a' + str.charAt(i) - 'A');              // String을 이용한 answer의 저장
            }else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                answer += (char)('A' + str.charAt(i) - 'a');
            }
        }
    }
}

// 2023-04-19 review
