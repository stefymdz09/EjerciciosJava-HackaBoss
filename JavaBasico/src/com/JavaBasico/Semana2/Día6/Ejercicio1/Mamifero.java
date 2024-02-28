package com.JavaBasico.Semana2.Día6.Ejercicio1;

public class Mamifero extends Animal {

	private int numPatas;
	private String tipoReproduccion;
	private String colorPelaje;
	private String habitat;

	public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numPatas,
			String tipoReproduccion, String colorPelaje, String habitat) {
		super(id, nombre, edad, tipoPiel, tipoAlimentacion);
		this.numPatas = numPatas;
		this.tipoReproduccion = tipoReproduccion;
		this.colorPelaje = colorPelaje;
		this.habitat = habitat;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getTipoReproduccion() {
		return tipoReproduccion;
	}

	public void setTipoReproduccion(String tipoReproduccion) {
		this.tipoReproduccion = tipoReproduccion;
	}

	public String getColorPelaje() {
		return colorPelaje;
	}

	public void setColorPelaje(String colorPelaje) {
		this.colorPelaje = colorPelaje;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public void saludar() {
		System.out.println("Hola, soy un mamífero.");
	}

}
