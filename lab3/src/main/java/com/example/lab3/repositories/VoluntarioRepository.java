package com.example.lab3.repositories;

import com.example.lab3.Models.Voluntario;

import java.util.List;

public interface VoluntarioRepository{
    public List<Voluntario> getAllVoluntarios();
    public int cantidadVoluntarios();

}
