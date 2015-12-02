package W2A1Q1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{

	int overtimeHours; //contains how many hours a sec worked as overtime
	
	Secretary(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate);
		// TODO Auto-generated constructor stub
	}
	
	public int getOvertimeHours() {
		return overtimeHours;
	}
	
	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	@Override
	public double computeSalary(){
		return this.salary + 12 * this.overtimeHours;
	}
	

	
	
	

}
