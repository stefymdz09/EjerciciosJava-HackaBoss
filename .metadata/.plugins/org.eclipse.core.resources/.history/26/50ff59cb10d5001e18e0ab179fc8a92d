package integradorvehiculos;

import integradorvehiculos.Interfaces.Electrico;

public class Auto extends Vehiculo implements Electrico {

    private int capacidadBateria;
    private int autonomia;
    

    public Auto(int capacidadBateria, int autonomia, int id, String placa, String marca, String modelo, int anio, double costo) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
        
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public int calcularAntiguedad() {
        int anioActual = 2023; // Año actual, puedes obtenerlo también dinámicamente
        return anioActual - super.anio;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energía del auto eléctrico con una capacidad de batería de " + capacidadBateria + " mAh.");
    }

    
    
}
