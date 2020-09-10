package basics;

import java.util.Arrays;

public class MaxProdOfTwo {

	public static void main(String[] args) {
	
		
		/*
		 * Given an array of Integers, find the maximum product of the 2 numbers in an
		 * array
		 */	
		

		int[] array= {4,2,19,89,12,6,-12,40,-150,4,65};
		Arrays.sort(array);
		int val=array.length;
		int val1=array[0];
		int val2=array[1];
		if(val1*val2>array[val-1]*array[val-2]) {
			System.out.println(val1*val2+ " is the max product and values are "+val1+ " and "+val2);
		}
		else {
			System.out.println(array[val-1]*array[val-2]+ " is the max product and values are "+array[val-1]+ " and "+array[val-2]);
		}
		
		
		
		
	}

}
