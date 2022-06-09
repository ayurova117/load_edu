package lesson3.task;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lesson3.works.Address;
import lesson3.works.Office;
import lesson3.works.Worker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) throws IOException {
        Integer countWorker = 10;
        Integer countOffice = 100;

        ObjectMapper mapper = new XmlMapper();
        List<Worker> workerList = new ArrayList<>();
        List<Office> officeList = new ArrayList<>();

        Address address = new Address();
        address.setCountry("USA");
        address.setCity("Moscow");
        address.setStreet("South");
        address.setNumberOfHouse(48);
        address.setNumberOfFloor(8);
        address.setNumberOfFlat(5);

        for (int i = 0; i < countWorker; i++) {
            Worker worker = new Worker();
            worker.setName("Ivan");
            worker.setSurName("Ivanov");
            worker.setMiddleName("Pupkin");
            worker.setAge(35);
            worker.setSalary(150000);
            worker.setExperience(20);
            worker.setId(i);
            workerList.add(worker);
        }
        for (int i = 0; i < countOffice; i++) {
            Office office = new Office();
            office.setAddress(address);
            office.setWorker(workerList);
            officeList.add(office);
        }
        File file = new File("./office.xml");
        mapper.writeValue(file, officeList);
        ObjectReader objectReader = mapper
                .readerForListOf(Office.class);
        List<Object> office100 = objectReader
                .readValue(file);
        System.out.println(office100);

    }
}
