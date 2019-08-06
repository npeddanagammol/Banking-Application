package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		List<Account> account = new LinkedList<Account>();

		// Read a CSV file and then create new accounts based on that data

		String file = "/Users/apple/Downloads/NewBankAccounts.csv";

		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {

			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initialDeposit = Double.parseDouble(accountHolder[3]);

			if (accountType.equals("Checking")) {
				account.add(new Checking(name, sSN, initialDeposit));
			} else if (accountType.equals("Savings")) {

				account.add(new Savings(name, sSN, initialDeposit));
			}

			else {
				System.out.println("ERROR READING INPUT TYPE");
			}

		}

//		account.get(5).showInfo();

		for (Account accounts : account) {
			System.out.println("\n********************\n");
			accounts.showInfo();

		}
	}

}
