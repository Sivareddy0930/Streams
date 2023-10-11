package streamsAll.Collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class countingMethod {

	public static void main(String[] args) {
		
	
			
			
			Stream<Integer> a1=Stream.of(1,3,2,4);
			long d1=a1.collect(Collectors.counting());
			
				System.out.println(d1);
				
	}

}
