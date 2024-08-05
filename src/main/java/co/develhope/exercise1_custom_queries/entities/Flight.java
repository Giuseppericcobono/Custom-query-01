package co.develhope.exercise1_custom_queries.entities;

import co.develhope.exercise1_custom_queries.enums.Status;
import co.develhope.exercise1_custom_queries.services.FlightService;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "Flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String description;

    @Column
    private String fromAirport;

    @Column
    private String toAirport;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Flight() {}

    public Flight(Integer id, String description, String fromAirport, String toAirport, Status status) {
        this.id = id;
        this.description = description;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
