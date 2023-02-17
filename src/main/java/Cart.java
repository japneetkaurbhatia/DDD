// add apple pencil to cart
// add sony headphones
// add 2 apple pencil to cart
import java.util.*;

class Product {
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

public class Cart {
    public static ArrayList<String> Product = new ArrayList<String>();
    public static  String product = "";
    public static void main(String args[]) {
        Product applePencil = new Product("Apple Pencil", 34.03);
        product = addToCart(applePencil);
        Product.add(product);

        Product sonyHeadphone = new Product("Sony Headphone",340.03);
        product = addToCart(sonyHeadphone);
        Product.add(product);

        Product applePencil2 = new Product("Apple Pencil", 34.03, 2);
        product = addToCart(applePencil2);
        Product.add(product);

        Product headphone = new Product("Headphone",340.03);
        product = addToCart(headphone);
        Product.add(product);

        System.out.println(Product);

        removeFromCart(headphone);

        System.out.println(Product);
    }


    public static String addToCart(Product product) {
        String result = product.name;
        return result;
    }

    public static void removeFromCart(Product product) {
        for(int i = 0; i < Product.size(); i++) {
            if(Product.get(i).equals(product.name) )
                Product.remove(i);
        }
    }
}