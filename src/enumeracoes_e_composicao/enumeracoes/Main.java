package enumeracoes_e_composicao.enumeracoes;

import enumeracoes_e_composicao.enumeracoes.entities.Order;
import enumeracoes_e_composicao.enumeracoes.enums.OrderStatus;

import java.util.Date;

public class Main {
	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order.toString());

		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // converte uma string para um enum

		System.out.println(os1);
		System.out.println(os2);

		System.out.println(os1 == os2); // true

	}
}
