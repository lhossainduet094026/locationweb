package com.lokman.locationweb.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lokman.locationweb.Services.LocationService;
import com.lokman.locationweb.Util.EmailUtil;
import com.lokman.locationweb.entities.Location;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationService;

	@Autowired
	private EmailUtil emailUtil;

	@GetMapping("/showCreate")
	public String createLocation() {
		return "createLocation";
	}

	@PostMapping("/saveloc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap map) {

		Location locaton = locationService.saveLocaton(location);
		String successMessage = "Location with Id:" + locaton.getId() + " successfully saved.";
		map.addAttribute("successMessage", successMessage);
		emailUtil.sendEmail("lhossainduet094026@gmail.com", "Location saved email",
				"Location was saved successfully.Enjoy your new location");
		return "createLocation";

	}

	@GetMapping("/displayLocations")
	public String displayLocations(ModelMap map) {

		List<Location> locations = locationService.getAllLocations();
		map.addAttribute("locations", locations);

		return "displayLocations";
	}

	@GetMapping("/deleteLocation")
	public String deleteLocations(@RequestParam("id") int id, ModelMap map) {

		Location location = locationService.getLocationById(id);
		locationService.deleteLocation(location);

		List<Location> locations = locationService.getAllLocations();
		map.addAttribute("locations", locations);

		return "displayLocations";
	}

	@GetMapping("/editLocation")
	public String editLocations(@RequestParam("id") int id, ModelMap map) {

		Location location = locationService.getLocationById(id);
		map.addAttribute("location", location);

		return "editLocation";
	}

	@PostMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap map) {

		locationService.updateLocation(location);
		List<Location> locations = locationService.getAllLocations();
		map.addAttribute("locations", locations);
		return "displayLocations";

	}

}
