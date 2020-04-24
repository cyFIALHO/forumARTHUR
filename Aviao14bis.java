package avi;

import java.util.HashSet;
import java.util.Set;

public class Aviao14bis {
    private Set<AviaoListener> listeners = new HashSet<>();
    private estado estadoAtual = Estado.PARADO;

    public void decolar() {
        estadoAtual = Estado.PARADO;

        for (AviaoListener listener : listeners) {
            listener.aviaoEstaParado();
        }
    }

    public void planar() {
        estadoAtual = Estado.PLANANDO;

        for (AviaoListener listener : listeners) {
            listener.aviaoPlanando();
        }
    }

    public void pousar() {
        estadoAtual = Estado.PARANDO;

        for (AviaoListener listener : listeners) {
            listener.aviaoPousando();
        }
    }

  

    public void adicionarListener(CarroListener listener) {
        listeners.add(listener);
    }

    enum Estado {
        SUBINDO("SU"),
        PLANANDO("PL"),
        PARANDO("PA");

        public String estado;

        Marcha(String estado) {
            this.estado = estado;
        }
    }
}
© 