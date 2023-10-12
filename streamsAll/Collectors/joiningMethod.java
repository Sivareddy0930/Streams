package streamsAll.Collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class joiningMethod {

	public static void main(String[] args) {
				
		Stream<String> s=Stream.of("siva","hunny","tunny","kunny");
		//Returns a Collector that concatenates the input elements into a String, in encounter order.
		String s1=s.collect(Collectors.joining(","));
							//joining(CharSequence delimiter)
		
				System.out.println(s1);
				
				
				
				
				Stream<String> k=Stream.of("siva","hunny","tunny","kunny");
				
				String k1=k.collect(Collectors.joining(",","[","]"));
									//joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
						System.out.println(k1);
	}

}
