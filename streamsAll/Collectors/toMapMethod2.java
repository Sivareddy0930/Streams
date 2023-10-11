package streamsAll.Collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Employee class is in another file.in same package.
//classname is Employee

public class toMapMethod2 {

	public static void main(String[] args) {
		
			List<Employee> al=new ArrayList();
			
			al.add(new Employee(1,"siva",50000,"siva@gmail.com"));
			al.add(new Employee(2,"aunny",5000,"aunny@gmail.com"));
			al.add(new Employee(3,"bunny",40000,"bunny@gmail.com"));
			al.add(new Employee(4,"cunny",20000,"cunny@gmail.com"));
			al.add(new Employee(5,"dunny",10000,"dunny@gmail.com"));
			al.add(new Employee(6,"eunny",70000,"eunny@gmail.com"));
			al.add(new Employee(7,"funny",20000,"funny@gmail.com"));
			al.add(new Employee(8,"gunny",10000,"gunny@gmail.com"));
			al.add(new Employee(9,"hunny",70000,"hunny@gmail.com"));
			
			al.add(new Employee(10,"aunny",15000,"aunny1@gmail.com"));
			
			//convert to map using streams.
			
			
			
			//when we are making map using  toMap(). what if  we are got duplicated value as a key ? .
			
		/*	Map<String,Integer> m2=al.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
			
			System.out.println(m2);*/
			
			
			//Exception in thread "main" java.lang.IllegalStateException: Duplicate key aunny (attempted merging values 5000 and 15000)
			//Because aunny is already there.Here we are taking names as Keys.key must not be duplicte.
			//to avoid that .....................
			
			//(oldValue, newValue) -> oldValue ==> If the key is duplicated, do you prefer oldKey or newKey
			
			//To solve the duplicated key issue above, pass in the third mergeFunction argument like this :
			
				Map<String,Integer> m3=al.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary,(oldvalue,newvalue)->oldvalue));
			
			System.out.println(m3);
	}

}
