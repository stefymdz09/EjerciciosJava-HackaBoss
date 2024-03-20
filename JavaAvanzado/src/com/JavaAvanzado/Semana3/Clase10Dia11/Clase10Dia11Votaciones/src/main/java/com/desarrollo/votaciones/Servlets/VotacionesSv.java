package com.desarrollo.votaciones.Servlets;

import com.desarrollo.votaciones.logica.Controladora;
import com.desarrollo.votaciones.logica.Voto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VotacionesSv", urlPatterns = {"/VotacionesSv"})
public class VotacionesSv extends HttpServlet {

    private Controladora controladora = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        // Obtén la lista de votos
        List<Voto> listaVotos = controladora.obtenerVotos();

        // Crea una lista para almacenar los recuentos de votos
        List<Voto> recuentoVotos = new ArrayList<>();

        // Itera sobre la lista de votos
        for (Voto vote : listaVotos) {
            String name = vote.getNombrePartido();
            // Busca si ya existe un objeto Voto con el mismo nombre
            Voto votoExistente = null;
            for (Voto v : recuentoVotos) {
                if (v.getNombrePartido().equals(name)) {
                    votoExistente = v;
                    break;
                }
            }

            if (votoExistente != null) {
                // Si ya existe, incrementa el recuento
                votoExistente.setCantidadVotos(votoExistente.getCantidadVotos() + 1);
            } else {
                // Si no existe, crea un nuevo objeto Voto
                Voto newVote = new Voto();
                newVote.setNombrePartido(name);
                newVote.setCantidadVotos(1);
                recuentoVotos.add(newVote);
            }
        }

        // Configura el resultado en el objeto request
        request.setAttribute("resultados", recuentoVotos);

        // Envía la solicitud a la página JSP para mostrar los resultados
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String nombreVoto = request.getParameter("voto");

        if (nombreVoto != null) {
            Voto voto = new Voto(nombreVoto);
            System.out.println("Voto recibido: " + nombreVoto);
            try {
                controladora.agregarVoto(voto);
            } catch (Exception ex) {
                Logger.getLogger(VotacionesSv.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Voto es nulo");
        }

        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
