package com.example.demo.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.hateoas.EntityModel;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.AtencionMedica;
import com.example.demo.model.Pacientes;
import com.example.demo.service.AtencionMedicaService;

@WebMvcTest(AtencionMedicaController.class)
public class AtencionMedicaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AtencionMedicaService atencionMedicaServiceMock;

    @Test
    public void obtenerTodosTest() throws Exception {
        Pacientes paciente1 = new Pacientes();
        paciente1.setName("John");
        paciente1.setId(1L);
        Pacientes paciente2 = new Pacientes();
        paciente2.setName("Doe");
        paciente2.setId(2L);
        List<Pacientes> pacientes = List.of(paciente1, paciente2);

        List<EntityModel<Pacientes>> pacientesResources = pacientes.stream()
                .map(paciente -> EntityModel.of(paciente))
                .collect(Collectors.toList());


        mockMvc.perform(get("/atencion-medica"))
                .andExpect(status().isOk())
                // Aquí, utiliza una coincidencia directa de la ruta JSON sin Matchers
                .andExpect(jsonPath("$._embedded.atencionMedica.length()").value(2))
                .andExpect(jsonPath("$._embedded.atencionMedica[0].name").value("John"))
                .andExpect(jsonPath("$._embedded.atencionMedica[1].name").value("Doe"))
                .andExpect(jsonPath("$._embedded.atencionMedica[0]._links.self.href").value("http://localhost:8080/atencion-medica/1"))
                .andExpect(jsonPath("$._embedded.atencionMedica[1]._links.self.href").value("http://localhost:8080/atencion-medica/2"));
    }
}
