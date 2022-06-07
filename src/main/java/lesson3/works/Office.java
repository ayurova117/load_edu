package lesson3.works;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "office")
public class Office {

    private Address address;
    @JacksonXmlElementWrapper(localName = "workers")
    private List<Worker> worker = new ArrayList<>();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Worker> getWorker() {
        return worker;
    }

    public void setWorker(List<Worker> worker) {
        this.worker = worker;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Office{");
        sb.append("address=").append(address);
        sb.append(", workers=").append(worker);
        sb.append('}');
        return sb.toString();
    }
}
