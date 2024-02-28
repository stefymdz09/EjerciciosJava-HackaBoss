package com.JavaBasico.Semana2.Día6.Ejercicio2;

public class Vestimenta {

	private int codigo;
	private String nombre;
	private double precio;
	private String marca;
	private String talla;
	private String color;

	public Vestimenta(int codigo, String nombre, double precio, String marca, String talla, String color) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.marca = marca;
		this.talla = talla;
		this.color = color;
	}

	public Vestimenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void mostrarMensaje() {
		System.out.println("Esta vestimenta es de la marca " + this.getMarca());
	}

}
