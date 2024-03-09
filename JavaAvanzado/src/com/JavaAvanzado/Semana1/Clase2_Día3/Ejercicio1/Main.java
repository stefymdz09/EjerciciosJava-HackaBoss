package com.JavaAvanzado.Semana1.Clase2_Día3.Ejercicio1;

public class Main {
	public static void main(String[] args) {
		/*
		 * Ejercicio Nº 1 - Simulación de un centro de atención al cliente
		 * 
		 * • Crea una simulación de un centro de atención al cliente en la que varios
		 * agentes de soporte pueden atender llamadas telefónicas concurrentemente. •
		 * Cada agente se representa como un hilo independiente. • Los agentes deben
		 * recibir llamadas de clientes, resolver consultas y registrar información
		 * sobre cada llamada. Utiliza hilos para simular la atención concurrente de
		 * múltiples llamadas y garantizar que los agentes puedan manejarlas de manera
		 * eficiente. • Asegúrate de controlar la concurrencia para evitar conflictos en
		 * la asignación de llamadas a los agentes.
		 */
		
		final int NUM_AGENTES = 3;
		final int NUM_LLAMADAS = 10;

		AgenteDeSoporte[] agentes = new AgenteDeSoporte[NUM_AGENTES];

		for (int i = 0; i < NUM_AGENTES; i++) {
			agentes[i] = new AgenteDeSoporte("Agente" + (i + 1));
			agentes[i].start();
		}

		for (int i = 1; i <= NUM_LLAMADAS; i++) {
			AgenteDeSoporte agente = encontrarAgenteDisponible(agentes);
			if (agente != null) {
				System.out.println("Llamada " + i + " asignada a " + agente.getNombre());
				agente.liberarAgente();
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static AgenteDeSoporte encontrarAgenteDisponible(AgenteDeSoporte[] agentes) {
		for (AgenteDeSoporte agente : agentes) {
			if (agente.isAgenteDisponible()) {
				return agente;
			}
		}
		return null;
	}
}
