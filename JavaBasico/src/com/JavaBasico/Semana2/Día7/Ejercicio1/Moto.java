package com.JavaBasico.Semana2.Día7.Ejercicio1;

import java.util.Calendar;

import com.JavaBasico.Semana2.Día7.Ejercicio1.Interfaces.Combustion;

public class Moto extends Vehiculo implements Combustion {
	/*
	 * 
	 * e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la
	 * interfaz Combustion. Agrega atributos específicos para las motos de
	 * combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de
	 * la clase abstracta y los de la interfaz.
	 */

	private int cilindrada;
	private String tipoMotor;

	public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada,
			String tipoMotor) {
		super(id, placa, marca, modelo, anio, costo);
		this.cilindrada = cilindrada;
		this.tipoMotor = tipoMotor;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	@Override
	public int calcularAntiguedad() {
		return Calendar.getInstance().get(Calendar.YEAR) - super.anio;
	}

	@Override
	public void recargarCombustible() {
		System.out.println("Recargando combustible de la moto");
	}

}
