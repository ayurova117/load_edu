package lesson2.animals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Cat")
public class Cat extends Animal{

    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cat{");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", age=").append(getAge());
        sb.append(", isTail=").append(getTail());
        sb.append(", kind='").append(kind).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
