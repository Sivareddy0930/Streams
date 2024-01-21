package streamsPractice.Example2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTasks {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(103, "cunny", 30, "female", "Java", 2020, 50000.00));
		list.add(new Employee(104, "bunny", 39, "male", "Java8", 2000, 200000.01));
		list.add(new Employee(105, "aunny", 25, "female", "springBoot", 2012, 100000.1234));
		list.add(new Employee(101, "siva", 23, "male", "Java", 2024, 75000.4444));
		list.add(new Employee(102, "dunny", 44, "male", "Java8", 2023, 40000.90));
		
		
		// 1) Given a list of employees, write a Java 8 code to count the number of employees in each department?
	
		Map<String, Long> count =list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(count);
		
		// 2) Given a list of employees, find out the average salary of male and female employees?
		
		  Map<String,Double> group= list.stream().collect(Collectors.groupingBy(Employee::getGender ,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(group);
		
	   // 3)  Write a Java 8 code to get the details of highest paid employee in the organization from the given list of employees?
		
//		List<Employee> topSalary = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(1).collect(Collectors.toList());
//		Optional<Employee> topSalary = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();
		Optional<Employee> topSalary = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(topSalary.get());
		
		// 4) Write the Java 8 code to get the average age of each department in an organization?
			
		 Map<String,Double> averageAge= list.stream().collect(Collectors.groupingBy(Employee::getDepartment ,Collectors.averagingInt(Employee::getAge)));
			System.out.println(averageAge);
		
		// 5) Given a list of employees, how do you find out who is the senior most employee in the organization?
//			Optional<Employee> seniorMostEmployeeWrapper=list.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
			Optional<Employee> seniorEmployee=list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
			System.out.println(seniorEmployee.get());
			
		// 6) Given a list of employees, get the details of the most youngest employee in the organization?
			
			Optional<Employee> youngestEmployee=list.stream().sorted(Comparator.comparing(Employee::getAge)).findFirst();
			System.out.println(youngestEmployee);
			
		// 7)  How do you get the number of employees in each department if you have given a list of employees?
			
			 Map<String, Long> numberOfEmployeesInDepartment= list.stream().collect(Collectors.groupingBy(Employee::getDepartment ,Collectors.counting()));
				System.out.println(numberOfEmployeesInDepartment);
				
		// 8) Given a list of employees, find out the number of male and female employees in the organization?
				
				 Map<String, Long> numberOfMaleAndFemale= list.stream().collect(Collectors.groupingBy(Employee::getGender ,Collectors.counting()));
					System.out.println(numberOfMaleAndFemale);
	}

}
