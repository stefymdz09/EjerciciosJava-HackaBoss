package com.JavaAvanzado.Semana2.Clase7_Día8.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Directorio {

	String nombre;
	List<Directorio> subdirectorios;
	List<String> archivos;

	public Directorio(String nombre) {
		this.nombre = nombre;
		this.subdirectorios = new ArrayList<>();
		this.archivos = new ArrayList<>();
	}

	public void agregarSubdirectorio(Directorio subDirectorio) {
		this.subdirectorios.add(subDirectorio);
	}

	public void agregarArchivo(String archivo) {
		this.archivos.add(archivo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Directorio> getSubdirectorios() {
		return subdirectorios;
	}

	public void setSubdirectorios(List<Directorio> subdirectorios) {
		this.subdirectorios = subdirectorios;
	}

	public List<String> getArchivo() {
		return archivos;
	}

	public void setArchivo(List<String> archivo) {
		this.archivos = archivos;
	}

}
