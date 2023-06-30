package com.example.myanimelist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Anime {
    //animeId is the primary key
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
    @Id
    public Long animeId;
    public String animeStudios;
    public String animeLicensors;
    public String animeSeason;
    public Integer animeTotalMembers;
    public Integer animeTotalScores;
    public Double animeScoreVal;
    public Boolean hasEpisodeVideo;
    public Boolean hasPromotionVideo;
    public Boolean hasVideo;
    public String videoUrl;
    public List<Long> genres;
    public List<Long> demographics;
    public String titleLocalized;
    public String animeUrl;
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
