package com.JavaAvanzado.Semana2.Clase6_Día7.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Auto {
	private String marca;
	private String modelo;
	private int año;
	private double precio;

	public Auto(String marca, String modelo, int año, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Auto{" + "marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", año=" + año + ", precio=" + precio
				+ '}';
	}
}
