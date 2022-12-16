import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int n;
        // n = scanner.nextInt();
        for(int i = 1; i <= 5000; i++) {
            if (sover(i) == true) {
                System.out.println(i);
            }
        }

    }
    public static boolean sover(int k) {
        int sum = 0;
        for (int i = 1; i < k; i++) {
            if (k % i == 0) {
                sum += i;
            }
        }
        if (k == sum) {
            return true;
        }
        else {
            return false;
        }
    }
}