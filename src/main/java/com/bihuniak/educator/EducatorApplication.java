package com.bihuniak.educator;

import com.bihuniak.educator.basic.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;


@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;
	private HumanRepository humanRepository;
	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Car car = new Car("Passeraty", "WV", 2, 2, true);
		myFirstRepository.saveAll(Collections.singletonList(car));
		Human human = new Human("Kostya", "Gavura", new Address("Prudnicka", new PostCode("50-503"),"Wroclaw", "Polska"), LocalDate.of(1987, 2,21), Sex.MALE);

		humanRepository.save(human);



	}
}
