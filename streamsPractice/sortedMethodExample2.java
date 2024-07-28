package streamsPractice;

import java.util.*;
import java.util.stream.*;

public class sortedMethodExample2 {
	

	public static void main(String[] args) {
		
		ArrayList<String> al =new ArrayList();
		al.add("A");
		al.add("AA");
		al.add("AAAAAA");
		al.add("AA");
		al.add("AAAA");
		al.add("AAA");
		
			// i want to sort based on length of string and if length of two strings is same then sort it based on natural sorting order.
			
		Comparator<String> comObj=(a,b)->(a.length() < b.length()) ? -1 : (a.length() < b.length())? +1 : a.compareTo(b);
		
		List<String> sortedList=al.stream().sorted(comObj).collect(Collectors.toList());
		System.out.println(sortedList);
		
		
	}

}
