package programacao_funciona_e_lambda.interfaces_funcionais.Predicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 1000.00;
    }

}
