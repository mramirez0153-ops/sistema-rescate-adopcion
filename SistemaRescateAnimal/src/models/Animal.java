package models;

public abstract class Animal {
    protected String id;
    protected String nombre;
    protected String estado;

    public Animal(String id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String mostrarFicha() {
        return "[ID: " + id + "] Nombre: " + nombre + " | Estado: " + estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("[Estado Actualizado] " + nombre + " ahora está: " + estado);
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
}