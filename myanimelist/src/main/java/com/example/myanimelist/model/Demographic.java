package com.example.myanimelist.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Demographic {

    @Column(name="demographic_id")
    private Long id;
    @Column(name="demographic_name")
    private String name;

}
