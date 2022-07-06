package on.controller;


import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {
	@GetMapping("/greeting") 
	public String greeting(@RequestParam(required=false) String name) {
		if(LocalTime.now().isAfter(LocalTime.of(14, 0))&& LocalTime.now().isBefore(LocalTime.of(16, 0) ))
			return "https://cataas.com/cat";
		else
		return "Hello " + (name==null?"world": name);
	}
}
