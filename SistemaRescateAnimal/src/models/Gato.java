package models;

public class Gato extends Animal {
    private boolean esEsterilizado;

    public Gato(String id, String nombre, boolean esEsterilizado, String estado) {
        super(id, nombre, estado);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public String mostrarFicha() {
        String esterilizadoStr = esEsterilizado ? "Sí" : "No";
        return super.mostrarFicha() + " | Especie: Gato | Esterilizado: " + esterilizadoStr;
    }
}