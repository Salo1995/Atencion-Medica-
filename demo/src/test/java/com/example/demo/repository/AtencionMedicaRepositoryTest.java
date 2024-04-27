package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.model.AtencionMedica;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AtencionMedicaRepositoryTest {
    @Autowired
    private AtencionMedicaRepository atencionMedicaRepository;

    @Test
    public void consultaIdPacienteTest() {
        // Crea una nueva instancia de AtencionMedica
        AtencionMedica atencionMedica = new AtencionMedica();
        atencionMedica.setIdPaciente(21130780-2);

        // Guarda la instancia en la base de datos usando el repositorio
        AtencionMedica resultado = atencionMedicaRepository.save(atencionMedica);

        // Verifica que el ID no sea nulo después de guardar
        assertNotNull(resultado.getIdPaciente());
        // Verifica que el nombre sea igual al proporcionado al guardar
        assertEquals("21130780-2", resultado.getIdPaciente());
    }
}
