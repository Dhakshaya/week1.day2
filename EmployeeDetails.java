package week1.day2;

public class EmployeeDetails {
	
	
	/* Create a new class as EmployeeDetails with methods as below
	 * printEmployeeName(String empName, int empId) -> print the empName & empId
	 * getEmployeeAddress(String empAddress) -> print address (eg: Chennai)
	 * printEmployeeSalary(double empSalary) -> print the empSalary
	 * printEmployeeMobileNumber(long mobNum) -> print the phoneNumber Call all the
	 * methods from main() and execute
	 */
	public void printEmployeeName(String empName, int empId)
	
	{			
		
		System.out.println(empName + empId);
	}
	
	public void getEmployeeAddress(String empAddress)
	{
		
		System.out.println(empAddress);
	}
	
	public void printEmployeeSalary(double empSalary)
	{
		
		System.out.println(empSalary);
		
	}
	
	
	public void printEmployeeMobileNumber(long mobNum)
	{
		
		System.out.println(mobNum);
	}

	
	/*
	 * public double printEmployeeSalary1(double empSalary1) {
	 * 
	 * return empSalary1; }
	 */
	
	public static void main(String[] args) {
		
		EmployeeDetails objempolyee = new EmployeeDetails();
		objempolyee.printEmployeeName("Dhakshayani", 3198);
		objempolyee.getEmployeeAddress("Chennai");
		objempolyee.printEmployeeSalary(35000.35);
		objempolyee.printEmployeeMobileNumber(9944994881L);
		//System.out.println(objempolyee.printEmployeeSalary1(35000.00));
	//	double salary2 = objempolyee.printEmployeeSalary1(35000.00);
	
		
		
		
		
	}
	
}
