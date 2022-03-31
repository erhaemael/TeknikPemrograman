package Exercise2;

public class Shape {

	private String color;
	private boolean filled;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//Constructors 
	public Shape() { // 1st (default) constructor
		color = "green";
		filled = true;
	}

	public Shape(String c, boolean f) {
		color = c;
		filled = f;
	}
	
	public String toString() {
		
		if(filled) {
			return "A shape with color of " + color + " and filled";	
		}
		else {
			return "A shape with color of " + color + " and Not filled";	
		}
	
	}

}
