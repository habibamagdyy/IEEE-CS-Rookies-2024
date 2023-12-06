
package newarray;
import java.util.Scanner;
public class Newarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }
        int[] C = concatenateArrays(A, B);
        printArray(C);
    }
    static int[] concatenateArrays(int[] A, int[] B) {
        int lengthA = A.length;
        int lengthB = B.length;
        int[] C = new int[lengthA + lengthB];
        for (int i = 0; i < lengthB; i++) {
            C[i] = B[i];
        }
        for (int i = 0; i < lengthA; i++) {
            C[lengthB + i] = A[i];
        }

        return C;
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
