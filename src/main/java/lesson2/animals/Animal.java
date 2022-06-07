package lesson2.animals;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Animal")
public class Animal {
    @JacksonXmlProperty(isAttribute = true)
    private String type;
    private String name;
    private Integer age;
    private Boolean isTail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getTail() {
        return isTail;
    }

    public void setTail(Boolean tail) {
        isTail = tail;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", isTail=").append(isTail);
        sb.append('}');
        return sb.toString();
    }
}
