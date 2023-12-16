package com.example.pep3.repositories;

import com.example.pep3.Models.Voluntario;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "voluntarios", path = "voluntarios")
public interface VoluntarioRepository{
    public List<Voluntario> getAllVoluntarios();
    public int cantidadVoluntarios();

}
