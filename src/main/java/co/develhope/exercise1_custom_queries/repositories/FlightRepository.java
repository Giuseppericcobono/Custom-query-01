package co.develhope.exercise1_custom_queries.repositories;

import co.develhope.exercise1_custom_queries.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
}