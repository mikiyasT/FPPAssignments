package W3A5Q1;


public class arrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = {4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = {2, 0, 4, 4, 0, 8 };
		
		for(int i = 0; i < number.length; i++){
			try{
			int res = number[i] / denom[i] ;
			System.out.println("Result of division : "+ res);
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException ex){
				System.out.println("Error occured : " + ex.getMessage());
				ex.printStackTrace();
			}
			
		}

	}

}
