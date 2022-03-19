package bukatutupjalan;
import java.util.Scanner;

/**
* <h1>Calculate Agent Salary</h1>
* This program will determines whether some cars should runs on the road or stop
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-18
*/

public class BukaTutupJalan {
	
	public static void main(String[] args) {
		
		//read the input of car's number plate
		Scanner scanner = new Scanner(System.in);
		String plat = scanner.nextLine(); 
		scanner.close();
		
		//remove the whitespaces
		String replace = plat.replaceAll("\\s", "");
		
		//convert string into long
		Long convert = Long.parseLong(replace);
		
		//determina the output
		if((convert - 999999) % 5 == 0) {
			System.out.println("berhenti");
		} else {
			System.out.println("jalan");
		}

	}

}
