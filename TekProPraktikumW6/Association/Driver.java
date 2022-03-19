package Association;

public class Driver extends Car {
	
	String driverName;
	
	public Driver(String name, String car, String plate){
		super(car, plate);
		this.driverName = name;
	}
	
}
