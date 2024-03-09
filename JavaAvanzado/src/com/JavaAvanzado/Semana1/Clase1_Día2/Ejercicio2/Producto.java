package com.JavaAvanzado.Semana1.Clase1_Día2.Ejercicio2;

public class Producto {

	/*
	 * Ejercicio Nº 2 - Manejo de Inventarios en un Comercio - Individual
	 * 
	 * Imagina que estás desarrollando un sistema de gestión de inventarios para un
	 * comercio minorista. Los usuarios pueden agregar productos al inventario
	 * proporcionando información como el nombre del producto, el precio y la
	 * cantidad disponible. Tu tarea es implementar una función que maneje la
	 * gestión de inventarios, validando los datos ingresados y manejando
	 * excepciones en caso de errores o datos inválidos.
	 * 
	 * Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso
	 * de que ésta sea opersonalizada) o de utilizar los tipos correctos de
	 * excepción en cada caso.
	 */
	private String nombre;
	private double precio;
	private int cantidadDisponible;

	public Producto(String nombre, double precio, int cantidadDisponible) throws InventarioException {
		validarDatos(nombre, precio, cantidadDisponible);

		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
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

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public void validarDatos(String nombre, double precio, int cantidadDisponible) throws InventarioException {
		if (nombre == null || nombre.isEmpty()) {
			throw new InventarioException("El nombre del producto no puede ser nulo o vacío.");
		}
		if (precio < 0) {
			throw new InventarioException("El precio no puede ser un número negativo");
		}
		if (cantidadDisponible < 0) {
			throw new InventarioException("La cantidad disponible debe ser mayor o igual a cero.");
		}
	}

}
