/*********************************
 * BankAccountClass
 * Marco Gonzalez
 * 12-07-2017
 * The class takes the users
 *  account name, account number,
 *   and balance in order
 *    to change the user's balance.
 **********************************/
public class BankAccountClass {
	
	//Instance variables
	private String accountName; //the user's account name
	private String accountNum; //the user's account number
	private double balance; //the user's balance
	private double deposit; //the amount of money the user wants to deposit
	private double withdrawal; //the amount of money the user is withdrawing
	
	//Default Constructor
	public BankAccountClass ( ) {
		accountName = "";
		accountNum = "";
	}
	
	//Overload Constructor
	//user will apply values to accountName, accountNum, and balance
	public BankAccountClass ( String startAccountName, String startAccountNum, double startBalance, double startDeposit, double startWithdrawal ) {
		accountName = startAccountName;
		accountNum = startAccountNum;
		//Checking balance
		if (startBalance >= 0.0) {
			balance = startBalance;
		}
		else{
			System.err.println("Balance value is negative. Value will be set to 0.");
			System.err.println("Balance cannot be negative. An error must have occured during a transaction.");
		}
		//Checking deposit
		if (startDeposit >= 0.0) {
			deposit = startDeposit;
		}
		else{
			System.err.println("Deposit value is negative.");
			System.err.println("Value will be set to 0.");
		}
		//Checking withdrawal
		if (startWithdrawal >= 0.0) {
			withdrawal = startWithdrawal;
		}
		else{
			System.err.println("Withdrawal value is negative.");
			System.err.println("Value will be set to 0.");
		}
	}
	
	//Accessor Method
	
	//current value of accountName
	public String getAccountName( ) {
		return accountName;
	}
	//current value of accountNum
	public String getAccountNum( ) {
		return accountNum;
	}
	//current value of balance
	public double getBalance( ) {
		return balance;
	}
	//current value of deposit
	public double getDeposit( ) {
		return deposit;
	}
	//current value of withdrawal
	public double getWithdrawal( ) {
		return withdrawal;
	}
	
	//Mutator Method
	//user will be able to set or change the value of the variables through the client
	public void setAccountName(String newAccountName) {
		accountName = newAccountName;
	}
	public void setAccountNum(String newAccountNum) {
		accountNum = newAccountNum;
	}
	public void setBalance(double newBalance) {
		if (newBalance >= 0) {
			balance = newBalance;
		}
		else {
			System.err.println("Balance cannot be negative.");
			System.err.println("Value not changed.");
		}
	}
	public void setDeposit(double newDeposit) {
		if (newDeposit >= 0) {
			deposit = newDeposit;
		}
		else {
			System.err.println("Deposit cannot be negative.");
			System.err.println("Value not changed.");
		}
	}
	public void setWithdrawal(double newWithdrawal) {
		if (newWithdrawal >= 0) {
			withdrawal = newWithdrawal;
		}
		else {
			System.err.println("Withdrawal cannot be negative.");
			System.err.println("Value not changed.");
		}
	}
	
	//Methods
	//Changing the user's balance
	
	public double getUpdateBalance ( ) {
		if (deposit > 0.0) {
			double x = balance+deposit;
			return x;
		}
		else {
			double x = balance - withdrawal;
			return x;
		}
	}
	
	public String getUpdateName ( ) {
		return accountName;
	}
	public String getUpdateNum ( ) {
		return accountNum;
	}
	public double getLateBalance ( ) {
		return balance;
	}

}
