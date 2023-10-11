package problemsUsingStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStrings {

	public static void main(String[] args) {
		//Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
		
		String arr[]= {"siva","punny","aunny","zunny","tunny","cunny","junny","runny","dunny"};
		
		Stream<String> sl=Arrays.stream(arr);
		
		List<String> s2=sl.sorted().collect(Collectors.toList());
		System.out.println(s2);
		//---------------------------------------------------------------
		Stream<String> s4=Arrays.stream(arr);
		List<String> s3=s4.sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		System.out.println(s3);
		//------------------------------------------------------------------------------------
		Stream<String> s5=Arrays.stream(arr);
		List<String> s6=s5.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(s6);
		
		

	}

}
