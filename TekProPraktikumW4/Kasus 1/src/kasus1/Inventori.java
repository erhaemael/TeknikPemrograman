package kasus1;

/**
* <h1> Inventory Class </h1>
* 
* The Inventory Class is used to create the object of the Item Class and
* display the object that have been created and and used to collect data if there 
* is an additional stock. The Inventory Class is also the Main Class.
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-24
*/

public class Inventori {
	
	Barang[] barangs; //declaration array of barangs which is an instance od Item Class
	
	void initBarang() {
		barangs = new Barang[2];  //new object called array of barangs that is an instance oc Item Class
		barangs[0] = new Barang("001", "Baju", 10);  //construct first new object
		barangs[1] = new Barang("002", "Celana", 20); //construct second new object
	}
	
	void showBarang() {
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
	void pengadaan() {
		
		initBarang();
		
		//the mutator setStok will be called that will increase the amount of the stock
		//only for the first object of the array
		barangs[0].setStok(20);
		barangs[0].setStok(30);
		barangs[0].setStok(30);

		showBarang(); //run showBarang method that will display the result of changes in setStock
		
	}
		
	public static void main(String[] args) {	
		Inventori beli = new Inventori();
		beli.pengadaan();
	}

}
