package lesson2.task;

import lesson2.address.Address;
import lesson2.animalNursery.Nursery;
import lesson2.animals.Cat;
import lesson2.animals.Dog;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new XmlMapper();
        List<Object> animals = new ArrayList<>();

        Cat cat = new Cat(); //"", 2, "test"
        cat.setName("Barsik");
        cat.setAge(2);
        cat.setTail(true);
        cat.setKind("Yes");
        animals.add(cat);

        Dog dog = new Dog();
        dog.setName("Puschok");
        dog.setAge(5);
        dog.setTail(false);
        dog.setTrained(true);
        animals.add(dog);

        Address address = new Address();
        address.setCountry("USA");
        address.setCity("Moscow");
        address.setStreet("South");
        address.setNumberOfHouse(48);
        address.setNumberOfFloor(8);
        address.setNumberOfFlat(5);

        Nursery nursery = new Nursery(); //(animals, address, "The best nursery");
        nursery.setName("Pitomnik1");
        nursery.setAddress(address);
        nursery.setAnimalList(animals);


        File file = new File("./nursery.xml");
        mapper.writeValue(file, nursery);
        Nursery nursery1 = mapper.readValue(file, Nursery.class);
        System.out.println(nursery1);
    }
}
