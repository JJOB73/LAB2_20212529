package com.example.lab2_20212529.repository;

import com.example.lab2_20212529.entity.SedeEntity;
import com.example.lab2_20212529.entity.SeguroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguroRepository extends JpaRepository<SeguroEntity, Integer> {
}