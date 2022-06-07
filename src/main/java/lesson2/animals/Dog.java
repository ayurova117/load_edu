package lesson2.animals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Dog")
public class Dog extends Animal {

    private boolean isTrained;

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dog{");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", age=").append(getAge());
        sb.append(", isTail=").append(getTail());
        sb.append(", isTrained=").append(isTrained);
        sb.append('}');
        return sb.toString();
    }
}
