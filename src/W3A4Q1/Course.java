package W3A4Q1;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Course {
	
	private String c_name;
	private String[] faculty;
	
	public String getC_name() {
		return c_name;
	}


	public void setC_name(String c_name) {
		this.c_name = c_name;
	}


	public String[] getFaculty() {
		return faculty;
	}


	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}


	Course(String course, String[] fa){
		faculty = new String[fa.length];
		for(int i = 0; i < fa.length; i++)
			faculty[i] = fa[i];
		c_name = course;
	}
	
	public String toString(){
		String output = "";
		output += this.c_name + " --> [ ";
		for(int i = 0 ; i < faculty.length; i++){
			output += faculty[i] + ",";
		}
		output += " ]";
		return output;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Course> course_map = new HashMap();
		
		String[] fac1 = {"Renuka","Joe","Jim"};
		String[] fac2 = {"Cathie","Elsa"};
		String[] fac3 = {"Shmit","Ziv","Niko","miki"};
		
		Course c1 = new Course("FPP",fac1);
		Course c2 = new Course("MPP",fac2);
		Course c3 = new Course("WAP",fac3);
		
		course_map.put("CS390", c1);
		course_map.put("CS490", c2);
		course_map.put("CS590", c3);
		
		System.out.println("Checking if CS490 is in the list --> " + course_map.containsKey("CS490"));
		System.out.println("Displaying only the keys");
		Set<String> crs_keys = course_map.keySet();
		Iterator it = crs_keys.iterator();
		while(it.hasNext())
		{
			System.out.println("-->" + it.next());
		}
		
		System.out.println("Displaying only the values");
		crs_keys = course_map.keySet();
	    it = crs_keys.iterator();
		while(it.hasNext())
		{
			System.out.println("-->" + course_map.get(it.next()));
		}
		System.out.println(course_map);
		
		System.out.println("size of hash table " + course_map.size());
		
		
		
	}

}
