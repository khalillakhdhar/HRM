package com.persitance.model.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.persitance.model.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class Formation extends BaseEntity {
private String titre;
private String debut;
private String fin;
private double prix;
private String description;
private String formateur;
@ManyToMany(mappedBy = "formations")
private Set<Employee> employees;

}
