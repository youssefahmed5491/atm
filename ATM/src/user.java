public class user {
	 private String cardnumber = "2468";
	 static int balance;
	 static int getBalance() {
		return balance;
	}
	public static void setBalance(int balance) {
		user.balance = balance;
	}
	String checknumber;
	public void settingcardnumber(String cardnumber) {
		checknumber = cardnumber;
	}
	public boolean validate() {
		if(checknumber.equals (cardnumber)) {
			return true;
		}	
		else {
			return false;
		}
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
}