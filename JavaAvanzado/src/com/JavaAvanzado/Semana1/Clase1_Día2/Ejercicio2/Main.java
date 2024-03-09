package com.JavaAvanzado.Semana1.Clase1_Día2.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Producto> inventario = new ArrayList<>();

		try {
			Producto producto1 = new Producto("Teléfono", 1200.0, 70);
			inventario.add(producto1);
			System.out.println("Producto agregado: " + producto1.getNombre());
		} catch (InventarioException e) {
			System.out.println("Error al agregar producto1: " + e.getMessage());
		}

		try {
			Producto producto2 = new Producto("Auriculares", -40.50, 0);

			System.out.println("Producto agregado: " + producto2.getNombre());

		} catch (InventarioException e) {
			System.out.println("Error al agregar producto2: " + e.getMessage());
		}
	}
}
