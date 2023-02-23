package Assignment;

import java.util.*;

class Employee2{
	String name;
	String designation;
	long contactNumber;
	String department;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", designation=" + designation + ", contactNumber=" + contactNumber
				+ ", department=" + department + ", salary=" + salary + "]";
	}
	public Employee2(String name, String designation, long contactNumber, String department, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.contactNumber = contactNumber;
		this.department = department;
		this.salary = salary;
	}
	
}

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1=new Employee2("Sai", "TL", 9876543210l, "Developement", 1600000);
		Employee2 e2=new Employee2("Ganesh", "HR", 9876543210l, "HR", 9000);
		Employee2 e3=new Employee2("Mandalapu", "SDE", 9876543210l, "Developement", 1200000);
		List<Employee2> list=new ArrayList<Employee2>();
		list.add(e1);list.add(e2);list.add(e3);
		Map<String,List<Employee2>> map=new HashMap<>();
		departmentSort(map,list);
		System.out.println("Department vise employees");
		for(Map.Entry<String, List<Employee2>> e:map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println("List of employees with salary more than 10k");
		list.stream().filter(x->x.salary>100000).forEach(x->System.out.println(x));
	}
​
	private static void departmentSort(Map<String, List<Employee2>> map, List<Employee2> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			String department=list.get(i).department;
			if(map.containsKey(department)) {
				map.get(department).add(list.get(i));
			}
			else {
				List<Employee2> ar=new ArrayList<>();
				ar.add(list.get(i));
				map.put(department, ar);
			}
		}

	}

}
