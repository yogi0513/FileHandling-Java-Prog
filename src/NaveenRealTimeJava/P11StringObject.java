package NaveenRealTimeJava;

public class P11StringObject {
	
	/*
	 * How many String Objects will be created? - String Objects & String Constant Pool
	 */
	
	public static void main(String[] args) {
		
		String sr = new String("Yogendra");    // 2 object will be created
		
		// one more time guess how many object will be created ?
		String rs = new String("Yogendra");   // 1 object 
		
		
		// one more time guess
		String ss = "Yogendra";     // zero object 
		
		// another equation given guess object 
		String sy = "Yogi"	;   // one object in SCP   --- reference in Stack
		String ys = "Yogi" ;   // zero as object already present inside SCP
		String ds = ys ;   // zero object
		
		
		
		System.out.println(sy==ys);  // true
		System.out.println(ys==ds);  // true
		System.out.println(sy==ds);  // true
		
		
		System.out.println(sr==sy);  //false --- comparison base on reference 
		System.out.println(sr==rs);  //false  ---- reference comarison
	}
}

/*
 *  (non-static)  Heap   --- ( String constant pool -- this pool is present inside heap)---- object of sr will be created in
 *  						 heap area  ----- one more object will be created in SCP area ---"Yogendra"     
 *   						object of rs will be created in heap area ---- now object will pointing to earlier created object in
 *   						SCP area --- so one object will be there in heap area  
 *    
 *    
 *  (static)     Stack  ----  sr (reference) will be store in stack memory , rs (reference) will be store in stack memory
 *								ss (reference) create in stack

*/



