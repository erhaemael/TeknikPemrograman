package inputoutput;
import java.util.Scanner;

/**
* <h1>Split string into tokens</h1>
* This program will take an input from user 
* in the form of string and print
* the number of words in the string
* followed by each token on a new line
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-19
*/

public class InputOutput {

	public static void main(String[] args) {
		//read input
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		
		s = s.trim();   //so .split() will works properly
		
		//split on all non-alphabetic characters
		String[] words = s.split("[ !,?._'@]+");
		//String[] words = s.split("[^a-zA-Z]+");
		
		//print output
		System.out.println(words.length);
		for(String word : words) {
			System.out.println(word);
		}	

	}

}
