package generics_set_map.hash_code_e_equals;

public class Program {

    // Comparativo - Hash Code e Equals

    // Equals
    // -> Retorna Booleanoo, verifica se dois objetos são iguais.
    // -> Operação lenta, mas 100% precisa.

    // Hash Code
    // -> Retorna um número inteiro, representa o objeto.
    // -> Operação rápida, mas não 100% precisa na resposta positiva.
    // Um mesmo objeto nunca gerará dois códigos diferentes, porém, dois objetos diferentes
    //  podem gerar um mesmo código, o que chamamos de colisão.

    public static void main(String[] args) {

        Client cl1 = new Client("Maria", "maria@gmail.com");
        Client cl2 = new Client("Maria", "maria@gmail.com");
        Client cl3 = new Client("Alex", "alex@gmail.com");

        System.out.println(cl1.hashCode());
        System.out.println(cl2.hashCode());
        System.out.println(cl1.equals(cl2)); // True
        System.out.println(cl1.equals(cl3)); // False

        System.out.println(cl1 == cl2); // False, pois o == compara referências de memória e não conteúdo

        System.out.println(cl1.hashCode() == cl2.hashCode()); // True, pois o hashCode é o mesmo

    }

}
