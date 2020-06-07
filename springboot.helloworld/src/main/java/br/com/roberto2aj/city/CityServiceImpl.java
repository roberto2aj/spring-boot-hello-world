package br.com.roberto2aj.city;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository repository;

	@Override
	public List<City> all() {
		return repository.findAll();
	}

	@Override
	public City findById(Integer cityId) {
		Optional<City> city = repository.findById(cityId);
		return city.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "City not found"));
	}

	@Override
	public void delete(Integer cityId) {
		repository.delete(findById(cityId));
	}

	@Override
	public City insert(String cityName) {
		City city = new City(cityName);
		return repository.save(city);
	}

	@Override
	public City update(City city) {
		findById(city.getId());
		return repository.save(city);
	}

}
