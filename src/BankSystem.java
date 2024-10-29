
public class BankSystem {
	public static void main(String arg[]) {
		Customer customer1 = new Customer("A", "123456789");
		customer1.openNormalAccount(1e5);
		NormalAccount normalAccount1 = customer1.getNormalAccount();
		System.out.println("Initial balance of customer 1 is " + normalAccount1.getBalance());
		normalAccount1.deposit(-50000);
		normalAccount1.deposit(1e5);
		normalAccount1.withdraw(-50000);
		normalAccount1.withdraw(145000);
		normalAccount1.withdraw(150000);
		customer1.openSavingAccount(1e5, 0.2);
		SavingAccount savingAccount1 = customer1.getSavingAccount();
		System.out.println("Monthly interest of customer 1's saving account is " + 
				savingAccount1.calculateMonthlyInterest() + " VND.");
		savingAccount1.deposit(1e5);
		System.out.println("Monthly interest of customer 1's saving account is " + 
				savingAccount1.calculateMonthlyInterest() + " VND.");
	}
}
