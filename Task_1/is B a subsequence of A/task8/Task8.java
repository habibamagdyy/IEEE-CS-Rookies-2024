
package task8;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 
        int M = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[M];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            B[i] = scanner.nextInt();
        }

        int i = 0, j = 0;
        while (i < N && j < M) {
            if (A[i] == B[j]) {
                j++;
            }
            i++;
        }

        if (j == M) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
