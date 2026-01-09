import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

class Product {
  private int id;
  private String name;
  private double price;

  public Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
  }
}

class ProductManager {
  private static final Logger LOGGER = Logger.getLogger(ProductManager.class.getName());
  private List<Product> products = new ArrayList<>();

  // validate the product before adding
  public void addProduct(Product product) {
    if (product == null) {
      throw new ProductValidationException("Product cannot be null");
    }
    if (product.getId() <= 0) {
      throw new ProductValidationException("Product id must be positive");
    }
    if (product.getName() == null || product.getName().trim().isEmpty()) {
      throw new ProductValidationException("Product name is required");
    }
    if (product.getPrice() < 0) {
      throw new ProductValidationException("Product price cannot be negative");
    }
    if (getProductById(product.getId()) != null) {
      throw new DuplicateProductException("Product with id " + product.getId() + " already exists");
    }

    products.add(product);
    LOGGER.info("Added product with id " + product.getId());
  }

  public void displayAllProducts() {
    for (Product product : products) {
      System.out.println(product);
    }
  }

  public Product getProductById(int id) {
    for (Product product : products) {
      if (product.getId() == id) {
        return product;
      }
    }
    return null;
  }

  public Product getProductByIdOrThrow(int id) {
    Product p = getProductById(id);
    if (p == null) {
      throw new ProductNotFoundException("Product with id " + id + " not found");
    }
    return p;
  }

  public boolean removeProductById(int id) {
    return products.removeIf(product -> product.getId() == id);
  }

  public void removeProduct(int id) {
    boolean removed = removeProductById(id);
    if (!removed) {
      LOGGER.warning("Attempted to remove product with id " + id + " but it did not exist");
    } else {
      LOGGER.info("Removed product with id " + id);
    }
  }
}

public class ProductManagerApp {
  public static void main(String[] args) {
    ProductManager manager = new ProductManager();

    // Adding products
    try {
      manager.addProduct(new Product(1, "Laptop", 999.99));
      manager.addProduct(new Product(2, "Smartphone", 499.99));
      manager.addProduct(new Product(3, "Tablet", 299.99));
    } catch (RuntimeException e) {
      System.err.println("Error adding product: " + e.getMessage());
    }

    // Attempt to add duplicate to demonstrate validation
    try {
      manager.addProduct(new Product(2, "Duplicate Smartphone", 499.99));
    } catch (DuplicateProductException e) {
      System.err.println("Duplicate product prevented: " + e.getMessage());
    } catch (ProductValidationException e) {
      System.err.println("Invalid product: " + e.getMessage());
    }

    // Displaying all products
    System.out.println("All Products:");
    manager.displayAllProducts();

    // Searching for a product
    System.out.println("\nSearching for product with ID 2:");
    try {
      Product product = manager.getProductByIdOrThrow(2);
      System.out.println(product);
    } catch (ProductNotFoundException e) {
      System.out.println("Product not found.");
    }

    // Removing a product
    System.out.println("\nRemoving product with ID 1.");
    boolean removed = manager.removeProductById(1);
    if (removed) {
      System.out.println("Product removed successfully.");
    } else {
      System.out.println("Product not found, nothing removed.");
    }

    // Displaying all products after removal
    System.out.println("\nAll Products after removal:");
    manager.displayAllProducts();
  }
}
