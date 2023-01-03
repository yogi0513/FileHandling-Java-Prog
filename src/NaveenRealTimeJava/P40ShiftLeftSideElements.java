package NaveenRealTimeJava;

import java.util.Arrays;
import java.util.LinkedList;

//Shift All Zero Elements to Right Side of the Array 

public class P40ShiftLeftSideElements {
	
	private static int[] shiftZeroToRight(int[] a) {
		
		if(a.length==1) {
			return a;
		}
		int newArr [] = new int[a.length];
		int count=0;
		for(int ele:a) {
			if(ele!=0) {
				newArr[count]=ele;
				
				// for understanding we can print newArr[count]
				System.out.println(newArr[count]);
				count++;
			}
		}

		return newArr;
	}
	
	

	public static void main(String[] args) {
		
		int [] ar = new int [] {1,0,2,0,3,0,0,0}; //1 2 3 0 0 0 0 0 
		
		System.out.println(Arrays.toString(shiftZeroToRight(ar)));
		
		
		//------------------------------------------------------

		Integer arr[] = {1,2,3,4,5};
		
		int k=3;
		
		// output should be int arr = 3,4,5,1,2  
		
		LinkedList<Integer> li = new LinkedList<>(); 
		LinkedList<Integer> li2 = new LinkedList<>(); 
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k || arr[i]>=k) {
				li.add(arr[i]);
				
			}
			else if(arr[i]<k) {
				li2.add(arr[i]);
			}
		}
		
		li.addAll(li2);
		System.out.println(li);
	}
}
