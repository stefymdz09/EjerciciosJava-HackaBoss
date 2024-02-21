package com.JavaBasico.semana1.Dia4.Ejercicio2;

/**
 * Programación Orientada a Objetos
 *
 * @author Stefany
 */
public class Persona {
	/*
	 * Crear una clase Persona, que tenga los siguientes atributos: id, nombre,
	 * edad, dirección y número de teléfono (tener en cuenta todos sus atributos,
	 * constructores y métodos getters y setters).
	 */
	private int id;
	private String nombre;
	private int edad;
	private String dirección;
	private String telefono;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(int id, String nombre, int edad, String dirección, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.dirección = dirección;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", dirección=" + dirección
				+ ", telefono=" + telefono + "]";
	}

}
