package com.example.lab3.Services;

import com.example.lab3.Models.Voluntario;
import com.example.lab3.repositories.VoluntarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoluntarioService {
    @Autowired
    private VoluntarioRepository voluntarioRepository;

    public int cantidadVoluntarios(){
        return voluntarioRepository.cantidadVoluntarios();
    }

    public List<Voluntario> getAllVoluntarios(){
        return voluntarioRepository.getAllVoluntarios();
    }

    public String getTotalHabilidades() {
        List<Voluntario> voluntarios = voluntarioRepository.getAllVoluntarios();
        String str = "";
        for (Voluntario voluntario : voluntarios) {
            str += voluntario.getNombre() + ": " + voluntario.getHabilidades().size() + "\n";
        }
        return str;
    }
}
