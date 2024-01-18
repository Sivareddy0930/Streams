package streamsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertCollectionToArrayUsingStreams {
	
		public static void main(String[] args) {
			List<Integer> al = new ArrayList<>();
			
			al.add(100);
			al.add(200);
			al.add(300);
			al.add(400);
			
			
			
			//Stream.toArray()
			Object arr[] = al.stream().toArray();
			System.out.println(Arrays.toString(arr));
			
			//Collection.toArray()
			Object arr1[] = al.toArray();
			System.out.println(Arrays.toString(arr1));
			
			
			Integer arr2[] = al.stream().toArray(Integer[]::new);
			System.out.println(Arrays.toString(arr2));
		}
}
