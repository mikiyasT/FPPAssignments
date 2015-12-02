package W2A1Q4;

public interface Employee {
	double baseSalary	 = 10;
	double bonus		 = 2;
	double extraHours 	 = 15; 
	
	void getEmployeeDetails();
	double calculateSalary();
	void setWorkInfo(int hours, int years);

}
