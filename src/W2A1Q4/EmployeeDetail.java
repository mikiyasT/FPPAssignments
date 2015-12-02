package W2A1Q4;

import java.time.LocalDate;

public class EmployeeDetail {
	
	private String name;
	private String ssn;
	private LocalDate dob;
	private String address;
	
	EmployeeDetail(String name, String ssn, LocalDate dob,String address){
		this.name = name;
		this.ssn = ssn;
		this.dob = dob;
		this.address = address;
	}
	
	public void getEmployeeDetails(){
		System.out.println("Name " + name + "\n" + "ssn " + ssn + "\n" + "dob "
				+ dob + "\n" + "address " + address + "\n");
	}

}
