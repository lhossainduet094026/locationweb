package com.lokman.locationweb.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lokman.locationweb.Repositories.LocationRepository;
import com.lokman.locationweb.entities.Location;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location saveLocaton(Location location) {
		return locationRepository.save(location);

	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepository.delete(location);

	}

	@Override
	public Location getLocationById(int locationId) {
		Location location = null;
		Optional<Location> locationOptional = locationRepository.findById(locationId);
		if (locationOptional.isPresent()) {
			location = locationOptional.get();
		}
		return location;

	}

	@Override
	public List<Location> getAllLocations() {

		return locationRepository.findAll();
	}

}
