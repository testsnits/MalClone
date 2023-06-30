package com.example.myanimelist.service;

import com.example.myanimelist.dto.AnimeDTO;
import com.example.myanimelist.model.Anime;

import java.util.List;

public interface AnimeService {

    Anime save(Anime anime);

    Iterable<Anime> saveAll(List<AnimeDTO> animeList);
}
