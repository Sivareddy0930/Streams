package streamsAll.IntStream;

import java.util.*;
import java.util.stream.*;

public class IntStreamMaxMethod {
	
	//it is a primitivr reprisenntation of int value .
	//it has additional methods like sum(),average(),range(),reduce(),collect(Collecters.joining()).........
	//here min and max is different from Stream method min and max.....no need to use comprator here.
	//this methods only appliacble for IntStream types .but not for Stream types.
	
	
	//simmilerly we have LongStream,DoubleStream .
	public static void main(String[] args) {
		
		
		
		Stream<Integer> a=Stream.of(1,2,3,4);
		
		OptionalInt op=a.mapToInt(Integer::valueOf).max();
				//max method return type is OprtionalInt
		
		System.out.println(op);
		//to retrive data from Optional types we use method like getAsInt(),getAsDouble().
		System.out.println(op.getAsInt());
		
		//------------------------------------------------------------------------------------------------
		
		
		Stream<Integer> a1=Stream.of(1,2,3,4);
		int op1=a1.mapToInt(Integer::intValue).max().orElse(0);
		
		//orElse() applicable for only Optional Return Types.
				//Here max() method return type is OptionalInt so we can use orElse() here.

		
		System.out.println(op1);
		
		
							
							
	}

}
