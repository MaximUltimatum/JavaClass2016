package lesson1;

public class Point {
	private int x;
	private int y;
	
	public Point(int a, int b){
		x = a;
		y = b;
	}
	
	public double distanceTo(Point SavedPoint){
		final double hypotenuse = Math.sqrt((x - SavedPoint.x)^2 + (y - SavedPoint.y)^2);
		
		return hypotenuse;
	}
}
