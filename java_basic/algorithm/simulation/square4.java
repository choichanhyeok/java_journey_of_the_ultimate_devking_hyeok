package algorithm.simulation;
import java.util.Scanner;

// 문제 분석
// 1. 직사각형 A 위에 직사각형 B를 덮어 쓸건데 남아있는 잔해물을 덮기 위해 필요한 최소한의 직사각형 넓이 구하기
// 2. 가장 작은 (x1, y1) 에서 가장 큰 (x2, y2)를 범위로 하는 직각 사각형 구하면 된다.

public class square4 {
    // 필요 변수
    private static final int OFFSET = 1000;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[][] matrix = new int[MAX_R][MAX_R];
    private static int smallX = MAX_R;
    private static int smallY = MAX_R;
    private static int largeX, largeY;

    private static void drawingAtMatrix(int x1, int y1, int x2, int y2, int type){
        for (int i = x1; i < x2; i ++){
            for (int j = y1; j < y2; j ++){
                matrix[i][j] = type;
            }
        }
    }

    private static void setAnswerSquarePosition(){
        for (int i = 0; i < MAX_R; i ++){
            for (int j = 0; j < MAX_R; j ++){
                if (matrix[i][j] == 1){
                    smallX = Math.min(smallX, i);
                    smallY = Math.min(smallY, j);
                    largeX = Math.max(largeX, i);
                    largeY = Math.max(largeY, j);
                }
            }
        }
    }

    private static void printAnswer(){
        int answer = 0;

        for (int i = smallX; i <= largeX; i ++){
            for (int j = smallY; j <= largeY; j ++){
                answer += 1;        
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO 1. 직사각형 A를 matrix에 그리고 그 위에 B를 그려준다.
        for (int i = 1; i < 3; i ++){
            drawingAtMatrix(sc.nextInt() + OFFSET, sc.nextInt() + OFFSET, sc.nextInt() + OFFSET, sc.nextInt() + OFFSET, i);
        }
        // TODO 2. 남은 A의 범위를 커버할 수 있는 사각형의 좌하단, 우상단 좌표 추출
        setAnswerSquarePosition();

        // TODO 3. [TODO 2].에서 구한 x1, x2, y1, y2의 크기를 구해 출력한다.
        printAnswer();

    }
}
