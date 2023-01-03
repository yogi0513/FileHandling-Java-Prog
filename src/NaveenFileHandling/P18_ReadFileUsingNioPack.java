package NaveenFileHandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class P18_ReadFileUsingNioPack {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\sample1.txt";
		try {
			List<String> li =Files.readAllLines(Paths.get(path),StandardCharsets.UTF_8);
			
			for(String ele:li) {
				System.out.println(ele);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
