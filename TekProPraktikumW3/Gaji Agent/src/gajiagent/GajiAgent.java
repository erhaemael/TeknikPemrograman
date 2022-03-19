package gajiagent;
import java.util.Scanner;

/**
* <h1>Calculate Agent Salary</h1>
* This program will count agent's salary 
* based on the items sold by the agent
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-18
*/

public class GajiAgent {
	
	public static void main(String[] args) {
		int gaji_pokok = 500000;
		int harga_item = 50000;
		int total_gaji = 0;
		
		//read the number of item sold
		Scanner scanner = new Scanner(System.in);
		int jml_penjualan = scanner.nextInt();
		scanner.close();
		
		//calculate the salary
		if(jml_penjualan < 15) {
			total_gaji = gaji_pokok - (((15 - jml_penjualan) * harga_item) * 15 / 100);
		} else if (jml_penjualan >= 40) {
			total_gaji = gaji_pokok + ((jml_penjualan * harga_item) * 25 / 100);
		} else if (jml_penjualan > 80) {
			total_gaji = gaji_pokok + ((jml_penjualan * harga_item) * 35 / 100);
		} else {
			total_gaji = gaji_pokok + ((jml_penjualan * harga_item) * 10 / 100);
		}
		
		//print the final salary
		System.out.println(total_gaji);	

	}

}
