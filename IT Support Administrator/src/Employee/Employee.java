package Employee;

public class Employee {
	String FirstName;
	String LastName;
	String Department;
	
	
	public Employee(String firstName, String lastName, String department) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Department = department;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	

}
