import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int answer = 1;
        int left = 1;
        int right = 1;
        int sum = 1;
        
        while (right != n) {
            if (sum == n) {
                answer++;

                right++;
                sum += right;
            }

            else if (sum > n) {
                sum -= left;
                left++;
            }

            else if (sum < n) {
                right++;
                sum += right;
            }
        }
        
        System.out.print(answer);
    }
}