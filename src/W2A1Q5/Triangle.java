package W2A1Q5;

import java.util.Scanner;

public class Triangle extends Shape{
	
	double base;
	double height;
	Triangle(){
		
	}
	public String toString(){
		String str = "Triangle of base = " + Double.toString(base) + "height =" + Double.toString(height);
		return str;
	}
	public double computeArea(){
		return 0.5 * base * height;
	}
	public double computePerimeter(){
		return 0;
	}
	public void readShapeData(){
		System.out.println("Please enter the base and height of the triangle separated by , ");
		Scanner in = new Scanner(System.in);
		String input[] = in.nextLine().split(",");
		this.base = Integer.parseInt(input[0]);
		this.height = Integer.parseInt(input[1]);
	}
	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return "Triangle";
	}	

}
