package com.JavaAvanzado.Semana2.Clase6_Día7.Ejercicio1;

import java.util.Arrays;
import java.util.List;

public class AdministradorConcesionariaMain {
	public static void main(String[] args) {

		/*
		 * Ejercicio 1: Concesionaria de Autos
		 * 
		 * Una concesionaria de vehículos necesita un sistema para administrar su
		 * inventario de autos. Crea una clase Auto con atributos como marca, modelo,
		 * año, y precio. Implementa una clase utilitaria InventarioAutos con métodos
		 * genéricos para realizar las siguientes operaciones:
		 * 
		 * Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al
		 * inventario de la concesionaria.
		 * 
		 * Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan
		 * buscar autos por marca o año dentro del inventario.
		 * 
		 * Calcular el Valor Total del Inventario: Desarrolla un método genérico que
		 * calcule el valor total de todos los autos en el inventario.
		 */
		InventarioAutos<Auto> inventarioAutos = new InventarioAutos<>();

		List<Auto> autos = Arrays.asList(new Auto("Dacia", "Kl", 2010, 25000.0),
				new Auto("Toyota", "Civic", 2000, 22000.0), new Auto("Ford", "Mustang", 2020, 35000.0),
				new Auto("Ford", "C-max", 2020, 32000.0), new Auto("Chevrolet", "Camaro", 2000, 32000.0));

		for (Auto auto : autos) {
			inventarioAutos.agregarAuto(auto);
		}

		double precioTotal = inventarioAutos.calcularValorTotal();
		System.out.println("\nPrecio total del inventario: " + precioTotal);

		List<Auto> autosFord = inventarioAutos.buscarPorMarca("Ford");
		List<Auto> autosAño2020 = inventarioAutos.buscarPorAño(2020);

		System.out.println("Autos Ford :");
		System.out.println(autosFord.toString());
		System.out.println("Autos del año 2020: ");
		System.out.println(autosAño2020);
	}

}
