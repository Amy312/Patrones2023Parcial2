package parcial2.ejercicio5;

import java.util.Random;

public class Prendido implements IStateCelular{
    @Override
    public void memoriaManager(Celular celular) throws InterruptedException {
        System.out.println("Estado --> Prendido");

        Random random = new Random();

        int nprogramas = random.nextInt(9) + 1;

        for(int i=0; i<nprogramas; i++){
            celular.getProgramas()[i] = (String)("App" + i);
        }

        int recursos = 5, i = 0;
        while (celular.getCpu().getConsumo() < 100 && celular.getRam().getConsumo() < 100 && i<nprogramas){
            celular.getRam().showInfo();
            celular.getCpu().showInfo();

            System.out.println();

            Thread.sleep(1000);
            celular.getCpu().setConsumo(celular.getCpu().getConsumo()+recursos);
            celular.getRam().setConsumo(celular.getRam().getConsumo()+recursos);
        }
        if(celular.getCpu().getConsumo()>=100){
            celular.getCpu().setConsumo(100);
            celular.getRam().setConsumo(100);
        }


        System.out.println("--> Celular prendido <--");

        celular.getRam().showInfo();
        celular.getCpu().showInfo();
        System.out.println();
    }
}
