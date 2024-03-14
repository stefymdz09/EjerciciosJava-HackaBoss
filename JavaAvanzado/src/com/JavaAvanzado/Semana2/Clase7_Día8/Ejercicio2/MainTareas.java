package com.JavaAvanzado.Semana2.Clase7_Día8.Ejercicio2;

import java.util.Scanner;

public class MainTareas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bienvenido al Organizador de Tareas");
		System.out.println("Ingrese el nombre del proyecto:");
		String nombreProyecto = scanner.nextLine();

		Tarea proyecto = new Tarea(nombreProyecto);
		agregarTarea(proyecto, scanner, 0);

		System.out.println("Estructura de Tareas:");
		proyecto.imprimir(0);
	}

	private static void agregarTarea(Tarea tareaPrincipal, Scanner scanner, int nivel) {
		System.out.println("¿Desea agregar una tarea (S/N)?");
		String respuesta = scanner.nextLine().trim().toUpperCase();
		if (respuesta.equals("S")) {
			System.out.println("Ingrese el nombre de la tarea:");
			String nombreTarea = scanner.nextLine();
			Tarea nuevaTarea = new Tarea(nombreTarea);
			tareaPrincipal.agregarSubtarea(nuevaTarea);
			// Llamada recursiva para agregar subtareas
			agregarTarea(nuevaTarea, scanner, nivel + 1);
		} else if (!respuesta.equals("N")) {
			System.out.println("Respuesta no válida. Por favor, ingrese 'S' para sí o 'N' para no.");
			agregarTarea(tareaPrincipal, scanner, nivel);
		}
	}

}