package com.persitance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persitance.model.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
List<Formation> findByPrixLessThan(double prix);
List<Formation> findByDescriptionContaining(String description);
}
