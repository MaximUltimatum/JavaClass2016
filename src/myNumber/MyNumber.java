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