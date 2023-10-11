package problemsUsingStreams;

import java.util.ArrayList;
import java.util.Comparator;

public class SecondSmallestAndLargestLargest {

	public static void main(String[] args) {
		//Write a Java program to find the second smallest and largest elements in a list of integers using streams.
		
		ArrayList<Integer> al=new ArrayList();
		
		al.add(7);
		al.add(2);
		al.add(8);
		al.add(4);
		al.add(1);
		al.add(6);
		al.add(3);
		al.add(8);
		al.add(4);
		al.add(1);
		al.add(5);
		al.add(9);
		System.out.println(al);
		int secondSmallest=al.stream().distinct().sorted().skip(1).findFirst().get();
			
			System.out.println(secondSmallest);
			
		//----------------------------------------------
			//secondLargest.
			
			int secondLargest=al.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
			System.out.println(secondLargest);
			
			
	}

}
