package com.lokman.locationweb.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lokman.locationweb.Repositories.LocationRepository;
import com.lokman.locationweb.entities.Location;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

	@Autowired
	private LocationRepository locationRepository;

	@GetMapping
	public List<Location> getAllLocations() {
		return locationRepository.findAll();

	}

	@PostMapping
	public Location createLocation(@RequestBody Location location) {
		return locationRepository.save(location);
	}

	@PutMapping
	public Location updateLocation(@RequestBody Location location) {

		return locationRepository.save(location);
	}

	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {

		locationRepository.deleteById(id);
	}

	@GetMapping("/{id}")
	public Location getOneLocation(@PathVariable("id") int id) {

		Optional<Location> locationOptional = locationRepository.findById(id);
		return locationOptional.get();
	}

}
