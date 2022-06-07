package lesson3.task;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lesson3.works.Worker;

import java.io.File;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new XmlMapper();

        Worker worker = new Worker();
        worker.setName("Ivan");
        worker.setSurName("Ivanov");
        worker.setMiddleName("Pupkin");
        worker.setAge(35);
        worker.setSalary(150000);
        worker.setExperience(20);
        worker.setId(0);

        File fileWorker = new File("./worker.xml");
        mapper.writeValue(fileWorker, worker);
        Worker worker1 = mapper.readValue(fileWorker, Worker.class);
        System.out.println(worker1);

    }
}
