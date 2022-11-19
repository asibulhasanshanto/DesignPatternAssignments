
public class Client {
    public static void main(String[] args) {
        
        Factory factory = new Factory();
        Product product1 = factory.getProduct("Product1");
        Product product2 = factory.getProduct("Product2");

        System.out.println(product1.getName());
        System.out.println(product2.getName());
    
    }
}
