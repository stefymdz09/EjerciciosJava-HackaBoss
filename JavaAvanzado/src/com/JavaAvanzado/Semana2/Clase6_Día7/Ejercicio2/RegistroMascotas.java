package com.JavaAvanzado.Semana2.Clase6_Día7.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas<T> {
	List<Mascota<T>> mascotas;

	public RegistroMascotas() {
		this.mascotas = new ArrayList<>();
	}

	public void agregarMascota(Mascota<T> mascota) {
		mascotas.add(mascota);
	}

	public List<Mascota<T>> buscarPorNombre(String nombre) {
		List<Mascota<T>> resultado = new ArrayList<>();
		for (Mascota<T> mascota : mascotas) {
			if (mascota.getNombre().equals(nombre)) {
				resultado.add(mascota);
			}
		}
		return resultado;
	}

	public List<Mascota<T>> buscarPorEspecie(String especie) {
		List<Mascota<T>> resultado = new ArrayList<>();
		for (Mascota<T> mascota : mascotas) {
			if (mascota.getEspecie().equals(especie)) {
				resultado.add(mascota);
			}
		}
		return resultado;
	}

	public int cantidadTotalMascotas() {
		return mascotas.size();
	}

	public void generarDatosAleatorios(int cantidad) {
		Random random = new Random();
		String[] nombres = { "Max", "Milo", "Kira", "Canela", "Brand", "Dana" };
		String[] especies = { "Perro", "Gato", "Reptil", "Ave" };

		for (int i = 0; i < cantidad; i++) {
			String nombreAleatorio = nombres[random.nextInt(nombres.length)];
			int edadAleatoria = random.nextInt(15) + 1;
			String especieAleatoria = especies[random.nextInt(especies.length)];
			Mascota<T> mascota = new Mascota<>(nombreAleatorio, edadAleatoria, especieAleatoria);
			agregarMascota(mascota);
		}
	}
}
