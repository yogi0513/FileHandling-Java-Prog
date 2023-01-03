package NaveenRealTimeJava;

/*
 *  STar pattern -- 
 */
public class P20_StarPatterns {
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=6;i++) {
			char in ='A';
			for(int j=1;j<=i;j++) {
				System.out.print(in+" ");
				in++;
			}
			System.out.println();
		}
		
		
		
	}
}

/*

1 A
2 A_B
3 A_B_C
4 A_B_C_D
5 A_B_C_D_E


A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 


 */













