package streamsAll.IntStream;

import java.util.*;
import java.util.stream.*;

public class IntStreamSumMethod {
	
	//it is a primitivr reprisenntation of int value .
	//it has additional methods like sum(),average(),range(),reduce(),collect(Collecters.joining()).........
	//here min and max is different from Stream method min and max.....no need to use comprator here.
	//this methods only appliacble for IntStream types .but not for Stream types.
	
	
	//simmilerly we have LongStream,DoubleStream .
	public static void main(String[] args) {
		
		
		
		Stream<Integer> a=Stream.of(1,2,3,4);
		
		int op=a.mapToInt(Integer::valueOf).sum();
				//sum method returns int
		System.out.println(op);
		
		//------------------------------------------------------------------------------------------------
		
		
		Stream<Integer> a1=Stream.of(1,2,3,4);
		int op1=a1.mapToInt(Integer::intValue).sum();
		
		System.out.println(op1);
		
		
							
							
	}

}
