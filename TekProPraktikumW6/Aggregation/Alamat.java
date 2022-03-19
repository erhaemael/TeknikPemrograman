package Aggregation;

public class Alamat {
	
	String jalan;
	String kelurahan;
	String kecamatan;
	String kota;
	int kodepos;
	   
	public Alamat(String jalan, String kelurahan, String kecamatan, String kota, int kodepos) {
		
		this.jalan = jalan;
		this.kelurahan = kelurahan;
	    this.kecamatan = kecamatan;
	    this.kota = kota;
	    this.kodepos = kodepos;
	    
	}
	
	public String toString() {
		
		return "Alamat :" + "\nJalan " + this.jalan + "\nKelurahan " + this.kelurahan + "\nKecamatan " + this.kecamatan + "\nKota/Kab " + this.kota + "\nKode Pos " + this.kodepos + "\n";
		
	}

}
