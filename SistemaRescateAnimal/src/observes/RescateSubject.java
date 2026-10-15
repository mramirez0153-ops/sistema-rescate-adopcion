package observers;

import java.util.ArrayList;
import java.util.List;

public class RescateSubject {
    private List<VoluntarioObserver> observadores;

    public RescateSubject() {
        this.observadores = new ArrayList<>();
    }

    public void suscribir(VoluntarioObserver obs) {
        observadores.add(obs);
        System.out.println("[Suscripcion] Voluntario " + obs.getNombre() + " registrado para alertas.");
    }

    public void desuscribir(VoluntarioObserver obs) {
        observadores.removeIf(o -> o.getIdVoluntario().equals(obs.getIdVoluntario()));
    }

    public void notificar(String caso) {
        System.out.println("\n");
        System.out.println("\n                              *****EMITIENDO ALERTA DE RESCATE*****                          ");
        for (VoluntarioObserver obs : observadores) {
            obs.actualizar(caso);
        }
        System.out.println("\n");
        System.out.println("===================================================================================================");
    }
}