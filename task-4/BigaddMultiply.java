
package bigadd.multiply;
import java.util.Scanner;
import java.math.BigInteger;
public class BigaddMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger N = scanner.nextBigInteger();
        BigInteger sumResult = N.add(BigInteger.valueOf(9999));
        BigInteger productResult = N.multiply(BigInteger.valueOf(9999));

        System.out.println(sumResult);
        System.out.println(productResult);

        scanner.close();
    }
}
