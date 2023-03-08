package parcial2.ejercicio1;

public class AppMain {
    public static void main (String []args) {
        GDrive gDrive = new GDrive();
        GDocs gDocs = new GDocs();

        Documento doc1 = new Documento("11/02/2023", "1", "finish");
        gDocs.setDocumento(doc1);
        gDrive.addDocumento(gDocs.createDocumento());

        doc1 = new Documento("13/02/2023", "2", "finish");
        gDocs.setDocumento(doc1);
        gDrive.addDocumento(gDocs.createDocumento());

        doc1 = new Documento("17/02/2023", "3", "finish");
        gDocs.setDocumento(doc1);
        gDrive.addDocumento(gDocs.createDocumento());


        doc1 = new Documento("21/02/2023", "4", "in process");
        gDocs.setDocumento(doc1);
        gDrive.addDocumento(gDocs.createDocumento());


        System.out.println("Mostrar version 4");
        doc1.showInfo();

        gDocs.restoreDocumento(gDrive.getDocumento("ctrl+z"));
        gDocs.restoreDocumento(gDrive.getDocumento("ctrl+z"));
        gDocs.restoreDocumento(gDrive.getDocumento("ctrl+z"));



        gDocs.restoreDocumento(gDrive.getDocumento("ctrl+y"));
        gDocs.restoreDocumento(gDrive.getDocumento("ctrl+y"));
        gDocs.restoreDocumento(gDrive.getDocumento("ctrl+y"));


    }
}
