package parcial2.ejercicio5;


public class Celular {

    private String[] programas;

    private IStateCelular stateCelular;
    private CPU cpu;
    private RAM ram;


    public Celular(){
        cpu = new CPU(0);
        ram = new RAM(0);
        programas = new String[10];
        stateCelular = new Apagado();
    }

    public String[] getProgramas() {
        return programas;
    }

    public void setProgramas(String[] programas) {
        this.programas = programas;
    }

    public IStateCelular getStateCelular() {
        return stateCelular;
    }

    public void setStateCelular(IStateCelular stateCelular) {
        this.stateCelular = stateCelular;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void viewState() throws InterruptedException {
        stateCelular.memoriaManager(this);
    }
}
