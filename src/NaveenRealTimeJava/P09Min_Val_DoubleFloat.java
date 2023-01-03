package NaveenRealTimeJava;

public class P09Min_Val_DoubleFloat {
	
	/*
	 *  what is the value of double Min_value?
	 *  which one is bigger  --> Double Min_value or 0.0d?
	 *  which one is bigger --> Double Min_value or negative_infinity?
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println(Double.MIN_VALUE);    // minimum value are always negative but here in double case it is positive
		System.out.println(Long.MIN_VALUE);  
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Math.min(Double.MIN_VALUE,0.0d ));   // see here min value is positive that's why 0.0d is greater 
		System.out.println(Math.min(Integer.MIN_VALUE, 0));
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
		// negative infinity -- means minus infinity number
	}
}
