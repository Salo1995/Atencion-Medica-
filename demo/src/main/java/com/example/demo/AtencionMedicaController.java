package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;



@RestController

public class AtencionMedicaController {
    private List<AtencionMedica> peliculas = new ArrayList<>();

    public AtencionMedicaController(){

        peliculas.add(new AtencionMedica(0, "Titanic", 2000, "James Cameron", "Romantica", "Una Historia de amor"));
    }

    @GetMapping("/peliculas")
    public List <AtencionMedica> getPeliculas() {
        return peliculas;
    }
    @GetMapping("/peliculas/{id}")
    public AtencionMedica getPeliculasId(@PathVariable int id) {
        for (AtencionMedica pelicula : peliculas){
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }
}
