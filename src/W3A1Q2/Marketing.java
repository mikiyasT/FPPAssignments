package W3A1Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Marketing {
	
	private String Employee_name;
	private String Product_name;
	private double sales_amount;
	
	Marketing(String emp_name, String prt_name, double sales){
		this.Employee_name = emp_name;
		this.Product_name = prt_name;
		this.sales_amount = sales;
	}
	
	String getEmployeeName(){
		return this.Employee_name;
	}
	double getSalesAmount(){
		return this.sales_amount;
	}
	
	static void displayAll(ArrayList<Marketing> marketing){
		for(Marketing m : marketing)
			System.out.println(" First Name " + m.getEmployeeName() + " Sales "
					+ m.getSalesAmount());  
	}
	public String toString(){
		return "Name : " + this.Employee_name + " Product " + this.Product_name + " Sales " + this.sales_amount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Marketing> marketing = new ArrayList<>();
		marketing.add(new Marketing("Steve","Computer",34500));
		marketing.add(new Marketing("Balmer","Computer",4566));
		marketing.add(new Marketing("Mark","pad",34500));
		marketing.add(new Marketing("Rubio","projecter",6789));
		marketing.add(new Marketing("Rubio","projecter",6789));
		marketing.add(new Marketing("Lina","monitor",1200));
		marketing.add(new Marketing("Raju","decoder",6789));
		
		marketing.remove(3);
		marketing.set(2, new Marketing("Frank","Books",240));
		
		final Comparator NAME = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Marketing m1 = (Marketing)o1;
				Marketing m2 = (Marketing)o2;
				
				return m1.getEmployeeName().compareTo(m2.getEmployeeName());
				
			
			}
		
		};
		
		final Comparator SALES = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Marketing m1 = (Marketing)o1;
				Marketing m2 = (Marketing)o2;
				
				Double s1 = new Double(m1.getSalesAmount());
				Double s2 = new Double(m2.getSalesAmount());
				
				return s1.compareTo(s2);
				
			
			}
		
		};
		
		System.out.println("-------Before sorting happens---------");
		displayAll(marketing);
		System.out.println("--------After Sorting by Name----------");	
		Collections.sort(marketing,NAME);
		displayAll(marketing);
		System.out.println("----------After Sorting by Name----------");	
		Collections.sort(marketing,SALES);
		displayAll(marketing);
		
		System.out.println("Size of the marketing list is : " + marketing.size());
		
		
		
	}

}
