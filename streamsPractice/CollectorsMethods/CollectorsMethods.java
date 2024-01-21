package streamsPractice.CollectorsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsMethods {
	
	public static void main(String[] args) {
		
		Stream<Double> al=Stream.of(1.2,2.2,3.2,4.2);
//		System.out.println(al);
		
		Double d=al.collect(Collectors.averagingDouble(n->n));
		System.out.println(d);
		
		int arr[]= {1,2,3,4};
		double d1=Arrays.stream(arr).boxed().collect(Collectors.averagingInt(Integer::intValue));
//		Arrays.stream(arr) returns intStream
//		.boxed()  // Convert IntStream to Stream<Integer>
		System.out.println(d1);
		
		long l=Arrays.stream(arr).count();
		//we are counting from intStream
		System.out.println(l);
		
		long l1=Stream.of(1,2,3,4,5).count();
		//we are counting from Stream
		System.out.println(l1);
		
		long l2=Stream.of(1,2,3,4,5,6,7,8,9,10).collect(Collectors.counting());
		//we are counting from Stream using collectors methods.
		System.out.println(l2);
		
		
		
		
	}

}
