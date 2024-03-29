package com.JavaBasico.semana1.Dia3;

import java.util.Scanner;


/**
 * Ejercicios de Estructuras de Control Y Arrays
 *
 * @author Stefany
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declarar un arreglo de tamaño para almacenar las temperaturas maximas de la
		// semana

		Double[] temperaturas = new Double[7];

		// Preguntar al usuario las 7 temperaturas por cada dia de la semana
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Ingrese la temperatura máxima para el día " + (i + 1) + ": ");
			temperaturas[i] = scanner.nextDouble();
		}

		//llamar-invocar al metodo de calcular el promedio de la temperaturas
		double promedioTemperaturas = calcularPromedio(temperaturas);
		System.out.printf("\nLa temperatura maxima promedio es:" + promedioTemperaturas);
	}

	// Declarar metodo para calcular el promedio. Recorrer el numero de temperaturas
	// solicitadas, sumarlas y dividirlas entre el numero de dias de las semana
	// (veces solicitada)
	private static double calcularPromedio(Double[] temperaturas) {
		double suma = 0;

		for (int i = 0; i < temperaturas.length; i++) {
			suma = suma + temperaturas[i];
		}
		return suma / temperaturas.length;
	}

}
