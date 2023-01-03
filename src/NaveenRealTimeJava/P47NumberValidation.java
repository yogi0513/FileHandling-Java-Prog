package NaveenRealTimeJava;

public class P47NumberValidation {
	
	//Check given String is a valid number in Java
	public static boolean isNumber(String num) {
		
		try {
			Long.parseLong(num);
		System.out.println("this is valid number "+ num);	
		
			
		} catch (NumberFormatException e) {
			System.out.println("not a valid number "+num);
			return false;
		}
		return true;
		
		
		
	}
	public static void main(String[] args) {
		isNumber("34343sss4");
	}
}
