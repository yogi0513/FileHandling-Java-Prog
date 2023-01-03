package NaveenRealTimeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/*
	 *  what is NaN  (Not a Number) ? 
	 *  How is NaN defined in different languages?
	 *  Java, JavaScript
	 */

public class P06WhatIsNaN {
	
		public static void main(String[] args) {
			try {   
//			System.out.println(2/0);         //arithmetic exception
			System.out.println(2.0/0.0);    // infinity  (normal calculate -- it's showing cannot be divided by 0)
			System.out.println(0.0/0.0);     // Nan
			System.out.println(0.0/0);       // Nan
			System.out.println(Math.sqrt(-1));    // false
			System.out.println(Float.NaN==Float.NaN); // NaN -- stand for Not a Number
			System.out.println(Double.NaN!=Double.NaN);  // true 
			}
			// two NAN number cannot be compared as they both are un defined
			
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("ok");
			}
			System.out.println("hello morning");
			
			   
		}
}
