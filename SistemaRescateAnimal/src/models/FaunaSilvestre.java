package models;

public class FaunaSilvestre extends Animal {
    private String permisoAmbiental;

    public FaunaSilvestre(String id, String nombre, String permisoAmbiental, String estado) {
        super(id, nombre, estado);
        this.permisoAmbiental = permisoAmbiental;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + " | Especie: Fauna Silvestre | Permiso: " + permisoAmbiental;
    }
}