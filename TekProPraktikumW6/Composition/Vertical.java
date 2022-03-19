package Composition;

public class Vertical extends Line {
	
	public void MakeVerLine() {
		Point Vertical = new Point();  //implement composition relationship
		Vertical.setStartPoint(1, 0);
		Vertical.setEndPoint(1, 3);
		Vertical.PointDetails();
	}

}
