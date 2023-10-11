package streamsAll.Collectors;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class minByMethod {

	public static void main(String[] args) {
		
		Stream<Integer> al=Stream.of(1,3,2,4);
			
			Optional min=al.collect(Collectors.minBy((a,b)->a.compareTo(b)));	
			
			System.out.println(min.get());
			

			Stream<Integer> a2=Stream.of(1,3,2,4);
			Optional max=a2.collect(Collectors.maxBy((a,b)->a.compareTo(b)));	
			
			System.out.println(max.get());
		

	}

}
