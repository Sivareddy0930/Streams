package problemsUsingStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
	 
		
		List<Integer> al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		
		int sumofEvens=al.stream().filter(a->a%2==0).mapToInt(Integer::valueOf).sum();
		System.out.println(sumofEvens);
		
		int sumofOdds=al.stream().filter(a->a%2 !=0).mapToInt(Integer::valueOf).sum();
		System.out.println(sumofOdds);
		
	
		
	 

	}

}
