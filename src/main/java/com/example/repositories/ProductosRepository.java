package com.example.repositories;

import com.example.entities.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
    List<Productos> findAllByPrecioBetween (Double precioMin, Double precioMax);
    List<Productos> findAllByCaducidadBefore (LocalDate caducado);


}