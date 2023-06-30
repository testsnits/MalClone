package com.example.myanimelist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Demographic {

    @Id
    @JsonProperty("id")
    public Long id;
    @JsonProperty("name")
    public String name;

}
