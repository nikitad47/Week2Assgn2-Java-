package Assignment;

import java.util.*;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> list=new ArrayList<>(Arrays.asList('a','g','h','e','v','k','A'));
		int count=(int)list.stream().filter(x->x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U').count();
		System.out.println(count);

	}

}
