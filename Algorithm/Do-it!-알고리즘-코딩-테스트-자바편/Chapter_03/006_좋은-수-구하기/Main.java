import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] number = new long[n];
        for (int i = 0; i < n; i++) number[i] = sc.nextLong();

        int answer = 0;
        
        Arrays.sort(number);

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                // 합 비교
                if (number[i] == number[left] + number[right]) {
                    if (left == i) left++; // 자기 자신은 제외
                    else if (right == i) right--; // 자기 자신은 제외
                    else {
                        answer++;
                        break;
                    }
                }
                else if (number[i] > number[left] + number[right]) left++;
                else if (number[i] < number[left] + number[right]) right--;
            }
        }

        System.out.print(answer);
    }
}