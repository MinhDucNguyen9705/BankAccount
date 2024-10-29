
public class SavingAccount extends Account{
	private double annualInterestRate;
	
	public SavingAccount(String ownerName, String number, double initialBalance, double annualInterestRate) {
		super(ownerName, number, initialBalance);
		this.annualInterestRate = annualInterestRate;
	}
	
	public double calculateMonthlyInterest() {
		return balance*annualInterestRate/12;
	}
	
	@Override
	public void withdraw(double amount) {
		System.out.println("Cannot withdraw from saving account.");
	}
}
