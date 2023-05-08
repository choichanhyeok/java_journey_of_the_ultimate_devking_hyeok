package study_log.reprac;
import java.util.Scanner;

/**
 * 13223번 소금 폭탄 문제를 통해 
 * 여러 방식의 시간 문자열 처리에 대해 학습 
 */
public class SaltBoomerPrac {
    /**
     * ":"를 기준으로 split()해 시간, 분, 초를 분리해 배열 형태로 리턴해주는 메서드
     * @param time
     * @return 시, 분, 초 값이 담긴 int형 배열을 리턴
     */
    private static int[] divideHourMinuteSecondType1(String time){
        String[] timeAbout = time.split(":");

        return new int[]{Integer.parseInt(timeAbout[0]), Integer.parseInt(timeAbout[1], Integer.parseInt(timeAbout[2]))};
    }

    /**
    * charAt을 이용해 시간, 분, 초를 분리해 배열 형태로 리턴해주는 메서드
    * @param time
    * @return 시, 분, 초 값이 담긴 int형 배열을 리턴
    */
   private static int[] divideHourMinuteSecondType2(String time){

       return new int[]{(time.charAt(0) - '0') * 10 + (time.charAt(1) - '0'), (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0'), (time.charAt(6)) * 10 + time.charAt(7)};
   }

   /**
   * subString을 이용해 시간, 분, 초를 분리해 배열 형태로 리턴해주는 메서드
   * @param time
   * @return 시, 분, 초 값이 담긴 int형 배열을 리턴
   */
  private static int[] divideHourMinuteSecondType3(String time){

      return new int[]{Integer.parseInt(time.substring(0, 1)), Integer.parseInt(time.substring(3, 4)), Integer.parseInt(time.substring(6, 7))};
  }

    /**
     * 시간, 분, 초 값이 담긴 두 int형 배열의 시간 차이를 구한 뒤 같은 형태로 리턴해주는 메서드
     * @param currentTime
     * @param targetTime
     * @return 시간, 분, 초에 대해 담긴 int형 배열을 리턴
     */
    private static int[] getDifferenceEachTime(int[] currentTime, int[] targetTime){
        int currentTimeAmount = (currentTime[0] * 3600) + (currentTime[1] * 60) + (currentTime[2]);
        int targetTimeAmount = (targetTime[0] * 3600) + (targetTime[1] * 60) + (targetTime[2]);

        int needTimeAmount = targetTimeAmount - currentTimeAmount;
        if(needTimeAmount < 0){
            needTimeAmount += (24 * 3600);
        }

        return new int[]{(needTimeAmount / 3600), (needTimeAmount % 3600) / 60, (needTimeAmount % 60)};
    }

    public static void solved13223(){
        Scanner sc = new Scanner(System.in);
        String currentTime = sc.next();
        String targetTime = sc.next();

        // TODO 1. ":"를 기준으로 시간, 분, 초 값 분리
        int[] currentTimeArray = divideHourMinuteSecondType3(currentTime);
        int[] targetTimeArray = divideHourMinuteSecondType3(targetTime);

        // TODO 2. 두 시간의 차이 구하기 (시, 분, 초)
        int[] needTimeArray = getDifferenceEachTime(currentTimeArray, targetTimeArray);

        // TODO 3. 두 시간의 차이를 ("%02d" 포맷으로 시, 분, 초 각각을 출력)
        System.out.printf("%02d:%02d:%02d", needTimeArray[0], needTimeArray[1], needTimeArray[2]);
    }
}  
