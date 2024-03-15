package com.JavaAvanzado.Semana2.RepasoFinal.Ejercicio2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Producto {
	private String nombre;
	private double precio;
	private String categoria;

	public Producto(String nombre, double precio, String categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Producto{" + "nombre='" + nombre + '\'' + ", precio=" + precio + ", categoria='" + categoria + '\''
				+ '}';
	}

}
