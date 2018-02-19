package prueba.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample extends Thread {

    private Semaphore printer;
    private String mensaje;
    private int papelDisponible;

    public SemaphoreExample(String mensaje,Semaphore semaphore){
        this.mensaje=mensaje;
        this.printer=semaphore;
        this.papelDisponible=10;
    }

    @Override
    public void run() {
        while (papelDisponible>=0) {
            try {
                System.out.println("Adquiriendo semaforo");
                printer.acquire();
                System.out.println("Semaforo adquirido");
                System.out.println(printer.availablePermits() + " permisos actualmente");
                if (this.mensaje.equals("negrita")) {
                    System.out.println("Imprimiendo en negrita");
                    papelDisponible--;
                } else if (this.mensaje.equals("cursiva")) {
                    System.out.println("Imprimiendo en cursiva");
                    papelDisponible--;
                } else if (this.mensaje.equals("sub")) {
                    System.out.println("Imprimiendo en sub");
                    papelDisponible--;
                }
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Interrumpido");
            }finally {
                printer.release();
                System.out.println("Liberando lugar...");
            }
        }
    }


    public int getPapelDisponible() {
        return papelDisponible;
    }

    public void setPapelDisponible(int papelDisponible) {
        this.papelDisponible = papelDisponible;
    }

    public Semaphore getPrinter() {
        return printer;
    }

    public void setPrinter(Semaphore printer) {
        this.printer = printer;
    }
}
