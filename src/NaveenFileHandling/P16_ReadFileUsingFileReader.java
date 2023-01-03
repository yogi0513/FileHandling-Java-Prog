package NaveenFileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P16_ReadFileUsingFileReader {
	
	public static void main(String[] args) {
		
		File file=null;
		FileReader fr = null;
		try {
			file = new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\sample1.txt");
			fr = new FileReader(file);
			System.out.println("File content is : ");
			
			int i=0;
			
			while ((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
}
