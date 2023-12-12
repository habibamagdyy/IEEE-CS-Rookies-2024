package task7;
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int[] w = new int[n];
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }

        Arrays.sort(w);
        Arrays.sort(x);

        boolean isPermutation = Arrays.equals(w, x);

        if (isPermutation) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}
