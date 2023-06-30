package com.example.animetracker.repository;

import com.example.animetracker.model.Demographic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemographicRepo extends JpaRepository<Demographic, Long> {
}
