package myNumber;

public class MyNumberTest {
	public static void main(String[] args) {
		MyNumber n = new MyNumber(15);
		n.display();
		n.add(3);
		n.display();
		n.add(4);
		n.display();
		System.out.println();
		
		MyHexadecimalNumber r = new MyHexadecimalNumber("ace");
		r.display();
		r.add("1");
		r.display();
		r.add(2);
		r.display();
	}
}