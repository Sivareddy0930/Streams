package streamsAll.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;


 class Employee1 {
	

	private int id;
	private String name;
	private int salary;
	private String email;
	
	
	
	public Employee1(int id, String name, int salary, String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + "]";
	}
	
	//-----------------------------------------------------
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return Objects.equals(name, other.name);
	}
	
	
}


public class groupingBy2 {

	public static void main(String[] args) {
		
		List<Employee1> al=new ArrayList();
		
		al.add(new Employee1(1,"siva",50000,"siva@gmail.com"));
		al.add(new Employee1(2,"aunny",5000,"aunny@gmail.com"));
		al.add(new Employee1(3,"bunny",40000,"bunny@gmail.com"));
		al.add(new Employee1(4,"cunny",50000,"cunny@gmail.com"));
		al.add(new Employee1(5,"dunny",40000,"dunny@gmail.com"));
		al.add(new Employee1(6,"eunny",70000,"eunny@gmail.com"));
		al.add(new Employee1(7,"funny",20000,"funny@gmail.com"));
		al.add(new Employee1(8,"gunny",50000,"gunny@gmail.com"));
		al.add(new Employee1(9,"hunny",70000,"hunny@gmail.com"));
		
		al.add(new Employee1(10,"aunny",5000,"aunny1@gmail.com"));
		
		
		
		
		
		
		
		
		//group employees based on there salary.
		//before example we get output but with salary of 5000 i got two employees and name is same .now i consider that those two employee 
		//with same name  is duplicate(or)employee entry with duplicate.now i don't want duplicates.
		//i am considering name as parameter if both names same then employee is same.

		//groupingBy with single parameter.
		//Syntax:- Map<K, List<T>>  groupingBy(Function<? super T, ? extends K> classifier)
		
		
		// Map<K,D>   groupingBy(Function<? super T, ? extends K> classifier, Collector<? super T, A, D> downstream)
		//this is overloaded method of groupingBy with single parameter method.
		//D is any type like it return in form of set<> or queue<>
		
		//groupingBy with Multiple parameter.
		//Classification function passed to groupingBy method is the method specified as emp->emp.getSalary()
		
		
		//groupingBy with Single parameter====> Function.

		Map<Integer,List<Employee1>> result1=al.stream().collect(Collectors.groupingBy(emp->emp.getSalary()));
		System.out.println(result1);
		
		
		
		//groupingBy with Multiple parameter====> Function,Collector or downstream.(or) it can be any collection type like set,linkedList....
		
		Map<Integer,Set<Employee1>> result=al.stream().collect(Collectors.groupingBy(Employee1::getSalary,Collectors.toSet()));
		System.out.println(result);
		
		

		

		

	}

}
