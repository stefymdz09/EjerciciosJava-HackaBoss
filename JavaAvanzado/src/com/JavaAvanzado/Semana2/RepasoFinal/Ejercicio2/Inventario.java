package com.JavaAvanzado.Semana2.RepasoFinal.Ejercicio2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Inventario {
	public static void main(String[] args) {

		/*
		 * Ejercicio Nº 5: Streams y Optionals Sobre el ejercicio 3 (inventario con
		 * generics), implementa las siguientes operaciones utilizando Streams y
		 * Optionals:
		 * 
		 * 1. Filtrar los productos electrónicos de una marca determinada y mostrarlos.
		 * 
		 * 2. Sobre los productos electrónicos filtrados, obtener el precio MAXIMO y
		 * mostrarlo.
		 */
		List<Producto> inventario = List.of(new Producto("Laptop", 1200, "Electronico"),
				new Producto("Smartphone", 800, "Electronico"), new Producto("Libro", 25, "Libreria"),
				new Producto("Tablet", 500, "Electronico"), new Producto("Monitor", 300, "Electronico"));

		// 1. Filtrar los productos electrónicos de una marca determinada y mostrarlos.
		String marca = "Electronico";
		List<Producto> productosElectronicos = inventario.stream()
				.filter(producto -> producto.getCategoria().equals(marca)).collect(Collectors.toList());

		System.out.println("Productos electrónicos de la marca " + marca + ":");
		productosElectronicos.forEach(System.out::println);

		/*
		 * 2. Calculamos el precio máximo de los productos electrónicos filtrados y lo
		 * mostramos. Utilizamos un Optional para manejar valores posiblemente vacíos.
		 * El método max() nos permite encontrar el valor máximo en función de un
		 * comparador (en este caso, Double::compare). ANTES de calcular el máximo,
		 * MAPEAMOS los objetos Producto (los elementos de productosElectronicos) a sus
		 * precios correspondientes utilizando el método map(). Esto nos permite
		 * trabajar directamente con los precios de los productos en forma de Double.
		 * 
		 * (Usamos el map para poder "transformar" los objetos de Producto (los
		 * elementos de productosElectronicos) en Double)
		 */

		Optional<Double> precioMaximo = productosElectronicos.stream().map(Producto::getPrecio).max(Double::compare);

		precioMaximo.ifPresent(max -> System.out.println("Precio máximo: " + max));
	}
}