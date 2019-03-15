public class transactions {
	static String[] amount = new String[5];
	static String[] type = new String[5];
	static int i = 0;
	static int j = 4;
	
	static user myuser = new user();
	
	public void deposit(double depositamount) {
		
		user.balance += depositamount;
		
	}
	
	public static boolean withdrawal(double withdrawalamount) {
		if(user.balance < withdrawalamount)
			return false;
		else {
			return true;
			
		}	
	}	
	
	public void balanceinquiry() {
		System.out.println("your balance is" + user.balance);
	}
	
}