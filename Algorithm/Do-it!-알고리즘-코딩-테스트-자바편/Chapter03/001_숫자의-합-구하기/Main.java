import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String number = sc.next();
        char[] numberArray = number.toCharArray();
        
        int sum = 0;
        for (int i = 0; i < n; i++) sum += numberArray[i] - 48;

        System.out.print(sum);
    }
}

/* 01단계. 문제 분석하기
 * - N의 범위가 1 ~ 100 -> int, long으로 담을 수 없다.
 * - String값으로 받아서 각 index의 char값을 int형으로 바꾼다.
 * - 아스키코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48이다.
 * - 혹은, (해당 값) - '0'을 사용해도 된다.
 * 
 * 
 * 
 * 
 * 
 */