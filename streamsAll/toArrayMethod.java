package streamsAll;

import java.util.*;
import java.util.stream.*;

public class toArrayMethod {
	
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
		al.add(20);
		al.add(90);
		al.add(30);
		al.add(50);
		al.add(20);
		al.add(90);
		al.add(89);
		al.add(77);

				System.out.println("toArray():-");
				
						Object[] gg=al.stream().toArray();
						//System.out.println(gg);
						System.out.println(Arrays.toString(gg));
						
						
						//---------------------------------------
						Integer[] g=al.stream().toArray(Integer[]::new);
						//In this case, you are using a method reference (Integer[]::new) to specify the type of the resulting array. This means that the toArray method will create a new array of type Integer[] to hold the elements from the stream.
						
						System.out.println(Arrays.toString(g));
				
					
				
							
							
	}

}
