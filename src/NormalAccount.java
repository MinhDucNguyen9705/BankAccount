
public class NormalAccount extends Account{
	private static final double withdrawFee = 5000;
	
	public NormalAccount(String ownerName, String number, double initialBalance) {
		super(ownerName, number, initialBalance);
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Error! Withdraw amount must be positive");
		}else {
			if (balance - amount - withdrawFee < minBalance) {
				System.out.println("Account balance is insufficient!");
			}else {
				balance -= amount + withdrawFee;
				System.out.println("Successfully withdraw " + amount + 
						" VND. Remaining balance " + balance + " VND.");
			}
		}
	}
}
