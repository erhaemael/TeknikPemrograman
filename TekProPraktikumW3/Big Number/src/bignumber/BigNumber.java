package bignumber;
import java.util.Scanner;
import java.math.BigInteger;

public class BigNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num1 = scanner.nextLine();
		String num2 = scanner.nextLine();
		BigInteger bignum1 = new BigInteger(num1);
		BigInteger bignum2 = new BigInteger(num2);
		System.out.println(bignum1.add(bignum2));
		System.out.println(bignum1.multiply(bignum2));

	}

}
