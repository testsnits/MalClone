package com.example.myanimelist.repository;

import com.example.myanimelist.model.Demographic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemographicRepo extends JpaRepository<Demographic, Long> {
}
