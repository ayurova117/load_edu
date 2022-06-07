package lesson1.products;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Orange extends Product{

    private boolean isBone;

    public boolean isBone() {
        return isBone;
    }

    public void setBone(boolean bone) {
        isBone = bone;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "price=" + getPrice() +
                ", name='" + getName() + '\'' +
                ", weight=" + getWeight() +
                ", isBone=" + isBone +
                "} ";
    }
}
