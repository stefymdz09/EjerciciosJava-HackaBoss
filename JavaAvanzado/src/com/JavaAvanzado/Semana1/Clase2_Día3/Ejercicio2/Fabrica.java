package com.JavaAvanzado.Semana1.Clase2_Día3.Ejercicio2;

public class Fabrica {
	private int productosEnsamblados = 0;
	private int productosControlados = 0;
	private int productosEmbalados = 0;

	public synchronized void ensamblar() {
		System.out.println("Trabajador ensambló un producto.");
		productosEnsamblados++;
		notifyAll();
	}

	public synchronized void controlarCalidad() {
		while (productosEnsamblados == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Trabajador realizó control de calidad.");
		productosEnsamblados--;
		productosControlados++;
		notifyAll();
	}

	public synchronized void embalar() {
		while (productosControlados == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Trabajador embaló un producto.");
		productosControlados--;
		productosEmbalados++;
		notifyAll();
	}

	public int getProductosEmbalados() {
		return productosEmbalados;
	}
}
