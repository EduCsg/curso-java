package programacao_funciona_e_lambda.interfaces_funcionais.Comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        // retornar > 1 se p1 > p2 | < 1 se p1 < p2 | 0 se p1 == p2

        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }

}
