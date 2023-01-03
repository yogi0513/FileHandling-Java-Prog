package NaveenRealTimeJava;

public class P30FindLengthOfString {

	// find out length of string 
	
	public static void main(String[] args) {
		
		String sc = "yogendra";
		int i=0;
		try {
			while(true) {
				sc.charAt(i);
				i++;
			}	
		}catch (IndexOutOfBoundsException e) {
			System.out.println(i);
		}
		
		//tochararray method to get length of string

		
		char [] arr =sc.toCharArray();
		
		int count=0;
		for(char ele:arr) {
			count++;
		}
		System.out.println(count);
		
		
	}
}
