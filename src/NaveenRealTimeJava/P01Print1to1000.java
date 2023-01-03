package NaveenRealTimeJava;

public class P01Print1to1000 {
	
	/*
	 * Output numbers 1 to 100 
	 * without using any number in your code
	 */
	
	public static void main (String [] args ) {
		
		// 1st way
		System.out.println((int)'A');  //65
		
		int in = 'A'/'A';
		System.out.println(in);
		
		String sc = "**********";
		System.out.println(sc.length());
		
		for(int i=in;i<=sc.length()*sc.length();i++) {
			System.out.println(i);
		}
		
		//2nd way easy one   --- ascii value of char 'd' is 100
	
		for(int i='A'-'A';i<='d';i++) { 
			System.out.println(i);
		}
		
		//3rd way --- 
		
	}
}
