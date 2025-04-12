package com.example.lab2_20212529.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "auto")
public class AutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idauto")
    private Integer id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "color")
    private String color;

    @Column(name = "kilometraje")
    private Integer kilometraje;

    @Column(name = "costo_por_dia")
    private Double costo_por_dia;

}