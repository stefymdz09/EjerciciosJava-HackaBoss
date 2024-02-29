/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaBasico.Semana2.Día8.logica;

import com.JavaBasico.Semana2.Día8.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Stefy
 */
public class Controladora {

    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void crearPlatillo(Platillo platillo) {

        controlPersistencia.crearPlatillo(platillo);

    }

    public void eliminarPlatillo(int id) throws Exception {
        controlPersistencia.eliminarPlatillo(id);
    }

    public List<Platillo> obtenerPlatillos() {

        return controlPersistencia.obtenerPlatillos();
    }

    public void modificarPlatillo(Platillo platillo) throws Exception {
        controlPersistencia.modificarPlatillo(platillo);
    }

}
