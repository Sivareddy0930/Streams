package streamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapToInt2 {
	public static void main(String[] args) {

		
		int arr[]=Stream.of(1,2,3,4).mapToInt(n -> n.intValue()).toArray();
		
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		System.out.println(list);
		
		long l=Stream.of("10","20","30","40")
				.mapToInt(n ->Integer.parseInt(n)).sum();
		
		System.out.println(l);
	}

}
