
package commonarea;
import java.util.Scanner;
public class CommonArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 1; t <= T; t++) {
         
            int N = scanner.nextInt();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int minX = x1;
            int minY = y1;
            int maxX = x2;
            int maxY = y2;

            for (int i = 1; i < N; i++) {
                int currentX1 = scanner.nextInt();
                int currentY1 = scanner.nextInt();
                int currentX2 = scanner.nextInt();
                int currentY2 = scanner.nextInt();

                minX = Math.max(minX, currentX1);
                minY = Math.max(minY, currentY1);
                maxX = Math.min(maxX, currentX2);
                maxY = Math.min(maxY, currentY2);
            }
            int area = Math.max(0, maxX - minX) * Math.max(0, maxY - minY);
            System.out.println("Case #" + t + ": " + area);
        }
    }
}
