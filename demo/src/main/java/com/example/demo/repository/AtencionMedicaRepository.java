package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AtencionMedica;

public interface AtencionMedicaRepository extends JpaRepository<AtencionMedica, Long> {
    
}
