
public class Customer {
	private String name;
	private String accountNumber;
	private NormalAccount normalAccount;
	private SavingAccount savingAccount;
	
	public Customer(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	public void openNormalAccount(double initialBalance) {
		normalAccount = new NormalAccount(name, accountNumber, initialBalance);
		System.out.println("Successfully created normal account for " + name + 
				" with initial balance: " + initialBalance);
	}
	
	public void openSavingAccount(double initialBalance, double annualInterestRate) {
		savingAccount = new SavingAccount(name, accountNumber, initialBalance, annualInterestRate);
		System.out.println("Successfully created normal account for " + name + 
				" with initial balance: " + initialBalance);
	}
	
	public NormalAccount getNormalAccount() {
		return normalAccount;
	}
	
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}
}
