package com.JavaAvanzado.Semana2.RepasoFinal.Ejercicio1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class GestionarEstudiantes {

	public static void main(String[] args) {
		// CREAR AL MENOS 5 ESTUDIANTES CON AL MENOS 3 CALIFICACIONES CADA UNO

		List<Estudiante> estudiantes = Arrays.asList(new Estudiante("Carlos", Arrays.asList(8.0, 9.0, 7.0), 20),
				new Estudiante("Maria", Arrays.asList(6.0, 7.5, 8.0), 22),
				new Estudiante("Juan", Arrays.asList(9.0, 9.5, 8.5), 19),
				new Estudiante("Laura", Arrays.asList(7.5, 8.0, 7.0), 21),
				new Estudiante("Pedro", Arrays.asList(8.5, 9.0, 8.0), 18));
		// A- Filtrar a los alumnos mayores de 18 años

		List<Estudiante> alumnosFiltrados = estudiantes.stream().filter(edad -> edad.getEdad() > 18)
				.collect(Collectors.toList());

		// Recorrer para mostrar los alumnos mayores de 18 años
		System.out.println("Alumnos mayores de 18 años: ");
		alumnosFiltrados.forEach(System.out::println);

		// Recorrer los estudiantes y despues procesar-obtener la lista de
		// calificaciones para poder obtener el promedio
		System.out.println("\nPromedio de calificaciones:");
		estudiantes.forEach(estudiante -> {
			OptionalDouble promedio = estudiante.getCalificaciones().stream()
					// Se calcula el promedio con average(una forma) y el average espera un
					// DoubleStream
					.mapToDouble(Double::doubleValue).average();
			System.out.println(estudiante.getNombre() + ": " + promedio.orElse(0.0));
		});
		// hay que mapearlo; hacer mapToDouble para poder acceder a operaciones como
		// suma.. average

		/*
		 * Se puede obtener el valor como primitivo double con getAsDouble(), sin
		 * embargo, esta operación podría causar un NullPointerException si el Optional
		 * está vacío. Para evitar este problema, utilizamos métodos proporcionados por
		 * Optional para manejar valores nulos. En este caso, usamos orElse() para
		 * proporcionar un valor predeterminado en caso de que el Optional esté vacío.
		 */
	}

}
