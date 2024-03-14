package com.JavaAvanzado.Semana2.Clase3y5_Día6.Ejercicio1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainEmpleados {
	public static void main(String[] args) {

		/*
		 * Ejercicio Nº 1 - Empleados - Individual
		 * 
		 * Crea una aplicación que maneje información sobre empleados. Cada empleado
		 * tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador",
		 * "Analista", "Gerente"). Implementa las siguientes operaciones utilizando
		 * Streams y Optionals:
		 * 
		 * Filtra los empleados cuyo salario sea mayor a cierto valor específico.
		 * 
		 * Agrupa los empleados por categoría y calcula el salario promedio para cada
		 * categoría.
		 * 
		 * Encuentra al empleado con el salario más alto utilizando Optionals.
		 */

		// Crear una lista de empleados usando asList en este caso
		List<Empleado> empleados = Arrays.asList(new Empleado("Maikel", 3300, "Desarrollador"),
				new Empleado("Fátima", 2000, "Analista"), new Empleado("Juan", 1800, "Desarrollador"),
				new Empleado("Dayana", 2500.50, "Gerente"));
		// A- Filtra los empleados cuyo salario sea mayor a cierto valor específico.

		double salarioMinimo = 2000;
		List<Empleado> empleadosFiltrados = empleados.stream().filter(empleado -> empleado.getSalario() > salarioMinimo)
				.collect(Collectors.toList());
		System.out.println("Empleados con salario mayor a " + salarioMinimo + "$:");
		empleadosFiltrados.forEach(System.out::println);

		// empleadosFiltrados.forEach(empleado -> System.out.println(empleado));

		// Agrupar empleados por categoría y calcular salario promedio para cada
		// categoría
		Map<String, Double> salarioPromedioPorCategoria = empleados.stream().collect(
				Collectors.groupingBy(Empleado::getCategoria, Collectors.averagingDouble(Empleado::getSalario)));
		System.out.println("-----------------------");
		System.out.println("\nSalario promedio por categoría:");
		salarioPromedioPorCategoria
				.forEach((categoria, salarioPromedio) -> System.out.println(categoria + ": " + salarioPromedio));

		// Encontrar empleado con el salario más alto utilizando Optional

		Optional<Empleado> empleadoSalarioMaximo = empleados.stream()
				.max(Comparator.comparingDouble(Empleado::getSalario));
		System.out.println("-----------------------");
		empleadoSalarioMaximo
				.ifPresent(empleado -> System.out.println("\nEmpleado con el salario más alto: " + empleado));

	}
}
