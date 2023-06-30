package com.example.myanimelist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
//@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Anime  {

    //ID is animeId
    @JsonProperty("status")
    public Integer status;
    @JsonProperty("score")
    public Integer score;
    @JsonProperty("tags")
    public String tags;
    @JsonProperty("is_rewatching")
    public Integer isRewatching;
    @JsonProperty("num_watched_episodes")
    public Integer numWatchedEpisodes;
    @JsonProperty("created_at")
    public Integer createdAt;
    @JsonProperty("updated_at")
    public Integer updatedAt;
    @JsonProperty("anime_title")
    public String animeTitle;
    @JsonProperty("anime_title_eng")
    public String animeTitleEng;
    @JsonProperty("anime_num_episodes")
    public Integer animeNumEpisodes;
    @JsonProperty("anime_airing_status")
    public Integer animeAiringStatus;
    @Id
    @JsonProperty("anime_id")
    public Long animeId;
    @JsonProperty("anime_studios")
    public String animeStudios;
    @JsonProperty("anime_licensors")
    public String animeLicensors;
    @JsonProperty("anime_season")
    public String animeSeason;
    @JsonProperty("anime_total_members")
    public Integer animeTotalMembers;
    @JsonProperty("anime_total_scores")
    public Integer animeTotalScores;
    @JsonProperty("anime_score_val")
    public Double animeScoreVal;
    @JsonProperty("has_episode_video")
    public Boolean hasEpisodeVideo;
    @JsonProperty("has_promotion_video")
    public Boolean hasPromotionVideo;
    @JsonProperty("has_video")
    public Boolean hasVideo;
    @JsonProperty("video_url")
    public String videoUrl;
    @JsonProperty("genres")
    public List<Long> genres;
    @JsonProperty("demographics")
    public List<Long> demographics;
    @JsonProperty("title_localized")
    public String titleLocalized;
    @JsonProperty("anime_url")
    public String animeUrl;
    @JsonProperty("anime_image_path")
    public String animeImagePath;
    @JsonProperty("is_added_to_list")
    public Boolean isAddedToList;
    @JsonProperty("anime_media_type_string")
    public String animeMediaTypeString;
    @JsonProperty("anime_mpaa_rating_string")
    public String animeMpaaRatingString;
    @JsonProperty("start_date_string")
    public String startDateString;
    @JsonProperty("finish_date_string")
    public String finishDateString;
    @JsonProperty("anime_start_date_string")
    public String animeStartDateString;
    @JsonProperty("anime_end_date_string")
    public String animeEndDateString;
    @JsonProperty("days_string")
    public String daysString;
    @JsonProperty("storage_string")
    public String storageString;
    @JsonProperty("priority_string")
    public String priorityString;
    @JsonProperty("notes")
    public String notes;
    @JsonProperty("editable_notes")
    public String editableNotes;
}
