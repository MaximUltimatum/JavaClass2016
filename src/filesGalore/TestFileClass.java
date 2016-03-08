package filesGalore;

import java.io.FileNotFoundException;
import java.io.Writer;

public class TestFileClass {
	public static void main(String[ ] args) throws FileNotFoundException {
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		 // Write formatted output to the file
		   output.print("John T Smith ");
		   output.println(90);
		   output.print("Eric K Jones ");
		  output.println(85);
		   // Close the file
		output.close();
		
		java.io.File file1 = new java.io.File("image/hello.txt");
		System.out.println("Does it exist? " + file1.exists());
		System.out.println("The file has " + file1.length() + " bytes");
		System.out.println("Can it be read? " + file1.canRead());
		System.out.println("Can it be written? " + file1.canWrite());
		System.out.println("Is it a directory? " + file1.isDirectory());
		System.out.println("Is it a file? " + file1.isFile());
		System.out.println("Is it absolute? " + file1.isAbsolute());
		System.out.println("Is it hidden? " + file1.isHidden());
		System.out.println("Absolute path is " +file1.getAbsolutePath());
		System.out.println("Last modified on " +new java.util.Date(file1.lastModified()));
		

	}
}
