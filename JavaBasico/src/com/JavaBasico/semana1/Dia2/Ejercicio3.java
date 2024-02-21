package com.JavaBasico.semana1.Dia2;

/**
 * Ejercicios de Introducción a Java
 *
 * @author Stefany
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Ejercicio Nº 3 - Variables y Operadores - Individual
		 * 
		 * Escribe un programa que permita calcular el área de un triángulo y luego
		 * mostrar el resultado por pantalla.. Recuerda que la fórmula para calcular
		 * esto es: (base * altura) / 2 (base por altura dividido dos).
		 * 
		 * Pista: Debes declarar variables para la base y la altura del triángulo,
		 * asignarles valores y luego calcular el área utilizando la fórmula.
		 */
		double base = 12.0;
		double altura = 7.5;
		double area;
		// calcular el área del triágulo
		area = (base * altura) / 2;
		System.out.println("El área del triángulo es: " + area);

	}

}
