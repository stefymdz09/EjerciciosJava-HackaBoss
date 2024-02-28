package com.JavaBasico.Semana2.Día7.Ejercicio2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// b) Guardar estos objetos creados en un ArrayList.
		ArrayList<Producto> productos = new ArrayList<>();

		// a) Crear 10 objetos de tipo Producto con sus correspondientes valores
		// cargados
		// (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).

		productos.add(new Producto(1, "Movil", "Apple", "Smartphone", 145, 99, 20));
		productos.add(new Producto(2, "Auriculares", "HP", "Bluetooth", 600, 900, 10));
		productos.add(new Producto(3, "Ordenador", "Sony", "Accesorio", 40, 70, 50));
		productos.add(new Producto(4, "Tablet", "Apple", "iPad", 15, 25, 30));
		productos.add(new Producto(5, "Cargador", "Huawey", "Accesorio", 50, 35, 50));
		productos.add(new Producto(6, "Tablet", "HP", "Portatil", 80, 130, 12));
		productos.add(new Producto(7, "Telefono", "Samsung", "Smartphone", 80, 46, 17));
		productos.add(new Producto(8, "Teclado", "Logitech", "Gaming", 90, 49, 22));
		productos.add(new Producto(9, "Televisor", "Samsung", "Accesorio", 60, 50, 35));
		productos.add(new Producto(10, "Impresora", "LG", "Accesorio", 40, 70, 28));

		/*
		 * c) Recorrer el ArrayList y determinar el producto con el mayor precio de
		 * venta.
		 */
		Producto maxPrecioVenta = productos.get(0);

		for (Producto producto : productos) {
			if (producto.getPrecioVenta() > maxPrecioVenta.getPrecioVenta()) {
				maxPrecioVenta = producto;

			}
		}
		System.out.println("Producto con mayor precio de venta es: " + maxPrecioVenta.getNombre()
				+ "con un precio Venta de de " + maxPrecioVenta.getPrecioVenta());

		/*
		 * d) Recorrer el ArrayList y determinar el producto con el menor precio de
		 * costo.
		 */
		Producto minPrecioCosto = productos.get(0);
		for (Producto producto : productos) {
			if (producto.getPrecioCosto() < minPrecioCosto.getPrecioCosto()) {
				minPrecioCosto = producto;
			}
		}
		System.out.println("\n Producto con menor precio de costo: " + minPrecioCosto.getNombre()
				+ "con un precio Costo de de" + minPrecioCosto.getPrecioCosto());

		/*
		 * e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
		 */
		if (productos.size() > 5) {
			Producto productoRemove = productos.remove(4);
			System.out.println("\n Se ha eliminado el producto de la posición 5");
			System.out.println("\n El producto eliminado fue:" + productoRemove.getNombre());

		} else {
			System.out.println("\n No hay suficientes productos en la ñlista para eliminar el de la posición 5.");
		}

		/*
		 * f) Determinar el producto que tenga la mayor cantidad en stock. A ese
		 * producto, descontarle 3 unidades del stock y actualizar el registro en la
		 * lista en base a eso.
		 */
		Producto maxStock = productos.get(0);
		for (Producto producto : productos) {
			if (producto.getCantidadStock() > maxStock.getCantidadStock()) {
				maxStock = producto;
			}
		}
		System.out.println("-----Antes de la actualización de Strock----------");
		System.out.println("Producto con mayor cantidad en stockes" + maxStock.getNombre());

		if (maxStock.getCantidadStock() >= 3) {
			maxStock.setCantidadStock(maxStock.getCantidadStock() - 3);
			System.out.println(
					"-----Antes de la actualización de Stock---- Se han descontado 3 unidades de Stock ------");

			System.out.println("\nEl producto con la mayor cantidad en stock es: " + maxStock.getNombre());

		} else {
			System.out.println("No hay suficientes unidades en stock para descontar al producto con mayor cantidad.");
		}
	}
}
