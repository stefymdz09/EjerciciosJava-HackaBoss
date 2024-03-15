package com.JavaAvanzado.Semana2.RepasoFinal.Ejercicio1;

import java.util.List;

public class Estudiante {
	/*
	 * Ejercicio Nº 1: Streams y Optionals – Gestión de estudiantes Crea un sistema
	 * de gestión de estudiantes donde cada estudiante tiene un nombre, una lista de
	 * calificaciones(Double) y una edad. Cargar 3 calificaciones como minimo para
	 * cada alumno. Ejemplo: new Estudiante("Carlos", Arrays.asList(8.0, 9.0, 7.0),
	 * 20) Sobrescribir el método toString de la clase Estudiante. En el main,
	 * cargar un listado de estudiantes (mínimo 5 estudiantes) e implementa las
	 * siguientes operaciones utilizando Streams y Optionals: • Filtrar los
	 * estudiantes mayores de 18 años y mostrarlos en una sola sentencia. • Para
	 * cada estudiante, calcular y mostrar el promedio de sus calificaciones.
	 */

	private String nombre;
	private List<Double> calificaciones;
	private int edad;

	public Estudiante(String nombre, List<Double> calificaciones, int edad) {
		super();
		this.nombre = nombre;
		this.calificaciones = calificaciones;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Double> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(List<Double> calificaciones) {
		this.calificaciones = calificaciones;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante{" + "nombre='" + nombre + '\'' + ", calificaciones=" + calificaciones + ", edad=" + edad
				+ '}';
	}

}
