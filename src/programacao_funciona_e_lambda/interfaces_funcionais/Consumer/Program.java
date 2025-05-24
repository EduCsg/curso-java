package programacao_funciona_e_lambda.interfaces_funcionais.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Smartphone", 700.00));

        // Implementação de Interface
        list.forEach(new PriceUpdate());

        // Reference method - Método Estático
        list.forEach(Product::staticPriceUpdate);

        // Reference method - Método Não Estático
        list.forEach(Product::nonStaticPriceUpdate);

        // Expressão Lambda declarada
        Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * 1.1);
        list.forEach(consumer);

        // Expressão Lambda Inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        list.forEach(System.out::println);

    }

}
