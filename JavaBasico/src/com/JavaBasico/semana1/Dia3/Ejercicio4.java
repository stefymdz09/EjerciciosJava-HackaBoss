package com.JavaBasico.semana1.Dia3;

import java.util.Scanner;

/**
 * Ejercicios de Estructuras de Control y Matrices
 *
 * @author Stefany
 */

public class Ejercicio4 {
	/*
	 * Ejercicio Nº 4 - Matrices
	 * 
	 * Imagina que estás trabajando en un sistema de reservas de asientos para un
	 * teatro. Crea un programa en Java que represente un mapa de asientos en una
	 * matriz de 5x5 y ten en cuenta lo siguiente:
	 * 
	 * Los asientos pueden estar ocupados (representados por "X") o vacíos
	 * (representados por "O").
	 * 
	 * Permite al usuario ingresar por teclado donde quiere sentarse, indicando su
	 * fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe
	 * marcar como ocupado ese asiento solo en caso de que esté vacío.
	 * 
	 * Si el asiento elegido por el usuario está ocupado, el sistema debe informar
	 * que elija otro diferente.
	 * 
	 * A medida que los asientos se ocupen, el programa debe actualizar el mapa de
	 * asientos y mostrarlo por pantalla luego de cada reserva.
	 * 
	 * Intenta hacer pruebas con otros compañeros, imagina que ellos son los
	 * compradores y tú el encargado del teatro. ¿Funciona para todos los casos?
	 * ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya
	 * reservados?
	 * 
	 * El sistema deberá seguir corriendo hasta que el encargado de cargar las
	 * reservas de los asientos determine que ha finalizado.
	 */

	/*-----------------BORRADOR DEL PLANTEAMIENTO INICIAL 
	 * 
	 * DECLARAR TAMAÑO DEL ARRAY [5]X[5]
	
	 ESTABLECER QUE "X" SIGNIFICA QUE LOS ASIENTOS ESTAN OCUPADOS Y "O" VACIO-
	 al ser primera reserva- la primera vuelta al bucle los asientos deben estar
	 vacios "o"
	
	 PREGUNTAR AL USUARIO LA FILA Y ASIENTO (COLUMNA)DE RESERVA
	 COMPROBAR QUE EL ASIENTO (FILA Y COLUMNA) ESTA VACIO - CONDICIONAL - REALIZAR
	 UN EQUALS o == "O" POR CADA FILA Y COLUMNA (bucle for)
	
	 A- SI ESTA VACIO: SE MUESTRA LA RESERVA DEL CLIENTE [5][5].. Tu reserva esta
	 en la fila 4 asiento 3 
	 *Y se pregunta si se quiere mostrar el asiento
	 *continuar con la reserva - booleano true/false o pregunta de SI/NO
	
	 B- SI ESTA OCUPADO : Mostrar mensaje y pedir al usuario un asiento nuevo -Metodo (RealizarReserva)...
	 Bucle For
	
	 SEPARAR POR METODOS 1- METODO REALIZAR RESERVA 2-METODO COMPROBAR
	 RESERVA(COMPROBAR SI LOS ASIENTOS ESTAN VACIOS) 3..Cuanndo este ocupado llamar
	al metodo realizar reserva
	 4.Metodo para mostrar reserva al usuario*/

	private static void mostrarButacasVacias(char[][] mapaAsientos) {
		for (int fila = 0; fila < mapaAsientos.length; fila++) {
			for (int asiento = 0; asiento < mapaAsientos[fila].length; asiento++) {
				mapaAsientos[fila][asiento] = 'O';
			}
		}
	}

	public static void mostrarAsientoReservado(char[][] mapaAsientos) {

		for (int fila = 0; fila < mapaAsientos.length; fila++) {
			System.out.print((fila + 1) + " ");
			for (int asiento = 0; asiento < mapaAsientos[fila].length; asiento++) {
				System.out.print("[" + mapaAsientos[fila][asiento] + "]");
			}
			System.out.println("");
		}
	}

	public static void rellenarButacas(char asientos[][]) {
		for (int fila = 1; fila <= 5; fila++) {
			System.out.print(fila + " ");
			for (int asiento = 0; asiento < 5; asiento++) {
				System.out.print("[" + asientos[fila - 1][asiento] + "]");
			}
			System.out.println("");
		}
	}

	public static boolean asientoReservado(char[][] asientos, int fila, int asiento) {
		return asientos[fila - 1][asiento - 1] == 'X';
	}

	public static boolean asientoVacio(char[][] asientos, int fila, int asiento) {
		return asientos[fila - 1][asiento - 1] == 'O';
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[][] asientos = new char[5][5];
		int fila, asiento;
		boolean continuar = false;

		System.out.println("----------------------------------------------------");
		System.out.println("Mapa inicial del sistema de Teatro");
		System.out.println("----------------------------------------------------");
		mostrarButacasVacias(asientos);
		rellenarButacas(asientos);
		System.out.println("----------------------------------------------------");

		do {
			System.out.println("Ingrese el número de la fila a reservar. Valor entre 1 y 5");
			fila = scanner.nextInt();

			System.out.println("Ingrese el número del asiento a reservar. Valor entre 1 y 5");
			asiento = scanner.nextInt();

			if (fila >= 1 && fila <= 5 && asiento >= 1 && asiento <= 5) {
				if (asientoVacio(asientos, fila, asiento)) {
					asientos[fila - 1][asiento - 1] = 'X';
					System.out.println("Reserva exitosa en la fila " + fila + ", asiento " + asiento + ".");

					// Preguntar si desea ver los asientos seleccionados
					System.out.println("Desea ver los asientos seleccionados? (SI/NO)");
					String respuestaVerAsientos = scanner.next();

					if (respuestaVerAsientos.equalsIgnoreCase("SI")) {
						System.out.println("\nMapa de Asientos con Reserva:");
						mostrarAsientoReservado(asientos);
					}

					// Preguntar si desea continuar comprando
					System.out.println("Desea continuar reservando más asientos? - SI/NO");
					String respuestaContinuar = scanner.next();
					continuar = respuestaContinuar.equalsIgnoreCase("SI");
				} else {
					System.out.println("El asiento seleccionado está ocupado. Por favor, seleccione uno nuevo.");
				}
			} else {
				System.out.println("Por favor, ingrese valores de fila y asiento entre 1 y 5.");
			}
		} while (continuar);
		System.out.println("Reserva realizada correctamente! :)");
	}
}