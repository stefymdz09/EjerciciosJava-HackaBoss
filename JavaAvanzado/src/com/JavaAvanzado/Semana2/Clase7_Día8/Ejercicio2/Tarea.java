package com.JavaAvanzado.Semana2.Clase7_Día8.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea {
	private String nombre;
	private List<Tarea> subtareas;

	public Tarea(String nombre) {
		this.nombre = nombre;
		this.subtareas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tarea> getSubtareas() {
		return subtareas;
	}

	public void setSubtareas(List<Tarea> subtareas) {
		this.subtareas = subtareas;
	}

	public void agregarSubtarea(Tarea subtarea) {
		subtareas.add(subtarea);
	}

	public void imprimir(int nivel) {
		System.out.println(getIndentacion(nivel) + "|-- " + nombre);
		for (Tarea subtarea : subtareas) {
			subtarea.imprimir(nivel + 1);
		}
	}

	private String getIndentacion(int nivel) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nivel; i++) {
			sb.append("|   ");
		}
		return sb.toString();
	}
}
