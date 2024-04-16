package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pacientes; 

public interface PacienteRepository extends JpaRepository<Pacientes, Long> {
    
}
