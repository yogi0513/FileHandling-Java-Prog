package NaveenRealTimeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class P71StringPalindrome {
	
	public static void main(String[] args) {
		
		
		String sc = "I like madam of malayalam who's name is hannah as she is very good teacher";
		
		String arr[] = sc.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		StringBuilder sb = new StringBuilder();
		
		String rev  =	sb.append(sc).reverse().toString();	
		
		String revarr[] = rev.split(" ");
		
		System.out.println(Arrays.toString(revarr));
		
		List<String>list1 = new ArrayList<>(Arrays.asList(arr));
		
		List<String>list2 = Arrays.asList(revarr);
		list1.retainAll(list2);
		
		
		System.out.println(list1);
		
		String maxStr = Collections.max(list1);
		System.out.println(maxStr);
		
		
		
	}
}
