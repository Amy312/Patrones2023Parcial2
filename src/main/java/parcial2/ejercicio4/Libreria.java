package parcial2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libros = new ArrayList<>();
    private IStrategy strategy;

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    public void execute(){
        this.strategy.execute(this.libros);
    }

}
