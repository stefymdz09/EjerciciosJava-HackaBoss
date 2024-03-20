
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.desarrollo.equiposbaloncesto.models.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Equipos de baloncesto</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container mt-3">
            <a href="partidos.jsp">CREAR PARTIDOS</a>
            <h2>Agregar Equipo</h2>
            <form action="EquiposSv" method="post">
                <div class="form-group">
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                <div class="form-group">
                    <label for="ciudad">Ciudad</label>
                    <input type="text" class="form-control" id="ciudad" name="ciudad">
                </div>

                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>




            <h2>Ver Listado de Equipos</h2>
            <form action="EquiposSv" method="get">

                <button type="submit" class="btn btn-primary">Ver</button>
            </form>

            <br>
            <br>
            <!-- Resultados en tabla -->
            <div class="results-table">
                <!--<!-- Verificacion de si hay resultados disponibles a mostrar---- 
                Si la solicitud tiene un atributo llamado "resultados" y no es nulo -->
                <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Ciudad</th>

                        </tr>
                    </thead>
                    <tbody>

                        <%--  Este bucle itera sobre la lista de equipos obtenida de la solicitud (a través del atributo "resultados").--%>
                        <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultados")) {%>
                        <tr>
                            <%--<%= ... %> se utilizan para imprimir el valor de las propiedades del Equipo --%>
                            <td><%= equipo.getIdEquipo()%></td>
                            <td><%= equipo.getNombre()%></td>
                            <td><%= equipo.getCiudad()%></td>

                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%> 
            </div>
        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
