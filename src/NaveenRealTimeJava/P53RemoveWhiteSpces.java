package NaveenRealTimeJava;

public class P53RemoveWhiteSpces {

	public static void main(String[] args) {
		
		String newStr = "     This is my car of Yogendra         	";
		String sc =newStr.trim();
		System.out.println(sc.length());
			String c =sc.replaceAll("\\s", "");   // this will remove white spaces
			System.out.println(c);
	}
}
