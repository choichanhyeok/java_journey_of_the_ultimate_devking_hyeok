package algorithm.simulation;
import java.util.Scanner;

// 문제 분석
// 1. 변의 길이가 8인 정사각형의 좌측 꼭지점 좌표가 주어짐 (ex. 0, 0)
// 2. 모든 색종이가 붙여진 이후의 총 넓이를 구하라
// 3. 단 모든 색종이는 (-100, -100) ~ (100, 100)의 좌표를 벗어나지 않는다.

public class square3 {
    // 필요 변수
    private static final int OFFSET = 100;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int SIZE = 8;
    private static final int[][] matrix = new int[MAX_R][MAX_R];

    private static void drawingAtPaper(int x1, int y1){
        int x2 = x1 + SIZE - 1;
        int y2 = y1 + SIZE - 1;

        for (int i = x1; i <= x2; i ++){
            for (int j = y1; j <= y2; j ++){
                matrix[i][j] = 1;
            }
        }
    }

    private static int getDrawingSize(){
        int answer = 0;

        for (int i = 0; i < MAX_R; i ++){
            for (int j = 0; j < MAX_R; j ++){
                if(matrix[i][j] == 1){
                    answer ++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO 1. 색종이의 개수 n을 입력
        int n = sc.nextInt();

        // TODO 2. 색종이의 개수만큼 drawing (matrix를 입력받은 좌측 하단 꼭지점 좌표에서 8의 범위만큼 체크)
        for (int i = 0; i < n; i++){
            drawingAtPaper(sc.nextInt() + OFFSET, sc.nextInt() + OFFSET);
        }

        // TODO 3. 색종이의 범위를 출력 (1의 개수)
        System.out.println(getDrawingSize());

    }
}
