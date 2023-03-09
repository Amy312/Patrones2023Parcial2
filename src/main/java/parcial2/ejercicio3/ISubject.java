package parcial2.ejercicio3;

public interface ISubject {
    void attach (IObserver observer);
    void deattach (IObserver observer);
    void notifyObservers();
}
