package com.JavaAvanzado.Semana1.Clase1_Día2.Ejercicio1;

import java.time.LocalDate;

public class Reserva {

	private String nombreCliente;
	private String destino;
	private LocalDate fechaViaje;
	private int numAsientosDisponibles;

	public Reserva(String nombreCliente, String destino, LocalDate fechaViaje, int numAsientosDisponibles) {
		super();
		this.nombreCliente = nombreCliente;
		this.destino = destino;
		this.fechaViaje = fechaViaje;
		this.numAsientosDisponibles = numAsientosDisponibles;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getFechaViaje() {
		return fechaViaje;
	}

	public void setFechaViaje(LocalDate fechaViaje) {
		this.fechaViaje = fechaViaje;
	}

	public int getNumAsientosDisponibles() {
		return numAsientosDisponibles;
	}

	public void setNumAsientosDisponibles(int numAsientosDisponibles) {
		this.numAsientosDisponibles = numAsientosDisponibles;
	}

	public void reservarVuelo(int numAsientosReserva) throws ReservaInvalidaException {
		if (nombreCliente == null || nombreCliente.isEmpty() || destino == null || destino.isEmpty()
				|| fechaViaje == null) {
			throw new ReservaInvalidaException("Debe ingresar un valor en los campos");
		}
		if (numAsientosReserva <= 0) {
			throw new ReservaInvalidaException("El número de asientos debe ser mayor que cero.");
		}
		if (numAsientosReserva > numAsientosDisponibles) {
			throw new ReservaInvalidaException("No hay suficientes asientos disponibles.");
		}
		actualizarDisponibilidadAsientos(numAsientosReserva);
	}

	private void actualizarDisponibilidadAsientos(int numAsientosReservaReservados) {

		numAsientosDisponibles -= numAsientosReservaReservados;
	}

}
