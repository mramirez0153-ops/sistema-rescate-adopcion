package models;

public class Perro extends Animal {
    private String raza;

    public Perro(String id, String nombre, String raza, String estado) {
        super(id, nombre, estado); // Llama al constructor de Animal
        this.raza = raza;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + " | Especie: Perro | Raza: " + raza;
    }
}