package io.moonrake.springboot.controller;

import io.moonrake.springboot.entity.Airplane;
import io.moonrake.springboot.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class AirplaneController {
    @Autowired
    private AirplaneRepository airplaneRepository;

    @GetMapping("/airplanes")
    public List<Airplane> fetchAirplanes() {
        return airplaneRepository.findAll();

    }
}
