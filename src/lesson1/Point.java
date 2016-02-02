package lesson1;

public class Point {
	private int x;
	private int y;
	
	public Point(int a, int b){
		x = a;
		y = b;
	}
	
	public double distanceTo(Point SavedPoint){
		double hypotenuse = Math.sqrt(Math.pow((x - SavedPoint.x),2) + Math.pow((y - SavedPoint.y),2));
		
		return hypotenuse;
	}
}
