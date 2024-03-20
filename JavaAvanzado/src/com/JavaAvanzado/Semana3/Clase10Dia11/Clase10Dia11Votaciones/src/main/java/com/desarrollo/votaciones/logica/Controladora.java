
package com.desarrollo.votaciones.logica;

import com.desarrollo.votaciones.persistencia.ControladoraPersistencia;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controladora {

    private final ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void agregarVoto(Voto voto) throws Exception {
        controladoraPersistencia.agregarVoto(voto);
    }

    public void actualizarVoto(Voto voto) {
        controladoraPersistencia.actualizarVoto(voto);
    }

    public Voto votoPorId(Long id) {
        return controladoraPersistencia.votoPorId(id);
    }

    public List<Voto> obtenerVotos() {
        return controladoraPersistencia.obtenerVotos();
    }
}
