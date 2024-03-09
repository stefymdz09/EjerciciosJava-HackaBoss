package com.JavaBasico.Semana2.Día8.Ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static final String URL = "jdbc:mysql://localhost:3306/estudiantes_bbdd";

//reemplazar por tu usuario y contraseña que hayas establecido en tu BD
	private static final String USER = "root";
	private static final String PASSWORD = "formacion";

	public static Connection conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
