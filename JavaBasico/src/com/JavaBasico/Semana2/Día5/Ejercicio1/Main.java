package com.JavaBasico.Semana2.Día5.Ejercicio1;

public class Main {

	public static void main(String[] args) {

		/*
		 * a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras.
		 * Crear 5 verduras y guardarlas en el vector.
		 */
		Verdura[] verduras = new Verdura[5];
		verduras[0] = new Verdura(1, "Espinaca", "Verde", 25.5, true);
		verduras[1] = new Verdura(2, "Cebolla", "Roja", 22.8, true);
		verduras[2] = new Verdura(3, "Pimiento", "Verde", 15.6, false);
		verduras[3] = new Verdura(4, "Calabacín", "Verde", 20, true);
		verduras[4] = new Verdura(5, "Espinaca", "Verde", 22.9, true);

		/*
		 * b) Recorrer el vector creado y mostrar por pantalla el nombre y las calorías
		 * de las verduras almacenadas.
		 */
		System.out.println("------NOMBRE Y CALORÍAS DE LAS VERDURAS-----------");
		for (Verdura verdura : verduras) {
			System.out.println("Nombre: " + verdura.getNombre() + " / Calorías: " + verdura.getCalorias());
			System.out.println("-------------------------------------------------------------------------------");
		}

		/*
		 * c) Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos de
		 * todas las verduras luego del cambio.
		 */
		verduras[0].setNombre("Tomate");
		verduras[0].setColor("Rojo");
		verduras[0].setCalorias(14.7);
		verduras[0].setDebeCocinarse(false);

		verduras[1].setNombre("Pimiento");
		verduras[1].setColor("Rojo");
		verduras[1].setCalorias(19.8);
		verduras[1].setDebeCocinarse(false);

		/*
		 * d) Recorrer el vector y mostrar por pantalla únicamente a las verduras que
		 * sean de color verde.
		 */
		System.out.println("\n------Información delas verduras después de modificarlas:------");
		for (Verdura verdura : verduras) {
			System.out.println(verdura.toString());
		}

		System.out.println("\n------Verduras de color verde:------");
		for (Verdura verdura : verduras) {
			if (verdura.getColor().equalsIgnoreCase("verde")) {
				System.out.println(verdura.toString());
			}
		}

	}

}
