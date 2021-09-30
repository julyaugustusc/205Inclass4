
public class BankAccount {
	
	private int accountNumber;
	private double balance;
	private static int numOfAccounts=0;
	
	public BankAccount() {
		
		accountNumber = 0000;
		balance = 0;
		numOfAccounts++;
		
	}
	
	public BankAccount(int actNum, double bal) {
		
		accountNumber = actNum;
		balance = bal;
		numOfAccounts++;
		
	}
	
	public double deposit (double depositAmt) {
		if(depositAmt>0) 
			balance += depositAmt;
		return balance;
		
	}
	
	public void withDraw(double withDrawAmt) {
		if(withDrawAmt <= balance)
			balance -= withDrawAmt;
		
	}
	
	public String toString() {
		return "Account " + accountNumber + " has $" + balance + " Balance";
	}
	
	public static int numOfAccounts() {
		return numOfAccounts;
	}
	

}
