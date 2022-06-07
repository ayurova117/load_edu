package lesson1.products;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Apple extends Product{

    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + getPrice() +
                ", name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", color='" + color + '\'' +
                "} ";
    }
}
