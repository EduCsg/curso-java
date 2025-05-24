package programacao_funciona_e_lambda.interfaces_funcionais.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        // Usando a classe auxiliar UpperCaseName
        // List<String> names = list.stream().map(new UpperCaseName()).toList();

        // Usando um método estático
        // List<String> names = list.stream().map(Product::staticUpperCaseName).toList();

        // Usando um método de instância
        // List<String> names = list.stream().map(Product::nonStaticUpperCaseName).toList();

        // Usando uma expressão lambda declarada
        // Function<Product, String> func = p -> p.getName().toUpperCase();
        // List<String> names = list.stream().map(func).toList();

        // Usando uma expressão lambda inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();

        names.forEach(System.out::println);

    }

}
