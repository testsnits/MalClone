package com.example.animetracker.repository;


import com.example.animetracker.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepo extends JpaRepository<Anime, Long> {

}
