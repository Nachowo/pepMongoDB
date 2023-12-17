package com.example.lab3.Services;

import com.example.lab3.Models.Habilidad;
import com.example.lab3.repositories.HabilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HabilidadService {
    @Autowired
    private HabilidadRepository habilidadRepository;

    public List<Habilidad> getAllHabilidades(){
        return habilidadRepository.getAllHabilidades();
    }
}

