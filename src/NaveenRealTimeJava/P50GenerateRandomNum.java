package NaveenRealTimeJava;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class P50GenerateRandomNum {

/*
 * 	Generate Random Number in java
 *  Random Class
 *  Math.random()
 *  ThreadLocalRandom
 *  
 *  Use cases : Random Num in email :test1234@gmail.com
 *  
 *  Phone number etc;
 */
	
	public static void main(String[] args) {
		
		Random random = new Random();
		for(int i=1;i<=5;i++) {
			System.out.println(random.nextInt());
			System.out.println(random.nextBoolean());
			System.out.println(random.nextFloat());
			System.out.println(random.nextDouble());
		}
		
		System.out.println("--------------------------------------");
		
		for(int i=1;i<=5;i++) {
			System.out.println((int) (Math.random()*10));  // this will give double value but --- explicit convert into int
			
		}
		
		System.out.println("------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			System.out.println(ThreadLocalRandom.current().nextInt());
		}
		
		System.out.println("-----------------------------------------");
		int num=20;
		while(num!=0) {
			int result =random.nextInt(20);	
			System.out.println(result);
			num--;
		}
		
		
	}

	 
}
