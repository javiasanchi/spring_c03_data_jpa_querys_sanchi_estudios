package com.example.repositories;

import com.example.entities.Direccion;
import com.example.entities.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {
    List<Direccion> findAllByCalleAndPais (String calle, String pais);
}