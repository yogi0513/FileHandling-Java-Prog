package NaveenRealTimeJava;

/*
 * Q1. Explain static blocks in Java ?  
      
   Q2. How can we run a java program without making any object?   --- static method
      
   Q3. Similarity and Difference between static block and static method ?
   
   Q4. How can we create objects if we make the constructor private ? 
      
   Q5. Is it possible to compile and run a Java program without writing main( ) method? 
   
   Q6. Can we initialize member variables within static block ?
 */

public class P13StaticBlockExplaination {

	static {									// inside class anywhere you can write the static block
		System.out.println("static block");   
	}
	
	static {   						// movement you load this class this will called 
		System.out.println("static block 2 check");
	}
	
	
	public static void name() {					// but static method we need to call by giving methodName() or className.MethodName
		System.out.print("Yogendra ");
	}

	public static void Surname() {
		name();
		System.out.println("Burkul");
	}
	

	//main method 
	public static void main(String[] args) {
		System.out.println("main method ");
		name();
		P13StaticBlockExplaination.name();    // proper way to call static method 
		System.out.println();
		
		
		Surname();
		
		
		//Q 3 answer 
	// static will be called automatically where as, static method you need to call when you have define & want to use 
		
		
//----------------------------------------------------------------------------------------------------------------------------
		// here we have used object of P13 -2 --- with private constructor -- by static method 
			
	//	P13StaticBlockExplaination2 psb = new P13StaticBlockExplaination2();  // this we can't create as private constructor
		
	 P13StaticBlockExplaination2 obj = P13StaticBlockExplaination2.createObjectInstance();
	 	obj.setAge(355);
	 	
	 	System.out.println(obj.getAge());  
	}
	
	
	
}
