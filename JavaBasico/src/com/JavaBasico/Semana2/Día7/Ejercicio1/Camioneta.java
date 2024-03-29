package com.JavaBasico.Semana2.Día7.Ejercicio1;

import java.util.Calendar;

import com.JavaBasico.Semana2.Día7.Ejercicio1.Interfaces.Combustion;

public class Camioneta extends Vehiculo implements Combustion {
	/*
	 * d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e
	 * implemente la interfaz Combustion. Agrega atributos específicos para las
	 * camionetas de combustión, como capacidadTanque y consumoCombustible.
	 * Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
	 */

	private int capacidadTanque;
	private double consumoCombustible;

	public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadTanque,
			double consumoCombustible) {
		super(id, placa, marca, modelo, anio, costo);
		this.capacidadTanque = capacidadTanque;
		this.consumoCombustible = consumoCombustible;
	}

	public int getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	public double getConsumoCombustible() {
		return consumoCombustible;
	}

	public void setConsumoCombustible(double consumoCombustible) {
		this.consumoCombustible = consumoCombustible;
	}

	@Override
	public int calcularAntiguedad() {
		return Calendar.getInstance().get(Calendar.YEAR) - super.anio;
	}

	@Override
	public void recargarCombustible() {
		System.out.println("Recargando combustible para la camioneta");
	}

}
