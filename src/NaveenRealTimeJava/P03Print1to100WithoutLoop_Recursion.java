package NaveenRealTimeJava;

import java.util.Arrays;

public class P03Print1to100WithoutLoop_Recursion {

	/*
	 * print from 1 to 100 without using loop and recursion
	 */
	
	public static void main(String[] args) {
		
		// using Array fill:
		
		Object num [] = new Object[100];
		
		Arrays.fill(num, new Object() {
			
			int count =0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		
		System.out.println(Arrays.toString(num));
	
		//---normal arrays fill method example
		
		Object n []	= new Object[2];
		
		Arrays.fill(n, "yogendra");
		
		System.out.println(n[0]);
		System.out.println(n[1]);
		
	}
	
}
