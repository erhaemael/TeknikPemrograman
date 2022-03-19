package berhitung;
import java.util.Scanner;

/**
* <h1>Calculate the approriate operation</h1>
* This program will print the result of the operation
* corresponding to the operator inputted by user
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-18
*/

public class Berhitung {

	public static void main(String[] args) {
		
		//read the input of two number and an operator
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		int num2 = scanner.nextInt();
		scanner.close();
		int result = 0;
		
		//calculate the appropriate operation
		if(operator == '+') {
			result = num1 + num2;
		} else if(operator == '-') {
			result = num1 - num2;
		} else if(operator == '*') {
			result = num1 * num2;
		} else if(operator == '/') {
			result = num1 / num2;
		} else if(operator == '%') {
			result = num1 % num2;
		}
		
		//print the result
		System.out.println(result);

	}

}
