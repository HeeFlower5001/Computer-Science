import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] numbers = new long[n + 1];
        long[] sumNumbers = new long[n + 1];

        for (int i = 1; i < n + 1; i++) {
            numbers[i] = sc.nextLong() % m;
            sumNumbers[i] = (sumNumbers[i - 1] + numbers[i]) % 3;
        }

        int answer = 0;
        for (int i1 = 1; i1 < n + 1; i1++) {
            for (int i2 = i1; i2 < n + 1; i2++) {
                if ( (sumNumbers[i2] - sumNumbers[i1 - 1]) % 3 == 0) answer++;
            }
        }

        System.out.print(answer);
    }
}

// 5 3
// 1 2 3 1 2


// 7
