package com.JavaAvanzado.Semana1.Clase2_Día3.Ejercicio2;

public class Trabajador extends Thread {
	private Fabrica fabrica;
	private String tarea;

	public Trabajador(Fabrica fabrica, String tarea) {
		this.fabrica = fabrica;
		this.tarea = tarea;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			realizarTarea();
		}
	}

	private void realizarTarea() {
		switch (tarea) {
		case "ensamblar":
			fabrica.ensamblar();
			break;
		case "controlarCalidad":
			fabrica.controlarCalidad();
			break;
		case "embalar":
			fabrica.embalar();
			break;
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}