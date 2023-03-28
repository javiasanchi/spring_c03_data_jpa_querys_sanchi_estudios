package com.example.repositories;

import com.example.entities.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {
}