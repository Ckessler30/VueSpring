package io.moonrake.springboot;

import io.moonrake.springboot.entity.Airplane;
import io.moonrake.springboot.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Override
    public void run(String... args) throws Exception {
        Airplane airplane1 = Airplane.builder()
                .planeType("747")
                .airline("Luftansa")
                .manufacturer("Boeing")
                .build();

        Airplane airplane2 = Airplane.builder()
                .planeType("A320")
                .airline("United")
                .manufacturer("Airbus")
                .build();

        Airplane airplane3 = Airplane.builder()
                .planeType("F-22")
                .airline("United States Air Force")
                .manufacturer("Lockheed Martin")
                .build();

        airplaneRepository.save(airplane1);
        airplaneRepository.save(airplane2);
        airplaneRepository.save(airplane3);

    }
}
