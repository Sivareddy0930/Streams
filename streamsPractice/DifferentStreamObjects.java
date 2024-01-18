package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class DifferentStreamObjects {
	
	
	public static void main(String[] args) {
		//empty Stream objects.
		

		List<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		if(l1 == null || l1.isEmpty()) {
			
			Stream.empty();//Returns an empty sequential Stream . to avoid returning null for streams with no element.
			System.out.println(Stream.empty().count());  //0
		}
		else {
			l1.stream().forEach(System.out::println);
		}
		
		
		System.out.println("--------------------------------------------------------");
		
		
		//collection
		
		Collection<Integer> l=Arrays.asList(1,2,3,4);
		
		l.stream().forEach(System.out::println);
		
		List<Character> list=Arrays.asList('a','b','c','d');
		
		list.stream().forEach(System.out::println);
		
		Set<Integer> set=new HashSet<>(l);
		set.stream().forEach(System.out::println);

		System.out.println("--------------------------------------------------------");

		//Arrays
		
		//Array can also be a source of a Stream
		
		Stream s = Stream.of("ok","okay","kk","okhay");
		s.forEach(System.out::println);
		
		int[] arr=new int[] {100,200,300,400};
		Arrays.stream(arr).forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------------");
		
		
		//builder()
		
		Stream sb=Stream.builder().add('t').add('v').add('s').add('y').build();
		sb.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------------");

		
		//generate()
		
				Stream sg=Stream.generate(()->"element").limit(10);
				sg.forEach(System.out::println);
				
				System.out.println("---------------------------------------------------------------------");

				
		//iterate()
				
				Stream si=Stream.iterate(1, n->n+2).limit(5);
				si.forEach(System.out::println);
			
				System.out.println("---------------------------------------------------------------------");
				
				
				
	}

}
