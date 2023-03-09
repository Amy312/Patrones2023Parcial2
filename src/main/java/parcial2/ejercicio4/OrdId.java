package parcial2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class OrdId implements IStrategy{

    @Override
    public void execute(List<Libro> libros) {
        List<String> ids = new ArrayList<>();
        for(Libro i: libros){
            ids.add(i.getId());
        }

        ids.stream().sorted().forEach(System.out::println);
    }
}