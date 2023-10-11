package problemsUsingStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStartsWith {

	public static void main(String[] args) {
	 
		//find string starts with "s".
		Stream<String> s=Stream.of("siva","aunny","bunny","cunny","dunny","sunny","Shank","funny","gunny","hunny","Shiva");		
		
		System.out.println(s);
		
		long value=s.filter(str->str.toLowerCase().startsWith("s")).count();
		System.out.println(value);
		
	
		
	 

	}

}
