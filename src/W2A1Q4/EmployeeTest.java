package W2A1Q4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input[];
		String DATE_FORMAT = "MM-dd-yyyy";
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		Employee emp[] = {new Manager("Mikiyas", "98768979", LocalDate.parse("12-16-1982", df), "Fair field, IA"),
							new Secretary("Kidist", "9762432", LocalDate.parse("12-16-1985", df), "Fair field, IA")};
		
		System.out.println("Displaying employee information from the emplyee database");
		for(Employee e : emp){
			e.getEmployeeDetails();
			System.out.println("Please enter the number of years in service , and hours per month for the above employee : ");
			
			input = in.nextLine().split(" ");
			e.setWorkInfo(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
			System.out.println("Salary earned is : " + e.calculateSalary());
			
		}
		

	}

}
