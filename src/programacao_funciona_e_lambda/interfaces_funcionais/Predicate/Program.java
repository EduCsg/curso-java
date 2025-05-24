package programacao_funciona_e_lambda.interfaces_funcionais.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    // Predicate é uma interface funcional (tem apenas um método abstrato) genérica que recebe um parâmetro e retorna um booleano

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Smartphone", 800.00));

        // Classe ProductPredicate - Implementação da Interface
        list.removeIf(new ProductPredicate());

        // Reference Method - Método Estático
        list.removeIf(Product::staticProductPredicate);

        // Reference Method - Método de Instância
        list.removeIf(Product::nonStaticProductPredicate);

        // Expressão Lambda declarada
        Predicate<Product> pred = p -> p.getPrice() >= 1000.00;
        list.removeIf(pred);

        // Expressão Lambda Inline
        list.removeIf(p -> p.getPrice() >= 1000.00);

        for (Product p : list)
            System.out.println(p.getName() + ", " + String.format("%.2f", p.getPrice()));

    }

}
