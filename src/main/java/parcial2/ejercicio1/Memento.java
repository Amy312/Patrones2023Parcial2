package parcial2.ejercicio1;

import templates.memento.ConcreteObject;

public class Memento {
    private Documento documento;

    public Memento(Documento documento) {
        this.documento = documento;
    }

    public Documento getDocumento() {
        return documento;
    }
}
