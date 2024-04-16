package com.example.demo.service;

import com.example.demo.model.AtencionMedica;

import java.util.List;
import java.util.Optional;

public interface AtencionMedicaService {
    List<AtencionMedica> getAllAtencionesMedicas();
    Optional<AtencionMedica> getAtencionMedicaById(Long id);
    AtencionMedica saveAtencionMedica(AtencionMedica atencionMedica);
    void deleteAtencionMedica(Long id);
}
