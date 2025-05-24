package programacao_funciona_e_lambda.interfaces_funcionais.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    // Interfaces funcionais são interfaces que tem apenas um método, e é abstrato

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Usando a classe MyComparator
        //list.sort(new MyComparator());

        //  Usando uma função anônima
        //        Comparator<Product> comparator = new Comparator<Product>() {
        //            @Override
        //            public int compare(Product p1, Product p2) {
        //                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        //            }
        //        };
        //        list.sort(comparator);

        // Usando uma expressão lambda
        // Comparator<Product> comparator = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        // list.sort(comparator);

        // Usando uma expressão lambda sem declaração
        // list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        // Usando uma expressão lambda com referência de método
        list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p.getName() + ", " + String.format("%.2f", p.getPrice()));
        }

    }

}
