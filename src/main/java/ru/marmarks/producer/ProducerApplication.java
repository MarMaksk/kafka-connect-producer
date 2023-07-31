package ru.marmarks.producer;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.marmarks.producer.entity.PersonalData;
import ru.marmarks.producer.repository.PersonalDataRepository;

@SpringBootApplication
public class ProducerApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(ProducerApplication.class, args);
    PersonalDataRepository dataRepository = context.getBean(PersonalDataRepository.class);
    dataRepository.save(new PersonalData(String.valueOf(ThreadLocalRandom.current().nextInt())));
    dataRepository.save(new PersonalData(String.valueOf(ThreadLocalRandom.current().nextInt())));
    dataRepository.save(new PersonalData(String.valueOf(ThreadLocalRandom.current().nextInt())));
    dataRepository.save(new PersonalData(String.valueOf(ThreadLocalRandom.current().nextInt())));
    dataRepository.save(new PersonalData(String.valueOf(ThreadLocalRandom.current().nextInt())));
  }

}