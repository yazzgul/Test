import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int k = 0;
        int m = 0;

        while(n>0) {
            k += n%10;
            n = n/10;
            m += n%10;
            n = n/10;
        }
        System.out.println(k-m);
    }
}