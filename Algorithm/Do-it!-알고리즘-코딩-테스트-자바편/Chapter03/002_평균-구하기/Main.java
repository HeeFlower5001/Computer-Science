import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] score = new int[n];
        int sum = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            
            sum += score[i];
            if (score[i] > maxIndex) maxIndex = i;
        }

        System.out.print((double) sum / score[maxIndex] * 100 / n);
    }
}