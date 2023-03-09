package parcial2.ejercicio4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrdTitulo implements IStrategy{

    @Override
    public void execute(List<Libro> libros) {
        List<String> titulos = new ArrayList<>();
        for(Libro i: libros){
            titulos.add(i.getTitulo());
        }

        titulos.stream().sorted().forEach(System.out::println);
    }
}