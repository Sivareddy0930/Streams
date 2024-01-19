package streamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapToInt {
	public static void main(String[] args) {
//		Stream mapToInt(ToIntFunction mapper) returns an IntStream consisting of the results of applying the given function to the elements of this stream
		
		int arr[]=Stream.of(1,2,3,4).mapToInt(n -> n.intValue()).toArray();
		//converted form Integer to int type and stored in array.
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		//converted form int to Integer type and stored in List.
		System.out.println(list);
	}

}
