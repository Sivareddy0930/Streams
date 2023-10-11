package streamsAll.IntStream;

import java.util.*;
import java.util.stream.*;

public class IntStreamAverageMethod {
	
	//it is a primitivr reprisenntation of int value .
	//it has additional methods like sum(),average(),range(),reduce(),collect(Collecters.joining()).........
	//here min and max is different from Stream method min and max.....no need to use comprator here.
	//this methods only appliacble for IntStream types .but not for Stream types.
	
	
	//simmilerly we have LongStream,DoubleStream .
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(9);
		al.add(40);
		al.add(60);
		al.add(90);
		
		Stream<Integer> a=Stream.of(1,2,3,4);
		
		OptionalDouble op=a.mapToInt(Integer::intValue).average();
				//mapToInt() method returntype is IntStream so we can use method like average().
		//Here avarage() method return type is OptionalDouble
		System.out.println(op);
		//to retrive data from Optional types we use method like getAsInt(),getAsDouble().
		System.out.println(op.getAsDouble());
		
		//------------------------------------------------------------------------------------------------
		
		//we can use orElse() at last to provied alternative value .
		
		//orElse() applicable for only Optional Return Types.
		//Here avarage() method return type is OptionalDouble so we can use orElse() here.
		
		Stream<Integer> a1=Stream.of(1,2,3,4);
		double op1=a1.mapToInt(Integer::intValue).average().orElse(0.0);
		
		System.out.println(op1);
		
		
							
							
	}

}
