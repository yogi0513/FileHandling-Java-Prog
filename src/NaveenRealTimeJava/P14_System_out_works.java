package NaveenRealTimeJava;

	/*
	 *  How System.out.println() really works in Java ?
	 */

public class P14_System_out_works {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World! ");
		
		// out is --- field --- public static final PrintStream out = null 
		
		
	}
}

/* out is static variable define inside System class --- variable --- type of variable is PrintStream 
 * 
 * System class constructor is private means you can't create object of it --- final --also as know one should change there 
 * value  --but it is define with null -- so why not it is giving null pointer exception 
 * 
 * native -- means --they are not written in java language -- written in c language --- native method is called by JNI
 * 
 * JAVA Native Interface -- is a foreign function interface programming framework that enables java code running in a java virtual
 * machine (JVM)
 *  
 *  JNI -- means --it defines a way for the bytecode that code written in java to interact with native code (written in C++)
 *  
 * that why JNI -- will call the SETOUT METHOD internally ---& goes to C++ implementation 
 * 
 * 
*/



