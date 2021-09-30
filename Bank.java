
public class Bank {
	
	public static void main(String[] arg) {
		
		BankAccount b1 = new BankAccount(1111, 500);
		BankAccount b2 = new BankAccount();
		
		System.out.println(BankAccount.numOfAccounts());
		
		b1.deposit(100);
		System.out.println(b1);
		System.out.println(b2);
	}

}
