package Composition;

public class Point {
	
	private int start_x, start_y;
	private int end_x, end_y;
	
	public Point () {

	}
	
	public void setStartPoint(int x, int y) {
		
		this.start_x = x;
		this.start_y = y;
	}
	
	public void setEndPoint(int x, int y) {
		
		this.end_x = x;
		this.end_y = y;
	}
	
	public void PointDetails() {
		System.out.println("Titik awal : " + "(" + this.start_x  + "," + this.start_y + ")");
		System.out.println("Titik akhir : " + "(" + this.end_x  + "," + this.end_y + ")");
	}

}
