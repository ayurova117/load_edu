package lesson1.task;

import lesson1.products.Apple;
import lesson1.products.Orange;
import lesson1.products.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Product product = new Product();
        product.setName("Апельсин");
        product.setPrice(100.00);
        product.setWeight(1.9);
        File fileOProduct = new File("./product.json");
        mapper.writeValue(fileOProduct, product);
        Product product1 = mapper.readValue(fileOProduct, Product.class);
        System.out.println(product1);

        Orange orange = new Orange();
        orange.setName("Апельсин");
        orange.setPrice(200.00);
        orange.setWeight(1.5);
        orange.setBone(true);
        File fileOrange = new File("./orange.json");
        mapper.writeValue(fileOrange, orange);
        Product productOrange = mapper.readValue(fileOrange, Product.class);
        System.out.println(productOrange);

        Apple apple = new Apple();
        apple.setName("Яблоко");
        apple.setPrice(80.00);
        apple.setWeight(0.3);
        apple.setColor("Красный");
        File fileApple = new File("./apple.json");
        mapper.writeValue(fileApple, apple);
        Product productApple = mapper.readValue(fileApple, Product.class);
        System.out.println(productApple);
    }
}
