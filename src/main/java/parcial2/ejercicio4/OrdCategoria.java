package parcial2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class OrdCategoria implements IStrategy{

    @Override
    public void execute(List<Libro> libros) {
        List<String> categoria = new ArrayList<>();
        for(Libro i: libros){
            categoria.add(i.getCategoria());
        }

        categoria.stream().sorted().forEach(System.out::println);
    }
}
