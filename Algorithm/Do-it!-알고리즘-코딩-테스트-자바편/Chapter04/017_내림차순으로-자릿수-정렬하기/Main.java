import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int[] value = new int[n.length()];

        for (int i = 0; i < n.length(); i++) value[i] = Integer.parseInt(n.substring(i, i + 1));

        for (int i1 = 0; i1 < n.length(); i1++) {
            int maxIndex = i1;

            for (int i2 = i1 + 1; i2 < n.length(); i2++) if (value[maxIndex] < value[i2]) maxIndex = i2;
            
            if (maxIndex != i1) {
                int temp = value[maxIndex];
                value[maxIndex] = value[i1];
                value[i1] = temp;
            }
        }
        
        for (int i = 0; i < n.length(); i++) System.out.print(value[i]);
    }
}