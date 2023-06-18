package java_string.study_log;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class SaltBoomer {
    /**
     * ": 기준으로 시간, 분, 초 데이터를 각각 분리"
     * @param time
     * @return 시, 분, 초 정보가 담긴 배열을 리턴
     */
    public static int[] divide(String time){
        String[] timeToArray = time.split(":");
        int hour = Integer.parseInt(timeToArray[0]);
        int minute = Integer.parseInt(timeToArray[1]);
        int second = Integer.parseInt(timeToArray[2]);

        return new int[]{hour, minute, second};
    }

    /**
     * 각 시간, 분, 초의 차이 구하기
     * @param currentTimeArray
     * @param targetTimeArray
     * @return
     */
    public static int[] getDifferenceEachTime(int[] currentTimeArray, int[] targetTimeArray){
        int totalCurrentTiemAmount = (currentTimeArray[0] * 3600) + (currentTimeArray[1] * 60) + (currentTimeArray[2]);
        int totalTargetTiemAmount = (targetTimeArray[0] * 3600) + (targetTimeArray[1] * 60) + (targetTimeArray[2]);

        int needTimeAmount = totalTargetTiemAmount - totalCurrentTiemAmount;
        if (needTimeAmount < 0)
            needTimeAmount += 24 * 3600;

        int needHour = needTimeAmount / 3600;
        int needMinute = (needTimeAmount % 3600) / 60;
        int needSecond = (needTimeAmount) % 60;

        return new int[]{needHour, needMinute, needSecond};
    }


    public static void solved13223(){
        Scanner sc = new Scanner(System.in);
        String currentTime = sc.next(); 
        String targetTime = sc.next();


        // TODO1. 시간, 분, 초를 ':' 단위로 분리한다.
        int[] currentTimeArray = divide(currentTime);
        int[] targetTimeArray = divide(targetTime);

        // TODO2. 각 시간의 차이를 구한다
        int[] DifferenceEachTime = getDifferenceEachTime(currentTimeArray, targetTimeArray);


        // TODO3. 02:01:26 같이 1의 자리도 2자리로 출력토록 한다.
        String answer = String.format("%02d:%02d:%02d", DifferenceEachTime[0], DifferenceEachTime[1], DifferenceEachTime[2]);
        System.out.println(answer);
    }
}
