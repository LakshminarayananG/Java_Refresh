package basics;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {

	public static void main(String[] args) {
		
		/*
		 * Given an array of Integers, find the peak element in the array. A peak
		 * element is an element that is greater than its neighbours
		 */
		
		
		
		List<Integer> peakelem=new ArrayList<Integer>();
		int[] array= {1,5,-5,-1,-2,7,9,12,34,7,23,4,57};
		
		for(int i=1;i<array.length;i++) {
			if(i!=array.length-1) {
				if(array[i]>array[i-1]&&array[i]>array[i+1]) {
				peakelem.add(array[i]);	
				}
			}
		}
		
		System.out.println("Peak elements are "+peakelem);

	}

}
