package NaveenRealTimeJava;

public class P24_Output_print {
	
	/*
	 *  what will be output of following equation ?
	 */
	
	public static void main(String[] args) {
		
		int i = (byte) + (char) - (int) + (long) -1 ;   // right to left -- it will go 
		
		System.out.println(i);   // no compile time error will be given 
		
		
		// above equation -- segregating 
		
		int j= (int) + (long) -1;
		System.out.println(j);
		
		int k = (char) -j;
		System.out.println(k);
		
		System.out.println((byte) k);
		
		
		
	}
}
