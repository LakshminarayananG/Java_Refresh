package basics;

import java.util.HashMap;

public class DuplicateCharacterInArray {

	public static void main(String[] args) {
		
		
	//Given an array of characters, show the number of characters that are duplicated	
		
		
		
		
		char[] array= {'a','r','v','r','b','s','t','o','p'};
		int length=array.length;
		HashMap<Character,Integer> dupvalues= new HashMap<Character,Integer>();
		
		
		for (char c : array) {
			if(dupvalues.containsKey(c)) {
				dupvalues.put(c,dupvalues.get(c)+1);
			}
			else {
				dupvalues.put(c,1);
			}
		}

		for(Object obj:dupvalues.keySet()) {
			if(dupvalues.get(obj)>1) {
				System.out.println("The value "+obj+" is duplicated "+dupvalues.get(obj)+" times");
			}
		}
		
	}

}
