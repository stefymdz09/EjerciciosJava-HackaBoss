package com.JavaBasico.semana1.Dia2;

/**
 * Ejercicios de Introducción a Java
 *
 * @author Stefany
 */
public class Ejercicio2 {
	public static void main(String[] args) {

		/*
		 * Ejercicio Nº 2 - Tipos de Datos - Grupal
		 * 
		 * a) Crea un programa que declare una variable para cada uno de los siguientes
		 * tipos de datos: int, double, boolean y String. Asigna un valor a cada
		 * variable y muestra su contenido en la consola.
		 * 
		 * b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un
		 * int en un String o un String en un double… ¿Qué sucede con el programa? ¿Se
		 * produce algún error? ¿En qué situaciones se genera error y en cuáles no?
		 * Justificar el por qué de cada caso. Debatir con otros compañeros.
		 */

		// a) Declarar variables y asignar valores
		int edad = 7;
		double peso = 64;
		boolean booleano = true;
		String saludo = "Hola mundo!";

		System.out.println("A- Valores iniciales con asignaciiones correctas:");
		System.out.println("Entero: " + edad);
		System.out.println("Decimal: " + peso);
		System.out.println("Booleano: " + booleano);
		System.out.println("Texto: " + saludo);

		// b) Asignar valores que no correspondan al tipo de dato. 
		edad = "Error -asignacion de de un String a un int"; // asignación de un String a un int
		peso = "Error- asignacion de un String a un double"; // asignación de un String a un double
		booleano = 42; // Asignacion de un entero a un boolean
		saludo = 123; // Asignacion un entero a un String

		// Mostrar contenido después de asignar valores incorrectos
		System.out.println("\n B- Valores con asignaciones incorrectas:");
		System.out.println("Entero: " + edad);
		System.out.println("Decimal: " + peso);
		System.out.println("Booleano: " + booleano);
		System.out.println("Texto: " + saludo);


		// Observación:
	
		// No se puede asignar un valor de tipo de dato numerico a uno de cadena, por ejemplo
		// un double a un tipo de dato string, ni un valor numerico a un booleano
		// esto dara error y no se puede asignar valor
		//El programa no se puede compilar/ ejecutar

	}
}