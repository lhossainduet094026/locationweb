package com.lokman.locationweb.Services;

import java.util.List;

import com.lokman.locationweb.entities.Location;

public interface LocationService {

	Location saveLocaton(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int locationId);

	List<Location> getAllLocations();

}
