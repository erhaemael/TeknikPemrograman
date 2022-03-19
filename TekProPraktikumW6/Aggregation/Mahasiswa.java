package Aggregation;

public class Mahasiswa {
	
	int NIM;
	String nama;
	Alamat mhsAlmt; 
	
	Mahasiswa(int NIM, String nama, Alamat alamat) {
		this.NIM = NIM;
		this.nama = nama;
	    this.mhsAlmt = alamat;
	}	 
	
	@Override
	public String toString() {
		
		return "Alamat :" + "\nJalan " + this.mhsAlmt.jalan + "\nKelurahan " + this.mhsAlmt.kelurahan + "\nKecamatan " + this.mhsAlmt.kecamatan + "\nKota/Kab " + this.mhsAlmt.kota + "\nKode Pos " + this.mhsAlmt.kodepos + "\n";
		
	}

}
