package bankAccountApp;

public abstract class Account implements InterestBaseRate {

	private String name;
	private String sSN;
	private double balance;

	private static int index = 10000;

	protected String accountNumber;
	protected double rate;

	public Account(String name, String sSN, double initialDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initialDeposit;

		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));

		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accrudeInterest = balance * (rate/100);
		System.out.println("Accrude Interest: $" + accrudeInterest );
		
		balance = balance + accrudeInterest;
		printBalance();
		
	}
	
	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $"+amount+" to "+toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now : $" + balance);
	}
	
	public void showInfo() {
		
		System.out.println(
				" NAME " + name +
				"\n ACCOUNT NUMBER " + accountNumber +
				"\n BALANCE " + balance +
				"\n RATE " + rate + "%"
				);
		
	}
	
	

}
