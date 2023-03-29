package com.example.repositories;

import com.example.entities.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
    List<Productos> findAllByPrecio (Double precio);
}