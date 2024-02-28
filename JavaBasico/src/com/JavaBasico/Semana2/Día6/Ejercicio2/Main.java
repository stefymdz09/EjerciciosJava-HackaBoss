package com.JavaBasico.Semana2.Día6.Ejercicio2;

public class Main {

	public static void main(String[] args) {

		/*
		 * * b) Una vez creadas las clases, crear en el Main un vector de tipo
		 * Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero
		 * (crear un objeto con parámetros para cada uno de ellos).
		 */

		Vestimenta[] vestimentas = new Vestimenta[9];

		vestimentas[0] = new Zapato(1, "Sandalia de Verano", 35.0, "Birkenstock", "39", "Blanco", "Cuero", "Hebilla");
		vestimentas[1] = new Zapato(2, "Zapatilla Casual", 55.0, "Vans", "38", "Gris", "Tela", "Cordones");
		vestimentas[2] = new Zapato(3, "Bota de Cuero", 75.0, "Timberland", "43", "Café Oscuro", "Cuero", "Cremallera");

		vestimentas[3] = new Pantalon(4, "Chino", 40.0, "Dockers", "34", "Beige", "Regular", "Algodón");
		vestimentas[4] = new Pantalon(5, "Jogger Deportivo", 30.0, "Under Armour", "M", "Negro", "Ajustado",
				"Poliamida");
		vestimentas[5] = new Pantalon(6, "Short de Playa", 20.0, "Levis", "L", "Azul Marino", "Deportivo",
				"Poliéster");

		vestimentas[6] = new Camiseta(7, "Camiseta Estampada", 25.0, "Hollister", "S", "Gris", "Corta",
				"Cuello Redondo");
		vestimentas[7] = new Camiseta(8, "Camiseta Polo", 35.0, "Ralph Lauren", "M", "Azul", "Manga Corta",
				"Cuello Polo");

		vestimentas[8] = new Sombrero(9, "Gorra de Béisbol", 18.0, "New Era", "Única", "Negra", "Algodón", "Ajustable");
		/*
		 * d) Recorrer el vector y ejecutar el método que corresponde en cada posición
		 * del mismo.
		 */
		for (Vestimenta prenda : vestimentas) {
			prenda.mostrarMensaje();
		}

	}

}
