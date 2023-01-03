package NaveenRealTimeJava;

public class P63StringToIntegerWithParseMethod {
	
//	WAP to convert String to Integer without using Integer.parseInt();
	
	public static int StringToNumber(String str) {
		int num=0;
		int len = str.length();
		
		for(int i=0;i<len;i++) {
			
			// ascii value of int --- 0 --- is 48
		int asciR =(int)str.charAt(i)-48;
		num=num*10+asciR;
		
		}
		return num;
	}
	
	/*	 char -- decimal value against it
	 * 
	 *  ascii value of  -- 0 -48, 1-49, 2-50, 3-51, 4-52, ---- 9-57
	 */
	
	
	public static void main(String[] args) {
		
		int result =StringToNumber("342");
		System.out.println(result);
		
		
		// Yogendra method to convert following 
		
		String s = "123";
		
		char [] arr =s.toCharArray();
		
		int v=0;
		int rem =0;
		int res =0;
		for(char ele:arr) {
			v =Character.getNumericValue(ele);
			rem=v%10;
			res=res*10+rem;
			 
		}
		
		System.out.println(res);
		
		
	}
}
