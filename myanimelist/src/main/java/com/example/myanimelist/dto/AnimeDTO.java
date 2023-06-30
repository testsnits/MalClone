package com.example.myanimelist.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimeDTO {
    public Integer status;
    public Integer score;
    public String tags;
    public Integer isRewatching;
    public Integer numWatchedEpisodes;
    public Integer createdAt;
    public Integer updatedAt;
    public String animeTitle;
    public String animeTitleEng;
    public Integer animeNumEpisodes;
    public Integer animeAiringStatus;
    public Long animeId;
    public Object animeStudios;
    public Object animeLicensors;
    public Object animeSeason;
    public Integer animeTotalMembers;
    public Integer animeTotalScores;
    public Double animeScoreVal;
    public Boolean hasEpisodeVideo;
    public Boolean hasPromotionVideo;
    public Boolean hasVideo;
    public String videoUrl;
    public List<GenreDTO> genres;
    public List<DemographicDTO> demographics;
    public String titleLocalized;
    public String animeImagePath;
    public Boolean isAddedToList;
    public String animeMediaTypeString;
    public String animeMpaaRatingString;
    public String startDateString;
    public String finishDateString;
    public String animeStartDateString;
    public String animeEndDateString;
    public String daysString;
    public String storageString;
    public String priorityString;
    public String notes;
    public String editableNotes;

}
