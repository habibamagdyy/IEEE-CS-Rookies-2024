
package shiftright;
import java.util.Scanner;
public class Shiftright {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        rightShiftArray(A, X);
        printArray(A);
    }
    static void rightShiftArray(int[] A, int X) {
        int length = A.length;
        for (int i = 0; i < X; i++) {
            int lastElement = A[length - 1];
            for (int j = length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = lastElement;
        }
    }
    static void printArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
