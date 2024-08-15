package com.persitance.model.entities;



import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.persitance.model.BaseEntity;
import com.persitance.model.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Employee extends BaseEntity {
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	@Column(nullable = false,unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	private Gender genre;
	@OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
	private Banque banque;
	@OneToMany(mappedBy = "employee")
	
	private List<Conge> conges;
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Set<Formation> formations;
	private String grade;
}
