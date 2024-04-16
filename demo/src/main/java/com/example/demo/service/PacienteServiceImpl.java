package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pacientes;
import com.example.demo.repository.PacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacientesService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Pacientes> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<Pacientes> getPacienteById(Long id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public Pacientes savePaciente(Pacientes paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public void deletePaciente(Long id) {
        pacienteRepository.deleteById(id);
    }
}
