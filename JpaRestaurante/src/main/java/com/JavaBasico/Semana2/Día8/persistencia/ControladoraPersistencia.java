/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.JavaBasico.Semana2.Día8.persistencia;

import com.JavaBasico.Semana2.Día8.logica.Platillo;
import com.JavaBasico.Semana2.Día8.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stefy
 */
public class ControladoraPersistencia {

    PlatilloJpaController platilloJpa = new PlatilloJpaController();

    //1-CREAR PLATILLO
    public void crearPlatillo(Platillo platillo) {

        platilloJpa.create(platillo);

    }

    //2-ELIMINAR PLATILLO
    public void eliminarPlatillo(int id) {
        try {
            platilloJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //3-OBTENER TODOS LOS PLATILLOS

    public List<Platillo> obtenerPlatillos() {
        return platilloJpa.findPlatilloEntities();
    }
    //4-MODIFICAR LOS PLATILLOS

    public void modificarPlatillo(Platillo platillo) {
        try {
            platilloJpa.edit(platillo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
