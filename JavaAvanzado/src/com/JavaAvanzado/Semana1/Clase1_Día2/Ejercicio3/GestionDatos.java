package com.JavaAvanzado.Semana1.Clase1_Día2.Ejercicio3;

import java.util.Scanner;

public class GestionDatos {

	public static void main(String[] args) {
		/*
		 * Estás desarrollando una aplicación de gestión de datos en la que puedes
		 * almacenar información en un vector y acceder a ella posteriormente. Tu tarea
		 * es implementar una función que te permita almacenar datos en un vector y
		 * manejar excepciones estándar de Java teniendo en cuenta lo siguiente:
		 * 
		 * Desarrolla una función que te permita almacenar datos en un vector. Puedes
		 * utilizar un vector de tamaño fijo para simplificar el ejercicio.
		 * 
		 * Luego, implementa un mecanismo que te permita acceder a los datos almacenados
		 * en el vector proporcionando un índice.
		 * 
		 * Utiliza una excepción estándar de Java que, al intentar acceder a una
		 * posición que no existe en el vector, por ejemplo, un índice que esté fuera
		 * del rango del vector se pueda capturar.
		 * 
		 * Captura la excepción y proporciona un mensaje de error descriptivo que
		 * indique que estás intentando acceder a una posición inválida en el vector.
		 */

		int tamanoVector = 7;

		int[] vector = new int[tamanoVector];

		almacenarDatosEnVector(vector);
		accederDatos(vector);

	}

	private static void almacenarDatosEnVector(int[] vector) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < vector.length; i++) {
			System.out.print("Ingrese valor en la posición " + i + ": ");
			vector[i] = scanner.nextInt();
		}
	}

	private static void accederDatos(int[] vector) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el índice para acceder a los datos:");

		try {
			int indice = scanner.nextInt();

			int valor = vector[indice];

			System.out.println("Valor en la posición " + indice + ": " + valor);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Error: Intentando acceder a una posición inválida en el vector.");
		}
	}
}
