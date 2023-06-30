package com.example.myanimelist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Genre {

    @Id
    @JsonProperty("id")
    public Long id;
    @JsonProperty("name")
    public String name;
}
