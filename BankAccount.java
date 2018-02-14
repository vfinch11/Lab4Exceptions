
/**
 * @author Vlad Fincher
 * This class is the bank account and calls getAccountID
 * and GetAccountBalance in order to check the user's balance 
 * deposit and withdraw are used to pull and place money into the account 
 * if withdraw makes the amount>balance then InsufficientFunds is called
 */
public class BankAccount {
    private final int accountid;
    private double balance = 0; 
	
    public BankAccount(int id) {
		this.accountid = id;
		
	}
    public int getAccountID() {
		return accountid;
	}
    public double getAccountBalance() {
		return balance;
	}
    public void deposit(double amount) {
		balance += amount;
	}
    public void withdraw(double amount) throws InsufficientFundsException {
	    if(amount>balance) {
		    throw new InsufficientFundsException(amount-balance);
	    }else {
		     balance-=amount;
		}
	}
}
