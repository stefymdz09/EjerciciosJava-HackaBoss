package com.desarrollo.votaciones.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombrePartido;
    private int cantidadVotos;

    public Voto() {
    }

    public Voto(Long id, String nombrePartido, int cantidadVotos) {
        this.id = id;
        this.nombrePartido = nombrePartido;
        this.cantidadVotos = cantidadVotos;
    }

    public Voto(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

}
