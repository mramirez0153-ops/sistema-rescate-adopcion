package config;

public class Database {
    private static Database instancia;
    private String conexion;

    // Constructor privado para evitar 'new' desde fuera
    private Database() {
        this.conexion = "Conexión activa a BD Rescate Animal";
    }

    // Método estático global para obtener la única instancia
    public static synchronized Database getInstance() {
        if (instancia == null) {
            instancia = new Database();
        }
        return instancia;
    }

    public void ejecutarConsulta(String sql) {
        System.out.println("[BD] Ejecutando consulta: \"" + sql + "\" en [" + conexion + "]");
    }
}