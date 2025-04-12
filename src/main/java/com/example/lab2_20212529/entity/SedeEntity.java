package com.example.lab2_20212529.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "sede")
public class SedeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsede")
    private Integer id;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "direccion")
    private String direccion;

}