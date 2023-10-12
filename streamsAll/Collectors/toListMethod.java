
package streamsAll.Collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class toListMethod {

	public static void main(String[] args) {
		
	
			
			
			Stream<Integer> a=Stream.of(1,3,2,4,7,8,9,4);
			List<Integer> a1=a.collect(Collectors.toList());
			
				System.out.println(a1);
				
	}

}
