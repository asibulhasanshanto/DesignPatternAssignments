public class Factory {

    public Product getProduct(String productName) {
        if (productName.equals("Product1")) {
            return new Product1("Product1");
        } else if (productName.equals("Product2")) {
            return new Product2("Product2");
        } else {
            return null;
        }
    }
}
