package NaveenRealTimeJava;

public class P15MaximumParameter {
	
	/*
	 *  Maximum number of parameters we can take for a method in Java ?
	 *  
	 *  ** int, short, byte, boolean, float, classType(class, object) ---254 (non-static) and 255 (static)  ---parameter we can give 
	 *  
	 *  double & long ---> 127 parameter allowed (static & non-static)
	 *  
	 *  
	 */
	
	public void testing(int a, int b, int c) { //...... go with 254
		
	}
	
	
	public static void main(String[] args) {
		
		// how to create parameter directly upto 255 using for loop 
		
		String sc ="";
		
		for(int i=0;i<25;i++) {
			sc+="double a"+i+", ";
			
		}
		System.out.print(sc);
		
	}
}
