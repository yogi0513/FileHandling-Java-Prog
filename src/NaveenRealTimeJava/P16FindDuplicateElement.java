package NaveenRealTimeJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/*
	 *  Find Duplicate Elements in An Arrays 
	 *  
	 *  1. Brute force
	 *  2. HashSet
	 *  3. HashMap<K,V>
	 *  4. Streams
	 */ 


public class P16FindDuplicateElement {

	public static void main(String[] args) {
		
		// Brute Force method
		
		String infra[] = {"Amazon", "GCP","Azure","SauceLabs", "Ali Baba", "Amazon", "GCP","Azure"};
		
		System.out.println("************------brute force method------****************");
		
		for(int i=0;i<infra.length;i++) {
			for(int j=i+1;j<infra.length;j++) {
				if(infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}
		
		for(int i=0;i<infra.length;i++){
			for(int j=i+1;j<infra.length;j++){
			if(infra[i]==infra[j]){
			System.out.print(infra[i]+" ");
			}
				}
			}
		System.out.println();
		// drawback is more than 2 element duplicate --- can be count again inside equals method ---
		
		
//---------------------------------------------------------------------------------------------------------------

		String infr[] = {"Amazon", "GCP","Azure","SauceLabs", "Ali Baba", "Amazon", "GCP","Azure", "Amazon", "GCP","Azure"};
		
		System.out.println("******** hashset ************");
		
		String str="";
		
		Set<String> hs = new HashSet<>();
		
		Set<String> hs1 = new HashSet<>();
		
		for(String ele:infr) {
			
			if(!hs.contains(ele)) {
				hs.add(ele);
				
			}
			else {
				hs1.add(ele);
			}
			
			// using this logic we are getting duplicate element 2 time which is not good approach
			/*
			if(hs.add(ele)==true) {
				
			}else {
				str+=ele;
				str+=" ";
			}
			*/
		}
		System.out.println(hs1);
		
		//---------------------------------------------------------------------------------------------
		
		System.out.println("---- Hash Map -----------");
		
		String inf[] = {"Amazon", "GCP","Azure","SauceLabs", "Ali Baba", "Amazon", "GCP","Azure", "Amazon", "GCP","Azure"};
		
		Map<String, Integer> hm = new HashMap<>();
		
		for(String ele:inf) {
			if(hm.containsKey(ele)) {
				hm.put(ele,hm.get(ele)+1);
			}
			else {
				hm.put(ele, 1);
			}
		}
		
		
		Set<Entry<String, Integer>> obj = hm.entrySet();
		
		for(Entry<String, Integer> ele:obj) {
			if(ele.getValue()>1) {
				System.out.println(ele.getKey());
			}
		}
		
		//----------------------------------------------------
		System.out.println("-------Streams----------------");
		
		String in[] = {"Amazon", "GCP","Azure","SauceLabs", "Ali Baba", "Amazon", "GCP","Azure", "Amazon", "GCP","Azure"};
			
		Set<String> hsq = new HashSet<>();
		
		List<String> lis = Arrays.asList(in);
		
		// !hsq.add(e) ---- if(not there true --- add it) ----else (false ---get all duplicate one ) --- that duplicate will be
		// in collectors --- Amazon, Amazon --- like this -- again convert into set -- and avoid same same element
		
		Set<String> dupSet = lis.stream().filter(e->!hsq.add(e)).collect(Collectors.toSet());
		System.out.println(dupSet);
		
//		List<String> dupSet = lis.stream().filter(e->!hsq.add(e)).collect(Collectors.toList());  // only to see result using list what element showing?
		
		
		
		//-----------------------------------------------------------------------
		System.out.println("------Stream using frequency --------");
		
		Set<String> eleList =lis.stream().filter(e ->Collections.frequency(lis, e)>1).collect(Collectors.toSet());
		System.out.println(eleList);
		
//		c the collection in which to determine the frequency of o the object whose frequency is to be determined 
	//  lis --- is the collection list ---in which i want to check frequency --- e is element one by one in that collection
		
	}
}
