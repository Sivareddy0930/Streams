package streamsAll.Collectors;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class countingMethod {

	public static void main(String[] args) {
		
	
			
			
			Stream<Integer> a1=Stream.of(1,3,2,4);
			
			
			long d1=a1.collect(Collectors.counting());
			
				System.out.println(d1);
		
		
		
		
		Stream<Integer> a2=Stream.of(1,3,2,4);
		
		
		long d2=a2.mapToInt(Integer::valueOf).boxed().collect(Collectors.counting());
		//here i convert Integer-> int ->Integer->and then i collected.
					//  a2------->mapToInt()->Boxed()->counting
			System.out.println(d2);
			
			
			
			
			IntStream a3=IntStream.of(1,3,2,4);
			
			
			long d3=a3.boxed().collect(Collectors.counting());
			
			//here i convert int ->Integer->and then i collected.
							//  a2->Boxed()->counting
			
				System.out.println(d3);
		
				
	}

}
