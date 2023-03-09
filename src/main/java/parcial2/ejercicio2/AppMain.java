package parcial2.ejercicio2;

public class AppMain {
    public static void main (String []args){

        Chat chat = new Chat();

        Estudiante est1 = new Estudiante(chat, "1222");
        est1.setName("juan");
        chat.addPersona("1", est1);

        Docente doc1 = new Docente(chat, "128129");
        doc1.setName("marco");
        chat.addPersona("2", doc1);

        Administrativo adm1  =new Administrativo(chat, "superior");
        adm1.setName("jose");
        chat.addPersona("3", adm1);

        adm1.send("Hola");

        doc1.send("Buenas");

    }

}
