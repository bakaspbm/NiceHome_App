package com.realstate.app.nicehome.repository;

import com.realstate.app.nicehome.entity.Properties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface proprietyRepository  extends JpaRepository<Properties, Integer> {

    Optional<Properties> findByCategory(String category);

    Optional<Properties> findByprice(int price);

    Optional<Properties> findByTitle(String title);
    Optional<Properties> findByAddress(String address);

}
