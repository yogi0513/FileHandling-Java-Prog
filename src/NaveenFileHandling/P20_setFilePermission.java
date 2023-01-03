package NaveenFileHandling;

import java.io.File;

public class P20_setFilePermission {
	
	//how to set Read/Write/Executable permissions for a file in Java.
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\P20_setFilePermission.java");
		
		file.setExecutable(true);
		file.setExecutable(true, true);  // 2nd argument is for only owner me who's is owner of file 
		
		file.setReadable(true);     // if you do false you cannot read or open once executed so be careful
		file.setWritable(true);		// same with this also
		
		
		System.out.println("Done...");
		
		// chmod 777 Resume.java ---- all permission given 
	}

}
