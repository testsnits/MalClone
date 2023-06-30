package com.example.myanimelist.repository;


import com.example.myanimelist.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepo extends JpaRepository<Anime, Long> {

}
