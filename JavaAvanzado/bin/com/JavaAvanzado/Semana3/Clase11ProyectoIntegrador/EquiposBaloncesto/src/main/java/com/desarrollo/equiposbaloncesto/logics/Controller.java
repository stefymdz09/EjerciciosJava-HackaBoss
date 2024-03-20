package com.desarrollo.equiposbaloncesto.logics;

import com.desarrollo.equiposbaloncesto.models.Equipo;
import com.desarrollo.equiposbaloncesto.models.Partido;
import com.desarrollo.equiposbaloncesto.persistence.PersistenceController;
import java.time.LocalDate;
import java.util.List;

public class Controller {

    PersistenceController persistenceController = new PersistenceController();

    //Equipo
    public void crearEquipo(Equipo equipo) {
        persistenceController.crearEquipo(equipo);
    }

    public List<Equipo> listarEquipos() {
        return persistenceController.listarEquipos();
    }

    public void borrarEquipo(int id) {
        persistenceController.borrarEquipo(id);
    }

    //Partido
    public void crearPartido(Partido partido) {
        persistenceController.crearPartido(partido);
    }

    public List<Partido> listarPartidos() {
        return persistenceController.listarPartidos();
    }

    public void borrarPartido(int id) {
        persistenceController.borrarPartido(id);
    }

}
