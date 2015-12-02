package W2A1Q4;

import java.time.LocalDate;

public class Manager extends EmployeeDetail implements Employee{

	
	private int hours_per_month;
	private int num_years_of_work;
	private int extra_hours;
	double salary;
	Manager(String name, String ssn, LocalDate dob,String address){
		super(name,ssn,dob,address);
	}
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("----Manager information---------");
		super.getEmployeeDetails();
		
	}

	public void setWorkInfo(int hours, int years){
		this.hours_per_month = hours;
		this.num_years_of_work = years;
	}

	public double calculateSalary() {
		// TODO Auto-generated method stub
		salary = baseSalary * 2 * hours_per_month;
		if(hours_per_month > 150)
			salary = baseSalary * 2 * 150 + (hours_per_month - 150) * extra_hours;
		else
			salary = baseSalary * 2 * hours_per_month;
			
		return salary;
	}
	

}
