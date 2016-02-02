package lesson1;
import java.util.Scanner;

public class CircleAndPointTest {
	private static Scanner pointedCircleScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the integer x coordinate of the center of the circle");
		int xCoord = pointedCircleScanner.nextInt();
		
		System.out.println("Enter the integer y coordinate of the center of the circle");
		int yCoord = pointedCircleScanner.nextInt();
		
		System.out.println("Enter the radius of the circle");
		double radius = pointedCircleScanner.nextDouble();
		
		Circle c = new Circle(new Point(xCoord, yCoord), radius);
		
		System.out.println("Enter the integer x coordinate of the first point");
		int p1xCoord = pointedCircleScanner.nextInt();

		
		System.out.println("Enter the integer y coordinate of the first point");
		int p1yCoord = pointedCircleScanner.nextInt();

		System.out.println("Enter the integer x coordinate of the second point");
		int p2xCoord = pointedCircleScanner.nextInt();

		System.out.println("Enter the integer y coordinate of the second point");
		int p2yCoord = pointedCircleScanner.nextInt();

		
		Point p1 = new Point(p1xCoord, p1yCoord);
		Point p2 = new Point(p2xCoord, p2yCoord);
		System.out.println("Circle c contains p1? " + c.contains(p1));
		System.out.println("Circle c contains p2? " + c.contains(p2));
	}
}
