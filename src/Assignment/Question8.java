package Assignment;

import java.util.Collections;
import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Nikita",8501871096l);
		Employee e2=new Employee(2,"Abby",8501871096l);
		Employee e3=new Employee(3,"Yesasvi",8501873096l);
		Employee e4=new Employee(4,"Mohan",8501871096l);
		Employee e5=new Employee(5,"Ganesh",8501871097l);
		Employee e6=new Employee(6,"Srija",8501871097l);
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e6);
		list.add(e4);
		list.add(e5);
		list.add(e2);
		list.add(e3);
		Collections.sort(list);
		System.out.println(list);

	}

}
