package com.example.lab3.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Voluntario {
    @BsonId
    private ObjectId _id;

    private String nombre;
    private String rut;

    private List<ObjectId> habilidades;
}
