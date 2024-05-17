package heranca_e_polimorfismo.heranca.application;

import heranca_e_polimorfismo.heranca.entities.Account;
import heranca_e_polimorfismo.heranca.entities.BusinessAccount;
import heranca_e_polimorfismo.heranca.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account account = new Account(1001, "Alex", 0.0);
		BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// Upcasting
		// Permite transformar a subclass em uma instância da superclass
		Account acc1 = businessAccount;
		Account acc2 = new BusinessAccount(1004, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// Downcasting
		// Transforma o objeto da superclass para a subclass
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(200.20);

		// BusinessAccount acc5 = (BusinessAccount) acc3;
		// ERRO, pois acc3 é uma SavingsAccount e não uma Account comum.
		// BusinessAccount não tem relação com a SavingsAccount, apenas com Account

		// Para evitar isso, existe o instanceof
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
