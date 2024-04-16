package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AtencionMedica;
import com.example.demo.repository.AtencionMedicaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AtencionMedicaServiceImpl implements AtencionMedicaService {

    @Autowired
    private AtencionMedicaRepository atencionMedicaRepository;

    @Override
    public List<AtencionMedica> getAllAtencionesMedicas() {
        return atencionMedicaRepository.findAll();
    }

    @Override
    public Optional<AtencionMedica> getAtencionMedicaById(Long id) {
        return atencionMedicaRepository.findById(id);
    }

    @Override
    public AtencionMedica saveAtencionMedica(AtencionMedica atencionMedica) {
        return atencionMedicaRepository.save(atencionMedica);
    }

    @Override
    public void deleteAtencionMedica(Long id) {
        atencionMedicaRepository.deleteById(id);
    }
}
