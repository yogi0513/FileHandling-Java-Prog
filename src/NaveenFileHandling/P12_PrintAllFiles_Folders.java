package NaveenFileHandling;

import java.io.File;
import java.util.Arrays;

/*
 *  Print all files and folders in a directory in sorted orders
 */

public class P12_PrintAllFiles_Folders {

	public static void main(String[] args) {
		
		// windows 
		String path = "C:\\Users\\yogen\\Downloads";
		
		File f = new File(path);
		
		
		File [] downloadDir =f.listFiles();
		
		Arrays.sort(downloadDir);
		
		for(File ele:downloadDir) {
			
			if(ele.isFile()) {
				System.out.println("File : "+ele.getName() + "   "+ ele.getAbsolutePath());
			}
			else if(ele.isDirectory()){
				System.out.println("Directory : "+ele.getName()+ "   "+ ele.getAbsolutePath());
			}
			else {
				System.out.println("unkown file : "+ele.getName()+ "   "+ ele.getAbsolutePath());
			}
		}
		
	}
}
