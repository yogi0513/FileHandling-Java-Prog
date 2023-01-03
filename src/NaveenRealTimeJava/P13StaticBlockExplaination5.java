package NaveenRealTimeJava;

/*
 * 
	// Q 8 -- what will be the output of executing following class ?
      
   
 */

public class P13StaticBlockExplaination5{
	
	
	// this is static block executed when main method is run without any object
	
	static {
		System.out.println("Static Block");
	}
	
	
	// below down are both instance / means non -static blocks --- for this to print ---we need object creation 
	{
		System.out.println("Instance Initialization Block");
	}
	
	 P13StaticBlockExplaination5() {
		 System.out.println("Constructor ");
	}
	
	public static void main(String[] args) {

			System.out.println("Main Method");
			
		
			
			P13StaticBlockExplaination5 psd = new P13StaticBlockExplaination5();
			
			new P13StaticBlockExplaination5();   // both way we can create new object 
			
	}
}

/*
 *  	 firstly executed --- Main method --- than uncomment --- object reference 
 * 		
Static Block
Main Method
Instance Initialization Block
Constructor 
 *				// instance block will be given higher preference before Constructor  
 */
