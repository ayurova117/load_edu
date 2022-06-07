package lesson2.animalNursery;

import lesson2.address.Address;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

public class Nursery {

   @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "animal")
    private List<Object> animalList = new ArrayList<>();
    private Address address;
    private String name;

    public List<Object> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Object> animalList) {
        this.animalList = animalList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Nursery{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append(", animalList=").append(animalList);
        sb.append('}');
        return sb.toString();
    }
}
