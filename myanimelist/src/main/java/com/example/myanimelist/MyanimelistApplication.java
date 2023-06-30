package com.example.myanimelist;

import com.example.myanimelist.dto.AnimeDTO;
import com.example.myanimelist.model.Anime;
import com.example.myanimelist.service.AnimeServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class MyanimelistApplication {

	@Autowired
	private ObjectMapper objectMapper;

	public static void main(String[] args) {
		SpringApplication.run(MyanimelistApplication.class, args);
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
