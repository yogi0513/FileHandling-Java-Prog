package NaveenRealTimeJava;

/*
 * 
      
   Q5. Is it possible to compile and run a Java program without writing main( ) method? 
   
   Q6. Can we initialize member variables within static block ?
 */

public class P13StaticBlockExplaination3 {

	// Q 5 - Solution
	
	static int age =34;
	
	//Q 6 answer below
	
	String notAllowName;
	static String allowName;
	
	static {
		
		System.out.println("static 1");
		
//		notAllowName = "don't try this as block is static & you are initializing non static variable member";
		
		// this way we can initialize the non -static variable 
		P13StaticBlockExplaination3 pbe = new P13StaticBlockExplaination3();
		pbe.notAllowName = "burkul";
		
		allowName ="yogendra";
		
		System.out.println(allowName + "  " + pbe.notAllowName);
	}
	
	static {
		System.out.println("static 2");
	}
	
	static {
		System.out.println("static 3");
	}
	
	//main method 
	public static void main(String[] args) {
	

	}
	
	
	
}
