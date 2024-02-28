package com.JavaBasico.Semana2.Día7.Ejercicio2;

public class Producto {
	/*
	 * Un administrador de una tienda de electrónica necesita un programa para
	 * gestionar los productos en su inventario. Para ello, necesita la creación de
	 * una clase Producto que cuente con los siguientes datos: código, nombre,
	 * marca, tipo, precio costo, precio venta, cantidad en stock.
	 * 
	 * A partir de esto, realizar las siguientes acciones en el programa
	 * desarrollado:
	 * 
	 * a) Crear 10 objetos de tipo Producto con sus correspondientes valores
	 * cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador,
	 * tablet, etc).
	 * 
	 * b) Guardar estos objetos creados en un ArrayList.
	 * 
	 * c) Recorrer el ArrayList y determinar el producto con el mayor precio de
	 * venta.
	 * 
	 * d) Recorrer el ArrayList y determinar el producto con el menor precio de
	 * costo.
	 * 
	 * e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
	 * 
	 * f) Determinar el producto que tenga la mayor cantidad en stock. A ese
	 * producto, descontarle 3 unidades del stock y actualizar el registro en la
	 * lista en base a eso.
	 * 
	 * g) Mostrar siempre por consola un mensaje informativo luego de resolver cada
	 * punto.
	 */

	private int codigo;
	private String nombre;
	private String marca;
	private String tipo;
	private double precioCosto;
	private double precioVenta;
	private int cantidadStock;

	public Producto(int codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta,
			int cantidadStock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.precioCosto = precioCosto;
		this.precioVenta = precioVenta;
		this.cantidadStock = cantidadStock;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

}
