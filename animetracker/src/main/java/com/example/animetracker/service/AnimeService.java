package com.example.animetracker.service;

import com.example.animetracker.dto.AnimeDTO;
import com.example.animetracker.model.Anime;

import java.util.List;

public interface AnimeService {

    Anime save(Anime anime);

    Iterable<Anime> saveAll(List<AnimeDTO> animeList);
}
