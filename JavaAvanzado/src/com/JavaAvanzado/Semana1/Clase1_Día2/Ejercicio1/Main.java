package com.JavaAvanzado.Semana1.Clase1_Día2.Ejercicio1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ejercicio Nº 1 - Reserva de Vuelos - Individual
		 * 
		 * Imagina que estás desarrollando un sistema de reservas de vuelos para una
		 * aerolínea. Los usuarios pueden realizar reservas de vuelos proporcionando
		 * información como su nombre, destino, fecha de viaje y número de asientos
		 * deseados. Tu tarea es implementar una función de reserva de vuelos que valide
		 * los datos ingresados y maneje excepciones si los datos son incorrectos o si
		 * no hay suficientes asientos disponibles en el vuelo.
		 * 
		 * Debes crear una excepción personalizada, por ejemplo,
		 * ReservaInvalidaException, que se lance en situaciones excepcionales, como
		 * cuando un usuario intenta reservar más asientos de los disponibles o si falta
		 * información esencial. La excepción personalizada debe proporcionar un mensaje
		 * claro sobre la causa del error.
		 */

		Reserva reserva = new Reserva("Pablo", "México", LocalDate.of(2022, 5, 1), 20);

		try {

			reserva.reservarVuelo(8);
			System.out.println("Reserva exitosa. Asientos restantes: " + reserva.getNumAsientosDisponibles());
		} catch (ReservaInvalidaException e) {
			System.out.println("Error al realizar la reserva: " + e.getMessage());
		}

		try {

			reserva.reservarVuelo(45);
			System.out.println("Reserva exitosa. Asientos restantes: " + reserva.getNumAsientosDisponibles());
		} catch (ReservaInvalidaException e) {
			System.out.println("Error al realizar la reserva: " + e.getMessage());
		}

		try {

			reserva.reservarVuelo(0);
			System.out.println("Reserva exitosa. Asientos restantes: " + reserva.getNumAsientosDisponibles());
		} catch (ReservaInvalidaException e) {
			System.out.println("Error al realizar la reserva: " + e.getMessage());
		}

	}

}
