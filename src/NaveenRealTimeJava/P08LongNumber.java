package NaveenRealTimeJava;

public class P08LongNumber {
	
	// Output when you use a Long number with L and without L suffix in java
	
	public static void main(String[] args) {
		 
		long longNum = 1000*60*60*24*365;      // normal calculator answer is 31536,000,000
		System.out.println(longNum);    //1471228928
		
		long longNumL = 1000*60*60*24*365L;  // when you want extract number same as calculator put L ---suffix
		System.out.println(longNumL);
	}
}

/*  
 *			31536,000,000 -- 36 bits 
 *			11101010111101100010010110000000000 --- binary conversion of above number 
 *			
 *		max limit of 32 bit int =2147483647
 *		// so to fit in 32 bit it will remove some binary number that's why giving different result
 *		1010111101100010010110000000000  ----- convert binary to decimal --- 1471228928 this is answer first 4 digit remove
 *			
 */
