package bankAccountApp;

public class Checking extends Account {

	private int debitCardNumber;
	private int debitCardPIN;

	public Checking(String name, String sSN, double initialDeposit) {
		super(name, sSN, initialDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		
	}

	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Checking Account Features: " +
							"\n Debit Card Number " + debitCardNumber +
							"\n Debit Card PIN " + debitCardPIN
				);
		
		
	}
	
	
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
		
//		System.out.println("Debit Card Number " + this.debitCardNumber);
//		System.out.println("Debit Card PIN "+this.debitCardPIN);
//		
		
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15 ;
	}
	
}
