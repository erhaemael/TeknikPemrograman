package Exercise2;

public class Square extends Rectangle {
	
	public Square(double side) {
		 super(side, side); // Call superclass Rectangle(double, double)
	}
	
	 @Override
	 public String toString() {
		 return "A Square with side = " + super.getWidth() + " , which is a subclass of " + super.toString();
	 }
	 
	 @Override
	 public double getPerimeter() {
		 return 4*super.getWidth();
	 }
	 
	 @Override
	 public void setWidth(double side) {
		super.setWidth(side);
	 }
	 
	 @Override
	 public void setLength(double side) {
		 super.setLength(side);
	 }

}
