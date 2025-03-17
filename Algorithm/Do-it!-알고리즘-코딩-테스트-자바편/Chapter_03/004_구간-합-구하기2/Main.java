import java.util.Scanner;


// 나의 풀이
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n + 1][n + 1];
        int[][] sumMatrix = new int[n + 1][n + 1];
        int[] result = new int[m];
        
        for (int i1 = 1; i1 < n + 1; i1++) {
            for (int i2 = 1; i2 < n + 1; i2++) {
                matrix[i1][i2] = sc.nextInt();
                sumMatrix[i1][i2] = sumMatrix[i1][i2 - 1] + matrix[i1][i2];                
            }
        }

        for (int i1 = 0; i1 < m; i1++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int i2 = x1; i2 < x2 + 1; i2++) {
                result[i1] += sumMatrix[i2][y2] - sumMatrix[i2][y1 - 1];
            }
        }

        for (int i1 = 0; i1 < m; i1++) System.out.println(result[i1]);
    }
}