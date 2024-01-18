package streamsPractice;

import java.util.*;
import java.util.stream.*;

public class TerminalOperations {
	

	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList();
		al.add(10);
		al.add(9);
		al.add(40);
		al.add(60);
		al.add(90);
		al.add(89);
		al.add(20);
		al.add(90);
		al.add(30);
		al.add(50);
		al.add(20);                     
		al.add(90);
		al.add(89);
		al.add(77);

		//filter(Predicate)
		
				Stream s=al.stream().filter(a->a>50);//it is a stream object so when we print it we get address.
				System.out.println(s);//java.util.stream.ReferencePipeline$2@1cd072a9
		        
				//forEach
				al.stream().forEach(System.out::println);		
				
				
				//collect
				List<Integer> list= al.stream().collect(Collectors.toList());
				System.out.println(list);
				
//				Integer min= al.stream().min((a,b)-> a.compareTo(b)).get();
				Integer min= al.stream().min(Comparator.comparingInt(Integer::intValue)).get();
				System.out.println(min);
				
//				Integer max= al.stream().max((a,b)-> a.compareTo(b)).get();
				Integer max= al.stream().max(Comparator.comparingInt(Integer::intValue)).get();
				System.out.println(max);
				
				
				//count 
				Long count= al.stream().count();
				System.out.println("Total count:-"+count);
				
				
				//allMatch
				boolean allmatch= al.stream().allMatch(n->n%2==0);
				System.out.println(allmatch);
				
				
				boolean anymatch= al.stream().anyMatch(n->n%2==0);
				System.out.println(anymatch);
				
				boolean nonematch= al.stream().noneMatch(n -> n==0);
				System.out.println(nonematch);
		
				
				//findFirst				
				Integer findFirst= al.stream().findFirst().get();
				System.out.println(findFirst);
				
				//findAny			
				Integer findAny= al.stream().filter(n -> n>50).findAny().get();
				System.out.println(findAny);
		
		
				
		
					
			
	}

}
