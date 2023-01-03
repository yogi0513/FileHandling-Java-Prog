package NaveenRealTimeJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P70StringLength {
	
	public static void main(String[] args) {
		
		//print largest length string from data -- here country will be largest 
		
		String s=" I love my country india";
		
		String [] re =s.split(" ");
		
		Map<String, Integer> hs = new HashMap<>();
		
		for(String ele:re) {
		
			if(hs.containsKey(ele)) {
				hs.put(ele, ele.length());
			}
			else {
				hs.put(ele, ele.length());
			}
			
		}
	
			
		int maxValueMap = Collections.max(hs.values());
		
		for(Entry<String, Integer> ele:hs.entrySet()) {
			if(ele.getValue()==maxValueMap) {
				System.out.println(ele.getKey()+" "+ele.getValue());
			}
		}
		
	}
}
