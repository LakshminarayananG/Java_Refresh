package basics;

import java.util.Arrays;

public class ArrayZeroes {

	public static void main(String[] args) {
		
	//Question	
		/*
		 * //Given an array of integers, move all the 0's present in the array to the
		 * end but keep the rest of elements in the same order
		 */
		
	int[] array= {1,4,0,45,0,3,2,5,6,90,0,10,56,0};
	int[] arr= new int[array.length];
	int length=array.length;
	int val=0;
	
	//Approach 1
	/*
	 * for (int i : array) { if(i!=0) { arr[val]=i; val++; } }
	 * 
	 * System.out.println(Arrays.toString(arr));
	 */
	
	
	//Approach 2
	for (int i : array) {
		if(i!=0) {
			array[val]=i;
			val++;
		}
	}

	for(int i=val;i<length;i++) {
		array[i]=0;
	}
	
	System.out.println(Arrays.toString(array));
	
	}

}
