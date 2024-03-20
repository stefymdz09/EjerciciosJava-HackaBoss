package com.desarrollo.votaciones.persistencia;

import com.desarrollo.votaciones.logica.Voto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    VotoJpaController controladorVoto = new VotoJpaController();

    public void agregarVoto(Voto voto) throws Exception {
        controladorVoto.create(voto);
    }

    public void actualizarVoto(Voto voto) {
        try {
            controladorVoto.edit(voto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Voto votoPorId(Long id) {
        return controladorVoto.findVoto(id);
    }

    public List<Voto> obtenerVotos() {
        return controladorVoto.findVotoEntities();
    }
}
