package W2A1Q1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{

		int numberOfPublications;
	
		Professor(String name, double salary, LocalDate hireDate) {
			super(name, salary, hireDate);
			// TODO Auto-generated constructor stub
		}
		
		public int getNumberOfPublications() {
			return numberOfPublications;
		}

		public void setNumberOfPublications(int numberOfPublications) {
			this.numberOfPublications = numberOfPublications;
		}

		

		
}
