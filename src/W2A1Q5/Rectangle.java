package W2A1Q5;

import java.util.Scanner;

public class Rectangle extends Shape{
	
	double width;
	double height;
	
	Rectangle(){
		
	}
	public String toString(){
		String str = "Rectangle of width = " + Double.toString(width) + "height =" + Double.toString(height);
		return str;
	}
	public double computeArea(){
		return width * height;
	}
	public double computePerimeter(){
		return 2*(width + height);
	}
	public void readShapeData(){
		System.out.println("Please enter the width and height of the rectangle separated by , ");
		Scanner in = new Scanner(System.in);
		String input[] = in.nextLine().split(",");
		this.width = Integer.parseInt(input[0]);
		this.height = Integer.parseInt(input[1]);
	}
	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

}
