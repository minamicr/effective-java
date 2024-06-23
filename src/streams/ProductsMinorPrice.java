package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.awt.Component;

public class ProductsMinorPrice {
  public List<Product> getProducts() {
    List<Product> products = new ArrayList<>();

    Product product1 = new Product("pen", "blue pencil",2.50);
    Product product2 = new Product("pencil", "pencil number 2",1.45);
    Product product3 = new Product("rule", "30cm rule",5);
    Product product4 = new Product("pencil case", "avengers pencil case",18.75);
    Product product5 = new Product("erase", "white erase",1.07);

    products.add(product1);
    products.add(product2);
    products.add(product3);
    products.add(product4);
    products.add(product5);

    return(products);
  }


  public Optional<Product> getMinorPrice(List<Product> products) {
    Comparator<Product> comparePrice = (product1, product2) ->
        Double.compare(product1.getPrice(), product2.getPrice());

    BinaryOperator<Product> minProduct = BinaryOperator.minBy(comparePrice);

    var x = minProduct.apply(products.get(0), products.get(4));
    System.out.println("minProduct.apply " + x);

    Optional<Product> prod = products
        .stream()
        .min(Comparator.comparing(Product::getPrice));

    return prod;
  }

}
