package streamsAll;

import java.util.*;
import java.util.stream.*;

public class AllMethodswithFilter {
	
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
//		System.out.println(al);
		//Streams are used to process data.
		//Stream object is created by using stream().
		
		//filter(Predicate)
		
				Stream s=al.stream().filter(a->a>50);//it is a stream object so when we print it we get address.
				System.out.println(s);//java.util.stream.ReferencePipeline$2@1cd072a9
		
		//collect()

				List<Integer> l=al.stream().filter(a->a>50).collect(Collectors.toList());
				System.out.println(l);//[60, 90, 80, 70]
		
		//----------------------------------------------------------------------------
		
		
		//allMatch(predicate)
				boolean b=al.stream().filter(a->a>50).allMatch(a->a%2==0);
				System.out.println(b);//false 
		//Because allMatch checks every element satisfying condition or not
		
		//anyMatch(predicate)
				boolean b1=al.stream().filter(a->a>50).anyMatch(a->a%2==0);
				System.out.println(b1);//true 
		//Because anyMatch checks atleast one element satisfying condition or not.
		
		//noneMatch(predicate)
				boolean b2=al.stream().filter(a->a>50).noneMatch(a->a%2==0);
				System.out.println(b2);//false 
		//Because Returns whether no elements of this stream match the provided predicate.
		
		//------------------------------------------------------------------------	//collect()
		//collect
				List<Integer> l1=al.stream().filter(a->a>50).collect(Collectors.toList());
				System.out.println(l1);//[60, 90, 80, 70]
		
		
		//long count()==>return type is long.
				long c=al.stream().filter(a->a<50).count();
				System.out.println(c);
				
				
		//--------------------------------------------------------------
				System.out.println("distinct:-");
		//distinct()
				al.stream().distinct().forEach(a->System.out.println(a));
				//it return only different elements.(or) unique elements.
		//---------------------------------------------------------
				System.out.println("ForEach:-");
		//forEach(Consumer)
				al.stream().filter(a->a<50).forEach(a->System.out.println(a));
				al.stream().filter(a->a<50).forEach(System.out::println);//Both are same
				
		//findFirst()
				Optional ff=al.stream().filter(a->a%2 !=0).findFirst();
				System.out.println(ff);
				//return first element 
				
		//findAny()
				Optional ff1=al.stream().filter(a->a%2 !=0).findAny();
				System.out.println(ff1);
				//return any element.
				
		//flatMap()
				//-----
		//------------------------------------------------------
		System.out.println("Limit must be 5:-");
		//limit(long l)
				al.stream().limit(5).forEach(a->System.out.println(a));
				
				//it restrict stream to take only mention no.of elements.
		//----------------------------------------------------------------------
				
				System.out.println("map:-");
		//map(Function)
				
				al.stream().map(a->a+2).forEach(System.out::println);
				
				System.out.println("min value:-");
				
		//min()
				Optional o=al.stream().min(Comparator.comparing(Integer::intValue));//it sort in ascending order. and then first min  value is 9.
				System.out.println(o);
				
				
				
				//The min values are evaluated based on the passed Comparator argument.
				
				System.out.println("max value:-");
				
		//max()
				//Optional o2=al.stream().max((i,j)->i.compareTo(j));
				Optional o2=al.stream().max(Comparator.comparing(Integer::intValue));//it sort in ascending order. and then first max value is 90.
				System.out.println(o2);
						
				
				//The largest values are evaluated based on the passed Comparator argument.
				
		//----------------------------------------------------------------------------------
				
				System.out.println("sorting:-");
				//sorted()
				
						
						List<Integer> p=al.stream().map(a->a+2).sorted().collect(Collectors.toList());//default natrual sorting order.
							System.out.println(p);
							
							
						List<Integer> p1=al.stream().map(a->a+2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());//custom sorting order.
							System.out.println(p1);
							//Comparator.reverseOrder() it retutn reverse of natural sorting order.
							
		//-----------------------------------------------
				System.out.println("skip:-");
				
				//skip(long l)
				

				List<Integer> p2=al.stream().map(a->a+2).sorted().skip(4).collect(Collectors.toList());//default natrual sorting order.
					System.out.println(p2);
					//it skip the specified number of elemnts.
					
					
					
		//----------------------------------------------------
					
				System.out.println("toArray():-");
				
						Object[] gg=al.stream().toArray();
//						System.out.println(gg);
						System.out.println(Arrays.toString(gg));
				
					
				
							
							
	}

}
