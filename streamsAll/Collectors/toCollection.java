package streamsAll.Collectors;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class toCollection {

	public static void main(String[] args) {
		
		Stream<Integer> a=Stream.of(1,2,3,4,5,9,7,5,8,1,4);
		
		LinkedList<Integer> a1=a.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(a1);
		
		//toCollection(Supplier<C> collectionFactory) 
		
		
		Stream<Integer> y=Stream.of(1,2,3,4,5,9,7,5,8,1,4);
		LinkedList<Integer> a2=y.collect(Collectors.toCollection(()->new LinkedList()));
		System.out.println(a2);
		
		
		Stream<Integer> z=Stream.of(1,2,3,4,5,9,7,5,8,1,4);
		TreeSet<Integer> a3=z.collect(Collectors.toCollection(()->new TreeSet()));
		System.out.println(a3);
		
		
		
		
		
	}

}
