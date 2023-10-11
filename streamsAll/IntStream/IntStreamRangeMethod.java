package streamsAll.IntStream;

import java.util.*;
import java.util.stream.*;

public class IntStreamRangeMethod {
	
	//it is a primitivr reprisenntation of int value .
	//it has additional methods like sum(),average(),range(),reduce(),collect(Collecters.joining()).........
	//here min and max is different from Stream method min and max.....no need to use comprator here.
	//this methods only appliacble for IntStream types .but not for Stream types.
	
	
	//simmilerly we have LongStream,DoubleStream .
	public static void main(String[] args) {
		
		
//		Stream a=IntStream.range(0,10);//IntStream is the returntype.
		//Type mismatch: cannot convert from IntStream to Stream
		
//		IntStream b=Stream.of(1,2,3,4);//Stream.of() return type is Stream<Integer>
//		Type mismatch: cannot convert from Stream<Integer> to IntStream
		
		//-----------------------------------------------------------------------------
		
		IntStream a=IntStream.range(0,10);//it create Stream of integers between specified range.


			a.forEach(System.out::println);
							
							
	}

}
