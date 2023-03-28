package com.example.repositories;

import com.example.entities.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TiendaRepository extends JpaRepository<Tienda, Long> {


    List<Tienda> findAll();
    List<Tienda> findAllByNombre(String nombre);

    List<Tienda> findAllByCif(String cif);

    List<Tienda> findAllByTelefono(Integer telefono);

    List<Tienda> findAllByEmail(String mail);
}