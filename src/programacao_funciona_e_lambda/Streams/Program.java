package programacao_funciona_e_lambda.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> st1 = list.stream();
        System.out.println("st1: " + Arrays.toString(st1.toArray()));
        // st1: [1, 2, 3, 4, 5]

        list.stream().map(x -> x * 10)
                .filter(x -> x > 20)
                .forEach(System.out::println);
        // 30 40 50

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println("st2: " + Arrays.toString(st2.toArray()));
        // st2: [Maria, Alex, Bob]

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println("st3: " + Arrays.toString(st3.limit(10).toArray()));
        // st3: [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]

        Stream<Long> fibonacci = Stream.iterate(new Long[]{0L, 1L}, x -> new Long[]{x[1], x[0] + x[1]})
                                         .map(x -> x[0]);
        System.out.println("Fibonacci: " + Arrays.toString(fibonacci.limit(10).toArray()));
        // Fibonacci: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

    }

}
