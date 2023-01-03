package NaveenFileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;    // java.nio.file.Paths;
import java.util.*;

/*
	 *  File
	 *  FileOutputStream
	 *  Java Nio utils
	 */

public class P13_CreateFile {
	
	public static void main(String[] args) {
		//----------------------------------------------------------------
		// File class method to create file
		
		String path = "C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\demo.img";
		
		File f = new File(path);
		
		// file handling always prefer try and catch block 
		
		try {
			
		boolean flag = f.createNewFile();   //true if the named file does not exist and was successfully created; false if the named file already exists

		// if only when flag become false then executed 
		if(!flag) {   //true -- !false ---goes inside 
			System.out.println("file already present");
	//		return; 			// -- it act like break statement exit -- below return nothing will be executed
		}
		
		/*	
		if(flag) {
			System.out.println("file is created");
		}
		else {
			System.out.println("file is already present ----");
		}
		
	*/	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	//--------------------------------------------------------------------------------------------------
		// 2 FileOutputStream along with Scanner -- location taken as input ----create + write some input
		
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name with location Path");
		
		String fileName =sc.nextLine();    //C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\demoyogi.txt
		
		FileOutputStream fos = new FileOutputStream(fileName, true);   // if make it false than -- whatever earlier written will vanished
		//append if true, then bytes will be written to the end of the file rather than the beginning
		
		System.out.println("Enter the file content");
		String content = sc.nextLine();
		
		byte [] b=content.getBytes();
		
		fos.write(b);  // write( byte [] b) --- method present 
		fos.close();
		
		System.out.println("File is saved ");
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//----------------------------------------------------------------------------------------------------
		//   3 java nio package 
	/*
		
		
		Path pathlocation = Paths.get("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\demo3.img");
		
		try {
		Path newPath =Files.createFile(pathlocation);
		System.out.println("new file created at : "+newPath);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		
	*/	
		
		
		
	}
}
