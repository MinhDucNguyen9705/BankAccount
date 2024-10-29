
abstract public class Account {
	protected String ownerName;
	protected String number;
	protected double balance;
	protected static final double minBalance = 50000;
	
	public Account(String ownerName, String number, double initialBalance) {
		this.ownerName = ownerName;
		this.number = number;
		this.balance = Math.max(initialBalance, minBalance);
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited " + amount + " VND. New balance: " + balance + " VND.");
		}else {
			System.out.println("Error! The amount of deposit should be positive");
		}
	}
	
	public abstract void withdraw(double amount);
	
	public double getBalance() {
		return balance;
	}
}