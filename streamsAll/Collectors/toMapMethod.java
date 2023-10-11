package streamsAll.Collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//Employee class is in another file.in same package.
//classname is Employee

public class toMapMethod {

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
			
					
			Map<Integer,String> m1=al.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
			System.out.println(m1);                     // Collectors.toMap(x -> x.getId(), x -> x.getName()));//internal mechanism.
				

	}

}
