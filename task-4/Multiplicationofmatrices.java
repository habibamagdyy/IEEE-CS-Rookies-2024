
package multiplicationofmatrices;
import java.util.Scanner;
public class Multiplicationofmatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int RA = scanner.nextInt();
        int CA = scanner.nextInt();
        int[][] A = new int[RA][CA];

        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CA; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        int RB = scanner.nextInt();
        int CB = scanner.nextInt(); 

        int[][] B = new int[RB][CB];

        for (int i = 0; i < RB; i++) {
            for (int j = 0; j < CB; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        int[][] result = multiplyMatrices(A, B);
        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int RA = A.length;
        int CA = A[0].length;
        int RB = B.length;
        int CB = B[0].length;

        int[][] result = new int[RA][CB];

        for (int i = 0; i < RA; i++) {
            for (int j = 0; j < CB; j++) {
                for (int k = 0; k < CA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
}
