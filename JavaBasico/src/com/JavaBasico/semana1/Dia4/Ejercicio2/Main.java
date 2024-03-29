package com.JavaBasico.semana1.Dia4.Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a)Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y
		// guardarlas en él.
		Persona[] personas = new Persona[5];
		personas[0] = new Persona(1, "Nicole", 22, "Calle Alfonso X", "656785632");
		personas[1] = new Persona(2, "Alyson", 16, "Calle Fernando", "654128996");
		personas[2] = new Persona(3, "Pablo", 48, "Calle Laguna", "654227789");
		personas[3] = new Persona(4, "Fatima", 32, "Calle Isabel II", "645627998");
		personas[4] = new Persona(5, "Pedro", 50, "Calle Torrejon", "623655339");

		// b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada
		// persona almacenada.

		System.out.println("Información de las personas antes del cambio de nombres:");
		for (Persona persona : personas) {
			System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
		}

		// c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar
		// el cambio y luego mostrar el después de los datos de las dos personas cuyos
		// nombres fueron cambiados.

		personas[1].setNombre("Joselyn");
		personas[4].setNombre("Nicolas");

		System.out.println("\nInformación de las personas después del cambio de nombres:");
		/*
		 * for (Persona persona : personas) { System.out.println("Nombre: " +
		 * persona.getNombre() + ", Edad: " + persona.getEdad());
		 * 
		 * }
		 */
		
		System.out.println("Nombre: " + personas[1].getNombre() + ", Edad: " + personas[1].getEdad());
		System.out.println("Nombre: " + personas[4].getNombre() + ", Edad: " + personas[4].getEdad());


		// d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya
		// edad sea mayor de 30 años.
		System.out.println("\nPersonas mayores de 30 años:");
		for (Persona persona : personas) {
			if (persona.getEdad() > 30) {
				System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
			}
		}
	}
}
