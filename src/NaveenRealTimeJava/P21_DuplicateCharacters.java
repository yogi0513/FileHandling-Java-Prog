package NaveenRealTimeJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P21_DuplicateCharacters {
		
	/*
	 * 	How to print duplicate characters from string ?
	 */
	
	public static void main(String[] args) {
		
		 printDuplicateCharacter("Yogendraa");
	}
	
	public static void printDuplicateCharacter(String str) {
		
		if(str==null) {
			System.out.println("Null String");
			return ;
		}
		else if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		else if(str.length()==1) {
			System.out.println("Single char String");
			return;
		}
		
		char [] words =str.toCharArray();
		
		Map<Character, Integer> hm = new HashMap<>();
		
		for(Character ele:words) {
			if(hm.containsKey(ele)) {
				hm.put(ele, hm.get(ele)+1);
			}
			else {
				hm.put(ele,1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
			
		for( Entry<Character, Integer> ele: entrySet ) {
			if(ele.getValue()>1) {
				System.out.println(ele.getKey() + ": " + ele.getValue() );	
			}
			
			
		}
	}
}
