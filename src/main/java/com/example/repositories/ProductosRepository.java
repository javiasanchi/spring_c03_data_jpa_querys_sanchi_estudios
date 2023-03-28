package com.example.repositories;

import com.example.entities.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
}