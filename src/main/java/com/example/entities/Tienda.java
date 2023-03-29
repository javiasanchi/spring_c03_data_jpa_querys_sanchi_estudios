package com.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String cif;
    @Column(length = 9, nullable = true)
    private Integer telefono;
    @Column(unique = true)
    private String email;
    private Double factura;
    private Boolean abierta;
    @OneToOne
    private Direccion direccion;


    public Tienda() {
    }

    public Tienda(String nombre, String cif, Integer telefono, String email, Double factura, Boolean abierta) {
        this.nombre = nombre;
        this.cif = cif;
        this.telefono = telefono;
        this.email = email;
        this.factura = factura;
        this.abierta = abierta;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public Tienda setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Tienda setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getCif() {
        return cif;
    }

    public Tienda setCif(String cif) {
        this.cif = cif;
        return this;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public Tienda setTelefono(Integer telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Tienda setEmail(String email) {
        this.email = email;
        return this;
    }

    public Double getFactura() {
        return factura;
    }

    public Tienda setFactura(Double factura) {
        this.factura = factura;
        return this;
    }

    public Boolean getAbierta() {
        return abierta;
    }

    public Tienda setAbierta(Boolean abierta) {
        this.abierta = abierta;
        return this;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Tienda setDireccion(Direccion direccion) {
        this.direccion = direccion;
        return this;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", factura=" + factura +
                ", abierta=" + abierta +
                '}';
    }
}