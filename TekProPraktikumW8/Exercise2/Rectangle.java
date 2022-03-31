package Exercise2;

public class Rectangle extends Shape {
	
	private double width;
	private double length;

	public Rectangle() {
		width = 1.0;
		length = 1.0;		 
	}
	 
	 public Rectangle(double w, double l) { // 2nd constructor
		 width = w;
		 length = l;
	 }

	 public Rectangle(double w, double l, String c, boolean b) {
		 width = w;
		 length = l;
		 super.setColor(c);
		 super.setFilled(b);
	 }
	 
	 public double getWidth() {
		return width;
	 }

	 public void setWidth(double width) {
		this.width = width;
	 }

	 public double getLength() {
		 return length;
	 }

	 public void setLength(double length) {
		 this.length = length;
	 }
	 	 
	 public double getArea() {
		 return width*length;
	 }
	 
	 public double getPerimeter() {
		 return 2*(length+width);
	 }
	 
	 @Override
	 public String toString() {
		 return "A Rectangle with width = " + width + " and length = " + length + " , which is a subclass of " + super.toString();
	 }
}
