package NaveenRealTimeJava;

public class P12NullArgument {
	
	/*
	 *  Pass null argument with method overloading of String and Object types
	 */
	
	public static void test(Object ob) {
		System.out.println("Object Argument");
	}
	
	public static void test(String str) {
		System.out.println("String Argument");
	}
	
	/*
	public static void test(int str) {  		// preference will be given to int ---primitive data type first than others
		System.out.println("int Argument");
	}  
	 */
	
	
	/*
	public static void test(StringBuffer str) {
		System.out.println("String Argument");
	}
	*/
	
	public static void main(String[] args) {
		
	test(null);		//object one will be called --- because it is super class of String but ... I was wrong --- 
	
	//The method test(Object) is ambiguous for the type P12NullArgument --- if you uncomment StringBuffer overload one
	}
}

/*
Because,resolving the overloaded method compiler will always gives precedence to child class when compared with parent ..
*/