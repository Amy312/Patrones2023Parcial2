package parcial2.ejercicio1;

public class Documento {
    private String date;
    private String version;
    private String state;

    public Documento(String date, String version, String state) {
        this.date = date;
        this.version = version;
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void showInfo(){
        System.out.println("--> Documento version" + version);
        System.out.println("- Date + " + date);
        System.out.println("- State + " + state);
        System.out.println("----------------------------------\n");

    }
}
