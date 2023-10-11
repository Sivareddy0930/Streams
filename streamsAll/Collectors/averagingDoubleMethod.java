package streamsAll.Collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class averagingDoubleMethod {

	public static void main(String[] args) {
		
		Stream<Double> al=Stream.of(1.2,2.2,3.2,4.2);
		Double d=al.collect(Collectors.averagingDouble(Double::valueOf));
//		Double d=al.collect(Collectors.averagingDouble(Double::doubleValue));  //both are same
			System.out.println(d);
			
			
			Stream<Integer> a1=Stream.of(1,3,2,4);
			Double d1=a1.collect(Collectors.averagingInt(Integer::intValue));
			//returns Double because average means double value.
				System.out.println(d1);
				
				Stream<Long> a2=Stream.of(1234L,3123L);
				Double d2=a2.collect(Collectors.averagingDouble(Long::valueOf));
				//returns Double because average means double value.
					System.out.println(d2);
					
					
					
	//---------------------------------------------------------------------------------------------------------
					
//					Collectors.averagingDouble is a built-in collector in Java's java.util.stream.Collectors class. It's used to calculate the average of elements in a stream of numeric values, such as double, float, or int.
//
//					Double::doubleValue is a method reference that specifies how to extract a double value from each Double object in the stream. In this case, it's simply calling the doubleValue() method on each Double object to get the underlying double value.
//
//					When you call collect(Collectors.averagingDouble(Double::doubleValue)), the averagingDouble collector processes each element in the stream, extracts the double value using the Double::doubleValue function, and calculates the sum of these double values.
//
//					It then divides the sum by the number of elements in the stream to compute the average.
//
//					Finally, the result is returned as a Double object, representing the average of the Double values in the stream.
	}

}
