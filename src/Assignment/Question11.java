package Assignment;

import java.util.*;
import java.util.stream.Collectors;

interface sortList
{
	void display();
}

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		List<Integer> list1=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		
		System.out.println(list1);

	}

}
