package com.example.animetracker;

import com.example.animetracker.dto.AnimeDTO;
import com.example.animetracker.service.AnimeServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.util.List;

@SpringBootApplication
public class AnimeTracker {

	@Autowired
	private ObjectMapper objectMapper;

	public static void main(String[] args) {
		SpringApplication.run(AnimeTracker.class, args);
	}

	@Bean
	CommandLineRunner runner(AnimeServiceImpl animeService) {
		return args -> {
			TypeReference<List<AnimeDTO>> reference = new TypeReference<>() {};
//			ClassPathResource resource = new ClassPathResource("/json/animelist.json");
			try {
				List<AnimeDTO> animes = objectMapper.readValue(new ClassPathResource("/json/animelist.json").getFile(), reference);
				animeService.saveAll(animes);
				System.out.println("Saved!");
			} catch (Exception e) {
				System.out.println("Unable to save! " + e.getMessage());
			}
		};
	}
}
