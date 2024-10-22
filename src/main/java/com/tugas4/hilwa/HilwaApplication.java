package com.tugas4.hilwa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HilwaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HilwaApplication.class, args);
	}

	@RestController
	// @Controller
	class PerdanaController {
		@GetMapping("/")
		// @ResponseBody
		public String hello() {
			return "food";
		}
	}
}