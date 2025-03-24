import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] number = new int[n + 1];
        int[] sum = new int[n + 1];

        number[1] = sc.nextInt();
        sum[1] = number[1];
        for (int i = 2; i < n + 1; i++) {
            number[i] = sc.nextInt();
            sum[i] = sum[i - 1] + number[i];
        }

        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            answer[i] = sum[x2] - sum[x1 - 1];
        }

        for (int i = 0; i < m; i++) System.out.println(answer[i]);
    }
}