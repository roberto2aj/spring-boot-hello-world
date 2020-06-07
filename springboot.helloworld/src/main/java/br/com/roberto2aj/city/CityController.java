package br.com.roberto2aj.city;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityController {

	@Autowired
	private CityService service;

	@GetMapping
	public List<City> all() {
		return service.all();
	}

	@GetMapping("{cityId}")
	public City findById(@PathVariable Integer cityId) {
		return service.findById(cityId).get();
	}

	@PostMapping
	public City insert(@RequestBody String cityName) {
		return service.insert(cityName);
	}

	@PutMapping
	public City update(@RequestBody City city) {
		return service.update(city);
	}

	@DeleteMapping
	public void delete(@RequestBody Integer id) {
		service.delete(id);
	}

}
