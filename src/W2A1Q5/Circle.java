package W2A1Q5;

import java.util.Scanner;

public class Circle extends Shape{
	
	double radius;
	Circle(){
		
	}
	public String toString(){
		String str = "Circle of radius = " + Double.toString(radius);
		return str;
	}
	public double computeArea(){
		return Math.PI * radius * radius;
	}
	public double computePerimeter(){
		return 2 * Math.PI * radius;
	}
	public void readShapeData(){
		System.out.println("Please enter the radius of the circle ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		this.radius = Integer.parseInt(input);
		
	}
	
	public String getShapeName() {
		// TODO Auto-generated method stub
		return "Circle";
	}

}
