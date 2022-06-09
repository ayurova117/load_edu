package lesson1.task;

import lesson1.orders.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import lesson1.products.Apple;
import lesson1.products.Orange;
import lesson1.products.Product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Order order = new Order();
        order.setNumOrder(1);
        ArrayList<Product> productList = new ArrayList<>();

        Orange orange = new Orange();
        orange.setName("Апельсин");
        orange.setPrice((int) (Math.random() * 100));
        orange.setWeight((int) (Math.random() * 100));
        orange.setBone(false);
        productList.add(orange);

        Apple apple = new Apple();
        apple.setName("Яблоко");
        apple.setPrice((int) (Math.random() * 100));
        apple.setWeight((int) (Math.random() * 100));
        apple.setColor("Красный");
        productList.add(apple);

        order.setProductList(productList);
        File file = new File("./order.json");
        mapper.writeValue(file, order);
        Order order1 = mapper.readValue(file, Order.class);
        System.out.println(order1);
    }
}
