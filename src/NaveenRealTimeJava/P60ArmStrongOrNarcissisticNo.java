/*
 * 		 0, 1 -- is armstrong number
		 153 = 1 cube + 5 cube + 3 cube = 153 -- armstrong
		 negative armstrong number not possible
		
		 different words for armstrong is narcissistic number / pluperfect digital invariant (PPDI) number
		 plus perfect number
		 
 * */

package NaveenRealTimeJava;

import java.util.Scanner;

public class P60ArmStrongOrNarcissisticNo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number to check armstrong or not");
		int num=sc.nextInt();
		int temp=num;
		int n=0;
		// to get size 
		while(num!=0) {
			n++;
			num=num/10;
		}
		System.out.println(n);
		
		
		// to verify if condition satisfied or not
		int rem=0;
		int res=0;
		while(temp!=0) {
			rem = temp%10;
			int b=1;
			for(int i=1;i<=n;i++) {
				b*=rem;
			}
			res+=b;
			temp=temp/10;
		}
		
		System.out.println(res);
		
		
		
	}
}
/*
 * 153 = 1*1*1 +5*5*5 +3*3*3 =153
 * 9474 = 9474
 * 
 * 54748 = 54748
 *  
 */
