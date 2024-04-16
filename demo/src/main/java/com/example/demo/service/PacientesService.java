package com.example.demo.service;

import com.example.demo.model.Pacientes;

import java.util.List;
import java.util.Optional;

public interface PacientesService {
    List<Pacientes> getAllPacientes();
    Optional<Pacientes> getPacienteById(Long id);
    Pacientes savePaciente(Pacientes paciente);
    void deletePaciente(Long id);
}
