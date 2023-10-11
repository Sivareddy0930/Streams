package problemsUsingStreams;

import java.util.ArrayList;
import java.util.Optional;

public class MaxAndMinValues {

	public static void main(String[] args) {
		//Write a Java program to find the maximum and minimum values in a list of integers using streams.
		
		ArrayList<Integer> al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(8);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(9);
		al.add(3);
		
		int l=al.stream().min((a,b)->a.compareTo(b)).get();
		
		System.out.println("ascending order min value:"+l);
		
		int l1=al.stream().max((a,b)->a.compareTo(b)).get();
		
		System.out.println("ascending order max value:"+l1);
		//------------------------------------------------------------
		
		int l2=al.stream().min((a,b)->-a.compareTo(b)).get();
		
		System.out.println("descending order min value:"+l2);
		
		int l3=al.stream().max((a,b)->-a.compareTo(b)).get();
		
		System.out.println("descending order max value:"+l3);
		
		
		
	}

}
