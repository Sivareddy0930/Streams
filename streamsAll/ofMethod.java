package streamsAll;

import java.util.*;
import java.util.stream.*;

public class ofMethod {
	
	//Non terminal or intermediate methods.
	//filter(Predicate),map(Function),flatMap(Function),sorted(),sorted(Comparetor),distinct(),limit(long l),skip(long l).
	
	//remainin all are terminal methods.

	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList();
		al.add(10);
		al.add(9);
		al.add(40);
		al.add(60);
		al.add(90);
		al.add(89);
	

				System.out.println("toArray():-");
				
						
						Integer[] g=al.stream().toArray(Integer[]::new);
						//In this case, you are using a method reference (Integer[]::new) to specify the type of the resulting array. This means that the toArray method will create a new array of type Integer[] to hold the elements from the stream.
						
						System.out.println(Arrays.toString(g));
						
						//now i want apply forEach method on array g[].
						
						//first convert array to stream by using of().
						
						Stream.of(g).forEach(System.out::println);
						//-------------------------------------------------------------------
						
						System.out.println("normal stream :-");
						
						Stream.of(10,20,30,40,50).forEach(System.out::println);
				
					
				
							
							
	}

}
