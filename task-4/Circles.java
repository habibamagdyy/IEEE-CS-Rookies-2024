
package circles;
import java.util.Scanner;
public class Circles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();
        double r1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) / 2.0;
        double r2 = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2)) / 2.0;
        double rt = r1 + r2;
        double Midx1 = (x1 + x2) / 2.0;
        double Midy1 = (y1 + y2) / 2.0;
        double Midx2 = (x3 + x4) / 2.0;
        double Midy2 = (y3 + y4) / 2.0;
        double L = Math.sqrt(Math.pow(Midx1 - Midx2, 2) + Math.pow(Midy1 - Midy2, 2));
        if (L > rt) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
