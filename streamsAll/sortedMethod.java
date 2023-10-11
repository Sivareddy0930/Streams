package streamsAll;

import java.util.*;
import java.util.stream.*;

public class sortedMethod {
	

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
		al.add(89);
		al.add(77);

			//i am adding 4 for ecah object and sorted in ascending order.
		//Default sorting...........................................................
		List l1=al.stream().map(a->a+4).sorted().collect(Collectors.toList());
		System.out.println(l1);
		
		//Default sorting...using comparator....compare method.
		//here we use compareTo() method inside of Comapre() method
		//comapre(i,j){i.compareTo(j);}======>(i,j)->i.compareTo(j)
		List l3=al.stream().map(a->a+4).sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
		System.out.println(l3);
							
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		//custom sorting oredre using comparator.
		//it has comapre method.
		//sorted(Comparator)
		
		//(i,j)->(i<j)?+1:(i>j)?-1:0 =========> this is pure lambda representation of compare() method.
		
		//model:-1
				
		List l2=al.stream().map(a->a+4).sorted((i,j)->(i<j)?+1:(i>j)?-1:0).collect(Collectors.toList());
		System.out.println(l2);
		//descending order
		
		
		//----------------------------
		//model:-2
		//(i,j)->-i.compareTo(j) ==> this compare method with also compareTo() inside.
		List l4=al.stream().map(a->a+4).sorted((i,j)->-i.compareTo(j)).collect(Collectors.toList());
		System.out.println(l4);
		
		//model:-3
				//(i,j)->j.compareTo(i) ==> this compare method with also compareTo() inside.
				List l5=al.stream().map(a->a+4).sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
				System.out.println(l5);
							
		
							
	}

}
