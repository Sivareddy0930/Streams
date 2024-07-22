package streamsPractice.Example1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentTasks {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		
		list.add(new Student("cunny",106,"java8",55.34));
		list.add(new Student("dunny",107,"java",59.44));
		list.add(new Student("eunny",108,"springboot",44.4444));
		list.add(new Student("aunny",109,"java8",40.01));
		list.add(new Student("funny",110,"springboot",66.68));
		list.add(new Student("siva",101,"java",94.4444));
		list.add(new Student("vamsi",102,"java8",90.21));
		list.add(new Student("vasu",103,"spring",96.88));
		list.add(new Student("naveen",104,"springboot",99.98));
		list.add(new Student("bunny",105,"java",60.64));
		
		
		// 1) Given a list of students, write a Java 8 code to partition the students who got above 60% from those who didn’t?
		
		Map<Boolean,List<Student>>	Result = list.stream().collect(Collectors.partitioningBy(s -> s.getPercentage() > 60));
		System.out.println(Result);
		
		// 2)  Given a list of students, write a Java 8 code to get the names of top 3 performing students?
		
		
		List<Student> top=list.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
		System.out.println(top);
		
		// 3)  Given a list of students, how do you get the name and percentage of each student?
		
		Map<String, Double> modified= list.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
		System.out.println(modified);
		
		// 4) Given a list of students, how do you get the subjects offered in the college?
		
//		Set<String> subjects=list.stream().map(studentobj -> studentobj.getSubject()).collect(Collectors.toSet());
		Set<String> subjects=list.stream().map(Student::getSubject).collect(Collectors.toSet());
		System.out.println(subjects);
		
		// 5) Given a list of students, write a Java 8 code to get highest, lowest and average percentage of students?
		
		
		DoubleStream high=list.stream().map(Student::getPercentage).mapToDouble(Double::doubleValue);
		
		System.out.println("Highest:"+high.max().getAsDouble());
		DoubleStream low=list.stream().map(Student::getPercentage).mapToDouble(Double::doubleValue);
		System.out.println("Lowest:"+low.min().getAsDouble());
		DoubleStream average=list.stream().map(Student::getPercentage).mapToDouble(Double::doubleValue);
		System.out.println("Average:"+average.average().getAsDouble());
		
		//                   (OR)
		System.out.println("------------------------------------------------------------------------------------");
		
	  DoubleSummaryStatistics Allresult = list.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
	  
		System.out.println("Highest:"+Allresult.getMax());
		System.out.println("Lowest:"+Allresult.getMin());
		System.out.println("Average:"+Allresult.getAverage());

		// 6) How do you get total number of students from the given list of students?
		
			Long count=list.stream().count();
			System.out.println("No .of Students ="+count);
			
			
			//Long studentCount = list.stream().collect(Collectors.counting());
			//System.out.println(studentCount);
		
		// 6) How do you get the students grouped by subject from the given list of students?
			
			Map<String,List<Student>> groups= list.stream().collect(Collectors.groupingBy(Student::getSubject));
			System.out.println(groups);
			
	

	}

}
