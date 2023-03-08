package parcial2.ejercicio1;



import java.util.ArrayList;
import java.util.List;

public class GDrive {
    private List<Memento> documentList = new ArrayList<>();
    private int index = 0;

    public GDrive addDocumento(Memento memento){
        documentList.add(memento);
        index = documentList.size() - 1;
        return this;
    }

    public Memento getDocumento(String comando){
        if("ctrl+z".equals(comando.toLowerCase())){
            if(index-1>=0){
                index-=1;
            }
        } else if("ctrl+y".equals(comando.toLowerCase())){
             if(index+1<documentList.size()){
                 index+=1;
             }
        }
        return documentList.get(index);
    }
}
