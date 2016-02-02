package lesson1;

public class CircleAndPointTest {
	public static void main(String[] args) {
		Circle c = new Circle(new Point(3, 3), 2);
		Point p1 = new Point(1, 1);
		Point p2 = new Point(4, 2);
		System.out.println("Circle c contains p1? " + c.contains(p1));
		System.out.println("Circle c contains p2? " + c.contains(p2));
	}
}
