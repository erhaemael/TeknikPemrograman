import java.util.Scanner;

public class Restaurant {

	//encapsulation by making the instance private
	private String[] nama_makanan;   
	private double[] harga_makanan;
	private int[] stok;
	private static byte id = 0;  

	//add getter and setter just for fields that need accessors and mutators
	public void setNama_makanan(String[] nama_makanan) {
		this.nama_makanan = nama_makanan;
	}
	
	public String[] getNama_makanan() {
		return this.nama_makanan;
	}

	public void setHarga_makanan(double[] harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	
	public double[] getHarga_makanan() {
		return this.harga_makanan;
	}

	public void setStok(int[] stok) {
		this.stok = stok;
	}
	
	public int[] getStok() {
		return this.stok;
	}

	/* not all fields need individual field accessor and mutator
	public static void setId(byte id) {
		Restaurant.id = id;
	}
	
	public static byte getId() {
		return Restaurant.id;
	}
	*/
	
	//constructor to initialize data
	public Restaurant() {
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	
	public static void nextId() {   //new method added corresponding the need in main class
		id++;		
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}
	
	public void tampilMenuMakanan() {
		
		String takeOrder = "ya";
		
		System.out.println("Menu");
		for(int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
			}	
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nApakah hendak melakukan order? {ya/tidak)");
		takeOrder = sc.nextLine();
		
		if("ya".equals(takeOrder)) {
			getOrder();
		}
		else
		{
			System.out.println("\n");
			tampilMenuMakanan();
		}
		
	}
	
	public boolean isOutOfStock(int id) {
		if(stok[id] == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void getOrder() {
		
		String again = "ya";
		String makanan;
		int qty;
		double total = 0;
		
		Scanner sc = new Scanner(System.in);

		while("ya".equalsIgnoreCase(again)) {
				
			System.out.println("Hendak memesan apa?");
			makanan = sc.nextLine();
			System.out.println("Berapa banyak?");
			qty = sc.nextInt();
			setStokOrder(makanan, qty);
			total = total + getTotal(makanan, qty);
				
			System.out.println("Order lagi? (ya/tidak)");
			again = sc.next() + sc.nextLine();
			
		}
		System.out.println("==== Total pembayaran = " + total + " ====\n");
		tampilMenuMakanan();
	}
	
	//a break up class from getOrder so it won't have too many responsibilities
	public void setStokOrder(String nama, int stok) {
		
		for(int i = 0; i <= id; i++) {
			if(nama.equalsIgnoreCase(this.nama_makanan[i])) {
				this.stok[i] -= stok;
			}
		}
	}
	
	//the name of the class have reflect its responsibility
	public double getTotal(String nama, int stok) {
		double harga;
		double total = 0;
		
		for(int i = 0; i <= id; i++) {
			if(nama.equals(this.nama_makanan[i])) {
				harga = this.harga_makanan[i]*stok;
				total += harga;
			}
		}
		return total;
	}
}


