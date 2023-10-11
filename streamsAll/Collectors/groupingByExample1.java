package streamsAll.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class groupingByExample1 {

	public static void main(String[] args) {
		
		List<Employee> al=new ArrayList();
		
		al.add(new Employee(1,"siva",50000,"siva@gmail.com"));
		al.add(new Employee(2,"aunny",5000,"aunny@gmail.com"));
		al.add(new Employee(3,"siva",40000,"bunny@gmail.com"));
		al.add(new Employee(4,"funny",50000,"cunny@gmail.com"));
		al.add(new Employee(5,"dunny",40000,"dunny@gmail.com"));
		al.add(new Employee(6,"siva",70000,"eunny@gmail.com"));
		al.add(new Employee(7,"funny",20000,"funny@gmail.com"));
		al.add(new Employee(8,"siva",50000,"gunny@gmail.com"));
		al.add(new Employee(9,"hunny",70000,"hunny@gmail.com"));
		al.add(new Employee(10,"aunny",5000,"aunny1@gmail.com"));
		//find the no.of times a name is repeated. 
		
		Map<String,Long> result=al.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		System.out.println(result);
		
		

	}

}

