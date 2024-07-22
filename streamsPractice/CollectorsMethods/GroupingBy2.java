package streamsPractice.CollectorsMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import streamsAll.Collectors.Employee;


public class GroupingBy2 {
	
	public static void main(String[] args) {
		List<Employee> al=new ArrayList<>();
		
		al.add(new Employee(1,"siva",50000,"siva@gmail.com"));
		al.add(new Employee(2,"aunny",5000,"aunny@gmail.com"));
		al.add(new Employee(3,"bunny",40000,"bunny@gmail.com"));
		al.add(new Employee(4,"cunny",50000,"cunny@gmail.com"));
		al.add(new Employee(5,"dunny",40000,"dunny@gmail.com"));
		al.add(new Employee(6,"eunny",70000,"eunny@gmail.com"));
		al.add(new Employee(7,"funny",20000,"funny@gmail.com"));
		al.add(new Employee(8,"gunny",50000,"gunny@gmail.com"));
		al.add(new Employee(9,"hunny",70000,"hunny@gmail.com"));
		al.add(new Employee(10,"aunny",5000,"aunny1@gmail.com"));
		
		Map<Integer, List<Employee>> map=al.stream().filter(emp->emp.getSalary() > 50000).collect(Collectors.groupingBy(Employee::getSalary));
		System.out.println(map);
		
	
		
	}

}
