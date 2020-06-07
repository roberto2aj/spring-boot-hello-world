package br.com.roberto2aj.city;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository repository;

	@Override
	public List<City> all() {
		return repository.findAll();
	}

	@Override
	public Optional<City> findById(Integer cityId) {
		return repository.findById(cityId);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public City insert(String cityName) {
		City city = new City(cityName);
		return repository.save(city);
	}

	@Override
	public City update(City city) {
		return repository.save(city);
	}

}
