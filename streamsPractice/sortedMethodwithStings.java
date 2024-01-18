package streamsPractice;

import java.util.*;
import java.util.stream.*;

public class sortedMethodwithStings {
	

	public static void main(String[] args) {
		
		ArrayList<String> al =new ArrayList();
		al.add("siva");
		al.add("chinny");
		al.add("bunny");
		al.add("eunny");
		al.add("funny");
		al.add("siva");
		al.add("aunny");
		al.add("tunny");
		al.add("qunny");
		al.add("runny");


		List<String> NaturalSort1=al.stream().sorted().collect(Collectors.toList());
							System.out.println(NaturalSort1);
		
		List<String> NaturalSort2=al.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
							System.out.println(NaturalSort2);
							
							
		List<String> CustomSort1=al.stream().sorted((a,b)-> -a.compareTo(b)).collect(Collectors.toList());
							System.out.println(CustomSort1);
		
		List<String> CustomSort2=al.stream().sorted((a,b)-> b.compareTo(a)).collect(Collectors.toList());
							System.out.println(CustomSort2);
		
							
	}

}
