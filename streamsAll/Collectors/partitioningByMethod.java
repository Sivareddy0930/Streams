package streamsAll.Collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class partitioningByMethod {

	public static void main(String[] args) {
		
		Stream<String> s=Stream.of("siva","is","a","good","boy","in","the","collage");
		
		Map<Boolean,List<String>> output=s.collect(Collectors.partitioningBy(a->a.length()>2));
		System.out.println(output);
		
	}

}
