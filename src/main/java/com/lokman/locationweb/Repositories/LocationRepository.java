package com.lokman.locationweb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lokman.locationweb.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
