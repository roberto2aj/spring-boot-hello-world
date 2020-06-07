package br.com.roberto2aj.city;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {

	@Autowired
	private CityService service;

	@GetMapping
	public ResponseEntity<List<City>> all() {
		return ResponseEntity.ok(service.all());
	}

	@GetMapping("{cityId}")
	public ResponseEntity<City> findById(@PathVariable Integer cityId) {
		return ResponseEntity.of(service.findById(cityId));
	}

}
