package W2A1Q3;

public class Notebook extends Computer{
	double height;
	double width;
	double weight;
	
	double screenSize(){
		return height * width;
	}

	@Override
	double costProduct() {
		// TODO Auto-generated method stub
		return 750;
	}
}
