package com.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String refer;
    private Double precio;
    private Integer stock;
    private Boolean dispo;
    private LocalDate caducidad;

    public Productos() {
    }

    public Productos(String nombre, String refer, Double precio, Integer stock, Boolean dispo, LocalDate caducidad) {
        this.nombre = nombre;
        this.refer = refer;
        this.precio = precio;
        this.stock = stock;
        this.dispo = dispo;
        this.caducidad = caducidad;
    }

    public Long getId() {
        return id;
    }

    public Productos setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Productos setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getRefer() {
        return refer;
    }

    public Productos setRefer(String refer) {
        this.refer = refer;
        return this;
    }

    public Double getPrecio() {
        return precio;
    }

    public Productos setPrecio(Double precio) {
        this.precio = precio;
        return this;
    }

    public Integer getStock() {
        return stock;
    }

    public Productos setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public Boolean getDispo() {
        return dispo;
    }

    public Productos setDispo(Boolean dispo) {
        this.dispo = dispo;
        return this;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public Productos setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
        return this;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", refer='" + refer + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", dispo=" + dispo +
                ", caducidad=" + caducidad +
                '}';
    }
}