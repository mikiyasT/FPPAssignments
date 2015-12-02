package W2A1Q5;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = { new Rectangle(),new Circle(),new Triangle()};
		
		for(Shape aShape : shapes){
			System.out.println(aShape.getShapeName());
			aShape.readShapeData();
		}
		
		getShape();

	}
	public static void getShape(){
		System.out.println("Which shape instance do you want to display /n (C- circle , R - Rectangle, T - Triangle) ");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();	
		switch(choice.charAt(0)){
		case 'C' :
			System.out.println( new Circle().toString());
			break;
		case 'R' :
			System.out.println( new Rectangle().toString());
			break;
		case 'T' :
			System.out.println( new Triangle().toString());
			break;
		default:
			System.out.println("Bad selection");
				
			
		
		}
	}

}
