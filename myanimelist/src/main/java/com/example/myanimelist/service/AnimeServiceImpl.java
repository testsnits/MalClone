package com.example.myanimelist.service;

import com.example.myanimelist.dto.AnimeDTO;
import com.example.myanimelist.model.Anime;
import com.example.myanimelist.model.Demographic;
import com.example.myanimelist.model.Genre;
import com.example.myanimelist.repository.AnimeRepo;
import com.example.myanimelist.repository.DemographicRepo;
import com.example.myanimelist.repository.GenreRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AnimeServiceImpl implements AnimeService{
    private final AnimeRepo animeRepo;
    private final GenreRepo genreRepo;
    private final DemographicRepo demographicRepo;


    @Override
    public Anime save(Anime anime){
        return animeRepo.save(anime);
    }
    @Override
    public Iterable<Anime> saveAll(List<AnimeDTO> animeList) {

        List<Anime> animes = animeList.stream()
                .map(animeDTO -> Anime.builder()
                        .status(animeDTO.getStatus())
                        .score(animeDTO.getScore())
                        .tags(animeDTO.getTags())
                        .isRewatching(animeDTO.getIsRewatching())
                        .numWatchedEpisodes(animeDTO.getNumWatchedEpisodes())
                        .createdAt(animeDTO.getCreatedAt())
                        .updatedAt(animeDTO.getUpdatedAt())
                        .animeTitle(animeDTO.getAnimeTitle())
                        .animeTitleEng(animeDTO.getAnimeTitleEng())
                        .animeNumEpisodes(animeDTO.getAnimeNumEpisodes())
                        .animeAiringStatus(animeDTO.getAnimeAiringStatus())
                        .animeId(animeDTO.getAnimeId())
                        .animeStudios(animeDTO.getAnimeStudios())
                        .animeLicensors(animeDTO.getAnimeLicensors())
                        .animeSeason(animeDTO.getAnimeSeason())
                        .animeTotalMembers(animeDTO.getAnimeTotalMembers())
                        .animeTotalScores(animeDTO.getAnimeTotalScores())
                        .animeScoreVal(animeDTO.getAnimeScoreVal())
                        .hasEpisodeVideo(animeDTO.getHasEpisodeVideo())
                        .hasPromotionVideo(animeDTO.getHasPromotionVideo())
                        .hasVideo(animeDTO.getHasVideo())
                        .videoUrl(animeDTO.getVideoUrl())
                        .titleLocalized(animeDTO.getTitleLocalized())
                        .animeUrl(animeDTO.getAnimeUrl())
                        .animeImagePath(animeDTO.getAnimeImagePath())
                        .isAddedToList(animeDTO.getIsAddedToList())
                        .animeMediaTypeString(animeDTO.getAnimeMediaTypeString())
                        .animeMpaaRatingString(animeDTO.getAnimeMpaaRatingString())
                        .startDateString(animeDTO.getStartDateString())
                        .finishDateString(animeDTO.getFinishDateString())
                        .animeStartDateString(animeDTO.getAnimeStartDateString())
                        .animeEndDateString(animeDTO.getAnimeEndDateString())
                        .daysString(animeDTO.getDaysString())
                        .priorityString(animeDTO.getPriorityString())
                        .notes(animeDTO.getNotes())
                        .editableNotes(animeDTO.getEditableNotes())
                        .build())
                .collect(Collectors.toList());

        List<Genre> genres = animeList.stream()
                .flatMap(animeDTO -> animeDTO.getGenres().stream())
                .map(genreDTO -> Genre.builder()
                        .id(genreDTO.getId())
                        .name(genreDTO.getName())
                        .build())
                .collect(Collectors.toList());
        genreRepo.saveAll(genres);

        List<Demographic> demographics = animeList.stream()
                .flatMap(animeDTO -> animeDTO.getDemographics().stream())
                .map(demographicDTO -> Demographic.builder()
                        .id(demographicDTO.getId())
                        .name(demographicDTO.getName())
                        .build())
                .collect(Collectors.toList());
        demographicRepo.saveAll(demographics);

        return animeRepo.saveAll(animes);
    }
}
