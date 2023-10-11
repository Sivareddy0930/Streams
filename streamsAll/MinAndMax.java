package streamsAll;

import java.util.*;
import java.util.stream.*;

public class MinAndMax {
	
	//Non terminal or intermediate methods.
	//filter(Predicate),map(Function),flatMap(Function),sorted(),sorted(Comparetor),distinct(),limit(long l),skip(long l).
	
	//remainin all are terminal methods.

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

		
		//min and max values are based on it sorted order but not based on its values.
		
		//according to natural sorting order.
		
		Integer i=al.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("MIN:-"+i);
		
		Integer j=al.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("MAX:-"+j);
		
		
		//according to custom sorting order.
		//or descending oredr
		
				Integer k=al.stream().min((a,b)->-a.compareTo(b)).get();
				System.out.println("MIN:-"+k);
				
				Integer l=al.stream().max((a,b)->-a.compareTo(b)).get();
				System.out.println("MAX:-"+l);

		
		
				
							
							
	}

}
