package streamsAll.Collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class toCollectionMethod {

	public static void main(String[] args) {
		
	
		String s[]= {"siva","munny","cunny","bunny","tunny"};
		
		//Specific type of subtype Collection to use is specified to the collector using the collectionFactory input parameter which is a Supplier functional interface. 
		//A Supplier’s task is to supply objects of a given type. In this case, the supplier passed to the toCollection() method needs to 'supply' a concrete Collection instance in order for the collector to work.
			
		LinkedList<String> s1=Arrays.stream(s).collect(Collectors.toCollection(()->new LinkedList()));
			System.out.println(s1);
			
						
	}

}
