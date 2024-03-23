package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AtencionMedicaController {
    private List<AtencionMedica> atencionesMedicas = new ArrayList<>();

    public AtencionMedicaController(){
        // Se agregan algunas atenciones médicas de ejemplo
        atencionesMedicas.add(new AtencionMedica(1, "Juan Pérez", "12345678-9", "Av. Libertad 123", "Dolor de cabeza", "Migraña", "Repaso y reposo", "Paracetamol", "2024-03-19", "Dr. García", "Pendiente", "Se programará nueva consulta en 1 semana"));
        atencionesMedicas.add(new AtencionMedica(2, "María López", "98765432-1", "Calle Flores 456", "Dolor abdominal", "Gastritis", "Dieta balanceada y antiácidos", "Omeprazol", "2024-03-20", "Dr. Martínez", "Finalizado", "Paciente en seguimiento"));
    }

    @GetMapping("/atenciones")
    public List <AtencionMedica> getAtencionesMedicas() {
        return atencionesMedicas;
    }

    @GetMapping("/atenciones/{id}")
    public AtencionMedica getAtencionMedicaPorId(@PathVariable int id) {
        for (AtencionMedica atencion : atencionesMedicas){
            if (atencion.getId() == id) {
                return atencion;
            }
        }
        return null;
    }
}
