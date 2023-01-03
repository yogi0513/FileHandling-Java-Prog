package NaveenRealTimeJava;

import java.text.DecimalFormat;

public class P64ElementPercentage {
	// find percentage of uppercase letter, lowercase letter, digits & special character in string

	public static void getCharPercentage(String str) {
		int len = str.length();
		
		int UpCaseCount =0;
		int lowCaseCount =0;
		int digits =0;
		int specChar =0;
		
		for(int i=0;i<str.length();i++) {
		char ch=	str.charAt(i);
		if(Character.isUpperCase(ch)) {
			UpCaseCount++;
			
		}
		else if(Character.isLowerCase(ch)) {
			lowCaseCount++;
		}
		else if(Character.isDigit(ch)) {
			digits++;
		}
		else {
			specChar++;
		}
		
		
		}
		
		double upCasePer = (UpCaseCount*100.0)/len;
		double loCasePer =(lowCaseCount*100.0)/len;
		double digPer = (digits*100.0)/len;
		double specPer = (specChar*100.0)/len;
		
		System.out.println("In given String : "+ str);
		DecimalFormat f = new DecimalFormat("##.##");
		
		System.out.println("upper case % ------> "+f.format(upCasePer));
		System.out.println("lower case % ------> "+f.format(loCasePer));
		System.out.println("digit case % ------> "+f.format(digPer));
		System.out.println("special case % ------> "+f.format(specPer));
		
		System.out.println("total percentage : "+(upCasePer+loCasePer+digPer+specPer));
		
		
	}
	
	
	public static void main(String[] args) {
		
		String sc = "Yogendra Burkul 123 %#";
		
		getCharPercentage(sc);
		
		
		
		
	}
}
