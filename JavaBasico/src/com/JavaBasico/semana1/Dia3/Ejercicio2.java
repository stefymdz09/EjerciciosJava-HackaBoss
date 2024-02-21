package com.JavaBasico.semana1.Dia3;

import java.util.Scanner;

/**
 * Ejercicios de Estructuras de Control
 *
 * @author Stefany
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Ejercicio Nº 2 - Estructuras Repetitivas - Individual
		 * 
		 * a) Imagina que eres un cajero en un supermercado. Crea un programa en Java
		 * que permita ingresar el precio de varios productos comprados por un cliente.
		 * 
		 * Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo
		 * precios hasta que el usuario decida finalizar. Luego, muestra el total de la
		 * compra que debe abonar.
		 */
		double precioProducto;
		double totalCompra = 0;
		boolean continuar;

		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------------------------------SUPERMERCADO------------------------------------");
		do {

			System.out.println("Ingrese el precio del producto (ingrese 0 o un numero negativo para finalizar): ");
			precioProducto = scanner.nextDouble();
			// si se introduce un cero o numero negativo el programa finaliza
			if (precioProducto <= 0) {
				continuar = false;
			} else {
				// Acumular el precio en el total de la compra
				totalCompra += precioProducto;
				continuar = true;
			}

		} while (continuar);

		// Mostrar el total de la compra
		System.out.println("El total de la compra es: " + totalCompra);

		scanner.close();
	}
}