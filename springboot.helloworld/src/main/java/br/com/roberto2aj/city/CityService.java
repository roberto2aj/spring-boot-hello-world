package br.com.roberto2aj.city;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface CityService {

	List<City> all();

	Optional<City> findById(Integer cityId);

}