package parcial2.ejercicio5;

import java.util.Arrays;

public class Apagado implements IStateCelular{
    @Override
    public void memoriaManager(Celular celular){
        System.out.println("Estado --> Apagado");

        celular.getRam().setConsumo(0);
        celular.getCpu().setConsumo(0);

        Arrays.fill(celular.getProgramas(),null);

        System.out.println("--> Celular Apagado <--\n");

    }
}
