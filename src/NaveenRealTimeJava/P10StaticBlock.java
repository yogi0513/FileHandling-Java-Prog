package NaveenRealTimeJava;

public class P10StaticBlock {
	
	public static void main(String[] args) {
	 
	System.out.println(Main.x);   //100  --- as it is final so does not loaded Main class 
	
	System.out.println(Main.y);  // static block will execute than y =100
	
	}
	
}

class Main{
	
	public static final int x = 100;
	
	public static int y =100;
	
	static {
		System.out.println("main ---- class static block ....");
	}
}
/*
 *   static block should run first but -- in this case not running main reason is ---
 *   
 *     to improve the performance this Main.x is replace inside the dot class file inside the bit code 
 *     if you remove final keyword ---than static block will run first --- than public static int x =100;
 *     
 *     with --final keyword -- it take directly from memory --as it is final --- doesn't load the Main class that's why
 *     static block is not executive
 *      
 *     
 */

