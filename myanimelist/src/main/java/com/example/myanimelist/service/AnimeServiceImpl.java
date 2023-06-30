package com.example.myanimelist.service;

import com.example.myanimelist.model.Anime;
import com.example.myanimelist.repository.AnimeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeServiceImpl implements AnimeService{
    private final AnimeRepo animeRepo;

    //To save all the animes from JSON to mysql
    public void save(List<Anime> animes) {
        animeRepo.saveAll(animes);
    }

    @Override
    public Anime save(Anime anime){
        return animeRepo.save(anime);
    }








}
