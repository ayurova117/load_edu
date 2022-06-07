package lesson2.task;

import lesson2.animals.Animal;
import lesson2.animals.Cat;
import lesson2.animals.Dog;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new XmlMapper();

        Animal animal = new Animal();
        animal.setName("animal");
        animal.setAge(5);
        animal.setTail(true);
        File fileAnimal = new File("./animal.xml");
        mapper.writeValue(fileAnimal, animal);
        Animal animals = mapper.readValue(fileAnimal, Animal.class);
        System.out.println(animals);

        Cat cat = new Cat();
        cat.setName("Puschok");
        cat.setAge(3);
        cat.setTail(true);
        cat.setKind("Yes");
        File fileCat = new File("./cat.xml");
        mapper.writeValue(fileCat, cat);
        Cat cats = mapper.readValue(fileCat, Cat.class);
        System.out.println(cat);

        Dog dog = new Dog();
        dog.setName("Sharik");
        dog.setAge(3);
        dog.setTail(true);
        dog.setTrained(true);
        File fileDog = new File("./dog.xml");
        mapper.writeValue(fileDog, dog);
        Dog dogs = mapper.readValue(fileDog, Dog.class);
        System.out.println(dog);
    }
}
