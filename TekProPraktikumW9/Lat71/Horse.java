package Lat71;

class Horse extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Heigh");
	}
	
	public static void main(String[] args) {
		Animal obj = new Horse();
		obj.sound();
	}
	
}