package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Pacientes;
import com.example.demo.service.PacientesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paciente")
public class PacientesController {

    @Autowired
    private PacientesService usuarioService;
    private PacientesService pacienteService;

    @GetMapping
    public List<Pacientes> getAllUsuario() {
        return usuarioService.getAllPacientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pacientes> getUsuarioById(@PathVariable Long id) {
        Optional<Pacientes> usuario = usuarioService.getPacienteById(id);
        return usuario.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaciente(@PathVariable Long id) {
        pacienteService.deletePaciente(id);
        return ResponseEntity.noContent().build();
    }
}
