package templates.observer;

public class AppMain {
    public static void main (String[]args){
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserverA());
        subject.attach(new ConcreteObserverB());
        subject.attach(new ConcreteObserverA());

        subject.setAttribute3("Deberia de notificarse");

    }
}
