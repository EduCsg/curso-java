package generics_set_map.bounded_wildcards;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

    public static void main(String[] args) {

        //
        // Covariância
        //
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(5);
        intList.add(10);

        List<? extends Number> genericNumberList = intList;

        // Funciona normalmente, pois é um método GET
        Number x = genericNumberList.get(0);

        // Não funciona, pois é um método PUT
        // Nada garante que o valor adicionado seja compatível com o tipo da lista
        // genericNumberList.add(20);

        //
        // Contravariáncia
        //
        List<Object> objectList = new ArrayList<Object>();
        objectList.add("Hello");
        objectList.add(10);

        List<? super Number> genericNumberList2 = objectList;

        // Funciona normalmente, pois é um método PUT e o tipo é compatível
        genericNumberList2.add(20);
        genericNumberList2.add(30.5);

        // Não funciona, pois é um método GET
        // Não é possível atribuir para um Number, pois pode ser qualquer superclasse de Number
        // Number y = genericNumberList2.get(0);

        //
        // Exercício - Método Copy()
        //

        List<Number> source = new ArrayList<>();
        source.add(1);
        source.add(2.5);

        List<Object> destination = new ArrayList<>();
        destination.add("Hello");
        copy(source, destination);

        System.out.println("Destination list: " + destination); // Destination list: [Hello, 1, 2.5]

    }

    // A origem será uma lista de números (ou subtipos de números)
    // O destino será uma lista de números (ou supertipos de números), como Object ou Number
    private static void copy(List<? extends Number> source, List<? super Number> destination) {
        for (Number number : source) {
            destination.add(number);
        }
    }

}
