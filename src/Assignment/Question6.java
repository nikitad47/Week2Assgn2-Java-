package Assignment;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;


public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp = Arrays.asList(new Employee(1,"Nikita",1234567891L), new Employee(1,"Nikita",1234567891L),new Employee(2,"Dara", 4567890123L));
		
		System.out.println(emp.toString());
		System.out.println("List Size" + emp.size());

		
		List<Employee> unique = emp.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingInt(Employee::getId))),
                                           ArrayList::new));
		System.out.println(unique.toString());
		System.out.println("List Size" + unique.size());

	}

}
