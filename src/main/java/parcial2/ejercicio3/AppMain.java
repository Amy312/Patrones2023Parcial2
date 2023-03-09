package parcial2.ejercicio3;

public class AppMain {
    public static void main (String[]args){
        ConcreteSubject facebook = new ConcreteSubject();

        facebook.attach(new ConcreteObserverA());
        facebook.attach(new ConcreteObserverB());
        facebook.attach(new ConcreteObserverA());
        facebook.attach(new ConcreteObserverB());
        facebook.attach(new ConcreteObserverA());

        facebook.setAttribute3("Enviar Imagen");
        facebook.setAttribute3("Enviar Video");


    }
}
