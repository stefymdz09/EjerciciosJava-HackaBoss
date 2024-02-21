package com.JavaBasico.semana1.Dia2;

import java.util.Scanner;

/**
 * Ejercicios de Introducción a Java
 *
 * @author Stefany
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Ejercicio Nº 4 - Operaciones de Lectura - Grupal
		 * 
		 * Crea un programa que pida al usuario que ingrese por teclado dos números
		 * enteros y realice las siguientes operaciones con ellos: suma, resta,
		 * multiplicación y división. Muestra por pantalla/consola los resultados de
		 * cada una de las operaciones con un mensaje amigable para el usuario.
		 * 
		 * Sugerencia: Compara los resultados que obtengas con otros compañeros. Pide a
		 * tus compañeros que te digan números al azar y haz las pruebas necesarias para
		 * comprobar el funcionamiento de tu programa.
		 * 
		 * Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con
		 * lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar
		 * ésta situación?
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un primer numero entero: ");
		int numero1 = scanner.nextInt();

		System.out.print("Ingrese un segundo numero entero: ");
		int numero2 = scanner.nextInt();

		// Realizar las operaciones
		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int multiplicacion = numero1 * numero2;
		double division;
		
		if (numero2 != 0) {
			division = (double) numero1 / numero2;
			System.out.println("El resultado de la división: " + numero1 + " / " + numero2 + " es " + division);
		} else {
			System.out.println("No es posible realizar la división por cero");
			return;
		}

		// Mostrar los resultados de las operaciones
		System.out.println("El resultado de la suma: " + numero1 + " + " + numero2 + " es " + suma);
		System.out.println("El resultado de la resta: " + numero1 + " - " + numero2 + " es " + resta);
		System.out.println("El resultado de la multiplicación: " + numero1 + " * " + numero2 + " es " + multiplicacion);

		scanner.close();
	}
}