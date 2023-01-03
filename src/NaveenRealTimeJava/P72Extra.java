package NaveenRealTimeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class P72Extra {
	
	public static void main(String[] args) {
		
		//----------------------------------------------------------------------------
		   String input = "I am in Adobe";   //-- interview q in UST
		   String neinput=input.toLowerCase();
		   
		
		   String out = "";
		   
		String [] arr = neinput.split(" ");
		  
			for(String ele:arr) {
				
				for(int i=0;i<ele.length();i++) {
					if(!out.contains(String.valueOf(ele.charAt(i)))) {
						out+=ele.charAt(i);
					}
				}

				out+=" ";
				
			}
			System.out.println(out);
		
		
		   
		   //--------------------------------------------------------------
		   
		   String str = "Kobe Is is The the best player In in Basketball basketball game .";
		   List<String> list = new ArrayList<>(Arrays.asList(str.split("\\s")));

		   // the actual operation
		   TreeSet<String> seen = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		   list.removeIf(s -> !seen.add(s));

		   // just for debugging
		   System.out.println(String.join(" ", list));
		   
		   String sc =null;
		   String cs = null;
		   System.out.println(sc.equals(cs));
		   
		System.out.println(null==null);
		
	}
}
