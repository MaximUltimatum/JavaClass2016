package lesson5;

import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			stringedInteger();
			stringedObject();
			doggedCat();
			weirdlyArrayed();
			nullReturn();
			ByZeroError();
		} catch (ArithmeticException e) {
		     System.out.println("Problem: " + e);
		} catch (NullPointerException e) {
		     System.out.println("Problem: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
		     System.out.println("Problem: " + e);
		} catch (StringIndexOutOfBoundsException e) {
		     System.out.println("Problem: " + e);
		} catch (ClassCastException e) {
		     System.out.println("Problem: " + e);
		} catch (NumberFormatException e) {
		     System.out.println("Problem: " + e);
		}
		
	}
	
	
	protected final static double ByZeroError() throws ArithmeticException{
		double errorResult = 10 / 0;
		return errorResult;
	}
	
	protected final static char nullReturn() throws NullPointerException{
		String nullString = null;
		@SuppressWarnings("null")
		char nullChar = nullString.charAt(0);
		return nullChar;
	}
	
	protected final static int weirdlyArrayed() throws ArrayIndexOutOfBoundsException{
		final int weirdArray[] = {10, 11, 12};
		return weirdArray[3];
	}
	
	protected final static char doggedCat() throws StringIndexOutOfBoundsException{
		String catWord = "cat";
		return catWord.charAt(3);
	}
	
	protected final static int stringedInteger() throws NumberFormatException{
		String englishWord = "English";
		int nonPrimitiveConversion = Integer.parseInt(englishWord);
		return nonPrimitiveConversion;
	}
	
	protected final static Integer stringedObject() throws ClassCastException{
		Object stringerObject = "Objectified";
		Integer errorIntg = (Integer)stringerObject;
		return errorIntg;
	}
}
