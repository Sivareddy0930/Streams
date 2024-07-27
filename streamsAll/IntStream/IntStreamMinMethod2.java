package streamsAll.IntStream;

import java.util.*;
import java.util.stream.*;

public class IntStreamMinMethod2 {

	public static void main(String[] args) {
		
		
		
		Stream<Integer> a=Stream.of(1,2,3,4);
		
		OptionalInt op=a.mapToInt(Integer::valueOf).min();
				
		
		System.out.println(op);
		System.out.println(op.getAsInt());
		
		
		
		Stream<Integer> a1=Stream.of(1,2,3,4);
		int op1=a1.mapToInt(Integer::intValue).min().orElse(0);
		
		
		System.out.println(op1);
		
		
							
							
	}

}
