package lesson1.task;

import lesson1.products.Apple;
import lesson1.products.Orange;
import lesson1.products.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Product product = new Product();
        product.setName("Апельсин");
        product.setPrice((int) (Math.random() * 100)); // (int) (Math.random() * 50)
        product.setWeight((int) (Math.random() * 50));
        File fileProduct = new File("./product.json");
        mapper.writeValue(fileProduct, product);
        Product product1 = mapper.readValue(fileProduct, Product.class);
        System.out.println(product1);

        Orange orange = new Orange();
        orange.setName("Апельсин");
        orange.setPrice((int) (Math.random() * 100));
        orange.setWeight((int) (Math.random() * 50));
        orange.setBone(true);
        File fileOrange = new File("./orange.json");
        mapper.writeValue(fileOrange, orange);
        Product productOrange = mapper.readValue(fileOrange, Product.class);
        System.out.println(productOrange);

        Apple apple = new Apple();
        apple.setName("Яблоко");
        apple.setPrice((int) (Math.random() * 100));
        apple.setWeight((int) (Math.random() * 50));
        apple.setColor("Красный");
        File fileApple = new File("./apple.json");
        mapper.writeValue(fileApple, apple);
        Product productApple = mapper.readValue(fileApple, Product.class);
        System.out.println(productApple);
    }
}
