package com.JavaAvanzado.Semana2.Clase7_Día8.Ejercicio1;

public class ExploradorDirectorios {

	public void explorarDirectorio(Directorio directorio, int nivel) {
		// Nombre del directorio principal (RAIZ)
		System.out.println(obtenerIndentacion(nivel) + "|-- " + directorio.nombre + "/");

		// mostrar el listado de directorios (carpetas)
		for (String archivo : directorio.archivos) {
			System.out.println(obtenerIndentacion(nivel + 1) + "|   " + archivo);
		}

		// mostrar el listado de subdirectorios (subcarpetas)
		for (Directorio subdirectorio : directorio.subdirectorios) {
			explorarDirectorio(subdirectorio, nivel + 1);
		}
	}

	// Estructura de como se muestra
	private String obtenerIndentacion(int nivel) {
		String indentacion = "";
		for (int i = 0; i < nivel; i++) {
			indentacion += "|    ";
		}
		return indentacion;
	}

}