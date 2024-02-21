package com.JavaBasico.semana1.Dia3;

import java.util.Scanner;

/**
 * Ejercicios de Estructuras de Control
 *
 * @author Stefany
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Ejercicio Nº 1 - Estructuras Condicionales - Individual
		 * 
		 * a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello
		 * necesita un programa que, a partir de que un usuario ingrese su edad,
		 * determine mediante un mensaje en pantalla si la persona puede o no ingresar
		 * al evento. El programa debe mostrar (según cada caso) un mensaje informando
		 * la situación.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"----------------------------RECITAL - PARA MAYORES DE 18 AÑOS -------------------------------------------------");
		System.out.print("Ingresar edad");
		int edad = scanner.nextInt();

		if (edad < 18) {
			System.out.println("Vaya ! No puedes ingreasar al evento :(, tu edad debe ser 18 o más");
		} else {
			System.out.println("Bienvenido al recital ! :)");
		}
	}

}
