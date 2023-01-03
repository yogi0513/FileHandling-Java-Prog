package NaveenRealTimeJava;

/*
 *  STar pattern -- 
 */
public class P18_StarPatterns {
	
	public static void main(String[] args) {
	
		// Pattern 1
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------**************");
		
		// Pattern 2
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}

/*

1____*
2___**
3__***
4_****
5*****

// pattern 2

		1*****
		2_****
		3__***
		4___**
		5____*
		
 */













