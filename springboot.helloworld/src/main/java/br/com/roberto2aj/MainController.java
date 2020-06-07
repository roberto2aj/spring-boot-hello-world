package br.com.roberto2aj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public List<String> helloWorld() {
		List<String> helloWorld = new ArrayList<>();
		helloWorld.addAll(Arrays.asList("Hello", "World", "!"));
		return helloWorld;
	}

}
