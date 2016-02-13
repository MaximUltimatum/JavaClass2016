package myNumber;

public class MyHexadecimalNumber extends MyNumber {
	public MyHexadecimalNumber(int number) {
		super(number);
	}
	
	public MyHexadecimalNumber(String hex) {
		super(0);
		setNumber(hexToDecimal(hex));
	}
	
	public void add(String hex) {
		add(hexToDecimal(hex));
	}
	
	public void display() {
		System.out.println("The hexadecimal number is " + 
			Integer.toHexString(getNumber()) + ".");
	}
	
	private int hexToDecimal(String hex) {
		String forwardHex = 
			new StringBuilder(hex.toLowerCase()).reverse().toString();
		int retVal = 0;
		for (int i = 0; i < hex.length(); i++) {
			retVal += Math.pow(16, i) * hexToDecimal(forwardHex.charAt(i));
		}
		return retVal;
	}
	
	private int hexToDecimal(char hex) {
		if (hex >= '0' && hex <= '9') return hex - '0';
		else return 10 + (hex - 'a');
	}
}