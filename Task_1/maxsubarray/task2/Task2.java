
package task2;

 import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            printMaximumNumbers(N, A);
        }
    }

    private static void printMaximumNumbers(int N, int[] A) {
        for (int i = 0; i < N; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < N; j++) {
                max = Math.max(max, A[j]);
                System.out.print(max + " ");
            }
        }
        System.out.println();
    }
}
    

