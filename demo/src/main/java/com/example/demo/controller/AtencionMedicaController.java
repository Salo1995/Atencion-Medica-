package com.example.demo.controller;

import com.example.demo.model.AtencionMedica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
public class AtencionMedicaController {
    private List<AtencionMedica> atencionesMedicas = new ArrayList<>();

    @GetMapping("/atenciones")
    public List<AtencionMedica> getAtencionesMedicas() {
        return atencionesMedicas;
    }

    @GetMapping("/atenciones/{id}")
    public ResponseEntity<AtencionMedica> getAtencionMedicaPorId(@PathVariable int id) {
        for (AtencionMedica atencion : atencionesMedicas) {
            if (atencion.getIdAtencion() == id) {
                return ResponseEntity.ok(atencion);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
