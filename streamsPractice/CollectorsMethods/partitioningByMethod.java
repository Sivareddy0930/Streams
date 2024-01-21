package streamsPractice.CollectorsMethods;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class partitioningByMethod {

	public static void main(String[] args) {
		
		
		Stream<String> s=Stream.of("siva","is","a","good","boy","in","the","collage");
		
		Map<Boolean,List<String>> map=s.collect(Collectors.partitioningBy(n -> n.length() > 2));
		System.out.println(map);
		
		Stream<String> s1=Stream.of("siva","is","a","good","boy","in","the","collage");

		Map<Boolean,Long> map1=s1.collect(Collectors.partitioningBy(n -> n.length() > 2,Collectors.counting()));
		System.out.println(map1);
		
		
	}

}
