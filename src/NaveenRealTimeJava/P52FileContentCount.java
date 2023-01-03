package NaveenRealTimeJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P52FileContentCount {

	// count total character, words and lines in a given file

	static String path = "C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenRealTimeJava\\Demo.txt";

	public static void main(String[] args) {
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		BufferedReader r;

		try {
			r = new BufferedReader(new FileReader(path));
			String curLine = r.readLine();
			
			while (curLine!=null) {
				lineCount++;
				
				//words
			String word [] =curLine.split(" ");
			wordCount+=word.length;
			
			
			//charCount
			for(String ele:word) {
				charCount+=ele.length();
				
			}
			curLine=r.readLine();
			
			}
			System.out.println("total lines : "+lineCount);
			System.out.println("total words : "+wordCount);
			System.out.println("total character : "+charCount);
				
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
