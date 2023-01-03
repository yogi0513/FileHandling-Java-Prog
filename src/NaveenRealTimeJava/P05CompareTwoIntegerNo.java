package NaveenRealTimeJava;

public class P05CompareTwoIntegerNo {
	
	/*
	 *  Compare two int numbers (Integer caching) 
	 */
	
	public static void main(String[] args) {
			
		// Integer
		
		Integer num1 = 127;    //-128 to 127 --- both are equals but greater than 127 ---both are not equals 
		Integer num2 = 127;
		
		if(num1==num2) {
			System.out.println("both are equals");
		}
		else {
			System.out.println("both are not equals");
		}
		
		System.out.println(num1==num2);
		
		//short
		
		Short a =200;
		Short b =200;
		System.out.println(a==b); //false
		
		
		
		
		
		//String comparing with double equal
		
		String sc ="yogi";
		String cs = "yogi";
		System.out.println(sc==cs);   //true
		
		String cc = new String("yogi"); 
		System.out.println(sc==cc);   //False
		
		//Float class comparison
		
		Float f1 = 34.3f;
		Float f2 = 34.3f;
		
		System.out.println(f1==f2);  //false
		
	}
}
