package com.desarrollo.equiposbaloncesto.servlets;

import com.desarrollo.equiposbaloncesto.logics.Controller;
import com.desarrollo.equiposbaloncesto.models.Equipo;
import com.desarrollo.equiposbaloncesto.models.Partido;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PartidosSv", urlPatterns = {"/PartidosSv"})
public class PartidosSv extends HttpServlet {

    Controller controller = new Controller();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        List<Partido> listaPartidos = controller.listarPartidos();

        request.setAttribute("listaPartidos", listaPartidos);

        RequestDispatcher dispatcher = request.getRequestDispatcher("partidos.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        int idEquipoLocal = Integer.parseInt(request.getParameter("equipoLocal"));
        int resultadoLocal = Integer.parseInt(request.getParameter("resultadoLocal"));
        int idEquipoVisitante = Integer.parseInt(request.getParameter("equipoVisitante"));
        int resultadoVisitante = Integer.parseInt(request.getParameter("resultadoVisitante"));
        LocalDate fecha = LocalDate.parse(request.getParameter("fecha"));

        Partido nuevoPartido = new Partido();
        nuevoPartido.setEquipoLocal(new Equipo(idEquipoLocal));
        nuevoPartido.setResultadoLocal(resultadoLocal);
        nuevoPartido.setEquipoVisitante(new Equipo(idEquipoVisitante));
        nuevoPartido.setResultadoVisitante(resultadoVisitante);
        nuevoPartido.setFecha(fecha);

        controller.crearPartido(nuevoPartido);

        response.sendRedirect("partidos.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
