package com.lokman.locationweb.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lokman.locationweb.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

	@Query("select type,count(type) total from location group by type")
	List<Object[]> findTypeAndTypeCount();

}
