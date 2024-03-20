package com.desarrollo.equiposbaloncesto.models;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Partido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPartido;
    @ManyToOne
    @JoinColumn(name = "idEquipoLocal")
    private Equipo equipoLocal;
    private int resultadoLocal;
    @ManyToOne
    @JoinColumn(name = "idEquipoVisitante")
    private Equipo equipoVisitante;
    private int resultadoVisitante;
    private LocalDate fecha;

    public Partido() {
    }

    public Partido(int idPartido, Equipo equipoLocal, int resultadoLocal, Equipo equipoVisitante, int resultadoVisitante, LocalDate fecha) {
        this.idPartido = idPartido;
        this.equipoLocal = equipoLocal;
        this.resultadoLocal = resultadoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultadoVisitante = resultadoVisitante;
        this.fecha = fecha;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public int getResultadoLocal() {
        return resultadoLocal;
    }

    public void setResultadoLocal(int resultadoLocal) {
        this.resultadoLocal = resultadoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getResultadoVisitante() {
        return resultadoVisitante;
    }

    public void setResultadoVisitante(int resultadoVisitante) {
        this.resultadoVisitante = resultadoVisitante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
