package NaveenRealTimeJava;

/*
 * 
   Q 7 - will the static block be executed in the following code ? why?
      
   
 */

class Test{
	
	static {
	System.out.println("Test -- static block");	
	
	}
	public static final int x =230;
	
}


public class P13StaticBlockExplaination4 {
	

public static void main(String[] args) {
	
	System.out.println(Test.x);     // no --- as it is final --- so not need to load static block 
	
	// this is called compiler optimization ---- compiler will not load the test class  ---
	// why ? but --  x = 20 is static in nature + final ---- available in common memory --- take it from there
	
	// but if you remove final keywords than static block will be loaded ---  
	
	
}

}