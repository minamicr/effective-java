package streams;

public class ProductsTest {

  public static void main(String[] args) {
    ProductsMinorPrice prod = new ProductsMinorPrice();
    System.out.println(prod.getMinorPrice(prod.getProducts()));
  }

}
