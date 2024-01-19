package streamsAll;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapToInt {
	public static void main(String[] args) {
//		Stream mapToInt(ToIntFunction ) returns an IntStream consisting of the results of applying the given function to the elements of this stream
		// ToIntFunction  Represents a function that produces an int-valued result.
//		int arr[]=Stream.of(1,2,3,4).mapToInt(n -> n.intValue()).toArray();
		int arr[]=Stream.of(1,2,3,4).mapToInt(n -> n).toArray();
		//converted form Integer to int type and stored in array.
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		//converted form int to Integer type and stored in List.
		System.out.println(list);
		
		
		
		 List<Integer> integerList = Arrays.asList(10, 24, 54, 8,232);

         // Define the implementation of ToIntFunction interface
		 //it always  Represents a function that produces an int-valued result.

         ToIntFunction<Integer> multiplyByTwo = e -> e * 2;
         //here automatically converted to int with specified logic from Integer

         // apply the multiplyByTwo using mapToInt function and print each value
         int arr1[] = integerList.stream().mapToInt(multiplyByTwo).toArray();
         System.out.println(Arrays.toString(arr1));
	}

}
