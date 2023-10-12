package streamsAll.Collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class partitioningByMethod {

	public static void main(String[] args) {
		
		////Map<Boolean,List<T>>    partitioningBy(Predicate<? super T> predicate)
		Stream<String> s=Stream.of("siva","is","a","good","boy","in","the","collage");
		
		Map<Boolean,List<String>> output=s.collect(Collectors.partitioningBy(a->a.length()>2));
		System.out.println(output);
		
		
		//type:2
		
		Stream<String> s1=Stream.of("siva","is","a","good","boy","in","the","collage");
		//Map<Boolean,D>    partitioningBy(Predicate<? super T> predicate, Collector<? super T,A,D> downstream)

		Map<Boolean,Long> output1=s1.collect(Collectors.partitioningBy(a->a.length()>2,Collectors.counting()));
		System.out.println(output1);
		
	}

}
