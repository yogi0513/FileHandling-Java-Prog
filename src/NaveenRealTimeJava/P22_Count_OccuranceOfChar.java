package NaveenRealTimeJava;

public class P22_Count_OccuranceOfChar {

	/*
	 * Count the occurrences of a character in a String
	 * 
	 *  CharArray 
	 *  CharAt()
	 *  Apache Common StringUtils
	 *  Streams
	 *  
	 */
	
	public static void main(String[] args) {
		
		getOccuranceOfChar("Welcome to the java programming language", 'm');
		
		String str = "I love my country India";
		
		//Streams
		
		str.chars().mapToObj(e->String.valueOf((char)e));
		
		
		long co = str.chars().mapToObj(e-> String.valueOf((char)e)).filter(e->e.equals("I")).count();
		System.out.println(co);
		
	
		
		// 	Apache Common StringUtils  --download binary -- org.apache.commons.lang3.StringUtils
		/*
		 *    int count =StringUtils.countMatches(str, "o");
		 *    System.out.println(count);
		 *    
		 */
		
	}
	
	public static void getOccuranceOfChar(String str, char val) {
		
		int count =0;
		for(char ele:str.toCharArray()) {
			if(ele==val) {
				count++;
			}
		}
		
		
		
		/*
		 int coun =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==val) {
				coun++;
			}
		}
		 */
		
		System.out.println("The count of following character is "+ val +"  "+ count );		
	}
	
	//-------------------------------------------------------
	
	
	
}
