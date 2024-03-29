package com.JavaBasico.Semana2.Día5.Ejercicio1;

public class Verdura {
	/*
	 * Ejercicio Nº 1 - Repaso POO - Grupal
	 * 
	 * Trabajando en equipos de 3 o 4 integrantes, deberán crear una clase llamada
	 * Verdura, que tenga los siguientes atributos: id, nombre, color, calorías,
	 * debeCocinarse (tener en cuenta todos sus atributos, constructores, métodos
	 * getters y setters).
	 * 
	 * Luego, realiza las siguientes acciones:
	 * 
	 * a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras.
	 * Crear 5 verduras y guardarlas en el vector.
	 * 
	 * b) Recorrer el vector creado y mostrar por pantalla el nombre y las calorías
	 * de las verduras almacenadas.
	 * 
	 * c) Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos de
	 * todas las verduras luego del cambio.
	 * 
	 * d) Recorrer el vector y mostrar por pantalla únicamente a las verduras que
	 * sean de color verde.
	 * 
	 * División de tareas GRUPALES
	 * 
	 * Para fomentar la colaboración en equipo, se propone la siguiente actividad:
	 * 
	 * Desarrollar el sistema de verduras especificado en el escenario y crear un
	 * repositorio en Git para guardarlo allí. Trabajar en colaboración en el
	 * repositorio de Git, fusionando las ramas cuando se completen las tareas y
	 * resolviendo conflictos si es necesario.
	 * 
	 * Dividir el equipo en roles, como desarrolladores, testers y responsables de
	 * documentación.
	 * 
	 * El/Los desarrolladores trabajarán en la implementación de la clase "Verdura"
	 * y la funcionalidad del programa. Si son varios, dividir las tareas, gestionar
	 * diferentes ramas y hacer los pushes correspondientes.
	 * 
	 * El/Los testers realizarán pruebas de funcionamiento para asegurarse de que el
	 * programa funcione correctamente.
	 * 
	 * El/Los responsables de documentación deberán crear un informe que sirva de
	 * documentación del sistema creado, donde se especifiquen las funcionalidades
	 * del sistema, las pruebas realizadas por los testers y los resultados
	 * obtenidos.
	 * 
	 * Al finalizar, presentar el sistema completo con documentación y realizar una
	 * revisión grupal para asegurarse que todos los entregables están correctos.
	 */

	private int id;
	private String nombre;
	private String color;
	private double calorias;
	private boolean debeCocinarse;

	public Verdura(int id, String nombre, String color, double calorias, boolean debeCocinarse) {
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.calorias = calorias;
		this.debeCocinarse = debeCocinarse;
	}

	public Verdura() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public boolean isDebeCocinarse() {
		return debeCocinarse;
	}

	public void setDebeCocinarse(boolean debeCocinarse) {
		this.debeCocinarse = debeCocinarse;
	}

	@Override
	public String toString() {
		return "Verdura [id=" + id + ", nombre=" + nombre + ", color=" + color + ", calorias=" + calorias
				+ ", debeCocinarse=" + debeCocinarse + "]";
	}



}
