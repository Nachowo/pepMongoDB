package com.example.pep3.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Voluntario {
    @BsonId
    private ObjectId _id;
    private String nombre;

    private String rut;
}
