import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;
        System.out.println("Длина массива =");
        n = scanner.nextInt();
        int [] m = new int [n];

        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        System.out.println("Введите число k");
        k = scanner.nextInt();

        int[] left = new int[k];
        int[] right = new int[n-k];

        for(int i = 0; i < n; i++){
            if(i < k){
                left[i] = m[i];
            }else{
                right[i-k] = m[i];
            }
        }
        for(int i = 0; i < n-k; i++){
            m[i] = right[i];
        }
        for(int i = 0; i < k; i++) {
            m[n - k + i] = left[i];
        }
        
//             for (int j = 0; j < k; i++) {
        // for (int i = 0; i <= k - 1; i++) {
        //     for (int j = k; j <= n - 1; j++) {
        //         int t = m[i];
        //         m[i] = m[j];
        //         m[j] = t;
        //     }
        // }
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " " );    
        }

// 1234 5678   5678 1234  0 k-1  k n-1
// 0123 4567
    }
}
// if(m[i] < m[j]) {
// (int j = m[k+1]; j < n; j++)