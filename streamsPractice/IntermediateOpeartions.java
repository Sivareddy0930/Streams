package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntermediateOpeartions {
	
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(777);
		al.add(881);
		al.add(100);
		al.add(200);
		al.add(577);
		al.add(623);
		al.add(777);
		al.add(881);
		
		List<Integer> list = al.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(list);
		
		Set<Integer> set = al.stream().map(n->n+1).collect(Collectors.toSet());
		System.out.println(set); 
		
		List<Integer> list1 = al.stream().filter(n->n%2==0).limit(2).collect(Collectors.toList());
		System.out.println(list1);
		
		List<Integer> list2 = al.stream().filter(n->n%2==0).skip(2).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3 = al.stream().distinct().collect(Collectors.toList());
		System.out.println(list3);
		
		List<Integer> sort = al.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
		
		List<Integer> sort1 = al.stream().sorted((x,y)-> x.compareTo(y)).collect(Collectors.toList());
		//(x,y)-> x.compareTo(y) represent natural sorting order.
		//(i,j)-> (i>j)? +1 : (i<j) ? -1 : 0
		System.out.println(sort1);
		
		
		
		
		//Custom sorting Order.
		List<Integer> sort2 = al.stream().sorted((i,j)-> (i>j)? -1 : (i<j)?+1:0).collect(Collectors.toList());
		
		System.out.println(sort2);
		
		
		//Custom sorting Order.
				List<Integer> sort3 = al.stream().sorted((i,j)->- i.compareTo(i)).collect(Collectors.toList());
				
				System.out.println(sort3);
		
		//flatMap
				
				
				List<List<String>> arrayList=Arrays.asList(
						Arrays.asList("aunny","bunny"),Arrays.asList("cunny","dunny"),Arrays.asList("eunny","funny")
						);
				
				System.out.println(arrayList);
				
				List<String> newList=arrayList.stream().flatMap(listObj -> listObj.stream()).collect(Collectors.toList());
				
				System.out.println(newList);
		
		
	}

}
