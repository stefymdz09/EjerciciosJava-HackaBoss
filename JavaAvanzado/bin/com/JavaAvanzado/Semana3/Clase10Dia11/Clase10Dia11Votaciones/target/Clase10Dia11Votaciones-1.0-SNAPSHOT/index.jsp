
<%@page import="java.util.List"%>
<%@page import="com.desarrollo.votaciones.logica.Voto"%>
<%@page import="java.util.ArrayList"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Votación de Partidos</title>
        <link rel="stylesheet" href="styles/styles.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>

    <body>
        <div class="container mt-4">
            <h2>Votación</h2>
            <p>Elija su voto:</p>
            <!--FORMULARIO DE VOTACIONES -->
            <div id="formulario">

                <form action="VotacionesSv" method="post">
                    <input type="radio" id="partido-a" name="voto" value="Partido A" />
                    <label for="partido-a">Partido A</label><br />
                    <input type="radio" id="partido-b" name="voto" value="Partido B" />
                    <label for="partido-b">Partido B</label><br />
                    <input type="radio" id="partido-c" name="voto" value="Partido C" />
                    <label for="partido-c">Partido C</label><br />
                    <button class="btn btn-primary" type="submit">Votar</button>
                </form>
            </div>

            <br />

            <br />

            <form action="VotacionesSv" method="get">
                <button class="btn btn-success" type="submit">Ver Resultados</button>
            </form>

            <br />
            <br />
            <div class="container mt-5">
                <% if (request.getAttribute("resultados") != null) {
                        List<Voto> resultados = (List<Voto>) request.getAttribute("resultados");
                %>
                <h2>Resultados de Votación</h2>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre del Partido</th>
                            <th>Cantidad de Votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Voto voto : resultados) {%>
                        <tr>
                            <td><%= voto.getNombrePartido()%></td>
                            <td><%= voto.getCantidadVotos()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% } else { %>
                <h2>No hay resultados disponibles</h2>
                <% }%>
            </div>


        </div>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
