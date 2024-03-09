package com.JavaAvanzado.Semana1.Clase2_Día3.Ejercicio2;

public class Main {

	public static void main(String[] args) {

		/*
		 * Ejercicio Nº 2 - Simulación de cadena de producción
		 * 
		 * • Crea una simulación de una cadena de producción en una fábrica en la que
		 * varios trabajadores pueden realizar tareas concurrentemente. • Cada
		 * trabajador se representa como un hilo independiente. • Los trabajadores deben
		 * llevar a cabo tareas como ensamblar productos, realizar controles de calidad
		 * y embalar productos. • Utiliza hilos para simular la ejecución concurrente de
		 * estas tareas en diferentes estaciones de trabajo de la fábrica. • Asegúrate
		 * de controlar la concurrencia para evitar problemas como la sobreproducción o
		 * la falta de coordinación entre las tareas.
		 */
		Fabrica fabrica = new Fabrica();
		Trabajador ensamblador = new Trabajador(fabrica, "ensamblar");
		Trabajador controlador = new Trabajador(fabrica, "controlarCalidad");
		Trabajador embalador = new Trabajador(fabrica, "embalar");

		ensamblador.start();
		controlador.start();
		embalador.start();

		try {
			ensamblador.join();
			controlador.join();
			embalador.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Productos embalados: " + fabrica.getProductosEmbalados());

	}

}
