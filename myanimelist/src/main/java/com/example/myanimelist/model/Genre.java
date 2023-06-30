package com.example.myanimelist.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Genre {
    @Column(name="genre_id")
    private Long id;
    @Column(name="genre_name")
    private String name;

}
