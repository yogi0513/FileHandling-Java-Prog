package NaveenFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P11_Copy_File_In_Java {

	/*
	 *  File Handling -1:
	 *  Copy a file (pdf) and create a different file in the same location 
	 *  
	 */
	
	public static void main (String [] args){
		
	File file = new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\sample.pdf");
	File outputFile = new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\sample-copy.pdf");	
	
	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	try {
		
		fis = new FileInputStream(file);
		fos = new FileOutputStream(outputFile);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		
	try {
		System.out.println(fis.available());  // no of byte present in this file
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	try {
		System.out.println(fis.read());   //the next byte of data, or -1 if the end of the file is reached.
	} catch (IOException e1) {
		
		e1.printStackTrace();
		}

	//-----------------------------------------------------------
	

	try {
		int i=fis.read();
		
		while(i!=-1) {    // always true --- actually file byte will become -1 when reach at end of the file
		
			fos.write(i);
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	finally {
		//close the stream 
		if(fis!=null) {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(fos!=null) {
			try {
				fos.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
	
	
	//text file copy 
	copyFileTxt();
	
	}
	
	public static void copyFileTxt() {
		// zero byte as -- file has nothing written in it
		File fileTxt = new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\sample1.txt");
		File fileTxtOut = new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\sample1_copy.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream(fileTxt);
			fos = new FileOutputStream(fileTxtOut);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
		try {
			System.out.println(fis.available());  // no of byte present in this file
		} catch (IOException e) {
			e.printStackTrace();
		}

		//-----------------------------------------------------------
		int i=0;
		
		try {
			while((i=fis.read())!=-1) {			//always true --  if nothing is written byte will be zero
				fos.write(i);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			//close the stream 
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}

	}
}
