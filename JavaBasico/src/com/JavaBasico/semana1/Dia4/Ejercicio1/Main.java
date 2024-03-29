package com.JavaBasico.semana1.Dia4.Ejercicio1;

public class Main {

	public static void main(String[] args) {
		

		// a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.

				Electrodomestico electrodomestico1 = new Electrodomestico(001, "Samsung", "234FH", 450.85, "Negro");
				Electrodomestico electrodomestico2 = new Electrodomestico(002, "Bosch", "645SD", 140.25, "Blanco");
				Electrodomestico electrodomestico3 = new Electrodomestico(003, "Sony", "589FNK", 245.65, "Gris");

				// b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
				// uso del constructor super()
				Electrodomestico electrodomestico4 = new Electrodomestico();

				/*
				 * c) Muestra por pantalla la marca, modelo y consumo energético de los 3
				 * electrodomésticos creados con parámetros.
				 */
				System.out.println("Electrodoméstico 1: Marca: " + electrodomestico1.getMarca() + ", Modelo:"
						+ electrodomestico1.getModelo() + ", Consumo - " + electrodomestico1.getConsumo());

				System.out.println("Electrodoméstico 2: Marca: " + electrodomestico2.getMarca() + ", Modelo:"
						+ electrodomestico2.getModelo() + ", Consumo - " + electrodomestico2.getConsumo());

				System.out.println("Electrodoméstico 3: Marca: " + electrodomestico3.getMarca() + ", Modelo:"
						+ electrodomestico3.getModelo() + ", Consumo - " + electrodomestico3.getConsumo());

				/*
				 * d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se
				 * obtiene algún valor? De ser así… ¿Qué valor se obtiene?
				 */

				System.out.println("Marca del electrodoméstico sin parámetros: " + electrodomestico4.getMarca());

				/*
				 * Como no se le ha asignado ningun valor de marca en el objeto de
				 * electrodomestico4, ya que procede de un contructor sin parametros El valor
				 * que se muestra es null
				 */
			}

		}
