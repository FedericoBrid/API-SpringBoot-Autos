package com.apiCurso.apiCurso.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Autos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marca;
    private String modelo;
    private String color;
    private int anio;
}
