package com.JavaBasico.Semana2.Día6.Ejercicio2;

public class Sombrero extends Vestimenta {

	private String tipo;
	private String tamaño;

	public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo,
			String tamaño) {
		super(codigo, nombre, precio, marca, talla, color);
		this.tipo = tipo;
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public void mostrarMensaje() {
		System.out.println("Este sombrero es de la marca-tipo: " + getTipo());
	}

}
