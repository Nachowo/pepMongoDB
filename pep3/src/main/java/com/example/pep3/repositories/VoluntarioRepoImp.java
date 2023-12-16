package com.example.pep3.repositories;

import com.example.pep3.Models.Voluntario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VoluntarioRepoImp implements VoluntarioRepository {

    @Autowired
    MongoDatabase database;

    @Override
    public List<Voluntario> getAllVoluntarios() {
        MongoCollection<Voluntario> collection = database.getCollection("voluntarios", Voluntario.class);
        List<Voluntario> voluntarios = collection.find().into(new ArrayList<>());
        return voluntarios;
    }

    @Override
    public int cantidadVoluntarios() {
        MongoCollection<Document> collection = database.getCollection("voluntarios");
        long count = collection.countDocuments();
        return (int) count;
    }
}
