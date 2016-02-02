package lesson1;

public class Circle {
	private Point center;
	private double radius;
	
	public Circle(Point centerPoint, double width){
		center = centerPoint;
		width = radius;
	}
	
	public boolean contains(Point containedPoint){
		double distance = center.distanceTo(containedPoint);
		boolean isContained = false;
		
		if(distance <= radius){
			isContained = true;
		}
		
		return isContained;
	}
}
