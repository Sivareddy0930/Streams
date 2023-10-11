package streamsAll.Collectors;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class summingIntMethod {

	public static void main(String[] args) {
		
		
		int a=Stream.of(4,4,4,4).collect(Collectors.summingInt(Integer::valueOf));
		System.out.println(a);
		
		List<Double> al=new ArrayList();
		al.add(2.2);
		al.add(2.3);
		al.add(2.4);
		al.add(2.5);
		
		Double d=al.stream().collect(Collectors.summingDouble(Double::doubleValue));
		
			System.out.println(d);
			
			
			Long a1=Stream.of(1234L,5678L).collect(Collectors.summingLong(Long::valueOf));
			System.out.println(a1);
			
			
		
		
		
	}

}
