package NaveenFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P15_ReadFileUsingBufferReader {
	
	/*
	 *  Reading content from buffered reader
	 */
	
	
	public static void main(String[] args) {
		String pathh = "C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\sample1.txt";
		BufferedReader br =null;
		try {

			File file = new File(pathh);
			br = new BufferedReader(new FileReader(file));  //FileReader will read the file --- you can directly also given path location 
			// BufferedReader will buffer the content
			 System.out.println("File content is :");
			 int c=0;
			 while ((c=br.read())!=-1) {
				System.out.print((char) c);
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		finally {
			try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
