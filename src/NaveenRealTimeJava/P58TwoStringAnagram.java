package NaveenRealTimeJava;

import java.util.Arrays;

//Check Two Strings are Anagram Or Not using Sort and Equals in Java

public class P58TwoStringAnagram {
	
	public static boolean isAnagram(String s1, String s2) {
		
		String str1 =s1.replaceAll("\\s", "");  // this remove space from string arguement
		String str2 =s2.replaceAll("\\s", "");
		
		if(str1.length()!=str2.length()) {
			return false;
			
		}
		else {

			char [] arr1 =str1.toLowerCase().toCharArray();
			char [] arr2 =str2.toLowerCase().toCharArray();
			
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			return Arrays.equals(arr1, arr2);
		}
	}
	
	
	public static void main(String[] args) {
		 
		// Listen ---- silent
		
		
		System.out.println(isAnagram("Listen yogendra", "silent ardnegoy"));
		
		
		
	}
}
