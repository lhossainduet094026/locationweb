package com.lokman.locationweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {

	@GetMapping("/showCreate")
	public String createLocation() {
		return "createLocation";
	}
}
