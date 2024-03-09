package com.JavaAvanzado.Semana1.Clase2_Día3.Ejercicio1;

class AgenteDeSoporte extends Thread {
	
	private boolean agenteDisponible = true;
	private String nombre;
	private int llamadasAtendidas = 0;

	public AgenteDeSoporte(String nombre) {
		this.nombre = nombre;
	}

	public boolean isAgenteDisponible() {
		return agenteDisponible;
	}

	public void setAgenteDisponible(boolean agenteDisponible) {
		this.agenteDisponible = agenteDisponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLlamadasAtendidas() {
		return llamadasAtendidas;
	}

	public void setLlamadasAtendidas(int llamadasAtendidas) {
		this.llamadasAtendidas = llamadasAtendidas;
	}

	@Override
	public void run() {
		while (true) {
			atenderLlamada();
		}
	}

	private synchronized void atenderLlamada() {
		while (!agenteDisponible) {
			try {
				System.out.println("El agente " + nombre + " está esperando llamadas...");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		llamadasAtendidas++;
		System.out.println("El agente " + nombre + " está atendiendo una llamada. Total de llamadas atendidas: "
				+ llamadasAtendidas);
		agenteDisponible = false;
		notify();
	}

	public synchronized void liberarAgente() {
		agenteDisponible = true;
		notify();
	}

}
