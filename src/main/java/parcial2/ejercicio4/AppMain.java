package parcial2.ejercicio4;

public class AppMain {
    public static void main (String[]args) {
        Libreria libreria = new Libreria();

        libreria.addLibro(new Libro("1", "ros", "uhh"));
        libreria.addLibro(new Libro("3", "cos", "uyh"));
        libreria.addLibro(new Libro("6", "bos", "ugh"));
        libreria.addLibro(new Libro("0", "raos", "mhh"));

        System.out.println("Categorias");
        libreria.setStrategy(new OrdCategoria());
        libreria.execute();
        System.out.println();

        System.out.println("Titulos");
        libreria.setStrategy(new OrdId());
        libreria.execute();
        System.out.println();

        System.out.println("ID");
        libreria.setStrategy(new OrdTitulo());
        libreria.execute();
        System.out.println();

    }
}
