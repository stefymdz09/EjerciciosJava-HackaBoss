package com.JavaBasico.Semana2.Día7.Ejercicio1;

import java.util.ArrayList;

import com.JavaBasico.Semana2.Día7.Ejercicio1.Interfaces.Combustion;
import com.JavaBasico.Semana2.Día7.Ejercicio1.Interfaces.Electrico;

public class Main {

	public static void main(String[] args) {
		/*
		 * f) Main: En el programa principal, crea objetos de diferentes tipos de
		 * vehículos (autos eléctricos, camionetas de combustión, motos de combustión) y
		 * añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno
		 * de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o
		 * combustible según corresponda.
		 * 
		 */

		ArrayList<Vehiculo> vehiculos = new ArrayList<>();

		Auto autoElectrico1 = new Auto(1, "MSF234", "KIA", "Modelo M", 2019, 75300, 60000, 8);
		Camioneta camionetaCombustion1 = new Camioneta(2, "RTH678", "Jeep", "Modelo U", 2021, 550000, 90, 12);
		Moto motoCombustion1 = new Moto(3, "YYP995", "Urbet", "Model F", 2020, 65000, 125, "3 tiempos");

		vehiculos.add(autoElectrico1);
		vehiculos.add(camionetaCombustion1);
		vehiculos.add(motoCombustion1);

		/*
		 * * g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la
		 * información de cada uno de ellos.
		 */
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println("\n --------------------------------------------------");
			System.out.println(vehiculo);
			System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años");

			if (vehiculo instanceof Electrico) {
				((Electrico) vehiculo).cargarEnergia();
			} else if (vehiculo instanceof Combustion) {
				((Combustion) vehiculo).recargarCombustible();
			}

		}

	}

}
