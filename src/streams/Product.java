package streams;

public class Product {

  private final String name;
  private final String description;
  private final Double price;

  public Product(String name, String description, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }


  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Double getPrice() {
    return price;
  }



  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", price=" + price +
        '}';
  }
}
