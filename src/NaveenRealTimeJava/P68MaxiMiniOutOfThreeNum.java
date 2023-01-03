package NaveenRealTimeJava;

public class P68MaxiMiniOutOfThreeNum {
	
	//Find out the max and mini number from the three positive number 
	
	// using loop
	public static void MaxNum(int a, int b, int c) {
		int max=0;
		while(a>0 || b>0 || c>0) {
			a--;
			b--;
			c--;
			max++;

		}
		System.out.println("maximun no : "+max);	
	}
	
	public static void MinNum(int a, int b, int c) {
		int min=0;
		while(a>0 && b>0 && c>0) {
			a--;
			b--;
			c--;
			min++;

		}
		System.out.println("minimum no : "+min);	
	}
	
	public static void main(String[] args) {
		
		MaxNum(20, 10, 30);
		MinNum(20, 45, 23);
		
		
		//============================================================
		// using ternary operator 
		
		int a =23,b=34,c=1;
		
		int d = (a>b)? a:b;
		int e = (d>c)? d:c;
		System.out.println("maximum no without using if else "+e);
		
		int g = (a<b)? a:b;
		int f = (d<c)? d:c;
		System.out.println("minimum no without using if else "+f);
		
		
		//=========================================================
		// if -else you can do it yourself
	
	}
	
}
