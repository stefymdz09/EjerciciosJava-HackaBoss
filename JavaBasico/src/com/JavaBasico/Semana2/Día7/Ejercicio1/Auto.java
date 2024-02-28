package com.JavaBasico.Semana2.Día7.Ejercicio1;

import java.util.Calendar;

import com.JavaBasico.Semana2.Día7.Ejercicio1.Interfaces.Electrico;

public class Auto extends Vehiculo implements Electrico {
	/*
	 * 
	 * c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la
	 * interfaz Electrico. Agrega atributos específicos para los autos eléctricos,
	 * como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos
	 * abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
	 */

	private int capacidadBateria;
	private int autonomia;

	public Auto(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadBateria,
			int autonomia) {
		super(id, placa, marca, modelo, anio, costo);
		this.capacidadBateria = capacidadBateria;
		this.autonomia = autonomia;
	}

	public int getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	@Override
	public int calcularAntiguedad() {
		return Calendar.getInstance().get(Calendar.YEAR) - super.anio;
	}

	@Override
	public void cargarEnergia() {
		System.out.println("Cargando energía del auto eléctrico");
	}

}
