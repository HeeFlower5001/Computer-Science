import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = sc.nextInt();

        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = 0; i2 < n - 1 - i1; i2++ ) {
                if (list[i2] > list[i2 + 1]) {
                    int temp = list[i2];
                    list[i2] = list[i2 + 1];
                    list[i2 + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) System.out.println(list[i]);
    }
}