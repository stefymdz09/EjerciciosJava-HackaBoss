package com.JavaAvanzado.Semana2.Clase6_Día7.Ejercicio2;

import java.util.List;

public class MainMascostas {
	public static void main(String[] args) {
		/*
		 * Ejercicio 2: Veterinaria
		 * 
		 * Una clínica veterinaria necesita un sistema para administrar su registro de
		 * mascotas, para ello, se solicita la definición de una clase genérica
		 * Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o
		 * id de mascota para identificar a cada una). Crea una clase utilitaria propia
		 * llamada RegistroMascotas que cuente con métodos genéricos para:
		 * 
		 * Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con
		 * genéricos para manipular colecciones como ArrayList o LinkedList y agregar
		 * mascotas de distinto tipo al registro de la veterinaria (puedes tomar como
		 * ejemplos de tipos: perros, gatos, reptiles y aves).
		 * 
		 * Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases
		 * utilitarias como Collections o Arrays junto con genéricos para realizar
		 * búsquedas eficientes por nombre o especie dentro del registro de mascotas.
		 * 
		 * Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de
		 * java.util para obtener el tamaño de la colección y contar la cantidad total
		 * de mascotas registradas en la veterinaria.
		 * 
		 * Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util
		 * para generar datos aleatorios, como nombres, edades o especies, para agregar
		 * mascotas al registro.
		 */
		RegistroMascotas<Integer> registro = new RegistroMascotas<>();

		registro.agregarMascota(new Mascota<>(1, "Maximiliano", 2, "Perro"));
		registro.agregarMascota(new Mascota<>(2, "Carlota", 3, "Gato"));
		registro.agregarMascota(new Mascota<>(3, "Dana", 7, "Perro"));

		List<Mascota<Integer>> mascotasPorNombre = registro.buscarPorNombre("Dana");
		System.out.println("\nMascotas por nombre 'Dana': " + mascotasPorNombre);

		List<Mascota<Integer>> mascotasPorEspecie = registro.buscarPorEspecie("Gato");
		System.out.println("\nMascotas por especie 'Gato': " + mascotasPorEspecie);

		int cantidadTotal = registro.cantidadTotalMascotas();
		System.out.println("\nCantidad total de mascotas: " + cantidadTotal);

		registro.generarDatosAleatorios(3);
		System.out.println("\nMascotas después de generar datos aleatorios: " + registro.mascotas);
	}
}
