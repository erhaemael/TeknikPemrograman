package Composition;

public class Line {
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void LineDetails() {
		System.out.println("Warna garis : " + this.color);
	}

}
