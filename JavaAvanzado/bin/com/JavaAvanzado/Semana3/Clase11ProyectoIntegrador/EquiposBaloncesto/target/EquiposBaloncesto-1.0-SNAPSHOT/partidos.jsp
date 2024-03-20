

<%@page import="java.util.List"%>
<%@page import="com.desarrollo.equiposbaloncesto.models.Partido"%>
<%@page import="com.desarrollo.equiposbaloncesto.models.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Partidos de Baloncesto</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-3">

            <a href="index.jsp">VOLVER A CREAR EQUIPO</a>
            <h1>Crear Nuevo Partido</h1>
            <form action="PartidosSv" method="post">

                <div class="form-group">
                    <label for="equipoLocal">Equipo Local:</label>
                    <input type="text" class="form-control" name="equipoLocal" id="equipoLocal"><br><br>
                </div>

                <div class="form-group">
                    <label for="resultadoLocal">Resultado Local:</label>
                    <input type="number" class="form-control" name="resultadoLocal" id="resultadoLocal"><br><br>

                </div>
                <div class="form-group">
                    <label for="equipoVisitante">Equipo Visitante:</label>
                    <input type="text" class="form-control" name="equipoVisitante" id="equipoVisitante"><br><br>
                </div>

                <div class="form-group">
                    <label for="resultadoVisitante">Resultado Visitante:</label>
                    <input type="number" class="form-control" name="resultadoVisitante" id="resultadoVisitante"><br><br>
                </div>
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="date" class="form-control" name="fecha" id="fecha"><br><br>
                </div>
                <input class="btn btn-primary" type="submit" value="Crear Partido">
            </form>
            <h2>Ver Listado de Partidos</h2>
            <form action="PartidosSv" method="get">

                <button type="submit" class="btn btn-primary">Ver</button>
            </form>
            <h3>Resultados de Partidos:</h3>
            <% if (request.getAttribute("listaPartidos") != null) { %>

            <table class="table">
                <thead>
                    <tr>
                        <th>ID Partido</th>
                        <th>Equipo Local</th>
                        <th>Resultado Local</th>
                        <th>Equipo Visitante</th>
                        <th>Resultado Visitante</th>
                        <th>Fecha</th>
                    </tr>
                </thead>
                <tbody>
                    <%--  Este bucle itera sobre la lista de partidos obtenida de la solicitud (a través del atributo "listaPartidos").--%>
                    <% for (Partido partido : (List<Partido>) request.getAttribute("listaPartidos")) {%>
                    <tr>
                        <td><%= partido.getIdPartido()%></td>
                        <td><%= partido.getEquipoLocal().getNombre()%></td>
                        <td><%= partido.getResultadoLocal()%></td>
                        <td><%= partido.getEquipoVisitante().getNombre()%></td>
                        <td><%= partido.getResultadoVisitante()%></td>
                        <td><%= partido.getFecha()%></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>


            <% }%>
        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
