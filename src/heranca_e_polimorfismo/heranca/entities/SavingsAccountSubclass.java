package heranca_e_polimorfismo.heranca.entities;

// SavingsAccount é final, ou seja, não pode ser herdada
//public class SavingsAccountSubclass extends SavingsAccount {
// | | | -> Erro: Cannot inherit from final 'SavingsAccount'
public class SavingsAccountSubclass extends BusinessAccount { // -> Correto

	// Normalmente, o parâmetro Final é utilizado em dois casos
	// | -> Classe/Método original, para garantir que a classe/método não seja
	// | | | herdado/sobrescrito

	// | -> Após realizar uma sobrescrita com o @Override, para garantir que o
	// | | | método não possa ser sobrescrito novamente, prevenindo sobreposições
	// | | | múltiplas

	// | -> Performance: Utilizado também para otimizar o tempo de execução, pois o
	// | | | Java consegue analisar mais rápido os atributos Final

	// Ao tentar sobrescrever o método withdraw, o compilador acusa erro, pois
	// @Override -> Error: overridden method is final
	// public void withdraw(Double amount) {
	// balance -= amount;
	// }

}
