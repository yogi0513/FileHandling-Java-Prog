package NaveenRealTimeJava;

public class P25_EscapeSpecialChar {

	/*
	 *   /"Hello"/
	 *   /'Hello'/
	 *   "Hello"
	 *   I love "java" and "programming" and "movies"	
	 *   
	 */
	
	public static void main(String[] args) {
	
		System.out.println("/\"Hello\"/");
		
		System.out.println("I love \"java\" and \"programming\" and \"movies\"");
		
		System.out.println("/\'Hello\'/");
		
		getXpath("yogendra");
		
	}
	
	public static void getXpath(String name) {
		String xpath = "//input[@id ='"+name+"']";
		System.out.println(xpath);
	}
	
}
