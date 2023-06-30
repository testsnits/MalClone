package com.example.myanimelist.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Anime {

//
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public int status;
    public int score;
    public String tags;
    public Long is_rewatching;
    public Long num_watched_episodes;
    public Long created_at;
    public Long updated_at;
    public String anime_title;
    public String anime_title_eng;
    public int anime_num_episodes;
    public int anime_airing_status;
    public Long anime_id;
    public String anime_studios;
    public String anime_licensors;
    public String anime_season;
    public Long anime_total_members;
    public Long anime_total_scores;
    public Double anime_score_val;
    public Boolean has_episode_video;
    public Boolean has_promotion_video;
    public Boolean has_video;
    public String video_url;
    @Embedded
    @Column(name="genre_id", insertable=false, updatable=false)
    public Genre genres;
    @Embedded
    @Column(name="demographic_id", insertable=false, updatable=false)
    public Demographic demographics;
    public String title_localized;
    public String anime_url;
    public String anime_imagePath;
    public Boolean is_added_to_list;
    public String anime_media_type_string;
    public String anime_mpaa_rating_string;
    public String start_date_string;
    public String finish_date_string;
    public String anime_start_date_string;
    public String anime_end_date_string;
    public String days_string;
    public String storage_string;
    public String priority_string;
    public String notes;
    public String editable_notes;
}
