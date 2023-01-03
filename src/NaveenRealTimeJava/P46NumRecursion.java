package NaveenRealTimeJava;

public class P46NumRecursion {
	
	//Reverse A Number using Recursion - Java Interview Question
	
	public static void rev(int number) {
		if(number<10) {   					// single digit number will not be reverse that's why
			System.out.println(number); 
			return;
		}
		else {
			System.out.print(number%10);   //3 //2 //1
			rev(number/10);
		}
	}
	

	public static void main(String[] args) {
		
		int num =123;
		int res=0;
		while(num!=0) {
			int rem = num%10;
			res=res*10+rem;
			num=num/10;
			
		}
		System.out.println(res);
		
		rev(123);
		
		
		
	}
}
