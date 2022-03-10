package fi.oscar.mavengitflowplugindemo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ari on 10.03.2022
 */
@RequestMapping("/api/v1")
@RestController
public class Controller {

	@GetMapping("/something")
	public String getSomething() {
		return "This is something else!";
	}
}
