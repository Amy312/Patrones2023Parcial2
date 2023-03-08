package parcial2.ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Chat implements ICanal{

    private Map<String, Persona> coleChat = new HashMap<>();
    private Docente docente;
    private Estudiante estudiante;
    private Administrativo administrativo;

    public Chat addPersona(String dato, Persona persona){
        coleChat.put(dato, persona);
        return this;
    }

    @Override
    public void send(String message, Persona persona) {
        if(persona == administrativo){
            for(String dato: coleChat.keySet()){
                if(persona!=coleChat.get(dato)){
                    coleChat.get(dato).received(message);
                }
            }
        } else if(persona == docente){
            for(String dato: coleChat.keySet()){
                if(persona!=coleChat.get(dato)){
                    if(coleChat.get(dato) == docente || coleChat.get(dato)== estudiante){
                        coleChat.get(dato).received(message);
                    }
                }
            }
        }

    }
}
