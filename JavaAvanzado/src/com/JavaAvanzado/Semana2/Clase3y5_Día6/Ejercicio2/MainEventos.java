package com.JavaAvanzado.Semana2.Clase3y5_Día6.Ejercicio2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainEventos {

	public static void main(String[] args) {

		/*
		 * Ejercicio Nº 2 - Gestor de Eventos - Individual
		 * 
		 * Imagina que estás construyendo una aplicación para gestionar eventos en una
		 * agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo,
		 * "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones
		 * utilizando Streams y Optionals:
		 * 
		 * Filtra los eventos que están programados para una fecha específica.
		 * 
		 * Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada
		 * categoría.
		 * 
		 * Encuentra el evento más próximo en el tiempo utilizando Optionals.
		 */

		List<Evento> eventos = Arrays.asList(new Evento("Reunión de equipo", LocalDate.of(2024, 3, 14), "Reunión"),
				new Evento("Conferencia de tecnología", LocalDate.of(2022, 3, 15), "Conferencia"),
				new Evento("Taller de desarrollo", LocalDate.of(2021, 6, 24), "Taller"),
				new Evento("Taller de programación", LocalDate.of(2022, 3, 5), "Taller"),
				new Evento("Reunion de equipo", LocalDate.of(2022, 3, 5), "Reunión"),
				new Evento("Conferencia de recursos humanos", LocalDate.of(2022, 3, 5), "Conferencia"));

		// Filtrar eventos para una fecha específica
		LocalDate fecha = LocalDate.of(2022, 3, 5);
		List<Evento> fechaFiltrada = eventos.stream().filter(evento -> evento.getFecha().equals(fecha))
				.collect(Collectors.toList());

		System.out.println("Eventos programados para el " + fecha + ":");
		fechaFiltrada.forEach(System.out::println);

		// Agrupar eventos por categoría y contar cuántos hay en cada categoría
		Map<String, Long> eventosPorCategoria = eventos.stream()
				.collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

		System.out.println("\nCantidad de eventos por categoría:");
		eventosPorCategoria.forEach((categoria, cantidad) -> System.out.println(categoria + ": " + cantidad));

		// Encontrar el evento más próximo en el tiempo utilizando Optional
		Optional<Evento> eventoProximo = eventos.stream().min(Comparator.comparing(Evento::getFecha));

		eventoProximo.ifPresent(evento -> System.out.println("\nPróximo evento: " + evento));
	}
}
