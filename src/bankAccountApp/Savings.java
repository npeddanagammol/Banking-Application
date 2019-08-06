package bankAccountApp;

public class Savings extends Account {
	
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	

	public Savings(String name, String sSN, double initialDeposit) {
		super(name, sSN, initialDeposit);
		accountNumber = "1" + accountNumber;
		safetyDepositBox();
		
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your saving Account features"+
				"\n Safety Deposit Box ID :" + 	safetyDepositBoxID +
				"\n Safety Deposit Box KEY : " + safetyDepositBoxKey
				);
		
	}
	
	
	private void safetyDepositBox() {
	
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));	
		}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25 ;
	}
	
}
