package streamsPractice.CollectorsMethods;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joining {

	public static void main(String[] args) {
		String arr[]= {"I","am","siva","reddy","venkata","Tumu"};
	String a=	Arrays.stream(arr).collect(Collectors.joining("|","[","]"));
	System.out.println(a);
	}

}
