package NaveenRealTimeJava;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P02Print1to100WithoutLoop {
	
	/*
	 * Output numbers 1 to 100 
	 * without using any loop 
	 */

	
	// reverse 100 to 1
	public static int printNum(int num) {
		if(num<1) {
			return num;
		}
		else {
			System.out.print(num+" ");
			return printNum(num-1);
		}
	}
	
	// 1 to 100 using recursive
	public static int printNumAscend(int num) {
		if(num>100) {
			return num;
		}
		else {
			System.out.print(num+" ");
			return printNumAscend(num+1);  // first tym
		}
	}

	
	
	public static void main (String [] args ) {
		
		printNum(100);
		System.out.println();
		printNumAscend(0);
		
//===================================================================================
		// using IntStream we can do 
		System.out.println();
		IntStream.range(0, 101).forEach(e->System.out.print(e+" ")); //only sort order ---reverse can't used
	
	}
}
