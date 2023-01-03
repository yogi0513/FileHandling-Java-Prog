package NaveenFileHandling;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class P14_OpenFileReadFile {
	
	/*
	 * I have explained how to read a file using: (means file is present in folder --open it and read it)
		1. File Reader
		2. BufferedReader
		3. FileInputStream
		4. Scanner class
		5. Java NIO package
		6. Java AWT Desktop 
	 */
	
	
	public static void main(String[] args) {
		
		// open file using Desktop awt package  ---to launch the file only use desktop 
		
		/*
		 *  two main method to learn ---- Desktop d = Desktop.getDesktop();     --- d.open(file); 
		 *  
		 */
		
	
		String path = "C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\demo2.txt";
		
		try {
		
			File file = new File(path);
			if(Desktop.isDesktopSupported()) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
			Desktop desktop = Desktop.getDesktop();
			
			if(file.exists()) {
				desktop.open(file);    // all this open action will happen on file object --- not on path 
				
			}
			} catch (Exception e) {
				
			}
		
		//-----------------------------------------------------------------------------------------------------
		// read the file using FileInputStream 
		
		String pathh = "C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\sample1.txt";
		FileInputStream fis=null;
		try {
			
			File file = new File(pathh);  //location
			 fis = new FileInputStream(file); // file
			
			System.out.println("File content is : ");
			
			int c = 0;
			
			while ((c=fis.read())!=-1) {  
				System.out.print((char) c);    // this are returning ascii values so convert into char 
			}
			
			
		}
		catch(Exception ex) {
			ex.getStackTrace();
		}
		finally {
		try {
			fis.close();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		}
		
	}
}
