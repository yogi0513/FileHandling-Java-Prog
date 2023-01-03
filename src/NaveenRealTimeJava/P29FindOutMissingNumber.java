package NaveenRealTimeJava;

public class P29FindOutMissingNumber {
	
	//Find out the missing number in an integer array only one missing number 
	
	public static void main(String[] args) {
	
		int num[] = {1,2,3,4,5,6,7,8,9,11,12,13,14,15};      //sorted in 1 to 100 order 
	
		int n1 = findMissingNumber(num);
		
		System.out.println(n1);
		
	}
	
	public static int findMissingNumber(int num[]) {
		int totalCount = num.length+1;
		int expSum = totalCount*((totalCount+1)/2);
		
		int actuSum=0;
		
		for(int i:num) {
			actuSum+=i;
			
		}
		return expSum-actuSum;
	}
	
}

