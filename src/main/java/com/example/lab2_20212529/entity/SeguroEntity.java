package com.example.lab2_20212529.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "seguro")
public class SeguroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idseguro")
    private Integer id;

    @Column(name = "empresa_aseguradora")
    private String empresa_aseguradora;

    @Column(name = "cobertura_maxima")
    private Double cobertura_maxima;

    @Column(name = "tarifa")
    private Double tarifa;

}
