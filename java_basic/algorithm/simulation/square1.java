package algorithm.simulation;

public class square1 {
    // 필요 변수
    // 1. 2차원 배열 matrix[][] 생성
    // 2. OFFSET은 100
    // 3. MAX_R은 OFFSET * 2 + 1

    private static final int OFFSET = 100;
    private static final int MAX_R = OFFSET * 2 + 1;
    private static final int[][] matrix = new int[MAX_R][MAX_R];

    private static void checkedAtMatrix(int x1, int y1, int x2, int y2){
        // TODO 2. implement
        for (int i = x1; i < x2; i ++){
            for (int j = y1; j < y2; j ++){
                matrix[i+OFFSET][j+OFFSET] += 1;
            }
        }
    }

    private static int getCheckedRange(){
        // TODO 3. implement
        int answer = 0;

        for (int i = 0; i < MAX_R; i ++){
            for (int j = 0; j < MAX_R; j++){
                if (matrix[i][j] > 0){
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO 1. 직사각형의 개수 n 입력
        int n = sc.nextInt();

        // TODO 2. n개의 직사각형의 범위를 matrix에 표시
        for (int i = 0; i < n; i ++){
            checkedAtMatrix(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        // TODO 3. matrix를 순회하며 1 이상인 것들 (직사각형의 범위)의 개수를 구한다.
        System.out.println(getCheckedRange());

    }
}
