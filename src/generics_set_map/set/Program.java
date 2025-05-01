package generics_set_map.set;

import java.util.*;

public class Program {

    // No Set, temos algumas regras específicas
    // -> Não podem ter elementos duplicados
    // -> Os elementos não tem posição
    // -> Não é possível acessar um elemento por índice
    // -> Acesso, inserção e remoção de elementos são O(1), muito rápidos
    // -> Muito bom para operações de conjuntos (união, interseção, diferença)

    // Pricipais implementações:
    //  -> HashSet: Mais rápida de todos, não mantém a ordem de inserção
    //  -> TreeSet: Mais lento (O(log n)), mantém a ordem natural dos elementos (ou a ordem definida por um Comparator)
    //  -> LinkedHashSet: Velocidade intermediária, mantém a ordem de inserção

    // Alguns dos métodos suportados:
    // -> add(E e): Adiciona um elemento ao conjunto
    // -> clear(): Limpa o conjunto
    // -> size(): Retorna o tamanho do conjunto
    // -> contains(Object o): Verifica se o conjunto contém um elemento
    // -> removeIf(Predicate<? super E> filter): Remove os elementos que satisfazem o predicado

    // -> addAll(other): Adiciona todos os elementos de outro conjunto (União)
    // -> retainAll(other): Retém apenas os elementos que estão em ambos os conjuntos (Interseção)
    // -> removeAll(other): Remove os elementos que estão em outro conjunto (Diferença)

    public static void main(String[] args) {

        // Set<String> set = new HashSet<>(); // O sout será TV - Notebook - Tablet -> Não mantém a ordem
        // Set<String> set = new TreeSet<>(); // O sout será Notebook - Tablet - TV -> Ordena alfabeticamente
        // Set<String> set = new LinkedHashSet<>(); // O sout será TV - Tablet - Notebook -> Mantém a ordem de inserção
        // set.add("TV");
        // set.add("Tablet");
        // set.add("Notebook");

        // System.out.println(set.contains("TV")); // true
        // set.remove("TV"); // remove o elemento "TV"
        // set.removeIf(s -> s.startsWith("T")); // remove todos os elementos que começam com "T"

        // for (String item : set) {
        //     System.out.println(item);
        // }

        // Operações de Conjuntos
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // União
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("União: " + union); // 0, 2, 4, 5, 6, 7, 8, 9, 10

        // Interseção
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Interseção: " + intersection); // 5, 6, 8, 10

        // Diferença
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Diferença: " + difference); // 0, 2, 4

    }

}
