package NaveenRealTimeJava;

import java.util.Arrays;

//Stack Memory and StackOverFlowError in Java 


public class P56StackMemory {
	
	public static void m1() {
		m2();
	}
	
	public static void m2() {
		m3();
	}

	public static void m3() {
	int i=10;
	System.out.println(i);
}
	public static void main(String[] args) {
		m1();  
	
	}
}
