package lesson1.task;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import lesson1.orders.Address;
import lesson1.orders.Order;
import lesson1.products.Apple;
import lesson1.products.Orange;
import lesson1.products.Product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<Product> productList = new ArrayList<>();

        Orange orange = new Orange();
        orange.setName("Orange");
        orange.setPrice(125.5);
        orange.setWeight(250.0);
        orange.setBone(true);
        productList.add(orange);

        Apple apple = new Apple();
        apple.setName("Orange");
        apple.setPrice(125.5);
        apple.setWeight(250.0);
        apple.setColor("Red");
        productList.add(apple);

        Address address = new Address();
        address.setCountry("USA");
        address.setCity("Moscow");
        address.setStreet("South");
        address.setNumberOfHouse(48);
        address.setNumberOfFloor(8);
        address.setNumberOfFlat(5);


        List<Order> orderList = new ArrayList<>();
        File file = new File("./order100.json");
        for (int i = 1; i <= 100; i++) {
            Order order = new Order();
            order.setNumOrder(i);
            order.setAddress(address);
            order.setProductList(productList);

            orderList.add(order);

        }
        mapper.writeValue(file, orderList);
        ObjectReader objectReader = mapper
                .readerForListOf(Order.class);
        List<Order> order100 = objectReader
                .readValue(file);
        System.out.println(order100);

    }
}
