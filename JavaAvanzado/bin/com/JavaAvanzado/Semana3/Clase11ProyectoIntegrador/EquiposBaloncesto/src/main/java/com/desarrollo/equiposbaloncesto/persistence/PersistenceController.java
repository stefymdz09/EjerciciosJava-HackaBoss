package com.desarrollo.equiposbaloncesto.persistence;

import com.desarrollo.equiposbaloncesto.models.Equipo;
import com.desarrollo.equiposbaloncesto.models.Partido;
import com.desarrollo.equiposbaloncesto.persistence.exceptions.NonexistentEntityException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {

    EquipoJpaController equipoJpaController = new EquipoJpaController();
    PartidoJpaController partidoJpaController = new PartidoJpaController();

    //Equipo
    public void crearEquipo(Equipo equipo) {
        equipoJpaController.create(equipo);
    }

    public List<Equipo> listarEquipos() {
        return equipoJpaController.findEquipoEntities();
    }

    public void borrarEquipo(int idEquipo) {
        try {
            equipoJpaController.destroy(idEquipo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Partido
    public void crearPartido(Partido partido) {
        partidoJpaController.create(partido);
    }

    public List<Partido> listarPartidos() {
        return partidoJpaController.findPartidoEntities();
    }

    public void borrarPartido(int idPartido) {
        try {
            partidoJpaController.destroy(idPartido);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
