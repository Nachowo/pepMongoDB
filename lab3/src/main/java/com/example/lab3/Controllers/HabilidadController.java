package com.example.lab3.Controllers;

import com.example.lab3.Services.HabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HabilidadController {
    private final HabilidadService habilidadService;

    public HabilidadController(HabilidadService habilidadService) {
        this.habilidadService = habilidadService;
    }

    @GetMapping("/habilidades/all")
    public String getAllHabilidades(){
        return habilidadService.getAllHabilidades().toString();
    }
}
