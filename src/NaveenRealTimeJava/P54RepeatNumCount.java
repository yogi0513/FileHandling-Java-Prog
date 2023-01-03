package NaveenRealTimeJava;

import java.util.HashMap;
import java.util.Map;

public class P54RepeatNumCount {

	public static void main(String[] args) {
		
		//121 --1:2 --2:1
		//111 --1:3
		
		int num =12134344;
		String nu=String.valueOf(num);
		char [] arr =nu.toCharArray();
		
		Map<Character,Integer> hs = new HashMap<>();
		
		for(char ele:arr) {
			if(hs.containsKey(ele)) {
				hs.put(ele, hs.get(ele)+1);
			}
			else {
				hs.put(ele, 1);
			}
			
		}
		System.out.println(hs);
	}
}
