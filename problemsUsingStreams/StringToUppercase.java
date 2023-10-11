package problemsUsingStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringToUppercase {

	public static void main(String[] args) {
	 Stream<String> at=Stream.of("siva","kunny","munny","cunny","tunny");
	 
	 List<String> l=at.map(a->a.toUpperCase()).collect(Collectors.toList());
	 
	 System.out.println(l);
	 

	}

}
