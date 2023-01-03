package NaveenRealTimeJava;

/*
 *  STar pattern -- 
 */
public class P17_StarPatterns {
	
	public static void main(String[] args) {
		
		// pattern 1
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// pattern 2
		System.out.println("===============");
		
		for(int i=1;i<=5;i++) {
			
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		// combine both to get --- 
	}
}

/*
 
* 
**
***
****
*****
===============
*****
****
***
**
*


 */













