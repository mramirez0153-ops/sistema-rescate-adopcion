package main;

import config.Database;
import factories.ExpedienteFactory;
import models.Animal;
import observers.RescateSubject;
import observers.VoluntarioObserver;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================== SISTEMA DE RESCATE Y ADOPCIÓN ANIMAL ====================\n");

        // 1. Probar Singleton
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        db1.ejecutarConsulta("SELECT * FROM casos_rescate");
        System.out.println("¿db1 y db2 son exactamente la misma instancia?: " + (db1 == db2) + "\n");

        // 2. Probar Observer
        RescateSubject emisor = new RescateSubject();
        VoluntarioObserver voluntario1 = new VoluntarioObserver("V-001", "Ana Gómez");
        VoluntarioObserver voluntario2 = new VoluntarioObserver("V-002", "Carlos Pérez");

        emisor.suscribir(voluntario1);
        emisor.suscribir(voluntario2);

        // 3. Probar Factory Method
        System.out.println("\n========================= REGISTRANDO NUEVOS RESCATES =========================");
        Animal perro1 = ExpedienteFactory.crearExpediente("perro", "P-101", "Firulais", "Mestizo", "Rescatado");
        Animal gato1 = ExpedienteFactory.crearExpediente("gato", "G-202", "Michi", "true", "En Tratamiento");

        System.out.println(perro1.mostrarFicha());
        System.out.println(gato1.mostrarFicha());

        // Emitir notificación automática a voluntarios
        emisor.notificar("Nuevo ingreso registrado: " + perro1.getNombre() + " (" + perro1.getId() + ")");
    }
}