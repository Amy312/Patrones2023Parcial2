package parcial2.ejercicio2;

public class Administrativo extends Persona {
    private String cargo;

    public Administrativo(ICanal canal, String cargo) {
        super(canal);
        this.cargo = cargo;
    }

    @Override
    public void send(String msg) {
        this.canal.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Administrativo: "+ getName() + "\nRecibio el mensaje " + msg);

    }
}
