package com.persitance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persitance.model.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
List<Employee> findByNom(String nom);
Employee findByEmailAndPassword(String email,String password);

}
