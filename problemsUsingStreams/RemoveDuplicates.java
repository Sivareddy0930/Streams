package problemsUsingStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicates {

	public static void main(String[] args) {
	 
		
		List<Integer> al=new ArrayList();
		
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(9);
		
		
		System.out.println(al);
		List<Integer> newAL=al.stream().distinct().collect(Collectors.toList());
		System.out.println(newAL);
		
	
		
	 

	}

}
