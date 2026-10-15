package factories;

import models.*;

public class ExpedienteFactory {
    public static Animal crearExpediente(String tipo, String id, String nombre, String atributoEspecial, String estado) {
        switch (tipo.toLowerCase()) {
            case "perro":
                return new Perro(id, nombre, atributoEspecial, estado);
            case "gato":
                boolean esterilizado = Boolean.parseBoolean(atributoEspecial);
                return new Gato(id, nombre, esterilizado, estado);
            case "faunasilvestre":
            case "fauna":
                return new FaunaSilvestre(id, nombre, atributoEspecial, estado);
            default:
                throw new IllegalArgumentException("Especie no soportada: " + tipo);
        }
    }
}