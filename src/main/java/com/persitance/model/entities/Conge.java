package com.persitance.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.persitance.model.BaseEntity;
import com.persitance.model.Etat;
import com.persitance.model.TypeCn;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
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
public class Conge extends BaseEntity {
private String titre;
private String description;
private TypeCn type;
private Etat etat;
@ManyToOne(fetch = FetchType.EAGER,optional = false)
private Employee employee;
private String debut;
private int duree;

}
