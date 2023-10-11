package streamsAll.Collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class toSetMethod {

	public static void main(String[] args) {
		
	
			
			
			Stream<Integer> a=Stream.of(7,8,9,4,1,3,2,4);
			Set<Integer> a1=a.collect(Collectors.toSet());
			
				System.out.println(a1);
				
	}

}
