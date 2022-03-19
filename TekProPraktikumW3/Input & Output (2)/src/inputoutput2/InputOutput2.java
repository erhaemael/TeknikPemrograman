package inputoutput2;
import java.util.Scanner;

/**
* <h1>Print formatted output</h1>
* This program will take some strings and numbers as
* an input from user and print the output that will be consisted of two columns:
* The first column contains the String and is left justified using exactly 15 characters
* The second column contains the numbers, expressed in exactly 3 digits
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-19
*/

public class InputOutput2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] s = new String[3];
		int[] num = new int[3];
		
		//read input
		for(int i = 0; i < 3; i++) {
			s[i] = scanner.next();
			num[i] = scanner.nextInt();
		}
		scanner.close();
		
		//print output
		System.out.println("================================");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%-15s", s[i]);
			System.out.printf("%03d%n", num[i]);
		}
		System.out.println("================================");

	}

}

