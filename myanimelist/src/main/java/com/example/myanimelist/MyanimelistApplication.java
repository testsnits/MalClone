package com.example.myanimelist;

import com.example.myanimelist.model.Anime;
import com.example.myanimelist.service.AnimeServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class MyanimelistApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyanimelistApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(AnimeServiceImpl animeService) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Anime>> reference = new TypeReference<List<Anime>>() {};
			InputStream stream = TypeReference.class.getResourceAsStream("/json/animelist.json");
			try {
				List<Anime> animes = mapper.readValue(stream, reference);
				animeService.save(animes);
				System.out.println("Saved!");
			} catch (Exception e) {
				System.out.println("Unable to save! " + e.getMessage());
			}
		};
	}
}
