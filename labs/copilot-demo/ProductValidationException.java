public class ProductValidationException extends IllegalArgumentException {
  public ProductValidationException() {
    super();
  }

  public ProductValidationException(String message) {
    super(message);
  }

  public ProductValidationException(String message, Throwable cause) {
    super(message, cause);
  }
}
