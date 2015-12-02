package W2A1Q1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DeptEmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-dd-yyyy");
	
		
		DeptEmployee[] deptEmployees = {
										new Professor("Mike buren", 1000, LocalDate.parse(("11-04-2004"),df)),
										new Professor("Joe Biden",1500,LocalDate.parse(("01-01-2001"),df)),
										new Professor("Joe Biden",1500,LocalDate.parse(("08-01-2001"),df)),
										new Secretary("Juhee Jong",700,LocalDate.parse(("01-06-2006"),df)),
										new Secretary("Kim Eunseo",500,LocalDate.parse(("05-01-2007"),df))
										 };
		
		int prof_salary = 0, sec_salary = 0;
		for(DeptEmployee de : deptEmployees){
			if(de instanceof Professor)
				prof_salary += de.computeSalary();
			if(de instanceof Secretary)
				sec_salary += de.computeSalary();
		}
		System.out.println("Sum of professor salaries is " + prof_salary);
		System.out.println("Sum of secretary salaries is " + sec_salary);
	}

}
