package NaveenRealTimeJava;

import java.util.Arrays;

public class P38PasswordShouldArrayChar {
	// Why password should be stored in char array char[] instead of string?

	public static void main(String[] args) {
		String pwd = "Yogendra@123";
		System.out.println("pwd is : "+pwd);
		
		char [] c = new char[] {'Y','o','g','i','0','5','1','3'};
		System.out.println(c);
		 
		// character array's are mutable 
		// String are immutable
		
		Arrays.fill(c, '*');
		

		
		System.out.println(c);
		
	}
	
}
