package com.JavaBasico.semana1.Dia4.Ejercicio1;
/**
 * Programación Orientada a Objetos
 *
 * @author Stefany
 */


public class Electrodomestico {

	/*
	 * Ejercicio Nº 1 - Clases y Objetos - Individual
	 * 
	 * Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres
	 * de clases y variables no llevan tilde) con los siguientes atributos: cod,
	 * marca, modelo, consumo y color.
	 * 
	 * Luego, realiza las siguientes acciones:
	 * 
	 * a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
	 * 
	 * b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
	 * 
	 * c) Muestra por pantalla la marca, modelo y consumo energético de los 3
	 * electrodomésticos creados con parámetros.
	 * 
	 * d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se
	 * obtiene algún valor? De ser así… ¿Qué valor se obtiene?
	 * 
	 * 
	 */

	private int cod;
	private String marca;
	private String modelo;
	private double consumo;
	private String color;

	public Electrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
		super();
		this.cod = cod;
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
		this.color = color;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
