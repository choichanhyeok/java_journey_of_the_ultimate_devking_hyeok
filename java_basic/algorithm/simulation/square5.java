package algorithm.simulation;
import java.util.Scanner;

// 문제 분석
// 1. 총 n개의 직각 사각형이 주어진다.
// 2. 처음 주어지는 직사각형은 빨간(1)색, 그 다음은 파란색(2)이다.
// 3. 겹치는 위치가 있다면 가장 마지막에 덮힌 색으로 취급
// 4. 파란색 영역의 총 넓이 (?)

public class square5 {
   // 필요 변수
   private static final int OFFSET = 100;
   private static final int MAX_R = OFFSET * 2 + 1;
   private static final int[][] matrix = new int[MAX_R][MAX_R];

   private static void drawingAtMatrix(int x1, int y1, int x2, int y2, int type){
       for (int i = x1; i < x2; i ++){
           for (int j = y1; j < y2; j ++){
               matrix[i][j] = type;
           }
       }
   }

   private static int getBlueAreaAmount(){
       int answer = 0;

       for (int i = 0; i < MAX_R; i ++){
           for (int j = 0; j < MAX_R; j ++){
               if(matrix[i][j] == 1){
                   answer += 1;
               }
           }
       }

       return answer;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // TODO 1. 직사각형의 개수 n을 입력
       int n = sc.nextInt();

       // TODO 2. 직사각형을 matrix에 그려준다
       for (int i = 0; i < n; i ++){
           drawingAtMatrix(sc.nextInt() + OFFSET, sc.nextInt() + OFFSET, sc.nextInt() + OFFSET, sc.nextInt() + OFFSET, (i+2)%2);
       }

       // TODO 3. 파란색으로 덮힌 영역의 총 넓이를 구하라.
       System.out.println(getBlueAreaAmount());
   }
}
