package com.lokman.locationweb.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.lokman.locationweb.Services.LocationService;
import com.lokman.locationweb.entities.Location;

@Controller
public class LocationController {

	@Autowired
	LocationService locationService;

	@GetMapping("/showCreate")
	public String createLocation() {
		return "createLocation";
	}

	@PostMapping("/saveloc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap map) {

		Location locaton = locationService.saveLocaton(location);
		String successMessage = "Location with Id:" + locaton.getId() + " successfully saved.";
		map.addAttribute("successMessage", successMessage);
		return "createLocation";

	}

	@GetMapping("/displayLocations")
	public String displayLocations(ModelMap map) {

		List<Location> locations = locationService.getAllLocations();
		map.addAttribute("locations", locations);

		return "displayLocations";
	}

}
