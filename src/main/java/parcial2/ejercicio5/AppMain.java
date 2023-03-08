package parcial2.ejercicio5;

public class AppMain {
    public static void main (String[]args) throws InterruptedException {
        Celular celular = new Celular();

        celular.viewState();

        celular.setStateCelular(new Prendido());
        celular.viewState();

        celular.setStateCelular(new Reiniciar());
        celular.viewState();

        celular.setStateCelular(new Prendido());
        celular.viewState();

        celular.setStateCelular(new Apagado());
        celular.viewState();

    }
}
