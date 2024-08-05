package co.develhope.exercise1_custom_queries.controllers;

import co.develhope.exercise1_custom_queries.entities.Flight;
import co.develhope.exercise1_custom_queries.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/create")
    public void createFlights () {
        flightService.init();
    }

    @GetMapping("/list")
    public List<Flight> listOfFlights () {
        return flightService.listOfFlights();
    }
}