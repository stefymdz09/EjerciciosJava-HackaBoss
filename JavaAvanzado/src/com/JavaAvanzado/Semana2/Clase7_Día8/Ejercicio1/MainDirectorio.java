package com.JavaAvanzado.Semana2.Clase7_Día8.Ejercicio1;

public class MainDirectorio {

	public static void main(String[] args) {
		/*
		 * Crea un programa que simule la exploración recursiva de directorios en el
		 * sistema de archivos de un sistema operativo utilizando una estructura de
		 * datos propia.
		 * 
		 * Emplea una estructura donde cada nodo representa un directorio y contiene
		 * referencias a sus subdirectorios.
		 * 
		 * El programa debe realizar una exploración simulada para mostrar la jerarquía
		 * de directorios y archivos.
		 */
		// Crear la estructura de directorios y archivos
		Directorio raiz = new Directorio("Raiz");
		Directorio carpeta1 = new Directorio("Carpeta1");
		Directorio carpeta2 = new Directorio("Carpeta2");
		Directorio subcarpeta1 = new Directorio("Subcarpeta1.1");
		Directorio subcarpeta1_2 = new Directorio("Subcarpeta1.2");

		Directorio subcarpeta2_1 = new Directorio("Subcarpeta2.1");

		raiz.agregarSubdirectorio(carpeta1);
		raiz.agregarSubdirectorio(carpeta2);

		carpeta1.agregarSubdirectorio(subcarpeta1);
		carpeta1.agregarSubdirectorio(subcarpeta1_2);
		carpeta1.agregarArchivo("archivo1.txt");

		carpeta2.agregarSubdirectorio(subcarpeta2_1);
		carpeta2.agregarArchivo("archivo2.txt");
		subcarpeta1.agregarArchivo("archivo3.txt");

		// Crear el explorador de directorios y explorar la raíz
		ExploradorDirectorios explorador = new ExploradorDirectorios();
		explorador.explorarDirectorio(raiz, 0);
	}

}
