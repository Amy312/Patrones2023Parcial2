package parcial2.ejercicio5;

public class RAM {
    private int consumo;

    public RAM(int consumo) {
        this.consumo = consumo;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void showInfo(){
        System.out.println("RAM: " + consumo + "%");

    }
}
