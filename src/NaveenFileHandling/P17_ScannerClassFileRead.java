package NaveenFileHandling;

import java.io.File;
import java.util.Scanner;

public class P17_ScannerClassFileRead {

	/*
	 *  Scanner class not recommend as it is use to take input from user 
	 */
	
	public static void main(String[] args) {
		
		String path = "C:\\\\Users\\\\yogen\\\\eclipse-seleniumworkspace\\\\PracticeRealTimeJava\\\\src\\\\NaveenFileHandling\\\\sample1.txt";
		Scanner sc = null;
		try {
			
			File file = new File(path);
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
			
		} catch (Exception e) {
		e.printStackTrace();	
		}
		finally {
			sc.close();
		}
	}
}
