package NaveenRealTimeJava;

public class P48BinaryNumberOrNot {
	
	//check number is binary or not 
	
	public static void main(String[] args) {
	
		boolean isBinary = true;
		
		int num =1011;
		int temp = num;
		
		int rem;
		while (temp!=0) {
			rem =temp%10;  
			System.out.println(rem);
			if(rem>1) {					// binary no are only in 0 and 1 that why this conditions
				isBinary=false;
				break;
			}
			
			else {
				temp=temp/10;
			}
			
		}
		
		if(isBinary){
			System.out.println("number is binary "+num);
		}
		else {
			System.out.println("number is not binary no "+num);
		}
		
	}
}
