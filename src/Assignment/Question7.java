package Assignment;

import java.util.*;

class Employee{
	int id;
	String name;
	long contact;
	
	public Employee(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
}

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1,"Nikita",7840913731L);
		Employee emp2 = new Employee(2,"Nikki",9850564076L);
		Employee emp3 = new Employee(3,"Dara",7840913731L);
		Employee emp4 = new Employee(4,"NND",9850564076L);
		Employee emp5 = new Employee(5,"Niki",7840913731L);

		List<Employee> list = new ArrayList<Employee>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		Map<Long,Integer> map = new HashMap<>();
		
		for(int i=0;i<list.size();i++)
		{
			if(map.containsKey(list.get(i).getContact()))
			{
				map.put(list.get(i).getContact(), map.get(list.get(i).getContact())+1);
			}
			else
			{
				map.put(list.get(i).getContact(), 1);
			}
		}
		System.out.println(map);
	}

}
