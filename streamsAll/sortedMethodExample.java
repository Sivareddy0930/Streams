package streamsAll;

import java.util.*;
import java.util.stream.*;

public class sortedMethodExample {
	

	public static void main(String[] args) {
		
		ArrayList<String> al =new ArrayList();
		al.add("A");
		al.add("AA");
		al.add("AAAAAA");
		al.add("AA");
		al.add("AAAA");
		al.add("AAA");
		
			// i want to sort based on length of string and if length of two strings is same then sort it based on naturalsorting order.
			//solution:-
		//Here custom sorting is required.
		
		
		Comparator<String> c=(a,b)->{
			
			int l1=a.length();
			int l2=b.length();
			
			if(l1<l2)  return -1;
			else if(l1>l2) 	return +1;
			else  return a.compareTo(b);	
			
		};
//		If the length of a is less than the length of b, it returns -1 to indicate that a should come before b in the sorted order.
//		If the length of a is greater than the length of b, it returns 1 to indicate that a should come after b in the sorted order.
//		If the lengths are equal, it uses the a.compareTo(b) method to compare the lexicographic (dictionary) order of the strings. If a is less than b, it returns a negative value; if they are equal, it returns 0, and if a is greater than b, it returns a positive value.
		
		
		List<String>l= al.stream().sorted(c).collect(Collectors.toList());
		System.out.println(l);
	}

}
