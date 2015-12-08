package W3A1Q1;

class Person
{
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String last, String first, int a)
	{ // constructor to initialize the values
		this.lastName = last;
		this.firstName = first;
		this.age = a;
		
	}
	public void displayPerson() // Display fisrtName, lastName and age
	{
		System.out.println("First name : " + firstName + "Last name : "
				+ lastName + "age : " + age);
 	}
	public String getLastName() // get only the last name
	{
		return lastName;
	}
	
} // end class Person
