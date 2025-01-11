package com.realstate.app.nicehome.repository;

import com.realstate.app.nicehome.entity.Rentals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RentalRepository extends JpaRepository<Rentals, Integer> {

    Optional<Rentals> findByUser (String name);


}
