package kasus1;

/**
* <h1> Item Class </h1>
* This class is used to tell the specifications of the item, 
* such as the item's code, item's name, and item's stock.
* The Item class is used to define the data structure required 
* by the Object of the Item Class
*
* @author Rahma Alia Latifa
* @version 1.0
* @since 2022-02-24
*/

public class Barang {
	
	String kode_barang; //default access modifier means that this variable can b
	String nama_barang; //called from any class
	private int stok; //make the stok variable as private so it can't be accessed by other class
	
	/* Constructor */
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
	
	/* Accessor */ //of the stok variable
	public int getStok() {
		return stok;
	}

	/* Mutator */ //of the stok variable
	public void setStok(int stok) {
		this.stok += stok;
	}

}
