package Association;

public class PoliceStation {
	
	public static void main(String args[]) {
		
		Driver obj = new Driver("Radit", "Inova", "D 1988 IT");
		System.out.println("Pemilik Kendaraan : " + obj.driverName);
		System.out.println("Tipe Kendaraan : " + obj.carName);
		System.out.println("Plat Nomor Kendaraan : " + obj.carPlate);
		
	}

}
