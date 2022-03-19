package Aggregation;

public class Universitas {
	
	String nama;
	Alamat univAlmt; 
	
	public Universitas(String nama, Alamat univAlmt){
		this.nama = nama;
		this.univAlmt = univAlmt;
	}
	
	@Override
	public String toString() {
		
		return "Alamat :" + "\nJalan " + this.univAlmt.jalan + "\nKelurahan " + this.univAlmt.kelurahan + "\nKecamatan " + this.univAlmt.kecamatan + "\nKota/Kab " + this.univAlmt.kota + "\nKode Pos " + this.univAlmt.kodepos + "\n";
		
	}

}
