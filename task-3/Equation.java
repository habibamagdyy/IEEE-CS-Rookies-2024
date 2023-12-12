
package equation;
import java.util.Scanner;

public class Equation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long E= 0;
         
        for (long i = 2; i <= b; i += 2) {
            E += Math.pow(a, i);
        }
        
        System.out.println(E);
    }
}

