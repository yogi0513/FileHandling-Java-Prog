package NaveenRealTimeJava;

import java.io.IOException;

public class P49LaunchExternalApps {

	public static void main(String[] args) throws IOException {
		
		Runtime rt = Runtime.getRuntime();
		
		rt.exec("notepad.exe");
		
	}
	
}
