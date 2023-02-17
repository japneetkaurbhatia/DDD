public class Product {
    double price;
    String name;
    int quantity = 1;

    public Product(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public Product(String name, double price, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

}
