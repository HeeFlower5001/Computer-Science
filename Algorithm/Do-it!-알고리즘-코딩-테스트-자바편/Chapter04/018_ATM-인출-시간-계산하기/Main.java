import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] time = new int[n];
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) time[i] = sc.nextInt();

        int answer = 0;
        for (int i1 = 1; i1 < n; i1++) {
            for (int i2 = i1; i2 > 0; i2--) {
                if (time[i2] >= time[i2 - 1]) break;
                
                int temp = time[i2];
                time[i2] = time[i2 - 1];
                time[i2 - 1] = temp;
            }
        }
        

        sum[0] = time[0];

        for (int i = 0; i < n; i++) {
            sum[i] = sum[i - 1] + time[i];
            answer += sum[i];
        }
        
        System.out.print(answer);
    }
}