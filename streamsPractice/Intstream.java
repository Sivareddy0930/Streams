package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Intstream {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(500);
		al.add(600);
		al.add(300);
		al.add(400);
	// return type of mapToInt(ToIntFunction) is IntStream.
		
	int arr[] =	al.stream().mapToInt(n -> n).toArray();
	System.out.println(Arrays.toString(arr));
	
	
		int value1 = al.stream().mapToInt(n -> n).findFirst().orElseThrow();
		System.out.println(value1);
		
		
		double value2 = al.stream().mapToInt(n -> n).average().orElse(0.00);
		System.out.println(value2);
		
		int value3 = al.stream().mapToInt(n -> n).max().getAsInt();
		System.out.println(value3);
		
		int value4 = al.stream().mapToInt(n -> n).min().getAsInt();
		System.out.println(value4);
		
		int value5 = al.stream().mapToInt(n -> n).sum();
		System.out.println(value5);
		
//		int value6 = al.stream().collect(Collectors.summingInt(n->n));
//		System.out.println(value6);
		
		 IntStream.range(0,9).forEach(System.out::println);
		 
		 System.out.println("sum of numbers:-"+IntStream.range(0,5).sum());
		 
	}

}
