package Exercise2;

public class Test {

	public static void main(String[] args) {

		Shape sh = new Shape();
		System.out.println(sh.toString());
		
		Circle c = new Circle(5.0, "Blue", false);
		System.out.println(c.toString());
		System.out.println("Area = " + c.getArea());
		System.out.println("Perimeter" + c.getPerimeter());
		
		Rectangle r = new Rectangle(4.0, 4.0, "Grey", true);
		System.out.println(r.toString());
		System.out.println("Area = " + r.getArea());
		System.out.println("Perimeter" + r.getPerimeter());
		
		Square s = new Square(2.0);
		System.out.println(s.toString());
		System.out.println("Area = " + s.getArea());
		System.out.println("Perimeter" + s.getPerimeter());	

	}

}
