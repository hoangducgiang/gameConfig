package com.minearena.gameconfig;

import com.minearena.gameconfig.entity.repo.MapRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameconfigApplication implements CommandLineRunner {


	@Autowired
	private MapRepo mapRepo;

	public static void main(String[] args) {
		SpringApplication.run(GameconfigApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(mapRepo.findAll());
	}
}
