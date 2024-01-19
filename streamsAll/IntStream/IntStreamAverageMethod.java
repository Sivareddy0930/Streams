package streamsAll.IntStream;

import java.util.*;
import java.util.stream.*;

public class IntStreamAverageMethod {
	
	//it is a primitive representation of int value .
	//it has additional methods like sum(),average(),range(),reduce(),collect(Collecters.joining()).........
	//here min and max is different from Stream method min and max.....no need to use comprator here.
	//this methods only applicable for IntStream types .but not for Stream types.
	
	
	//Similarly we have LongStream,DoubleStream .
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(9);
		al.add(40);
		al.add(60);
		al.add(90);
		
		Stream<Integer> a=Stream.of(1,2,3,4);
		
		OptionalDouble op=a.mapToInt(Integer::intValue).average();
				//mapToInt() method return type is IntStream so we can use method like average().
		
		
		
		//Here average() method return type is OptionalDouble
		System.out.println(op);
		//to retrieve data from Optional types we use method like getAsInt(),getAsDouble().
		System.out.println(op.getAsDouble());
		
		//------------------------------------------------------------------------------------------------
		System.out.println();
		//we can use orElse() at last to provide alternative value .
		
		//orElse() applicable for only Optional Return Types.
		//Here average() method return type is OptionalDouble so we can use orElse() here.
		
		Stream<Integer> a1=Stream.of(1,2,3,4);
		double op1=a1.mapToInt(Integer::intValue).average().orElse(0.0);
		
		System.out.println(op1);
		
		
							
							
	}

}
