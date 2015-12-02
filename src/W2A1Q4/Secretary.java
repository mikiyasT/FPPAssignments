package W2A1Q4;

import java.time.LocalDate;

public class Secretary extends EmployeeDetail implements Employee{

	private int hours_per_month;
	private int num_years_of_work;
	private double salary;
	
	
	Secretary(String name, String ssn, LocalDate dob,String address){
		super(name,ssn,dob,address);
	}
	
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("----Secretary  information---------");
		super.getEmployeeDetails();
		
	}
	
	
	public void setWorkInfo(int hours, int years){
		this.hours_per_month = hours;
		this.num_years_of_work = years;
	}
	
	
	public double calculateSalary() {
		// TODO Auto-generated method stub
		if(this.hours_per_month > 150)
			 salary = this.hours_per_month * baseSalary + (this.hours_per_month - 150) * bonus;
		else
			 salary = this.hours_per_month * baseSalary;
		
		if(this.num_years_of_work > 5)
			salary += salary * 0.1;
		
		return salary;
	}

}
