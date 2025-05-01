package generics_set_map.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {

    // O Map se trata de uma estrutura de dados chave-valor (Map<K, V>)
    // Funciona como se fosse um objeto JSON
    // -> Não pode ter chaves duplicadas
    // -> Os elementos são indexados por chave, não possuem posição
    // -> Acesso, inserção e remoção de elementos são O(1), muito rápidos

    // Principais implementações:
    // -> HashMap: Mais rápida de todas, operações O(1) em tabela Hash, não ordenado
    // -> TreeMap: Mais lenta (O(log n) em árvore Rubo Negra), ordenado pelo compareTo ou Comparator
    // -> LinkedHashMap: Velocidade intermediária, mantém a ordem de inserção

    // Alguns dos métodos suportados:
    // -> put(K key, V value): Adiciona um elemento ao mapa
    //      -> baseado em equals() e hashCode(), se não existir, compara através de ponteiros
    // -> clear(): Limpa o mapa
    // -> size(): Retorna o tamanho do mapa
    // -> containsKey(Object key): Verifica se o mapa contém uma chave
    // -> remove(Object key): Remove o elemento que tem a chave passada
    // -> putAll(other): Adiciona todos os elementos de outro mapa
    // -> keySet(): Retorna um Set com todas as chaves do mapa
    // -> values(): Retorna uma Collection com todos os valores do mapa

    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@email.com");
        cookies.put("phone", "123456789");

        cookies.remove("email");
        cookies.put("phone", "987654321"); // Substitui o valor da chave "phone"

        System.out.println("Contains phone key? > " + cookies.containsKey("phone"));

        System.out.println("All Cookies");
        for (String key : cookies.keySet())
            System.out.println(key + ": " + cookies.get(key));

    }

}
