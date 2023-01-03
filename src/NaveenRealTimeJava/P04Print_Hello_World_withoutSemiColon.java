package NaveenRealTimeJava;

public class P04Print_Hello_World_withoutSemiColon {

	public static void main(String[] args) {
		
		// 1 way
		if(System.out.printf("hello world\n")==null) {
			
		}
		
		//2 way
		
		if(System.out.append("Hello World\n").equals(null)) {
			
		}
		
	}
}
