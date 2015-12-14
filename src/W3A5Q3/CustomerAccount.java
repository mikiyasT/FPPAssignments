package W3A5Q3;

class myAccountException extends Exception{
	myAccountException(String message){
		super(message);
	}
}

public class CustomerAccount {
	
	String cus_name;
	String acc_no;
	double balance;
	
	CustomerAccount(String name, String acc_no, double balance){
		
		this.cus_name = cus_name;
		this.acc_no = acc_no;
		this.balance = balance;
	}
	
	private void deposit(double d){
		this.balance += d;
	}
	
	private void withdraw(double d) throws myAccountException {
		if(this.balance < 100)
			throw new myAccountException("Balance too low");
		if( d > this.balance)
			throw new myAccountException("With draw amount exceeds balance");
		this.balance -= d;
	}

	public static void main(String[] args) throws myAccountException{
		// TODO Auto-generated method stub
		CustomerAccount ca1 = new CustomerAccount("Miki","98797",8768);
		ca1.deposit(345);
		ca1.withdraw(6456);
		ca1.withdraw(345);		

	}

}
