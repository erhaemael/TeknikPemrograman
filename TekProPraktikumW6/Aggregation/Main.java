package Aggregation;

public class Main {

	public static void main(String args[]){
		
		Alamat almtmhs = new Alamat("Kenanga", "Jatiendah", "Gedebage", "Bandung", 40624);
		Mahasiswa mhs = new Mahasiswa(211524029, "Fitria Hasna Ramadhyani", almtmhs);
		System.out.println(mhs.NIM);
		System.out.println(mhs.nama);
		System.out.println(mhs.toString());
		
		Alamat almtuniv = new Alamat("Gegerkalong Hilir", "Ciwaruga", "Parongpong", "Bandung Barat", 40624);
		Universitas univ = new Universitas("Politeknik Negeri Bandung", almtuniv);
		System.out.println(univ.nama);
		System.out.println(univ.toString());
		
	}

}
