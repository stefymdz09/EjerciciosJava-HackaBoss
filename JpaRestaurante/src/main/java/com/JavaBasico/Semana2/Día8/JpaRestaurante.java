/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.JavaBasico.Semana2.Día8;

import com.JavaBasico.Semana2.Día8.logica.Platillo;
import com.JavaBasico.Semana2.Día8.persistencia.ControladoraPersistencia;

/**
 *
 * @author Stefy
 */
public class JpaRestaurante {

    public static void main(String[] args) {

        ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();

        //Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.
        Platillo platillo1 = new Platillo("Hamburguesa", "Pan, carne,tomate,queso,bacon", 12.0);

        controladoraPersis.crearPlatillo(platillo1);

        //Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los datos de otro mediante JPA.
        Platillo platillo2 = new Platillo("Cocido", "Garbanzos, carne, chorizo, fideos", 10.5);
        Platillo platillo3 = new Platillo("Pizza", "Harina, bacon, carne, queso", 8);
        
        controladoraPersis.crearPlatillo(platillo2);
        controladoraPersis.crearPlatillo(platillo3);

        controladoraPersis.eliminarPlatillo(2);

        //editamos datos de un platillo 
        platillo3.setNombre("Spaguettis");

        controladoraPersis.modificarPlatillo(platillo3);

    }

}
