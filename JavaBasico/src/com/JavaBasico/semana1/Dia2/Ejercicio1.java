package com.JavaBasico.semana1.Dia2;

import java.util.Scanner;

/**
 * Ejercicios de Introducción a Java
 *
 * @author Stefany 
 */
public class Ejercicio1 {
	public static void main(String[] args) {

		/*
		 * Ejercicio Nº 1 - Sintaxis básica - Individual
		 * 
		 * a) Escribir un programa en Java que muestre por pantalla un mensaje de
		 * Bienvenida a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.
		 * 
		 * b) Una vez logrado esta primera parte, permitir que se almacene el nombre del
		 * usuario en una variable y se muestre el mismo en el mensaje. Por ejemplo:
		 * “Hola Eduardo, bienvenida al sistema”.
		 */
		System.out.print("Hola, bienvenido al sistema/n");
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		String nombre;
		nombre = scanner.nextLine();// Leemos una línea de texto
		System.out.println("Hola " + nombre + ", bienvenido al sistema");

		scanner.close(); 
	}
}
