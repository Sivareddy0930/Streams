package streamsAll;

import java.util.*;
import java.util.stream.*;

public class sortedMethodwithStings {
	

	public static void main(String[] args) {
		
		ArrayList<String> al =new ArrayList();
		al.add("siva");
		al.add("chinny");
		al.add("bunny");
		al.add("eunny");
		al.add("funny");
		al.add("siva");
		al.add("aunny");
		al.add("tunny");
		al.add("qunny");
		al.add("runny");

			//sorted in ascending order.
		//Default sorting...........................................................
		List<String> l1= al.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		
		//Default sorting...using comparator....compare method.
		//here we use compareTo() method inside of Comapre() method
		//comapre(i,j){i.compareTo(j);}======>(i,j)->i.compareTo(j)
		List l3=al.stream().sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
		System.out.println(l3);
							
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		//custom sorting oredre using comparator.
		//it has comapre method.
		//sorted(Comparator)
		
		//(i,j)->(i<j)?+1:(i>j)?-1:0 =========> this is pure lambda representation of compare() method.
		
		//model:-1
				
//		List l2=al.stream().sorted((i,j)->(i<j)?+1:(i>j)?-1:0).collect(Collectors.toList());
//		System.out.println(l2);
		//*******************This approch not appliacble for Strings. we have to use comapteTo()
		//descending order
		
		
		//----------------------------
		//model:-2
		//(i,j)->-i.compareTo(j) ==> this compare method with also compareTo() inside.
		List l4=al.stream().sorted((i,j)->-i.compareTo(j)).collect(Collectors.toList());
		System.out.println(l4);
		
		//model:-3
				//(i,j)->j.compareTo(i) ==> this compare method with also compareTo() inside.
				List l5=al.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
				System.out.println(l5);
							
		
							
	}

}
