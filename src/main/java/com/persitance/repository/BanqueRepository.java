package com.persitance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persitance.model.entities.Banque;

public interface BanqueRepository extends JpaRepository<Banque, Long> {

}
