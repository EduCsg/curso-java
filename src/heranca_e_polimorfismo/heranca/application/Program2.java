package heranca_e_polimorfismo.heranca.application;

import heranca_e_polimorfismo.heranca.entities.Account;
import heranca_e_polimorfismo.heranca.entities.BusinessAccount;
import heranca_e_polimorfismo.heranca.entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance()); // 795.0

		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance()); // 800.0

		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance()); // 793.0

	}

}
