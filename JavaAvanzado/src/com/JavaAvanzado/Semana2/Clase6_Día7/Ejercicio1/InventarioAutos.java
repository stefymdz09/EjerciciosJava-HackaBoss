package com.JavaAvanzado.Semana2.Clase6_Día7.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {

	List<T> autos;

	public InventarioAutos() {
		this.autos = new ArrayList<>();
	}

//Agregar Autos al Inventario:  autos al inventario de la concesionaria.
	public void agregarAuto(T auto) {
		this.autos.add(auto);
		System.out.println("Auto agregado: " + auto);
	}

	// Calcular el Valor Total del Inventario: Desarrolla un método genérico que
	// calcule el valor total de todos los autos en el inventario.
	public double calcularValorTotal() {
		double valorTotal = 0.0;
		for (T auto : autos) {
			valorTotal += auto.getPrecio();
		}
		return valorTotal;
	}

//Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.
	public List<T> buscarPorMarca(String marca) {
		List<T> resultado = new ArrayList<>();
		for (T auto : autos) {
			if (auto.getMarca().equals(marca)) {
				resultado.add(auto);
			}
		}
		return resultado;
	}

	public List<T> buscarPorAño(int año) {
		List<T> resultado = new ArrayList<>();
		for (T auto : autos) {
			if (auto.getAño() == año) {
				resultado.add(auto);
			}
		}
		return resultado;
	}
}
