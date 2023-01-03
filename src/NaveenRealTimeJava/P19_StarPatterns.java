package NaveenRealTimeJava;

/*
 *  STar pattern -- 
 */
public class P19_StarPatterns {
	
	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) {
		for(int j=5;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<(i*2);k++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		
		
		
	}
}

/*

1
2
3
4
5


 */













