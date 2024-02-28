package com.JavaBasico.Semana2.Día6.Ejercicio1;

public class Animal {

	private int id;
	private String nombre;
	private int edad;
	private String tipoPiel;
	private String tipoAlimentacion;

	public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.tipoPiel = tipoPiel;
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public Animal() {
		super();
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

	public String getTipoPiel() {
		return tipoPiel;
	}

	public void setTipoPiel(String tipoPiel) {
		this.tipoPiel = tipoPiel;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public void saludar() {
		System.out.println("Hola, soy un animal.");
	}

}
