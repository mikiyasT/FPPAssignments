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
		
		getShapeInfo(shapes);

	}
	public static void getShapeInfo(Shape s[]){
		System.out.println("Which shape instance do you want to display \n (C- circle , R - Rectangle, T - Triangle) ");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();	
		switch(choice.charAt(0)){
		case 'C' :
			for(Shape aShape : s){
				if(aShape instanceof Circle) {
				System.out.println(aShape);
				break;
				}
				
			}
			
			break;
		case 'R' :
			for(Shape aShape : s){
				if(aShape instanceof Rectangle) {
				System.out.println(aShape);
				break;
				}
			}
			break;
		case 'T' :
				for(Shape aShape : s){
					if(aShape instanceof Triangle) {
						System.out.println(aShape);
						break;
				}
		}
			break;
		default:
			System.out.println("Wrong selection");
				
			
		
		}
	}

}
