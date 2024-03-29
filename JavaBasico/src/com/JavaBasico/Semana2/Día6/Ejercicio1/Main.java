package com.JavaBasico.Semana2.Día6.Ejercicio1;

public class Main {

	public static void main(String[] args) {
		/*
		 * c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3
		 * métodos saludar desde cada objeto
		 */
		Mamifero mamifero = new Mamifero(1, "Panda", 8, "Pelaje", "Carnívoro", 4, "Vivípara", "Negro-Blanco", "Selva");
		Ave ave = new Ave(2, "Loro", 7, "Plumaje", "Omnívoro", 2.5, "Planeador", "Colorido", "Pico curvado");
		Reptil reptil = new Reptil(9, "Cocodrilo", 12, "Piel gruesa", "Carnívoro", 5.0, "Constrictor",
				"Veneno moderado", "Humedales");

		mamifero.saludar();
		ave.saludar();
		reptil.saludar();

		/*
		 * d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado…
		 * ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
		 * 
		 */
		Animal animal = new Animal();
		animal = mamifero;

		/*
		 * Resp: Sí, es posible asignar un objeto de tipo Mamifero a un objeto de tipo
		 * Animal. Esta subclase Mamifero hereda características y comportamientos de la
		 * superclase (Animal. Un objeto de las subclases simpre va a poder heredar
		 * metodos/atributos..etc de las superclases que tenga, hasta de Object, debido
		 * al principio del Polimorfismo
		 */

		/*
		 * E) Cambiar el modificador de acceso de los métodos de "public" a "private".
		 * Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible
		 * hacer esto?
		 */

		/*
		 * Resp: Debido al principio de encapsulamiento, no ser posible acceder a ellos
		 * si se modifica, ya que al estar en "private" solo se puede acceder a ella a
		 * travéz de su propia clase
		 */
	}

}
