package problemsUsingStreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageofStream {

	public static void main(String[] args) {
	 Stream<Integer> at=Stream.of(1,2,3,4);
	 
	double value= at.mapToInt(Integer::valueOf).average().orElse(0.0);
	 
	System.out.println(value);//2.5
	 
	 
	 

	}

}
