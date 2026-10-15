package observers;

public class VoluntarioObserver {
    private String idVoluntario;
    private String nombre;

    public VoluntarioObserver(String idVoluntario, String nombre) {
        this.idVoluntario = idVoluntario;
        this.nombre = nombre;
    }

    public void actualizar(String mensaje) {
        System.out.println("[NOTIFICACIÓN -> Voluntario " + nombre + " (" + idVoluntario + ")]: " + mensaje);
    }

    public String getIdVoluntario() { return idVoluntario; }
    public String getNombre() { return nombre; }
}