package task7;
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of elements in the arrays
        int[] A = new int[n];
        int[] B = new int[n];

        // Input array A
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Input array B
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }

        // Sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);

        // Check if B is a permutation of A
        boolean isPermutation = Arrays.equals(A, B);

        if (isPermutation) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}
