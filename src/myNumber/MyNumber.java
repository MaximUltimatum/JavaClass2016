package myNumber;

public class MyNumber {
	private int number;
	private final int MIN_VAL = 0;
	
	public MyNumber(int value) {
		constrainNumber(value);
	}
	
	public void setNumber(int value) {
		constrainNumber(value);
	}
	
	public int getNumber() {
		return number;
	}
	
	public void add(int value) {
		constrainNumber(number + value);
	}
	
	private void constrainNumber(int value) {
		number = value;
		if (number < MIN_VAL) number = MIN_VAL;
	}
	
	public void display() {
		System.out.println("The number is " + number + ".");
	}
}

// beginning of portfolio for this code. First of all, HexadecimalNumber is a child of MyNumber because it "extends" it. This lesson was extraordinarily helpful because it showed me how the code I make in my robotics group interacts with the code we are given by FIRST, a worldwide organization that designs, programs, builds, and competes with robots.