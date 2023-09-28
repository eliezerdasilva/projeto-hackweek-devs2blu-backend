package br.com.devstoblu.hackWeek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class HackWeekApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackWeekApplication.class, args);
	}

	@GetMapping(value = "/healthCheck")
	public String helthCheck(){
		return "test";
	}

}
