package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String calle;
    private Integer numero;
    private String localidad;
    private String ciudad;
    private String pais;
    @Column(length = 5)
    private Integer cp;

    public Direccion() {
    }

    public Direccion(String calle, Integer numero, String localidad, String ciudad, String pais, Integer cp) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.pais = pais;
        this.cp = cp;
    }

    public Long getId() {
        return id;
    }

    public Direccion setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCalle() {
        return calle;
    }

    public Direccion setCalle(String calle) {
        this.calle = calle;
        return this;
    }

    public Integer getNumero() {
        return numero;
    }

    public Direccion setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Direccion setLocalidad(String localidad) {
        this.localidad = localidad;
        return this;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Direccion setCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public String getPais() {
        return pais;
    }

    public Direccion setPais(String pais) {
        this.pais = pais;
        return this;
    }

    public Integer getCp() {
        return cp;
    }

    public Direccion setCp(Integer cp) {
        this.cp = cp;
        return this;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", calle='" + calle + '\'' +
                ", numero=" + numero +
                ", localidad='" + localidad + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", cp=" + cp +
                '}';
    }
}