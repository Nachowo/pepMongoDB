package com.example.lab3.Controllers;

import com.example.lab3.Services.VoluntarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoluntarioController {
    private final VoluntarioService voluntarioService;

    public VoluntarioController(VoluntarioService voluntarioService) {
        this.voluntarioService = voluntarioService;
    }

    @GetMapping("/voluntarios")
    public int cantidadVoluntarios(){
        return voluntarioService.cantidadVoluntarios();
    }

    @GetMapping("/voluntarios/all")
    public String getAllVoluntarios(){
        return voluntarioService.getAllVoluntarios().toString();
    }
}
