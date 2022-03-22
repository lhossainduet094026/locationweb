package com.lokman.locationweb.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public Location saveLocation(@RequestBody Location location) {
		return locationRepository.save(location);
	}
}
