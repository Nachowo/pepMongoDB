package com.example.lab3.repositories;

import com.example.lab3.Models.Habilidad;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HabilidadRepoImp implements HabilidadRepository {
    @Autowired
    MongoDatabase database;
    @Override
    public List<Habilidad> getAllHabilidades() {
        MongoCollection<Habilidad> collection = database.getCollection("habilidad", Habilidad.class);
        List<Habilidad> habilidades = collection.find().into(new ArrayList<>());
        return habilidades;
    }
}
