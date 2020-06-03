import java.util.*;
class Employee1{
	private int EmpId;
	private String EmpName;
	private String EmpEmail;
	private char EmpGender;
	private float EmpSalary;
	public Employee1(int empId, String empName, String empEmail, char empGender, float empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpEmail = empEmail;
		EmpGender = empGender;
		EmpSalary = empSalary;
	}

	public String GetEmployeeDetails() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail
				+ ", EmpGender=" + EmpGender + ", EmpSalary=" + EmpSalary + "]";
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getEmpEmail() {
		return EmpEmail;
	}

	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}

	public char getEmpGender() {
		return EmpGender;
	}

	public void setEmpGender(char empGender) {
		EmpGender = empGender;
	}

	public float getEmpSalary() {
		return EmpSalary;
	}

	public void setEmpSalary(float empSalary) {
		EmpSalary = empSalary;
	}


}

class EmployeeDB {
	List<Employee1> employeeDb = new ArrayList<>();

	public boolean addEmployee(Employee1 e) {
		return employeeDb.add(e);
	}

	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;

		Iterator<Employee1> it = employeeDb.iterator();

		while (it.hasNext()) {
			Employee1 emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}

		return isRemoved;
	}

	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";

		for (Employee1 e : employeeDb) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getEmpSalary();
			}
		}

		return paySlip;
	}

	public Employee1[] listAll() {
		Employee1[] empArray = new Employee1[employeeDb.size()];
		for (int i = 0; i < employeeDb.size(); i++)
			empArray[i] = employeeDb.get(i);
		return empArray;
	}

}

public class Prog2{
	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		Employee1 emp1 = new Employee1(100, "John", "john@mail.com", 'M', 10000);
		Employee1 emp2 = new Employee1(101, "William", "wil@mail.com", 'M', 30000);
		Employee1 emp3 = new Employee1(102, "Olivia", "olivia@mail.com", 'F', 20000);
		Employee1 emp4 = new Employee1(103, "Eliz", "eliz@mail.com", 'F', 40000);

		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee1 emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());

		System.out.println();
		empDb.deleteEmployee(102);

		for (Employee1 emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());

		System.out.println();

		System.out.println(empDb.showPaySlip(103));
	}

}