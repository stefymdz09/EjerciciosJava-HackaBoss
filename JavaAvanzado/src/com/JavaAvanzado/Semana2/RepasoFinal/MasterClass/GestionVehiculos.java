package com.JavaAvanzado.Semana2.RepasoFinal.MasterClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class GestionVehiculos {
	public static void main(String[] args) {

		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(new Vehiculo("Ford", "Fiesta", 1000));
		vehiculos.add(new Vehiculo("Ford", "Focus", 1200));
		vehiculos.add(new Vehiculo("Ford", "Explorer", 2500));
		vehiculos.add(new Vehiculo("Fiat", "Uno", 500));
		vehiculos.add(new Vehiculo("Fiat", "Cronos", 1000));
		vehiculos.add(new Vehiculo("Fiat", "Torino", 1250));
		vehiculos.add(new Vehiculo("Chevrolet", "Aveo", 1250));
		vehiculos.add(new Vehiculo("Chevrolet", "Spin", 2500));
		vehiculos.add(new Vehiculo("Toyota", "Corolla", 1200));
		vehiculos.add(new Vehiculo("Toyota", "Fortuner", 3000));
		vehiculos.add(new Vehiculo("Renault", "Logan", 950));
		/*
		 * 3. Haciendo uso del método sort en la lista de Vehículos con expresiones
		 * lambda, obtén una lista de vehículos ordenados por precio de menor a mayor,
		 * imprime por pantalla el resultado.
		 */

		List<Vehiculo> ordenVehiculosPorPrecio = vehiculos.stream()
				.sorted((v1, v2) -> Double.compare(v1.getCosto(), v2.getCosto())).collect(Collectors.toList());

		System.out.println("Vehiculos ordenados por precio de menor a mayor");
		ordenVehiculosPorPrecio.forEach(System.out::println);

		// 4. De la misma forma anterior imprime una lista ordenada por marca y a su vez
		// por precio.

		List<Vehiculo> vehiculosOrdenadosPorMarcaYPrecio = vehiculos.stream()
				// ehiculo::getMarca -compara los objetos de vehiculos usando el metodo getMarca
				// thenComparingDouble - comparacion secundaria para compararlo con el precio en
				// caso de que dos marcas sean iguales
				.sorted(Comparator.comparing(Vehiculo::getMarca).thenComparingDouble(Vehiculo::getCosto))
				.collect(Collectors.toList());
		System.out.println("\nVehículos ordenados por marca y a la vez por precio:");
		vehiculosOrdenadosPorMarcaYPrecio.forEach(System.out::println);

		// 5. Se desea extraer una lista de vehículos con precio no mayor a 1000, luego
		// otra con precios mayor o igual 1000 y por último, obtén el promedio total de
		// precios de toda la lista de vehículos.

		List<Vehiculo> precioMenorA1000 = vehiculos.stream().filter(vehiculo -> vehiculo.getCosto() < 1000)
				.collect(Collectors.toList());

		System.out.println("\n Lista de vehiculos con vehiculos con precio no mayor a 1000");
		precioMenorA1000.forEach(System.out::println);

		List<Vehiculo> precioMayorOIgualA1000 = vehiculos.stream().filter(vehiculo -> vehiculo.getCosto() >= 1000)
				.collect(Collectors.toList());

		System.out.println("\n Lista de vehiculos precios mayor o igual 1000");
		precioMayorOIgualA1000.forEach(System.out::println);

		// Obtener el promedio total de la lista de vehiculos- recorrer todos los
		// vehiculos y usar el Optional para calcular el promedio

		// double promedioPrecios =
		// vehiculos.stream().mapToDouble(Vehiculo::getCosto).average().orElse(0.0);

		OptionalDouble promedioPreciosOptional = vehiculos.stream().mapToDouble(Vehiculo::getCosto).average();

		// System.out.println("\nPromedio de precios de todos los vehículos: " +
		// promedioPrecios);
		// Verificar si hay un valor antes de obtenerlos (posibles valores nulos)
		if (promedioPreciosOptional.isPresent()) {
			System.out
					.println("\nPromedio de precios de todos los vehículos: " + promedioPreciosOptional.getAsDouble());
		} else {
			System.out.println("\nNo hay vehículos en la lista.");
		}

	}

}
