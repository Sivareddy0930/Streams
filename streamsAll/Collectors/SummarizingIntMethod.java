package streamsAll.Collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SummarizingIntMethod {

	public static void main(String[] args) {
		
		Stream<Integer> i= Stream.of(1,2,3,4,5,6);
		
		IntSummaryStatistics s=i.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(s);
		
		System.out.println(s.getCount());
		System.out.println(s.getMax());
		System.out.println(s.getAverage());
		System.out.println(s.getSum());
		System.out.println(s.getMin());
		
		

	}

}
