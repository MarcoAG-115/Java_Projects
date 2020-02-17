/*********************************
 * BankAccountClass
 * Marco Gonzalez
 * 12-07-2017
 * The class takes the users
 *  account name, account number,
 *   and balance in order
 *    to change the user's balance.
 **********************************/
public class BankAccountClient {
	public static void main (String [ ] args) {
		BankAccountClass newBankAccountClass = new BankAccountClass();
		BankAccountClass Method = new BankAccountClass("Marco", "12345", 1500.89, 500.23, 0.0); //Account Name(String), Account Number(String), Current Balance value(double), amount deposited(double), amount withdrawn(double)
		double newUpdateBalance = Method.getUpdateBalance();
		String newUpdateName = Method.getUpdateName();
		String newUpdateNum = Method.getUpdateNum();
		double newLateBalance = Method.getLateBalance();
		System.out.println("Account "+ newUpdateName + " - " + newUpdateNum + " with the latest balance amount of: " + newLateBalance + " has now been updated to the amount of: " + newUpdateBalance + " ." );
		
	}

}
